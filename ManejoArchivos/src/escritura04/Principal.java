/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura04;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String reporte;
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese su cedula");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su correo");
            String correo = entrada.nextLine();

            reporte = String.format("%s%s %s\n", nombre, cedula, correo);
            Proceso.agregarRegistros(reporte, cedula);
        }
    }
}
