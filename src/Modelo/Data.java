/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author linusdufol
 */
public class Data {
    private String any;
    private String mes;
    private String idiomaIn;
    private String idiomaOut;

    public Data(String any, String mes, String idiomaIn, String idiomaOut) {
        this.any = any;
        this.mes = mes;
        this.idiomaIn = idiomaIn;
        this.idiomaOut = idiomaOut;
    }

    public String getAny() {
        return any;
    }

    public void setAny(String any) {
        this.any = any;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getIdiomaIn() {
        return idiomaIn;
    }

    public void setIdiomaIn(String idiomaIn) {
        this.idiomaIn = idiomaIn;
    }

    public String getIdiomaOut() {
        return idiomaOut;
    }

    public void setIdiomaOut(String idiomaOut) {
        this.idiomaOut = idiomaOut;
    }
    public void print() {
        System.out.println(getAny());
        System.out.println(getMes());
        System.out.println(getIdiomaIn());
        System.out.println(getIdiomaOut());
    }
    
}
