package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;

public class  DBConnect {
   static Connection con;
    public static Connection createDB(){

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/employeedb?useSSL=false";
            String username = "root";
            String password = "Codershaffu8";
            con = DriverManager.getConnection(url,username,password);

        }catch (Exception ex){
            ex.printStackTrace();;
        }
        return con;

    }
}
