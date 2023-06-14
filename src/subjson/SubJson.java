/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subjson;

import Informacion.Datos;
import Informacion.Info_nombre;
import com.google.gson.Gson;

/**
 *
 * @author hugo4295
 */
public class SubJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Info_nombre nombrec = new Info_nombre("Victor Hugo", "De la O", "Martinez");
        Datos datos = new Datos(nombrec,46,"personal@personal.com");
        Gson gson = new Gson();
        System.out.println(gson.toJson(datos));
        String Json="{\"nombrec\":{\"nombres\":\"Angel Gabriel\",\"A_paterno\":\"Gomez\",\"A_materno\":\"Sanchez\"},\"Edad\":24,\"Correo\":\"angel@gmail.com\"}";
        datos = gson.fromJson(Json, Datos.class);
        nombrec = datos.getNombrec();
        System.out.println("Nombre "+ nombrec.getNombres());
        System.out.println("Paterno "+ nombrec.getA_paterno());
        System.out.println("Materno "+ nombrec.getA_materno());
        System.out.println("Edad "+ datos.getEdad());
        System.out.println("Correo" + datos.getCorreo());
    }

}
