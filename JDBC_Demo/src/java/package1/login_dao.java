/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;
import java.sql.*;
/**
 *
 * @author Chanpreet
 */
public class login_dao {
    public static boolean validate(String uname,String pass)
      
    {
        String url="jdbc:mysql://localhost:3306/login";
        String username1="root";
        String password1="root";
        String query="select * from table1 where username=? and password=?";
        boolean status=false;
        
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,username1,password1);
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1, uname);
        ps.setString(2, pass);
        ResultSet rs=ps.executeQuery();
        status=rs.next();
        }catch(Exception e)
        {
            System.out.print(e);
        }
    return status;
    }
}
