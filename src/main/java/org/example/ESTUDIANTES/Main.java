package org.example.ESTUDIANTES;
import java.util.*;
import java.util.Stack;

public class Main {
    static Scanner sc;
    static EstudianteInfo sistemainformacionestudiantes = new EstudianteInfo();
    public static void main(String[]args){
        sc = new Scanner(System.in);
        while(true){
            System.out.println("\nOpciones:");
            System.out.println("1 Agrega estudiantes");
            System.out.println("2. Elimina Estudiante");
            System.out.println("3.Ver Estudiantes");
            System.out.println("4.Ver Calendario de Examenes");
            System.out.println("5. Exit");
            System.out.println("Ingresa la opcion:");
            int eleccion = -1;
            try{
                eleccion = sc.nextInt();
                sc.nextLine();
            } catch(InputMismatchException e){
                System.out.println("Entrada invalida");
                sc.nextLine();
                continue;
            }
            switch(eleccion){
                case 1:
                    crearEstudiante();
                    break;
                case 2:
                    eliminarEstudiante();
                    break;
                case 3:
                    verEstudiante();
                    break;
                case 4:
                    verCalendarioExamenes();
                    break;
                case 5:
                    System.out.println("Saliendo");
                    return;
                default:
                    System.out.println("\nEleccion invalida. Intenta de nuevo");
            }
        }
    }
    
}
