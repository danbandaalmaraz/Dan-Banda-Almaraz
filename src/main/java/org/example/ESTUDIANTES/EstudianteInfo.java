package org.example.ESTUDIANTES;
import java.util.List;

public class EstudianteInfo {
    private BaseDatos db = new BaseDatos();
    public List<Materia> ordenarMateriaporNombre(){
        List<Materia> materiaporNombre = (List<Materia>) db.materias.clone();
        int n = materiaporNombre.size();
        boolean cambio;
        for(int i = 0; i< n - 1; i++){
            cambio = false;
            for(int j = 0; j< n-1-i; j++){

            }
        }
    }
    public List<Estudiante> ordenarEstudianteporNombre(){
        List<Estudiante> estudiantes = (List<Estudiante>) db.estudiantes.clone();
    }
    public Estudiante encontrarEstudiante(Integer numeroEstudiante){

    }
    public Estudiante encontrarEstudiante(String nombre){
        List<Estudiante> estudiantes = this.ordenarEstudianteporNombre();
        int izq = 0;
        int der = estudiantes.size() - 1;
        while(izq <= der){
            int medio = izq + (der - izq) / 2;
            int comparador = estudiantes.get(medio).nombre.compareTo(nombre);
            if(comparador == 0){
                return estudiantes.get(medio);
            }else if(comparador < 0){
                izq = medio + 1;
            }else{
                der = medio -1;
            }
        }
        return null;

    }
    public List<Examen> encontrarExamenes(String materiaId){
        List<Examen> ordenExamenes = this.ordenarExamenporMateriaId();
    }
    public List<Examen> ordenarExamenporMateriaId(){
        List<Examen> examenesparaOrdenar = (List<Examen>) db.examenes.clone();
        int contadorreg = examenesparaOrdenar.size();
        for(int indiceSinOrdenar = 1; indiceSinOrdenar < contadorreg; indiceSinOrdenar++){
            Examen regSinOrdenar = (Examen)examenesparaOrdenar.get(indiceSinOrdenar);
            int indiceOrdenado = indiceSinOrdenar - 1;
            while(indiceOrdenado >= 0){
                Examen regOrdenado = (Examen)examenesparaOrdenar.get(indiceOrdenado);
                if(regOrdenado.materiaId.compareTo(regSinOrdenar.materiaId) > 0){
                    examenesparaOrdenar.set(indiceOrdenado + 1. regOrdenado);
                    indiceOrdenado++;
                }else{
                    break;
                }
            }
            examenesparaOrdenar.set(indiceOrdenado + 1, regSinOrdenar);
        }
        return examenesparaOrdenar;
    }
}
