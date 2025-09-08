package ejercicio05.model;

public class Persona {

    //Atributos de la clase//
private String nombre;
private String apellido; 
private int edad; 

//Método constructor por defecto//
public Persona(){

}

//Todos estos son métodos accesores
public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getEdad() {
    return edad;
}

  public void setEdad(int edad) {
      this.edad = edad;
  }

//Métodos creados por el usuario//
public int calcularAntiguedad(){
    int antiguedad = 10 * getEdad();
    return antiguedad; 
}


} 