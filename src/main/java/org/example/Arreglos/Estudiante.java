package org.example.Arreglos;

public class Estudiante {

    private int numero;
    private String nombre;
    private int edad;

    public Estudiante(){

    }
    public Estudiante(int numero, String nombre, int edad){
        this.numero = numero;
        this.nombre = nombre;
        this.edad = edad;

    }

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getNombre(){ return nombre; }
    public void setName(String nombre){ this.nombre = nombre;}

    public int getEdad(){ return edad;}
    public void setEdad(int edad){this.edad = edad;}

}
