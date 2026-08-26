package org.example.Arraylists.Integrador;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Reserva ManejadorReserva = new Reserva();

        while(true){
            System.out.println("\n1. Agregar reserva\n2.Cancelar Reserva\n3.Actualizar reserva\nDesplegar reservas\nExit");
            System.out.println("Escoge una opcion:");
            int eleccion = -1;
            try{
                eleccion = sc.nextInt();
                sc.nextLine();

            } catch(InputMismatchException e){
                System.out.println("Numero invalido ingrase numero correcot");
                sc.nextLine();
                continue;
            }
            switch(eleccion)
            {
                case 1:
                    System.out.println("Escribe numero de asiento");
                    String numeroAsiento = sc.next();
                    ManejadorReserva.añadirAsiento(numeroAsiento);
                    break;
                case 2:
                    System.out.println("Escribe numero de asiento a cancelar");
                    numeroAsiento = sc.next();
                    ManejadorReserva.cancelarAsiento(numeroAsiento);
                    break;
                case 3:
                    System.out.println("Escribe numero de asiento a actualizar");
                    String viejonumeroAsiento = sc.next();
                    System.out.println("Escribe nuevo numero de aisento");
                    String nuevonumeroAsiento = sc.next();
                    ManejadorReserva.actualizarReserva(viejonumeroAsiento, nuevonumeroAsiento);
                    break;
                case 4:
                    ManejadorReserva.desplegarReservas();
                    break;
                case 5:
                    System.out.println("Exit");
                    sc.close();
                    return;
                default:
                    System.out.println("Opcion invalida intente de nuevo");
                    break;
            }

            }
        }


}
