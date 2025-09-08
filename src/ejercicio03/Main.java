package ejercicio03;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        long factorial = 1;

        // Solicitar y validar la entrada del usuario//
        do {
            System.out.println("Ingrese un número entero entre 0 y 10 para calcular su factorial:");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.next(); // Descarta la entrada incorrecta//
            }
            numero = scanner.nextInt();
        } while (numero < 0 || numero > 10);

        // Calcular el factorial usando un bucle iterativo while//

        int i = numero;
        while (i > 0) {
            factorial *= i;
            i--;
        }

        //Mostrar el resultado//
        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }
}








