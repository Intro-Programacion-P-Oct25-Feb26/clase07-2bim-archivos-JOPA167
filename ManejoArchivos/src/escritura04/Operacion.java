/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura04;


import java.io.File;
import java.util.Formatter;

/**
 *
 * @author Alexito
 */
public class Operacion {
    public static void crearArchivo(String reporte, String cedula) {
        
        try{ 
            
            String ruta =String.format("data/%s.txt",cedula);
            Formatter salida = new Formatter(ruta);
            salida.format("%s", reporte);
            salida.close();
            
            
            
            
        }catch(Exception e) {
            System.err.println("Error al crear el archivo.");
            System.out.println(e);
            System.exit(1);
        }
    }
}
