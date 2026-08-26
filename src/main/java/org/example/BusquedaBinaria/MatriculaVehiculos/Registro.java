package org.example.BusquedaBinaria.MatriculaVehiculos;

public class Registro {
    public String licensia;
    public String dueño;

    public Registro(String licensia, String dueño){
        this.licensia = licensia;
        this.dueño = dueño;
    }

    @Override
    public String toString(){
        return licensia + "\t" + dueño;
    }
}
