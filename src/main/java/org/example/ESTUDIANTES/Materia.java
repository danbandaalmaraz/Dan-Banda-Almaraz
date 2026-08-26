package org.example.ESTUDIANTES;

public class Materia {
    String id;
    String nombre;
    public Materia(String id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    public String toString(){
        return id + "" + nombre;
    }
    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setId(String id){

    }
    public void setNombre(String nombre){

    }
}
