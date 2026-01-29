/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alexito
 */
public class Estadistica {

    public static void obtenerPromedio() {
        double suma=0;
        double resultado=0;
        try {
            Scanner entrada = new Scanner(new File("data/sucursales.txt"));
            entrada.nextLine();
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> listaSep = new ArrayList<>(lista);
                suma = suma + Double.parseDouble(listaSep.get(2));
                resultado = resultado + 1;
            }
            entrada.close();
        }catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
            }
        
        resultado = suma/resultado;
        System.out.printf("El promedio de los empleados de todas las empresas es:"
                + " %.2f",resultado);
    }
}
