
package Adopcion;


public class Persona {
    //la clase Persona con atributos: nombre, apellido, edad, documento y Perro.
    private String nombre,apellido;
    private int edad,documento;
    Perro perroadoptado;

    public Persona(String nombre, String apellido, int edad, int documento, Perro perroadoptado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perroadoptado = perroadoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerroadoptado() {
        return perroadoptado;
    }

    public void setPerroadoptado(Perro perroadoptado) {
        this.perroadoptado = perroadoptado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + "\nPerro adoptado=" + perroadoptado.toString() + '}';
    }
    
    
}
