/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Principal {
    public static void main(String[] args) {
        boolean bandera = true;
        while (bandera) {
            
                Scanner entrada = new Scanner(System.in);
                String continuar;
                String reporte;
                System.out.println("Ingrese su nombre");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese la marca de su carro");
                String marca = entrada.nextLine();
                System.out.println("Ingrese la placa de su carro");
                String placa = entrada.nextLine();
                placa = placa.toUpperCase();
                reporte = String.format("%s%s %s\n", nombre, marca, placa);
                escritura04.Proceso.agregarRegistros(reporte, placa);

                System.out.println("Ingrese C si quiere agregar otro usuario: ");
                continuar = entrada.nextLine();
                continuar = continuar.toUpperCase();
                if(continuar.equals("C")){
                    bandera = true;
                } else{
                    bandera = false;
                }
                
        }
    }
}
