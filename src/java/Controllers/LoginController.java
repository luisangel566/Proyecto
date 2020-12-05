/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HECTOR
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    private static final long serialVersionUID = 1L;

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
       
        try{
            String stMensaje= "";
            if(request.getParameter("txtEmail") .equals("")){
                stMensaje +="Ingrese email,";
            }
            if(request.getParameter("txtPassword") .equals("")) {
                stMensaje +="Ingrese Password,";
            }
           
            if(!stMensaje.equals(""))throw new Exception(stMensaje.substring(0,stMensaje.length()-1));
            //intanciando objeto
            Models.clsLogin obclsLogin=new Models.clsLogin();
            obclsLogin.setStEmail(request.getParameter("txtEmail"));
            obclsLogin.setStPassword(request.getParameter("txtPassword)"));
            
            //intanciando controlador
            BL.clsLogin obBLcslLogin =new BL.clsLogin();
            
            //invoco el metodo validarLogin
            boolean blBandera= obBLcslLogin.validarLogin(obclsLogin);
            if(blBandera)
                //direcionamiento JSP
     request.getRequestDispatcher("index.jsp").forward(request, response);
            else
        throw new Exception("Email o Password incorrecto");
                                 
    }catch(Exception ex){
       request.setAttribute("stError", ex.getMessage());
       //Envio de parametros o valores
       //direcionamiento JSP
       request.getRequestDispatcher("Login.jsp").forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public  String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
