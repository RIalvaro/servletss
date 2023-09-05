package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AlvaroRI_RespJSON", urlPatterns = {"/AlvaroRI_RespJSON"})
public class AlvaroRI_RespJSON extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
       PrintWriter out = response.getWriter();
       try{
            out.println("{\"empleados\":[");
            out.println("{\"nombre\":\"Bruno\",\"apellidos\":\"Diaz\"},");
            out.println("{\"nombre\":\"Juan Jose\",\"apellidos\":\"Paredes\"},");
            out.println("{\"nombre\":\"Dolores\",\"apellidos\":\"Fuentes\"},");
            out.println("]}");
           }finally{
                out.close();
            }
       }
    }