/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Clases.conversion_monedas;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanAstaiza
 */
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion,cantidad;
        do {            
            System.out.println("""
                           *****************************************
                           BIENVENIDO AL CONVERTIDOR DE MONEDAS
                           *****************************************
                       Programa que permite calcular conversión de monedas.
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
                    cantidad = lectura();
                    conversion("USD", "ARS", cantidad);                    
                }
                case 2 -> {
                    System.out.println("""
                                       ********************************
                                            PESO ARGENTINO A DÓLAR
                                       ********************************
                                       """);
                    cantidad = lectura();
                    conversion("ARS", "USD", cantidad);                    
                }
                case 3 -> {
                    System.out.println("""
                                       ********************************
                                            DÓLAR A REAL BRASILEÑO
                                       ********************************
                                       """);
                    cantidad = lectura();  
                    conversion("USD", "BRL", cantidad);                    

                }
                case 4 -> {
                    System.out.println("""
                                       ********************************
                                            REAL BRASILEÑO A DÓLAR 
                                       ********************************
                                       """);
                    cantidad = lectura();
                    conversion("BRL", "USD", cantidad);                  

                }
                case 5 -> {
                    System.out.println("""
                                       ********************************
                                            DÓLAR A PESO COLOMBIANO 
                                       ********************************
                                       """);
                    cantidad = lectura();
                    conversion("USD", "COP", cantidad);
                }
                case 6 -> {
                    System.out.println("""
                                       ********************************
                                            PESO COLOMBIANO A DÓLAR 
                                       ********************************
                                       """);
                    cantidad = lectura();
                    conversion("COP", "USD", cantidad);

                }
                case 7 ->{ System.out.println("""
                                       *******************************************
                                       Gracias por ultilizar nuestros servicios :)
                                       *******************************************
                                       """); 
                }
                default -> {
                    System.err.println("Error, opción incorrecta.Ingrese nuevamente.");
                }  
            }
        } while (opcion!=7);         
    }
    
    public static int lectura(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingresa el valor que deseas convertir: ");
        int valor = lectura.nextInt();       
        return valor;
    }
    
    public static String conversion(String MonedaBase, String MonedaDestino,int cantidad){
        String direccion = "https://v6.exchangerate-api.com/v6/4160a1179308f85fc29d3eeb/pair/"+MonedaBase+"/"+MonedaDestino+"/"+cantidad; // PAGINA GRATUITA API CONVERSION DE MONEDAS:  https://www.exchangerate-api.com/
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                      .uri(URI.create(direccion))
                      .build();
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    //System.out.println(json);                
                    Gson gson = new Gson();        
                    conversion_monedas result = gson.fromJson(json, conversion_monedas.class);         
                    System.out.println("El valor "+ cantidad +" ["+MonedaBase+"] corresponde al valor final  de ==> "+result.getConversion_result()+" ["+MonedaDestino+"]");              
            }catch(IllegalArgumentException | IOException e){
                System.err.println("Error en la URI,verifique la dirección.");
            } catch (InterruptedException ex) {
                System.err.println("Error comunicarse con el administrador.");
            }
        return null;
    }
    
    
}
