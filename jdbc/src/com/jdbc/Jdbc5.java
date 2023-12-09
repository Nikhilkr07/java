/*Retrive the values from database table*/

package com.jdbc;
import java.sql.*;
public class Jdbc5 {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver found");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","Nikhil@123");
        System.out.println("Connection established");
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select *from student");
//        while (rs.next()){
//            System.out.print(rs.getInt(1)+"  ");
//            System.out.println(rs.getString(2));
//        }
        /*Retrieve the element using both way either you provided the column numbers. otherwise you
        give the name of the columns such as "id" and "name".*/

        while (rs.next()){
            System.out.print(rs.getInt("id")+"  ");
            System.out.println(rs.getString("name"));
        }

    }
}
