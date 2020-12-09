<%-- 
    Document   : page
    Created on : 6 Dec, 2020, 7:47:45 PM
    Author     : NIKHIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,pkg.*"%>
<%  String name="";
    try{
    session = request.getSession();
   
    if(session.getAttribute("session_user")==null || session.getAttribute("session_user")=="" || session.getAttribute("session_user").equals(" ")){
        response.sendRedirect("signin.jsp");
    }
    else{
        name = session.getAttribute("session_user").toString();
    }}
    catch(Exception e){
            System.out.println(e);
            }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background-color: #f8f8f8;
            }
            input[type=url],input[type=text]{
  background-color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  border: 2px solid #ccc;
}

        </style>
    </head>
    <body>
        <form action="SearchServlet" method="post" target="_blank">

  <p>
  <div>
      <label for="exampleInput">Your Name</label><br>
    <input type="text" id="name1" name="name1" placeholder="Enter Name" value="<%=name%>"><br><br>
  </div>
  <label for="url">Enter an https:// URL:</label><br>

    <input type="url" name="url" id="url"
       placeholder="https://example.com"
       pattern="https://.*" size="30"
       required><br><br>

    <input type="submit" value="submit">

  </p>

</form>
    </body>
</html>
