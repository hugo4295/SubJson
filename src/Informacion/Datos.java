/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;

/**
 *
 * @author hugo4295
 */
public class Datos {
    Info_nombre nombrec;
    int Edad;
    String Correo;

    public Datos() {
    }

    public Datos(Info_nombre nombrec, int Edad, String Correo) {
        this.nombrec = nombrec;
        this.Edad = Edad;
        this.Correo = Correo;
    }

    public Info_nombre getNombrec() {
        return nombrec;
    }

    public void setNombrec(Info_nombre nombrec) {
        this.nombrec = nombrec;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    
}
