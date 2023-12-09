package com.jdbc;

import java.sql.*;

public class Update {
    public static void main(String[] args)throws  Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver is found");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","Nikhil@123");
        System.out.println("connection is Established");

        CallableStatement cs = con.prepareCall("call users.update1(4,'nitesh')");
        int i = cs.executeUpdate();
        System.out.println(i);

    }
}
