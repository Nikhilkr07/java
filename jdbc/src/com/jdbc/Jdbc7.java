//Use of PreparedStatement
package com.jdbc;

import javax.swing.plaf.IconUIResource;
import java.sql.*;

public class Jdbc7 {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver found");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","Nikhil@123");
        System.out.println("Connection is established");

        PreparedStatement ps = con.prepareStatement("insert into student values(8,'Sumit')");
        ps.executeUpdate();
    }
}
