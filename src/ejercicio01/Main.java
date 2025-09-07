package ejercicio01;

public class Main {
public static void main(String[] args) throws Exception {
    //Linea de comentarios
    //Tipos de datos primitivos 
    //Declarar variables e inicializar
    int numeroA = 3;
    double numeroB = 5.2;
    boolean bandera = true;
    char caracter = '$'; 

    //Variable de tipo Clase
    String mensaje01 = "Las variables son: "; 
    String mensaje02 = " que es un número entero"; 

    int longitudDeLaCadena =  mensaje01.length();  

    System.out.println( mensaje01+numeroA+mensaje02+" y el tamaño del mensaje es: "+ longitudDeLaCadena);
}


}
