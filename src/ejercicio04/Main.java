package ejercicio04;

import java.util.Scanner;

//Clase main//
public class Main {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Solicitar al usuario que ingrese un número entre 1 y 9//
        do {
            System.out.println("Ingrese un número entero comprendido entre [1, 9]:");

            // Usar el bucle while anidado para validar la entrada//

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Ingrese un número entero.");
                scanner.next(); //Descartar la entrada incorrecta//
            }
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 9);

        // Mostrar la tabla de multiplicar correspondiente// 
        System.out.println("\nTabla de multiplicar del " + numero + ":");
        //Bucle For//
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}






