package org.example.BubbleSort.PlacasCoche;

public class Registro {
    public String licencia;
    public String dueño;

    public Registro(String licencia, String dueño){
        this.licencia = licencia;
        this.dueño = dueño;
    }
    @Override

    public String toString(){
        return licencia + "\t: " + dueño;
    }
    public static void main(String[]args){
        System.out.println("Registro de plakas trabajando");
    }

}
