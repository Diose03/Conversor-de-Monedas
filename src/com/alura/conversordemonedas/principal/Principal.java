package com.alura.conversordemonedas.principal;
import com.alura.conversordemonedas.models.Conversion;
import com.alura.conversordemonedas.models.Conversor;
import java.util.Scanner;

/**
 * Clase principal que muestra un menú en consola, recibe la opción y cantidad a convertir,
 * y utiliza la API para obtener la tasa de cambio y mostrar el resultado.
 */

public class Principal {

    public static void main(String[] args) {
        String apiKey = "TU-API-KEY";
        Conversor conversor = new Conversor(apiKey);
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("""
            **************************************************************************************
            Sea bienvenido/a al Conversor de Moneda =]

            1) Dólar =>> Peso argentino
            2) Peso argentino =>> Dólar
            3) Dólar =>> Real brasileño
            4) Real brasileño =>> Dólar
            5) Dólar =>> Peso mexicano
            6) Peso mexicano =>> Dólar
            7) Salir

            Elija una opción válida:
            **************************************************************************************
            """);
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }

            if (opcion == 7) {
                System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
                break;
            }

            String origen = "";
            String destino = "";

            switch (opcion) {
                case 1 -> {
                    origen = "USD";
                    destino = "ARS";
                }
                case 2 -> {
                    origen = "ARS";
                    destino = "USD";
                }
                case 3 -> {
                    origen = "USD";
                    destino = "BRL";
                }
                case 4 -> {
                    origen = "BRL";
                    destino = "USD";
                }
                case 5 -> {
                    origen = "USD";
                    destino = "MXN";
                }
                case 6 -> {
                    origen = "MXN";
                    destino = "USD";
                }
                default -> {
                    System.out.println("Opción inválida. Intente de nuevo.");
                    continue;
                }
            }

            System.out.print("Ingrese la cantidad a convertir: ");
            double cantidad = 0;
            try {
                cantidad = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Cantidad inválida. Intente de nuevo.");
                continue;
            }

            try {
                Conversion conversion = conversor.convierteMoneda(origen, destino, cantidad);
                System.out.println("Resultado: " + conversion);
            } catch (RuntimeException e) {
                System.out.println("Error durante la conversión: " + e.getMessage());
            }

            System.out.println();

        } while (true);

        scanner.close();
    }
}



