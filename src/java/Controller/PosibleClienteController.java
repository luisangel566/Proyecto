/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.clsPosibleCliente;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HECTOR
 */
@WebServlet(name = "PosibleClienteController", urlPatterns = {"/PosibleClienteController"})
@SuppressWarnings("serial")
public class PosibleClienteController extends HttpServlet {

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
        
        if (request.getParameter("btnGuardar") != null) {
            btnGuardar(request, response);
            
        } else if (request.getParameter("btnModificar") != null) {
            btnModificar(request, response);
        } else if (request.getParameter("btnCancelar") != null) {
            
        } else if (request.getParameter("codigoSeleccionado") != null) {
            if (request.getParameter("stOpcion").equals("M")) {
                
                cargarModificar(request, response);
                
            } else if (request.getParameter("stOpcion").equals("E")) {
                btnEliminar(request, response);
            }
            
        }
    }
public void btnModificar(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException {
        
        try {
           
            List<Models.clsPosibleCliente> lstclsPosiblesClientes = new ArrayList<Models.clsPosibleCliente>();
            
            HttpSession session = request.getSession(true);
            
            if(session.getAttribute("session_lstclsPosiblesClientes") != null){
            
            lstclsPosiblesClientes = (List<Models.clsPosibleCliente>) session.getAttribute("session_lstclsPosiblesClientes");
            
            }
            
           int inPosicion = 0;
           
            for (clsPosibleCliente elem : lstclsPosiblesClientes) {
                if(elem.getInCodigo()== Integer.parseInt(request.getParameter("codigoModificar"))){
                
                break;
                
                }
                inPosicion++;
            }
            
            Models.clsFuentePosibleCliente obclsFuentePosibleCliente = new Models.clsFuentePosibleCliente();
            Models.clsEstadoPosibleCliente obclsEstadoPosibleCliente = new Models.clsEstadoPosibleCliente();
            Models.clsSector obclsSector = new Models.clsSector();
            Models.clsCalificacion obclsCalificacion = new Models.clsCalificacion();
            
            if (request.getParameter("txtEmpresa") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStEmpresa(request.getParameter("txtEmpresa"));
                
            }
            if (request.getParameter("txtNombre") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStNombre(request.getParameter("txtNombre"));
                
            }
            if (request.getParameter("txtApellidos") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStApellidos(request.getParameter("txtApellidos"));
                
            }
            if (request.getParameter("txtTitulo") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStTitulo(request.getParameter("txtTitulo"));
                
            }
            if (request.getParameter("txtCorreoElectronico") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStCorreoelectronico(request.getParameter("txtCorreoElectronico"));
                
            }
            if (request.getParameter("txtTelefono") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStTelefono(request.getParameter("txtTelefono"));
                
            }
            if (request.getParameter("txtFax") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStFax(request.getParameter("txtFax"));
                
            }
            if (request.getParameter("txtMovile") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStMovil(request.getParameter("txtMovile"));
                
            }
            if (request.getParameter("txtSitioWed") != null) {
                lstclsPosiblesClientes.get(inPosicion).setStSitioWeb(request.getParameter("txtSitioWed"));
                
            }
            if (request.getParameter("ddlFuentePosibleCliente") != null) {
                obclsFuentePosibleCliente.setInCodigo(Integer.parseInt(request.getParameter("ddlFuentePosibleCliente")));
                String stDescripcion = "";
                if (request.getParameter("ddlFuentePosibleCliente").equals("1")) {
                    stDescripcion = "None";
                    
                } else if (request.getParameter("ddlFuentePosibleCliente").equals("2")) {
                    
                    stDescripcion = "Aviso";
                } else if (request.getParameter("ddlFuentePosibleCliente").equals("3")) {
                    
                    stDescripcion = "Llamada no solicitada";
                } else if (request.getParameter("ddlFuentePosibleCliente").equals("4")) {
                    
                    stDescripcion = "Recomendacion empleado";
                    
                } else if (request.getParameter("ddlFuentePosibleCliente").equals("5")) {
                    
                    stDescripcion = "Recomendacion Externa";
                } else if (request.getParameter("ddlFuentePosibleCliente").equals("6")) {
                    
                    stDescripcion = "Tienda en linea";
                }
                
                obclsFuentePosibleCliente.setStDescripcion(stDescripcion);
                
                lstclsPosiblesClientes.get(inPosicion).setObclsFuentePosibleCliente(obclsFuentePosibleCliente);
            }
            if (request.getParameter("ddlEstadoPosibleCliente") != null) {
                obclsEstadoPosibleCliente.setInCodigo(Integer.parseInt(request.getParameter("ddlEstadoPosibleCliente")));
                String stDescripcion = "";
                if (request.getParameter("ddlEstadoPosibleCliente").equals("1")) {
                    stDescripcion = "None";
                    
                } else if (request.getParameter("ddlEstadoPosibleCliente").equals("2")) {
                    
                    stDescripcion = "Intento de Contacto";
                } else if (request.getParameter("ddlEstadoPosibleCliente").equals("3")) {
                    
                    stDescripcion = "Contactar en el Futuro";
                } else if (request.getParameter("ddlEstadoPosibleCliente").equals("4")) {
                    
                    stDescripcion = "Contactado";
                    
                } else if (request.getParameter("ddlEstadoPosibleCliente").equals("5")) {
                    
                    stDescripcion = "Posiblecliente no solicitado";
                } else if (request.getParameter("ddlEstadoPosibleCliente").equals("6")) {
                    
                    stDescripcion = "Posible cliente perdido";
                }
                obclsEstadoPosibleCliente.setStDescripcion(stDescripcion);
                
                lstclsPosiblesClientes.get(inPosicion).setObclsEstadoposiblecliente(obclsEstadoPosibleCliente);
            }
            if (request.getParameter("ddlSector") != null) {
                obclsSector.setIntCodigo(Integer.parseInt(request.getParameter("ddlSector")));
                String stDescripcion = "";
                
                if (request.getParameter("ddlSector").equals("1")) {
                    stDescripcion = "None";
                    
                } else if (request.getParameter("ddlSector").equals("2")) {
                    
                    stDescripcion = "APS (Proveedor de aplicaciones";
                } else if (request.getParameter("ddlSector").equals("3")) {
                    
                    stDescripcion = "OEM de datos";
                } else if (request.getParameter("ddlSector").equals("4")) {
                    
                    stDescripcion = "ERP (Planificacion de de recursos de empresa)";
                    
                } else if (request.getParameter("ddlSector").equals("5")) {
                    
                    stDescripcion = "Gobierno/Ejercito";
                } else if (request.getParameter("ddlSector").equals("6")) {
                    
                    stDescripcion = "Empresa Grande";
                }
                obclsSector.setStDescripcion(stDescripcion);
                
                lstclsPosiblesClientes.get(inPosicion).setObclsSector(obclsSector);
            }
            
            if (request.getParameter("txtCantidadEmpleados") != null) {
                
                lstclsPosiblesClientes.get(inPosicion).setIncantidadempleados(Integer.parseInt(request.getParameter("txtCantidadEmpleados")));
            }
            if (request.getParameter("txtIngresosAnuales") != null) {
                
                lstclsPosiblesClientes.get(inPosicion).setDbIngresosAnuales(Double.parseDouble(request.getParameter("txtIngresosAnuales")));
            }
            if (request.getParameter("ddlCalificacion") != null) {
                obclsCalificacion.setInCodigo(Integer.parseInt(request.getParameter("ddlCalificacion")));
                String stDescripcion = "";
                
                if (request.getParameter("ddlCalificacion").equals("1")) {
                    stDescripcion = "None";
                    
                } else if (request.getParameter("ddlCalificacion").equals("2")) {
                    
                    stDescripcion = "Adquirido";
                } else if (request.getParameter("ddlCalificacion").equals("3")) {
                    
                    stDescripcion = "Activo";
                } else if (request.getParameter("ddlCalificacion").equals("4")) {
                    
                    stDescripcion = "Fallo de Mercado";
                    
                } else if (request.getParameter("ddlCalificacion").equals("5")) {
                    
                    stDescripcion = "Proyecto Cancelado";
                } else if (request.getParameter("ddlCalificacion").equals("6")) {
                    
                    stDescripcion = "Apagar";
                }
                obclsCalificacion.setStDescripcion(stDescripcion);
                
                lstclsPosiblesClientes.get(inPosicion).setObclsCalificacion(obclsCalificacion);
            }
            if (request.getParameter("chNoParticipacionCorreoElectronico") != null) {
                
                char chSeleccion = request.getParameter("chNoParticipacionCorreoElectronico").equals("on")
                        ? 's' : 'N';
                lstclsPosiblesClientes.get(inPosicion).setBlNoparticipacionCorreoElectronico(true);
            } else {
               lstclsPosiblesClientes.get(inPosicion).setBlNoparticipacionCorreoElectronico('N');
            }
            
            if (request.getParameter("txtIDSkype") != null) {
                
                lstclsPosiblesClientes.get(inPosicion).setStIDskype(request.getParameter("txtIDSkype"));
            }
            if (request.getParameter("txtTwitter") != null) {
                
                lstclsPosiblesClientes.get(inPosicion).setStTwitter(request.getParameter("txtTwitter"));
            }
            if (request.getParameter("txtCorreoSecundario") != null) {
                
                lstclsPosiblesClientes.get(inPosicion).setStCorreoElectronicosecundario(request.getParameter("txtCorreoSecundario"));
            }
            
            session.setAttribute("session_lstclsPosiblesClientes", lstclsPosiblesClientes);
            
            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            request.setAttribute("stTipo", "success");
            
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);
                
            
        } catch (Exception ex) {
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);
            
        }
    }
  public void cargarModificar(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException {
        
        try {
            
            Models.clsPosibleCliente obclsPosiblesClientes = new Models.clsPosibleCliente();
            
            List<Models.clsPosibleCliente> lstclsPosiblesClientes = new ArrayList<Models.clsPosibleCliente>();
            
            HttpSession session = request.getSession(true);
            if (session.getAttribute("session_lstclsPosiblesClientes") != null) {
                
                lstclsPosiblesClientes = (List<Models.clsPosibleCliente>) session.getAttribute("session_lstclsPosiblesClientes");
            }
            for (Models.clsPosibleCliente item : lstclsPosiblesClientes) {
                
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSeleccionado"))) {
                    
                    obclsPosiblesClientes = item;
                    
                }
                
            }
            
            request.setAttribute("obclsPosiblesClientes", obclsPosiblesClientes);
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);
            
        } catch (Exception ex) {
            request.setAttribute("stTipo", "error");
            request.setAttribute("stMensaje", ex.getMessage());
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);
        }
    }

    public void btnEliminar(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException {
        try {
            //MODELOS SOBRE EL QUE ESTAMOS TRABAJANDO
            Models.clsPosibleCliente obclsPosiblesCliente = new Models.clsPosibleCliente();
            //LISTA DE OBJETO DONDE ESTA LA INFORMCAION GUARDADA
            List<Models.clsPosibleCliente> lstclsPosiblesClientes = new ArrayList<Models.clsPosibleCliente>();
          
            HttpSession session = request.getSession(true);

            if (session.getAttribute("session_lstclsPosiblesClientes") != null) {
                lstclsPosiblesClientes = (List<Models.clsPosibleCliente>) session.getAttribute("session_lstclsPosiblesClientes");                
            }

            for (Models.clsPosibleCliente item : lstclsPosiblesClientes) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSeleccionado"))) {
                    obclsPosiblesCliente = item;
                    break;
                }
            }

            session.setAttribute("session_lstclsPosiblesClientes", lstclsPosiblesClientes);
            request.setAttribute("stTipo", "success");
            request.setAttribute("stMensaje", "se realizo progreso con exito");
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);
        } catch (Exception ex) {
            request.setAttribute("stTipo", "error");
            request.setAttribute("stMensaje", ex.getMessage());
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);
        }
    }

    public void btnGuardar(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        try {

            //DEFINICION DE MODELOS
            Models.clsPosibleCliente obclsPosiblesClientes = new Models.clsPosibleCliente();
            Models.clsFuentePosibleCliente obclsFuentePosibleCliente = new Models.clsFuentePosibleCliente();
            Models.clsEstadoPosibleCliente obclsEstadoPosibleCliente = new Models.clsEstadoPosibleCliente();
            Models.clsSector obclsSector = new Models.clsSector();
            Models.clsCalificacion obclsCalificacion = new Models.clsCalificacion();

            //ASIGNACION DE ATRIBUTOS O PROPIEDADES
            if (request.getParameter("txtEmpresa") != null) {
                obclsPosiblesClientes.setStEmpresa(request.getParameter("txtEmpresa"));
            }
            if (request.getParameter("txtNombre") != null) {
                obclsPosiblesClientes.setStNombre(request.getParameter("txtNombre"));
            }
            if (request.getParameter("txtApellidos") != null) {
                obclsPosiblesClientes.setStApellidos(request.getParameter("txtApellidos"));
            }
            if (request.getParameter("txtTitulo") != null) {
                obclsPosiblesClientes.setStTitulo(request.getParameter("txtTitulo"));
            }
            if (request.getParameter("txtCorreoElectronico") != null) {
                obclsPosiblesClientes.setStCorreoelectronico(request.getParameter("txtCorreoElectronico"));
            }
            if (request.getParameter("txtTelefono") != null) {
                obclsPosiblesClientes.setStTelefono(request.getParameter("txtTelefono"));
            }
            if (request.getParameter("txtMovil") != null) {
                obclsPosiblesClientes.setStMovil(request.getParameter("txtMovil"));
            }
            if (request.getParameter("txtWeb") != null) {
                obclsPosiblesClientes.setStSitioWeb(request.getParameter("txtWeb"));
            }
            if (request.getParameter("ddlFuentePosibleCliente") != null) {
                //MODELO HIJO
                obclsFuentePosibleCliente.setInCodigo(Integer.parseInt(request.getParameter("ddlFuentePosibleCliente")));

                String stDescripcion = "";
                switch (request.getParameter("ddlFuentePosibleCliente")) {
                    case "1":
                        stDescripcion = "Ninguno";
                        break;
                    case "2":
                        stDescripcion = "Aviso";
                        break;
                    case "3":
                        stDescripcion = "Llamada no solicitada";
                        break;
                    case "4":
                        stDescripcion = "Recomendacion de empleado";
                        break;
                    case "5":
                        stDescripcion = "Recomendacion esterna";
                        break;
                    case "6":
                        stDescripcion = "Tienda en linea";
                        break;
                    default:
                        break;
                }
                obclsFuentePosibleCliente.setStDescripcion(stDescripcion);

                //ASIGNO EL MODELO PADRE
                obclsPosiblesClientes.setObclsFuentePosibleCliente(obclsFuentePosibleCliente);
            }
            if (request.getParameter("ddlEstadoPosibleCliente") != null) {
                //MODELO HIJO
                obclsEstadoPosibleCliente.setInCodigo(Integer.parseInt(request.getParameter("ddlEstadoPosibleCliente")));

                String stDescripcion = "";
                switch (request.getParameter("ddlEstadoPosibleCliente")) {
                    case "1":
                        stDescripcion = "Ninguno";
                        break;
                    case "2":
                        stDescripcion = "Intento de contacto";
                        break;
                    case "3":
                        stDescripcion = "Contactar en el futuro";
                        break;
                    case "4":
                        stDescripcion = "Contactado";
                        break;
                    case "5":
                        stDescripcion = "Posible cliente no solicitado";
                        break;
                    case "6":
                        stDescripcion = "Posible cliente perdido";
                        break;
                    default:
                        break;
                }
                obclsEstadoPosibleCliente.setStDescripcion(stDescripcion);

                //ASIGNO EL MODELO PADRE
                obclsPosiblesClientes.setObclsEstadoposiblecliente(obclsEstadoPosibleCliente);
            }
            if (request.getParameter("ddlSector") != null) {
                //MODELO HIJO
                obclsSector.setIntCodigo(Integer.parseInt(request.getParameter("ddlSector")));

                String stDescripcion = "";
                switch (request.getParameter("ddlSector")) {
                    case "1":
                        stDescripcion = "Ninguno";
                        break;
                    case "2":
                        stDescripcion = "Aps(provedor de servicios de aplicaciones)";
                        break;
                    case "3":
                        stDescripcion = "OEM de datos";
                        break;
                    case "4":
                        stDescripcion = "ERP(Planificacion de recursos de empresa";
                        break;
                    case "5":
                        stDescripcion = "Gobierno/Ejercito";
                        break;
                    case "6":
                        stDescripcion = "Empresa Grande";
                        break;
                    default:
                        break;
                }
                obclsSector.setStDescripcion(stDescripcion);

                //ASIGNO EL MODELO PADRE
                obclsPosiblesClientes.setObclsSector(obclsSector);
            }
            if (request.getParameter("txtCantidadEmpleados") != null) {
                obclsPosiblesClientes.setIncantidadempleados(Integer.parseInt(request.getParameter("txtCantidadEmpleados")));
            }
            if (request.getParameter("txtIngresosAnuales") != null) {
                obclsPosiblesClientes.setDbIngresosAnuales(Double.parseDouble(request.getParameter("txtIngresosAnuales")));
            }
            if (request.getParameter("ddlCalificacion") != null) {
                //MODELO HIJO
                obclsCalificacion.setInCodigo(Integer.parseInt(request.getParameter("ddlCalificacion")));

                String stDescripcion = "";
                switch (request.getParameter("ddlCalificacion")) {
                    case "1":
                        stDescripcion = "Ninguno";
                        break;
                    case "2":
                        stDescripcion = "Abquirido";
                        break;
                    case "3":
                        stDescripcion = "Activo";
                        break;
                    case "4":
                        stDescripcion = "Contactado";
                        break;
                    case "5":
                        stDescripcion = "Proyecto cancelado";
                        break;
                    case "6":
                        stDescripcion = "Apagar";
                        break;
                    default:
                        break;
                }
                obclsCalificacion.setStDescripcion(stDescripcion);

                //ASIGNO EL MODELO PADRE
                obclsPosiblesClientes.setObclsCalificacion(obclsCalificacion);
            }
            if (request.getParameter("chkNoParticipacionCorreoElectronico") != null) {
                boolean chSeleccion = request.getParameter("chkNoParticipacionCorreoElectronico").equals("on")
                        ? true : false;
                obclsPosiblesClientes.setBlNoparticipacionCorreoElectronico(chSeleccion);
            }
            if (request.getParameter("txtIDSkype") != null) {
                obclsPosiblesClientes.setStIDskype(request.getParameter("txtIDSkype"));
            }
            if (request.getParameter("txtTwitter") != null) {
                obclsPosiblesClientes.setStTwitter(request.getParameter("txtTwitter"));
            }
            if (request.getParameter("txtCorreoelectronicosecundario") != null) {

                obclsPosiblesClientes.setStCorreoElectronicosecundario(request.getParameter("txtCorreoelectronicosecundario"));
            }

            HttpSession session = request.getSession(true);
            //LISTA DE OBJETOS
            List<Models.clsPosibleCliente> lstclsPosibleCliente
                    = new ArrayList<Models.clsPosibleCliente>();

            //VALIDAMOS LA PREVIA EXISTENCIA DE LA VARIABLE DE SESSION
            if (session.getAttribute("session_lstclsPosibleClientes") != null) {
                lstclsPosibleCliente = (List<Models.clsPosibleCliente>) session.getAttribute("session_lstclsPosiblesClientes");

            }
            //PARA CALCULO AUTOMATICO QUE IDENTIFICA ESE REGISTRO
            int inCodigo = lstclsPosibleCliente.size() + 1;
            obclsPosiblesClientes.setInCodigo(inCodigo);

            //AGREGAMOS EL OBJETO A LA LISTA
            lstclsPosibleCliente.add(obclsPosiblesClientes);
            //CREAMOS VARIABLE DE SESSION
            session.setAttribute("session_lstclsPosiblesClientes", lstclsPosibleCliente);

            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", "Se realizo proceso con exito");
            request.setAttribute("stTipo", "success");

            //REDIRRECIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);

        } catch (NumberFormatException ex) {
            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRRECIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);
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
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
