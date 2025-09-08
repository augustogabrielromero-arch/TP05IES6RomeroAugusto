package ejercicio05;

import ejercicio05.model.Persona;

public class Main {

public static void main(String[] args) throws Exception {
    int numeroA = 7;
    double numeroB = 3;
    //Resolver una suma
    sumar(numeroA, numeroB);
    System.out.println(restar(numeroA, numeroB));
    contruirTablaDelNumeroIndicado(numeroA); 

//Llamar a la clase// 
   Persona unaPersona = new Persona();
   unaPersona.setNombre("Augusto");
   unaPersona.setApellido("Romero"); 
   unaPersona.setEdad(23);
   //Mostrarlo
   System.out.println("Persona: " +unaPersona.getApellido()+ " tiene "+ unaPersona.getEdad());

}

public static void sumar(int a, double b){
double suma = a + b; 
System.out.println(suma); 
}

//Método double quiere que devuelva el resultado 
public static double restar(int c, double d){
double resta = c-d; 
return resta; 
}

//Escribir la tabla indicada//
public static void contruirTablaDelNumeroIndicado(int e){
    System.out.println("Tabla de multiplicar por " +e);
    //entra al for hasta que e sea igual a i//
for(int i = 1; i <= 10; i++){
System.out.println(e*i);
}
}

}
