package org.example.ESTUDIANTES;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Estudiante {
    Integer numeroEstudiante;
    String nombre;
    ArrayList<Materia> materias = new ArrayList();
    HashMap<String,Examen> mapaExamenes = new HashMap();

    public Estudiante(String nombre,int numeroEstudiante ){
        this.numeroEstudiante = numeroEstudiante;
        this.nombre = nombre;
    }
    public String toString(){
        return numeroEstudiante + "\t" + nombre;
    }
    public String getNombre(){return nombre;}
    public Integer getnumeroEstudiante(){
        return numeroEstudiante;
    }
    public List <Materia> getMaterias(){
        return materias;
    }
    public void aggMaterias(ArrayList<Materia>materias){
        this.materias.addAll(materias);
    }
    public void aggMateria(Materia materia){
        materias.add(materia);
    }
    public void aggExamen(Examen examen){
        mapaExamenes.put(examen.materiaId, examen);
    }
    public void aggExamenes(List<Examen>examenes){
        for(Examen exam : examenes){
            aggExamen(exam);
        }
    }
    public List<Examen> getExamenes(){
        List<Examen> examenes = new ArrayList<>();
        for(Examen examen : examenes){
            examenes.add(examen);
        }
        return examenes;
    }

}
