/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chanpreet
 */
public class Servlet_JDBC extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        String uname1=request.getParameter("uname");
        String pass1=request.getParameter("pass");
        if(login_dao.validate(uname1, pass1))
        {
               RequestDispatcher rd=request.getRequestDispatcher("Servlet2");
               rd.forward(request,response);
        }
        else 
        {
            out.println("Sorry wrong details");
           
            RequestDispatcher rd=request.getRequestDispatcher("/index.html");
            rd.include(request, response);
       
             
        }
    }

}
