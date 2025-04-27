/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Physicxls
 */
public class Calculadora {

    /**
     * @param args the command line arguments ss
     */
    public static void main(String[] args) {
        
        Integer opcion = 0; 
        Integer opcionOperacion = 0;
        
        imprimirMenu();
       
        do{
      
            do{
                String valor = leerValorConsola("Opcion: ");
                opcion = convertirAEntero(valor);
            } while (opcion == null || opcion > 4 || opcion < 1);
            
            switch(opcion){
                case 1:
                    do{
                        imprimirOperacion("Sumar");
                        String valor1 = leerValorConsola("Valor 1: ");
                        int val1 = convertirAEntero(valor1);
                        String valor2 = leerValorConsola("Valor 2: ");
                        int val2 = convertirAEntero(valor2);
                        System.out.println("Resultado: " + (val1 + val2));
                        System.out.println("1. Nueva suma");
                        System.out.println("2. Regresar al menu");
                        String valor = leerValorConsola("Opcion: ");
                        opcionOperacion = convertirAEntero(valor);
                    } while (opcionOperacion == null || opcionOperacion > 2 || opcionOperacion <= 1);
                    break;
                case 2:
                    do{
                        imprimirOperacion("Restar");
                        String valor1 = leerValorConsola("Valor 1: ");
                        int val1 = convertirAEntero(valor1);
                        String valor2 = leerValorConsola("Valor 2: ");
                        int val2 = convertirAEntero(valor2);
                        System.out.println("Resultado: " + (val1 - val2));
                        System.out.println("1. Nueva resta");
                        System.out.println("2. Regresar al menu");
                        String valor = leerValorConsola("Opcion: ");
                        opcionOperacion = convertirAEntero(valor);
                    }while(opcionOperacion == null || opcionOperacion > 2 || opcionOperacion <= 1);
                    break;
                case 3:
                    do{
                        imprimirOperacion("Multiplicar");
                        String valor1 = leerValorConsola("Valor 1: ");
                        int val1 = convertirAEntero(valor1);
                        String valor2 = leerValorConsola("Valor 2: ");
                        int val2 = convertirAEntero(valor2);
                        System.out.println("Resultado: " + (val1 * val2));
                        System.out.println("1. Nueva multiplicacion");
                        System.out.println("2. Regresar al menu");
                        String valor = leerValorConsola("Opcion: ");
                        opcionOperacion = convertirAEntero(valor);
                    }while(opcionOperacion == null || opcionOperacion > 2 || opcionOperacion <= 1);
                    break;
                case 4:
                    do{
                        imprimirOperacion("Dividir");
                        String valor1 = leerValorConsola("Valor 1: ");
                        int val1 = convertirAEntero(valor1);
                        String valor2 = leerValorConsola("Valor 2: ");
                        int val2 = convertirAEntero(valor2);
                        System.out.println("Resultado: " + (val1 / val2));
                        System.out.println("1. Nueva division");
                        System.out.println("2. Regresar al menu");
                        String valor = leerValorConsola("Opcion: ");
                        opcionOperacion = convertirAEntero(valor);
                    }while(opcionOperacion == null || opcionOperacion > 2 || opcionOperacion <= 1);
                    break;
                default:
                    System.out.println("Selecciona una opción valida");
            }
        } while(opcionOperacion == 2);
    }
                
    private static void imprimirOperacion(String operacion){
        System.out.println("=============================");
        System.out.println("        " + operacion);
        System.out.println("=============================");   
    }
        
                
    private static String leerValorConsola(String prefijo){
        System.out.print(prefijo);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private static Integer convertirAEntero(String valor) {
        try{
            return Integer.valueOf(valor);
        } catch (NumberFormatException e){
            return null;
        }
    }
    
    private static void imprimirMenu() {
        System.out.println("=================");
        System.out.println("   CALCULADORA   ");
        System.out.println("=================");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
    }
    
}
