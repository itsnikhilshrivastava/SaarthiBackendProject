/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.login.LoginBean;
import pkg.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author NIKHIL
 */
public class LoginDAO {
    public String LoginCheck(LoginBean bean){
        
        Connection con = MyConnection.getConnection();
        
        String name = bean.getName();
        String pword = bean.getPword();
        try{
            String sqlQuery = "select * from user where name=? and pword=?";
            PreparedStatement pst = con.prepareStatement(sqlQuery);
            pst.setString(1, name);
            pst.setString(2, pword);
            
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String dbname = rs.getString("name");
                String dbpword = rs.getString("pword");
                if(dbname.equalsIgnoreCase(name) && dbpword.equalsIgnoreCase(pword)){
                    return "success";
                }
                return "error";
            }
            
        }catch(Exception ex){
            System.out.println("From LoginDAO"+ex);
        }
        
        return "error";
    }
    
}
