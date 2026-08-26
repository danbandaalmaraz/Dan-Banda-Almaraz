package org.example.Arraylists.Integrador;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public class Reserva {

    private List<Asiento> ListaReservaAsiento;
    public Reserva(){
        this.ListaReservaAsiento = new ArrayList<>();
    }

    public void añadirAsiento(String numeroAsiento){
        for(Asiento asiento: ListaReservaAsiento){
            if(asiento.getnumeroAsiento().equals(numeroAsiento) && asiento.esReservado() && !asiento.esCancelado()){
                System.out.println("Asiento" + numeroAsiento + "Ha sido reservado");
            }
        }
        Asiento nuevoAsiento = new Asiento(numeroAsiento);
        nuevoAsiento.setesReservado(true);
        nuevoAsiento.setFechaReservado(new Date());
        ListaReservaAsiento.add(nuevoAsiento);
        System.out.println("Asiento" + numeroAsiento + "Ha sido reservado");
    }
    public void cancelarAsiento(String numeroAsiento){
        for(Asiento asiento: ListaReservaAsiento){
            if(asiento.getnumeroAsiento().equals(numeroAsiento) && !asiento.esCancelado()){
                asiento.setCancelado(true);
                asiento.setesReservado(false);
                System.out.println("Asiento" + asiento.getnumeroAsiento() + "Ha sido cancelado");
            }
        }
    }

    public void actualizarReserva(String viejonumeroAsiento, String nuevonumeroAsiento){
        for(Asiento asiento: ListaReservaAsiento){
            if(asiento.getnumeroAsiento().equals(viejonumeroAsiento) && !asiento.esCancelado()){
                asiento.setnumeroAsiento(nuevonumeroAsiento);
                System.out.println("Nuevo numero de asiento actualizado" + nuevonumeroAsiento);
            }
        }
    }

    public void desplegarReservas(){
        if(ListaReservaAsiento.isEmpty()){
            System.out.println("no hay reservas asiganadas");
        }else{
            for(Asiento asiento: ListaReservaAsiento){
                if(!asiento.esCancelado() && asiento.esReservado()){
                    System.out.println("Asiento numero" + asiento.getnumeroAsiento() + "Fecha de reserva:" + asiento.getFechaReservado());
                }
            }
        }
    }

}
