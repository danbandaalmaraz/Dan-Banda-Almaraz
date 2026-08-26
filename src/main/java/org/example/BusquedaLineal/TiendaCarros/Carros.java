package org.example.BusquedaLineal.TiendaCarros;

public class Carros {
    public String marca;
    public String modelo;
    public String color;
    public double precio;
    public String aviabilidad;

    public Carros(String marca, String modelo, String color, double precio, String aviabilidad){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.aviabilidad = aviabilidad;
    }

    public String toString(){
        String extraTab = (this.color.equals("Red")? "\t" : "");
        return marca + "\t" + modelo + "\t" + color + "\t" + extraTab + "\t$" + precio + "\t" + aviabilidad;
    }

}
