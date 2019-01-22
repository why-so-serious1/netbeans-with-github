/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Chanpreet
 */
public class Servlet_Demo1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet_Demo1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet_Demo1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            String first_name,last_name;
            String url="mysql:jdbc://localhost:3306/practice";
            String uname="root";
            String pass="root";
            String query="insert into table2 values(?,?)";
            
            
            
             first_name=request.getParameter("fname");
             last_name=  request.getParameter("lname");
            
            Connection con=DriverManager.getConnection(url,uname,pass) ;
            PreparedStatement ps=con.prepareStatement(query);
            PrintWriter out= response.getWriter();
            try {
                
                
                out.println("hello bois"+first_name+" "+last_name);
                Class.forName("com.mysql.jdbc.cj.Driver");
                
                
                try {
                    ps.setString(1,first_name);
                } catch (SQLException ex) {
                    Logger.getLogger(Servlet_Demo1.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    ps.setString(2, last_name);
                } catch (SQLException ex) {
                    Logger.getLogger(Servlet_Demo1.class.getName()).log(Level.SEVERE, null, ex);
                }
                int count=ps.executeUpdate();
                out.println(count+" no. of row(s) affected");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Servlet_Demo1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Servlet_Demo1.class.getName()).log(Level.SEVERE, null, ex);
            }
            out.println("no error");
        } catch (SQLException ex) {
            Logger.getLogger(Servlet_Demo1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
