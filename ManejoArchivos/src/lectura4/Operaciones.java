/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura4;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Operaciones {

    public static void promedio() {

        double suma = 0;
        double resultado;
        double contador = 0;
        double numero = 0;

        try {
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));
            if (entrada.hasNextLine()) {
                entrada.nextLine();  
            }
            while (entrada.hasNext()) {

                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                numero = Double.parseDouble(linea_partes.get(3));
                suma = suma + numero;
                contador = contador + 1;
            }
            entrada.close();
        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
        resultado = suma / contador;
        System.out.println(resultado);
    }
}
