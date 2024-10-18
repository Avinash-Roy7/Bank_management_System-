package bank.management.system;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;

public class Con1{
    Connection connection;
    Statement statement;
    public Con1(){
        try{
           connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","#Om@1153");
           statement=connection.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
