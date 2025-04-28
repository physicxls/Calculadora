/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
/**
 *
 * @author Physicxls
 */
import java.util.Scanner;
public class Calculadora {

    /**
     * @param args the command line arguments ss
     */
    public static void main(String[] args) {
        Integer opcion = 0;
        do {
            do {
                imprimirMenu();
                String valor = leerValorConsola("Opcion: ");
                opcion = convertirAEntero(valor);
            } while (opcion == null || opcion < 1 || opcion > 6);

            if (opcion == 6) {
                System.out.println("Saliendo del programa...");
                break;
            }

            String operacion = obtenerNombreOperacion(opcion);
            ejecutarOperacion(operacion);
        } while (true);
    }

    private static void ejecutarOperacion(String operacion) {
        Integer opcionOperacion;
        do {
            imprimirOperacion(operacion);
            Integer val1 = pedirNumero("Valor 1: ");
            Integer val2 = pedirNumero("Valor 2: ");

            if (val1 != null && val2 != null) {
                switch (operacion.toLowerCase()) {
                    case "sumar":
                        System.out.println("Resultado: " + (val1 + val2));
                        break;
                    case "restar":
                        System.out.println("Resultado: " + (val1 - val2));
                        break;
                    case "multiplicar":
                        System.out.println("Resultado: " + (val1 * val2));
                        break;
                    case "dividir":
                        if (val2 != 0) {
                            System.out.println("Resultado: " + (val1 / val2));
                        } else {
                            System.out.println("No se puede dividir entre cero.");
                        }
                        break;
                    case "potenciar":
                        int resultado = 1;
                        for (int i = 0; i < val2; i++) {
                            resultado *= val1;
                        }
                        System.out.println("Resultado: " + resultado);
                        break;
                    default:
                        System.out.println("Operación no válida.");
                }
            } else {
                System.out.println("Valores inválidos.");
            }

            System.out.println("1. Nueva " + operacion);
            System.out.println("2. Regresar al menu");
            String valor = leerValorConsola("Opcion: ");
            opcionOperacion = convertirAEntero(valor);
        } while (opcionOperacion != null && opcionOperacion == 1);
    }

    private static String obtenerNombreOperacion(int opcion) {
        switch (opcion) {
            case 1:
                return "Sumar";
            case 2:
                return "Restar";
            case 3:
                return "Multiplicar";
            case 4:
                return "Dividir";
            case 5:
                return "Potenciar";
            default:
                return "";
        }
    }

    private static Integer pedirNumero(String mensaje) {
        String valor = leerValorConsola(mensaje);
        return convertirAEntero(valor);
    }

    private static void imprimirMenu() {
        System.out.println("=================");
        System.out.println("   CALCULADORA   ");
        System.out.println("=================");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
        System.out.println("5. POTENCIACION");
        System.out.println("6. SALIR");
        System.out.println("=================");
    } 

    private static String leerValorConsola(String mensaje) {
        System.out.print(mensaje);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private static Integer convertirAEntero(String valor) {
        try {
            return Integer.valueOf(valor);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static void imprimirOperacion(String operacion) {
        System.out.println("\n=============================");
        System.out.println("        " + operacion.toUpperCase());
        System.out.println("=============================");
    }
}

