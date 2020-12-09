/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;
import java.sql.*;
import pkg.MyConnection;

/**
 *
 * @author NIKHIL
 */
public class searchdao {
    
    public String MessageUser(searchbean rb){
        String name = rb.getName();
        String url = rb.getUrl();
        String content = rb.getContent();
        
        
        Connection con = MyConnection.getConnection();
        try{
            PreparedStatement pst = con.prepareStatement("insert into data values(?,?,?)");
           
            pst.setString(1, name);
            pst.setString(2, url);
            pst.setString(3,content);
            
            int i = pst.executeUpdate();
            if(i>0){
                return "SUCCESS";
            }
            con.close();
        }catch(Exception ex){
            System.out.println("RegisterDAO File"+ex);
        }
        return "error";
    }
    
}
