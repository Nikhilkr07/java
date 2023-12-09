/*insert value from database table */
package com.jdbc;
import  java.sql.*;
public class Jdbc2 {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Found");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","Nikhil@123");
        System.out.println("Connection is established");
        Statement st = con.createStatement();
        int i = st.executeUpdate("insert into student values(1,'Nikhil')");
        st.executeUpdate("insert into student values(2,'Nitesh')");
        st.executeUpdate("insert into student values(3,'Sonu')");
        st.executeUpdate("insert into student values(4,'Suraj')");
        st.executeUpdate("insert into student values(5,'Chandan')");
        st.executeUpdate("insert into student values(6,'Vishal')");

        System.out.println(i);
    }
}
