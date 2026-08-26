package org.example.Arraylists.Integrador;
import java.util.Date;

public class Asiento {
    private String numeroAsiento;
    private boolean esReservado;
    private Date FechaReservado;
    private boolean esCancelado;
    public Asiento(String numeroAsiento){
        this.numeroAsiento = numeroAsiento;
        this.esReservado = esReservado;
        this.esCancelado = esCancelado;
    }

    public String getnumeroAsiento(){
        return numeroAsiento;
    }
    public void setnumeroAsiento(String numeroAsiento){
        this.numeroAsiento = numeroAsiento;
    }
    public boolean esReservado(){
        return esReservado;
    }
    public void setesReservado(boolean reservado){
        esReservado = reservado;
    }
    public Date getFechaReservado(){
        return FechaReservado;
    }
    public void setFechaReservado(Date FechaReservado){
        this.FechaReservado = FechaReservado;
    }
    public boolean esCancelado(){
        return esCancelado;
    }
    public void setCancelado(boolean cancelado){
        esCancelado = cancelado;
    }
    @Override
    public String toString(){
        return "Asiento{" +
                "numeroAsiento=" + numeroAsiento + '\'' +
                ", esReservado=" + esReservado +
                ",FechaReservado=" + FechaReservado +
                ", esCancelado" + esCancelado +
                '}';
    }


}
