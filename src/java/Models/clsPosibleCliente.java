/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author HECTOR
 */
public class clsPosibleCliente {
    private String Empresa;

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getStNombre() {
        return stNombre;
    }

    public void setStNombre(String stNombre) {
        this.stNombre = stNombre;
    }

    public String getStApellidos() {
        return stApellidos;
    }

    public void setStApellidos(String stApellidos) {
        this.stApellidos = stApellidos;
    }

    public String getStTitulo() {
        return stTitulo;
    }

    public void setStTitulo(String stTitulo) {
        this.stTitulo = stTitulo;
    }

    public String getStCorreoelectronico() {
        return stCorreoelectronico;
    }

    public void setStCorreoelectronico(String stCorreoelectronico) {
        this.stCorreoelectronico = stCorreoelectronico;
    }

    public String getStTelefono() {
        return stTelefono;
    }

    public void setStTelefono(String stTelefono) {
        this.stTelefono = stTelefono;
    }

    public String getStFax() {
        return stFax;
    }

    public void setStFax(String stFax) {
        this.stFax = stFax;
    }

    public String getStMovil() {
        return stMovil;
    }

    public void setStMovil(String stMovil) {
        this.stMovil = stMovil;
    }

    public String getStsitioweb() {
        return stsitioweb;
    }

    public void setStsitioweb(String stsitioweb) {
        this.stsitioweb = stsitioweb;
    }

    public clsFuentePosibleCliente getObclsFuentePosibleCliente() {
        return obclsFuentePosibleCliente;
    }

    public void setObclsFuentePosibleCliente(clsFuentePosibleCliente obclsFuentePosibleCliente) {
        this.obclsFuentePosibleCliente = obclsFuentePosibleCliente;
    }

    public clsEstadoPosibleCliente getObclsEstadoposiblecliente() {
        return obclsEstadoposiblecliente;
    }

    public void setObclsEstadoposiblecliente(clsEstadoPosibleCliente obclsEstadoposiblecliente) {
        this.obclsEstadoposiblecliente = obclsEstadoposiblecliente;
    }

    public clsSector getObclsSector() {
        return obclsSector;
    }

    public void setObclsSector(clsSector obclsSector) {
        this.obclsSector = obclsSector;
    }

    public int getIncantidadempleados() {
        return incantidadempleados;
    }

    public void setIncantidadempleados(int incantidadempleados) {
        this.incantidadempleados = incantidadempleados;
    }

    public double getDbIngresosAnuales() {
        return dbIngresosAnuales;
    }

    public void setDbIngresosAnuales(double dbIngresosAnuales) {
        this.dbIngresosAnuales = dbIngresosAnuales;
    }

    public clsCalificacion getObclsCalificacion() {
        return obclsCalificacion;
    }

    public void setObclsCalificacion(clsCalificacion obclsCalificacion) {
        this.obclsCalificacion = obclsCalificacion;
    }

    public boolean isBlNoparticipacionCorreoElectronico() {
        return blNoparticipacionCorreoElectronico;
    }

    public void setBlNoparticipacionCorreoElectronico(boolean blNoparticipacionCorreoElectronico) {
        this.blNoparticipacionCorreoElectronico = blNoparticipacionCorreoElectronico;
    }

    public String getStIDskype() {
        return stIDskype;
    }

    public void setStIDskype(String stIDskype) {
        this.stIDskype = stIDskype;
    }

    public String getStTwitter() {
        return stTwitter;
    }

    public void setStTwitter(String stTwitter) {
        this.stTwitter = stTwitter;
    }

    public String getStCorreoElectronicosecundario() {
        return stCorreoElectronicosecundario;
    }

    public void setStCorreoElectronicosecundario(String stCorreoElectronicosecundario) {
        this.stCorreoElectronicosecundario = stCorreoElectronicosecundario;
    }
    //ATRIBUTOS O PROPIEDADES
    private int intCodigo;
    private String stEmpresa;
    private String stNombre;
    private String stApellidos;
    private  String stTitulo;
    private  String stCorreoelectronico;
    private  String stTelefono;
    private String stFax;
    private  String stMovil;
    private  String stsitioweb;
    private clsFuentePosibleCliente obclsFuentePosibleCliente;
    private  clsEstadoPosibleCliente obclsEstadoposiblecliente;
    private clsSector obclsSector;
    private int  incantidadempleados;
    private double dbIngresosAnuales;
    private clsCalificacion obclsCalificacion;
    private boolean blNoparticipacionCorreoElectronico;
    private   String stIDskype;
    private  String stTwitter;
    private String stCorreoElectronicosecundario;                                          

    public void FuentePosibleCliente(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the intCodigo
     */
    private int getIntCodigo() {
        return intCodigo;
    }

    /**
     * @param intCodigo the intCodigo to set
     */
    private void setIntCodigo(int intCodigo) {
        this.intCodigo = intCodigo;
    }

    /**
     * @param stEmpresa the stEmpresa to set
     */
    private void setStEmpresa(String stEmpresa) {
        this.stEmpresa = stEmpresa;
    }

    private void setStDescripcion(String atDescripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
