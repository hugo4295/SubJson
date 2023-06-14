/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;

/**
 *
 * @author hugo4295
 */
public class Info_nombre {
String nombres;
String A_paterno;
String A_materno;

    public Info_nombre(String nombres, String A_paterno, String A_materno) {
        this.nombres = nombres;
        this.A_paterno = A_paterno;
        this.A_materno = A_materno;
    }

    public Info_nombre() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getA_paterno() {
        return A_paterno;
    }

    public void setA_paterno(String A_paterno) {
        this.A_paterno = A_paterno;
    }

    public String getA_materno() {
        return A_materno;
    }

    public void setA_materno(String A_materno) {
        this.A_materno = A_materno;
    }



}
