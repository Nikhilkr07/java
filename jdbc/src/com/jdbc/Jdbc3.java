/*Update value from database table */
package com.jdbc;
import  java.sql.*;
public class Jdbc3 {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Found");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","Nikhil@123");
        System.out.println("Connection is established");
        Statement st = con.createStatement();
        int i = st.executeUpdate("update student set name = 'Shubham' where id = 1");
        System.out.println(i);
    }
}
