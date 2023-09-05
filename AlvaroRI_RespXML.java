package com.emergentes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "AlvaroRI_RespXML", urlPatterns = {"/AlvaroRI_RespXML"})
public class AlvaroRI_RespXML extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/xml;charset=UTF-8");
       PrintWriter out = response.getWriter();
       try{
            out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            out.println("<catalogo>");
            out.println("<CD>");
            out.println("<TITULO>tinta roja</TITULO>");
            out.println("ARTISTA>Andres Calamaro</ARTISTA>");
            out.println("<ORIGEN>AR</ORIGEN>");
            out.println("<PRECIO>5.90</PRECIO>");
            out.println("<AÑO>2006</AÑO>");
            out.println("</CD>");
            out.println("<CD>");
            out.println("<TITULO>La lengua popular</TITULO>");
            out.println("ARTISTA>Andres Calamaro</ARTISTA>");
            out.println("<ORIGEN>AR</ORIGEN>");
            out.println("<PRECIO>9.90</PRECIO>");
            out.println("<AÑO>2007</AÑO>");
            out.println("</CD>");
            out.println("</catalogo>");
           }finally{
                out.close();
            }
    }

}
