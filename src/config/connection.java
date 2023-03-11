/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author SCC-COMLAB
 */
public class connection {
    
     Connection con;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;


   
    public Connection getConnection(){  
            try{
                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_aotSSs", "root", "");
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    }
                        return con;
                }
}