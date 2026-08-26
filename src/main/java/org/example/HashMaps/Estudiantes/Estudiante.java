package org.example.HashMaps.Estudiantes;

public class Estudiante {
    public int idestudiante;
    public String nombre;
    public String apellido;
    public String estado;

    public Estudiante(int idestudiante, String nombre, String apellido, String estado){
        this.idestudiante = idestudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }

    @Override
    public String toString(){
        String str = "ID:'" + this.idestudiante + "'";
        str += "\tNOMBRE" + this.apellido + "'";
        str += this.nombre + "'";
        str += "\tESTADO: '" + this.estado + "'";
        return str;
    }

}
