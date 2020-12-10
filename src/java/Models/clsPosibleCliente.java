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

    public String getStSitioWeb() {
        return stSitioWeb;
    }

    public void setStSitioWeb(String stSitioWeb) {
        this.stSitioWeb = stSitioWeb;
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
    public int inCodigo;
    public String stEmpresa;
    public String stNombre;
    public String stApellidos;
    public String stTitulo;
    public String stCorreoelectronico;
    public String stTelefono;
    public String stFax;
    public String stMovil;
    public String stSitioWeb;
    public clsFuentePosibleCliente obclsFuentePosibleCliente;
    public clsEstadoPosibleCliente obclsEstadoposiblecliente;
    public clsSector obclsSector;
    public int incantidadempleados;
    public double dbIngresosAnuales;
    public clsCalificacion obclsCalificacion;
    public boolean blNoparticipacionCorreoElectronico;
    public String stIDskype;
    public String stTwitter;
    public String stCorreoElectronicosecundario;

   

    /**
     * @return the intCodigo
     */
    public int getInCodigo() {
        return inCodigo;
    }

    /**
     @param intCodigo the intCodigo to set
     */
    public void setInCodigo(int inCodigo) {
        this.inCodigo = inCodigo;
    }

    /**
     * @param stEmpresa the stEmpresa to set
     */
    public void setStEmpresa(String stEmpresa) {
        this.stEmpresa = stEmpresa;
    }

    public String getStEmpresa() {
        return stEmpresa;
    }

    public void setBlNoparticipacionCorreoElectronico(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
