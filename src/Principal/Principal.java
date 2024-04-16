/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.Scanner;

/**
 *
 * @author JuanAstaiza
 */
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {            
            System.out.println("""
                           *****************************************
                           BIENVENIDO AL CONVERTIDOR DE MONEDAS
                           *****************************************
                           1) Dólar =>> Peso argentino
                           2) Peso Argentino =>> Dólar
                           3) Dólar =>> Real brasileño
                           4) Real brasileño ==> Dólar
                           5) Dólar ==> Peso colombiano
                           6) Peso colombiano ==> Dólar
                           7) Salir
                           """);
           System.out.print("Elija una opción: ");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1 -> {
                    System.out.println("""
                                       ********************************
                                            DÓLAR A PESO ARGENTINO
                                       ********************************
                                       """);
                    System.out.println("El valor xx [USD] corresponde al valor final  de ==> xxx [ARG]");
                }
                case 2 -> {
                    System.out.println("""
                                       ********************************
                                            PESO ARGENTINO A DÓLAR
                                       ********************************
                                       """);
                    System.out.println("El valor xx [ARG] corresponde al valor final  de ==> xxx [USD]");
                }
                case 3 -> {
                    System.out.println("""
                                       ********************************
                                            DÓLAR A REAL BRASILEÑO
                                       ********************************
                                       """);
                    System.out.println("El valor xx [USD] corresponde al valor final  de ==> xxx [BRL])");

                }
                case 4 -> {
                    System.out.println("""
                                       ********************************
                                            REAL BRASILEÑO A DÓLAR 
                                       ********************************
                                       """);
                    System.out.println("El valor xx [BRL] corresponde al valor final  de ==> xxx [USD]");

                }
                case 5 -> {
                    System.out.println("""
                                       ********************************
                                            DÓLAR A PESO COLOMBIANO 
                                       ********************************
                                       """);
                    System.out.println("El valor xx [USD] corresponde al valor final  de ==> xxx [COL]");
                }
                case 6 -> {
                    System.out.println("""
                                       ********************************
                                            PESO COLOMBIANO A DÓLAR 
                                       ********************************
                                       """);
                    System.out.println("El valor xx [COL] corresponde al valor final  de ==> xxx [USD]");

                }
                case 7 -> System.out.println("""
                                       *******************************************
                                       Gracias por ultilizar nuestros servicios :)
                                       *******************************************
                                       """);
                default -> {
                    System.err.println("Error, opción incorrecta.Ingrese nuevamente.");
                }  
            }
        } while (opcion!=7);        
        
    }
}
