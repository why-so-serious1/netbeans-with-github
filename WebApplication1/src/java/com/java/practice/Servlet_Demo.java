/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chanpreet
 */
@WebServlet(name = "Servlet_Demo", urlPatterns = {"/Servlet_Demo"})
public class Servlet_Demo extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        out.println("Hello World");
    }

    /**
     * Returns a short description of the servlet.
     *00
     * @return a String containing servlet description
     */

}
