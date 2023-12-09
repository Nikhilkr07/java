package com.jdbc;

import java.sql.*;
public class jdbc1 {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver is found");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","Nikhil@123");
        System.out.println("connection is Established");

        Statement st = con.createStatement();
//        int i = st.executeUpdate("insert into emp values (2,'chandan')");
//          int i = st.executeUpdate("update emp set name = 'sumit' where id = 2");
        ResultSet rs = st.executeQuery("select *from emp");
//        System.out.println(i);

        while (rs.next()){
            System.out.print(rs.getInt(1)+" ");
            System.out.println(rs.getString(2));
        }
//        st.executeUpdate("insert into emp values(3,'rishabh')");
    }
}