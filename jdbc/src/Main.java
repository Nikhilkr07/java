
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver found");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","Nikhil@123");
        System.out.println("Driver found");
        //Statement st = con.createStatement();
//
//        int i = st.executeUpdate("insert into emp values(1,'chandan')");
//        ResultSet rs = st.executeQuery("select *from emp");
        //ResultSet rs1 = st.executeQuery("select COUNT(*) As TotalEmp from emp ");
//        while(rs.next()){
//            System.out.print(rs.getInt(1)+" ");
//            System.out.println(rs.getString(2));
//        }
    }

}