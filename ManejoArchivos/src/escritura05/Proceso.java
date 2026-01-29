/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Proceso {

    public static void crearArchivo(String cadena, String placa) {
        
        try {
            String ruta;
            String inicial = Proceso.obtenerCiudad(placa);
            if ((inicial.equals("L"))||(inicial.equals("G"))||(inicial.equals("G"))) {
                ruta = String.format("data/varios.txt");
            } else{
                ruta = String.format("\"data/%s.txt",inicial);
            }

            FileOutputStream fos = new FileOutputStream(ruta, true); // true = append
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);
            salida.format("%s", cadena);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }

    }

    public static String obtenerCiudad(String placa) {
        String inicial = placa.substring(0, 1);
        return inicial;
    }

}
