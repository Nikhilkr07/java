/* 20.	WAP to insert/retrieve an  image into database table.*/
package com.jdbc;

import java.io.*;
import java.sql.*;

public class Image {
    public static void main(String[] args)throws Exception {
        String img_path = "C:\\Users\\nikhi\\Pictures\\hanumanji1.jpg";
        String query = "insert into img(image_data) values(?)";

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver is found");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/image", "root", "Nikhil@123");
        System.out.println("connection is Established");

        FileInputStream fis = new FileInputStream(img_path);
        byte[] img_data = new byte[fis.available()];
        fis.read(img_data);

        PreparedStatement ps = con.prepareStatement(query);
        ps.setBytes(1,img_data);

        int effectedrow = ps.executeUpdate();
        if(effectedrow > 0){
            System.out.println("Image is inserted");
        }
        else{
            System.out.println("not inserted");
        }
    }
}
