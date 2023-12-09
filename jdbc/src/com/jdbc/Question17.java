/*17.	WAP to print all numeric digits sum of all database column values.*/
package com.jdbc;
import  java.sql.*;

public class Question17 {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","Nikhil@123");
        Statement st = con.createStatement();
        /*before we add all the numeric values of database table first we need to retrieve all
        the numeric column value first we perfrom select operation
         */
        ResultSet rs = st.executeQuery("select * from emp");
        int col1;
        String col2;
        int sum = 0;

        while (rs.next()){
            col1 = rs.getInt(1);
            sum += col1;
            col2 = rs.getString(2);
            System.out.print(col1+" ");
            System.out.println(col2);
        }

        System.out.println("The sum of numeric digits  "+sum);
    }
}
