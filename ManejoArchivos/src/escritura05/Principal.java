/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import escritura04.Operacion;
import java.util.Scanner;

/**
 *
 * @author Alexito
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String reporte;
        boolean bandera = true;
        while(bandera){
            System.out.println("Ingrese su Nombre: ");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la marca de su carro: ");
            String marca = entrada.nextLine();
            System.out.println("Ingrese placa: ");
            String placa = entrada.nextLine();
            reporte = String.format("%s %s %s\n",nombre,marca,placa);
            
            CrearArchivo.registrarPLacas(reporte, placa);
            
            
            
            System.out.println("Ingrese C para seguir agregando usuarios: ");
            String opcion = entrada.nextLine();
            opcion = opcion.toUpperCase();
            if(!opcion.equals("C")){
                bandera =false;
            }
        }
    }
}
