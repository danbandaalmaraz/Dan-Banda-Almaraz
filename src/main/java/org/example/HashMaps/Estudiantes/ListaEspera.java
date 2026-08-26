package org.example.HashMaps.Estudiantes;

public class ListaEspera {
    public static void main(String args[]){
    Estudiante[] estudiantes = new Estudiante[6];

    estudiantes[0] = new Estudiante(1, "Bill", "Jones","En Revision");
    estudiantes[1] = new Estudiante(2, "Juan", "Rosas","En Revision");
    estudiantes[2] = new Estudiante(3, "ALejandro", "Salas","En Revision");
    estudiantes[3] = new Estudiante(4, "Joel", "Ramirez","ASIGNADO");
    estudiantes[4] = new Estudiante(5, "Marco", "Rosas","En Revision");
    estudiantes[5] = new Estudiante(6, "Ruben", "Juanes","En Revision");

    ManejadorLista lista = new ManejadorLista(estudiantes);
    String apellidoEstudiante = "Rosas";

    int opcion = 2;
    System.out.println();
    switch(opcion){
        case 1:
            lista.listaEstudiantes();
            break;
        case 2:
            lista.encontrarEstudiante(apellidoEstudiante);
        case 3:
            lista.actualizarEstadoEstudiante(apellidoEstudiante, "ASIGNADO");
        case 4:
        lista.removerEstudiante(apellidoEstudiante);
    }
    System.out.println();
}
}