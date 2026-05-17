package com.example.servlet;

// Import required servlet classes
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

// @WebServlet Annotation ->  This annotation tells the servlet container:
//  Whenever user hits /firstServlet URL, * execute this servlet class."
//  Map this servlet with URL pattern "/firstServlet"
@WebServlet("/firstServlet")

// Every Servlet class must extend HttpServlet
// so that it can use HTTP methods like:doGet(), doPost(), doPut(), doDelete()
public class FirstServletApp extends HttpServlet {

    // Constructor -> Servlet container (Tomcat) creates servlet object only once
    // when the servlet is loaded. (Runs only one time)
    public FirstServletApp()
    {
        System.out.println("Servlet Object is Created Internally by Container");
    }

    /*
     * doPost() method handles POST requests
     * request  -> takes data from client
     * response -> sends data back to client
     */
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException
    {

        // request.getParameter("fieldName") -> Used to fetch form data from HTML page.
        // Get html form data using parameter names

        // Fetch username entered by user , store in String(name,ucity)
        String name = request.getParameter("uname");
        String ucity = request.getParameter("ucity");


        // response.getWriter() -> Creates PrintWriter object.
        // PrintWriter is used to send response to browser
        PrintWriter writer = response.getWriter();

        // writer.println() -> Prints text on browser page.
        // Send response to client
        writer.println("Hello " + name);
        writer.println("I know you are from " + ucity);

        // Close writer object
        writer.close();
    }
}