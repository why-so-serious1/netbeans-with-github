/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.sql.*;


/**
 *
 * @author Chanpreet
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String url="jdbc:mysql://localhost:3306/login";
        String uname="root";
        String pass="root";
       // Class.forName("com.mysql.cj.jdbc.Driver");
        String query="select * from table1";
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,uname,pass);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        String name=rs.getString(1);
        System.out.print(name);
        st.close();
        con.close();
    }
    
}
