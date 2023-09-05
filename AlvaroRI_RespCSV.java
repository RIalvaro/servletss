package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AlvaroRI_RespCSV", urlPatterns = {"/AlvaroRI_RespCSV"})
public class AlvaroRI_RespCSV extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("aplication/HTML");
       response.setHeader("Content-Dsiposition", "attachment;filename=archivo.csv");
       PrintWriter out = response.getWriter();
       try{
            out.println("id,tnombre;apellidos;edad");
            out.println("1;Juan;Pinto;21");
            out.println("2;Bruno;Diaz;18");            
            out.println("3;Armando;Mesa;30");
       }finally{
           out.close();
       }
    }

}
