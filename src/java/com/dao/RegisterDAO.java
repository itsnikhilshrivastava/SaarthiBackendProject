/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;
import java.sql.*;
import pkg.MyConnection;
import com.login.RegisterBean;
/**
 *
 * @author NIKHIL
 */
public class RegisterDAO {
    
    public String RegisterUser(RegisterBean rb){
        String name = rb.getName();
        String pword = rb.getPword();
        
        Connection con = MyConnection.getConnection();
        try{
            PreparedStatement pst = con.prepareStatement("insert into user values(?,?)");
           
            pst.setString(1, name);
            pst.setString(2, pword);
            
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
