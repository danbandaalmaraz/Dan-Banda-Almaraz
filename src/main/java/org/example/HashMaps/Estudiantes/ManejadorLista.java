package org.example.HashMaps.Estudiantes;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class ManejadorLista {
    HashMap mapaEstudiantes = new HashMap();

    public ManejadorLista(Estudiante [] estudiantes){
        for(Estudiante estudiante : estudiantes){
            mapaEstudiantes.put(estudiante.apellido, estudiante);
        }
    }

    public void listaEstudiantes(){
        if (mapaEstudiantes.isEmpty()){
            System.out.println("No hay elementos en la lista");

        }else{
            System.out.println("Lista de todos los estudiantes:\n");
            Set entradas = mapaEstudiantes.entrySet();
            for(Object entrada : entradas){
                Map.Entry mapaEntrada = (Map.Entry) entrada;
                Estudiante estudiante = (Estudiante)mapaEntrada.getValue();
                System.out.println(estudiante);
            }

        }
    }

    public void encontrarEstudiante(String apellido){
        if(mapaEstudiantes.containsKey(apellido)){
            System.out.println("Estudiante encontrado");
            Estudiante estudiante = (Estudiante)mapaEstudiantes.get(apellido);
            System.out.println(estudiante);
        }else{
            System.out.println("\nEstudiante con nombre '" + apellido + "'No Existe");
        }
    }

    public void actualizarEstadoEstudiante(String apellido, String nuevoestatus){
        Estudiante estudiante = (Estudiante)mapaEstudiantes.get(apellido);
        if(estudiante != null){
            String viejoestatus = estudiante.estado;
            estudiante.estado = nuevoestatus;
            mapaEstudiantes.put(apellido, estudiante);
            System.out.println();
            System.out.println("Estudiante (" + apellido + ")estado fue cambiado de '" + viejoestatus + "' para '" + nuevoestatus + "'" );

        }else{
            System.out.println();
            System.out.println("No existe el estudiante en la lista");
        }
    }

    public void removerEstudiante(String apellido){
        Estudiante estudianteRemovido = (Estudiante)mapaEstudiantes.remove(apellido);
        if(estudianteRemovido != null){
            System.out.println();
            System.out.println("Estudiante removido");
            System.out.println(estudianteRemovido);
            System.out.println();
        }else{
            System.out.println("Estudiante no fue removido");
        }
    }

}
