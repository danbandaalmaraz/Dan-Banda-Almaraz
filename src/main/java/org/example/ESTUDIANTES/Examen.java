package org.example.ESTUDIANTES;

public class Examen {
    int examenId;
    String materiaId;
    String fecha;
    String hora;

    public Examen(int examenId, String materiaId, String fecha, String hora){
        this.examenId = examenId;
        this.materiaId = materiaId;
        this.fecha = fecha;
        this.hora = hora;
    }
    public int getexamenId(){
        return examenId;
    }
    public String toString(){
        return examenId + "\t" + fecha +"\t" + hora;
    }
    public String getmateriaId(){
        return materiaId;
    }
    public String fecha(){
        return fecha;
    }
    public void setFecha(String Fecha){
        this.fecha = fecha;
    }
    public String hora(){
        return hora;
    }
    public void setHora(String hora){
        this.hora = hora;
    }
}
