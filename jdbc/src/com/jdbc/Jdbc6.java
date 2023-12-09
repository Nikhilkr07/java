/*Retrive the values from database table*/

package com.jdbc;
import java.sql.*;
public class Jdbc6 {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver found");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","Nikhil@123");
        System.out.println("Connection established");
        Statement st = con.createStatement();

        /*in order to retrieve the elements from database table we use to ResultSet class and fire the
        query using execute query execute methods return true if the query is select Query otherwise its
        return 0.
         */
//        boolean b = st.execute("insert into student values(7,'Kundan')");
//        System.out.println(b);
        /*its returns the false values because the query type of insert it only returns true if it is the select query
        but the query is executed successfully and value was inserted into the table*/

        boolean b = st.execute("select *from student");
        System.out.println(b);
        /*it returns true because their is select query*/

        ResultSet rs = st.getResultSet();
        /*You can retrieve the only one column value such as*/
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }


    }
}

