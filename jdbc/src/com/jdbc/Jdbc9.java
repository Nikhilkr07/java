/* We can insert only one value in database using prepared statement
such as
 */
package com.jdbc;
import  java.sql.*;
public class Jdbc9 {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver found");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","Nikhil@123");
        System.out.println("Connection established");

//        PreparedStatement ps = con.prepareStatement("insert into student(id) values(?)");
        PreparedStatement ps = con.prepareStatement("insert into student(name) values(?)");
//        ps.setInt(1,11);
//        ps.executeUpdate();

        ps.setString(1,"Monty");
        ps.executeUpdate();
    }
}
