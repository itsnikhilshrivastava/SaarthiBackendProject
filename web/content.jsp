<%-- 
    Document   : content
    Created on : 7 Dec, 2020, 7:43:17 PM
    Author     : NIKHIL
--%>

<%
    session = request.getSession();
    String name="";
    if(session.getAttribute("session_user")==null || session.getAttribute("session_user")=="" || session.getAttribute("session_user").equals(" ")){
        response.sendRedirect("signup.jsp");
    }
    else{
        name = session.getAttribute("session_user").toString();
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,pkg.*"%>
<%@page import="java.util.*" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background-color: #f8f8f8;
            }
            .name,.url{
  background-color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
  border: 2px solid #ccc;
}
textarea {
  width: 100%;
  height:500px;
  padding: 12px 20px;
  box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
  background-color: white;
}

        </style>
    </head>
    <body>
        <%         MyConnection x=new MyConnection();
        Connection c=x.getConnection();
    
        PreparedStatement pst=c.prepareStatement("select * from data where name=?");
        pst.setString(1, name);
     
        ResultSet rs=pst.executeQuery();
        if(rs.next()){
            String s=rs.getString("content");
        %>
            <form>
                <label for="name">Your Name:</label>
                <input type="name" id="name" class="name" name="name" value="<%=rs.getString("name")%>"><br><br>
                <label for="url">URL:</label>
                <input type="url" id="url" class="url" name="url" value="<%=rs.getString("url")%>"><br><br>
                <label for="textarea">URL Content:</label>
                <textarea><%=s%></textarea>
                
            </form>
         <%}%>          
    </body>
</html>
