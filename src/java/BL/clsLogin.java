/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

/**
 *
 * @author HECTOR
 */
public class clsLogin {

    public boolean validarLogin(Models.clsLogin obclsLogin) {
        try {

            return obclsLogin.getStEmail().equals("luisdx5666@gmail.com")
                    && obclsLogin.getStPassword().equals("vegueta7777");

        } catch (Exception ex) {
            throw ex;
        }
    }
}
    
