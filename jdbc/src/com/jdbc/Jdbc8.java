/*Another way to use preparedStatement*/

package com.jdbc;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
public class Jdbc8 {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver found");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","Nikhil@123");
        System.out.println("Connection is established");

        PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
        ps.setInt(1,9);
        ps.setString(2,"Sachin");
        ps.executeUpdate();

        ps.setInt(1,10);
        ps.setString(2,"Rishabh");
        ps.executeUpdate();
    }
}
