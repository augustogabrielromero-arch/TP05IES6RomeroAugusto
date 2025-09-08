package ejercicio02;

import java.util.Scanner;

public class Main {


public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Solicitar un número y verificar si es par o impar//
        System.out.println("Ingrese un número entero: ");
        int numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número ingresado es par. ");
        } else {
            System.out.println("El número ingresado es impar. ");
        }

        //Solicitar 3 números y verificar si el primero es mayor que los otros dos//
        
        System.out.println("\nIngrese tres números enteros:");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " es el número mayor.");
        } else {
            System.out.println(n1 + " no es el número mayor.");
        }

        entrada.close(); //Siempre cierra el objeto Scanner al finalizar
    }
}


