package org.example.ListaCanciones;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[]args){
    DoubelLinkedList manejadorPlaylist = new DoubelLinkedList();
    Scanner sc = new Scanner(System.in);
    int eleccion;
    Cancion[] cancionesDisponibles = {
            new Cancion("Cancion 1", "Artista A", "Pop", 210),
            new Cancion("Cancion 2", "Artista B", "Rock", 219),
            new Cancion("Cancion 3", "Artista C", "HipHop", 112),
            new Cancion("Cancion 4", "Artista D", "Clasica", 300),
    };

    do{
        System.out.println("Canciones Favo del manejador de Tareas");
        System.out.println("1. Agrega una canción a tu lista de favoritos");
        System.out.println("2.Borra una cancion de tu lista de favoritos");
        System.out.println("3.Muestra las canciones favoritas de la lista");
        System.out.println("4.Toca la siguiente cancion favorita");
        System.out.println("5.Toca la anterior cancion favoita");
        System.out.println("6.Empieza a tocar desde la primer cancion favorita");
        System.out.println("7.Exit");
        System.out.println("Agrega la opcion;");
        eleccion = -1;
        try{
            eleccion = sc.nextInt();
            sc.nextLine();
        } catch(InputMismatchException e){
            System.out.println("Entrada invalida, meete un numero correcot");
            sc.nextLine();
            continue;
        }
        switch(eleccion){
            case 1:
                System.out.println("Canciones disponibles");
                for(int i = 0; i < cancionesDisponibles.length; i++){
                    System.out.println((i+1) + "." + cancionesDisponibles[i]);
                }
                System.out.println("Agrega el numero de la cancion a agregar:");
                int eleccionCancion = sc.nextInt();
                sc.nextLine();
                if(eleccionCancion >=1 && eleccionCancion <= cancionesDisponibles.length){
                    manejadorPlaylist.aggCancionFav(cancionesDisponibles[eleccionCancion - 1]);
                } else{
                    System.out.println("Eleccion Invalida");
                }
                break;
            case 2:
                if(manejadorPlaylist.estaVacio()){
                    System.out.println("La playlist esta vacia");
                }else{
                    System.out.println("Canciones en la Playlist:");
                    manejadorPlaylist.desplegarCancionFav();
                    System.out.println("Ingresa el numero de la cancion a remover");
                    int removerIndice = sc.nextInt();
                    sc.nextLine();
                    manejadorPlaylist.borrarCancionFav(removerIndice);
                }
                break;
            case 3:
                manejadorPlaylist.desplegarCancionFav();
                break;
            case 4:
                manejadorPlaylist.tocarSiguienteCancion();
                break;
            case 5:
                manejadorPlaylist.tocarAnteriorCancion();
                break;
            case 6:
                manejadorPlaylist.mandarActualPrimero();
                break;
            case 7:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Elecicon invalida intenta de nuevo:");

        }
    }   while(eleccion != 7);
    sc.close();

    }
}
