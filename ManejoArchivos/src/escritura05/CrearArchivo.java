/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;

/**
 *
 * @author Alexito
 */
public class CrearArchivo {

    public static void registrarPLacas(String reporte, String placa) {
        String inicial = obtenerInicial(placa);
        try {
            if (!inicial.equals("L") && !inicial.equals("G") && !inicial.equals("P")) {
                inicial = ("varios");
            }
            
            String ruta = String.format("data/%s.txt",inicial);
            FileOutputStream fos = new FileOutputStream(ruta  , true); // true = append
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);
            
            salida.format("%s",reporte);
            salida.close();
            
        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }

    }
    public static String obtenerInicial(String placa){
        String inicial = placa.substring(0,1);
        return inicial;
    }
}
