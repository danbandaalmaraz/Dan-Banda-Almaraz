package org.example.BusquedaLineal.TiendaCarros;

import java.util.ArrayList;

public class BusquedaCarros {
    ArrayList carros = new ArrayList();

    public BusquedaCarros(){
        carros.add(new Carros("Ford","EcoSport","Rojo",80000,"En Stock"));
        carros.add(new Carros("Toyota","Yaris","Negro",90000,"Orden Fabrica "));
        carros.add(new Carros("Nissan","Sentra","Azul",250000,"En Stock"));
        carros.add(new Carros("Honda","Civic","Verde",88000,"En Trato"));
        carros.add(new Carros("Ford","Fiesta","Amarillo",95000,"En Stock"));
        carros.add(new Carros("Toyota","Camry","Blanco",600000,"En Stock"));
        carros.add(new Carros("Honda","CRV","Rojo",850000,"En Trato"));
        carros.add(new Carros("Mazda","CX3","Negro",450000,"En Stock"));
        carros.add(new Carros("Ford","Mustang","Rojo",800000,"Orden Fabrica"));
        carros.add(new Carros("Nissan","EcoSport","Azul",80000,"En Stock"));

    }

    public ArrayList buscarviabilidad(String aviabilidad){
        ArrayList resultado = new ArrayList();
        for(Object obj : carros){
            Carros car = (Carros) obj;
            if(car.aviabilidad.equals(aviabilidad)){
                resultado.add(car);
            }
        }
        if(resultado.isEmpty()){
            System.out.println("No hay nada");
        }
        return resultado;
    }

    public ArrayList buscar(String marca, String modelo, String color){
        ArrayList resultado = new ArrayList();
        for(Object obj: carros){
            Carros car = (Carros) obj;
            if(car.color.equals(color) && car.modelo.equals(modelo) && car.marca.equals(marca)){
                resultado.add(car);
            }
        }
        if(resultado.isEmpty()){
            System.out.println("NO hay nada");
        }
        return resultado;
    }

    public ArrayList buscarPrecio(double precioLimite, boolean masbajo){
        ArrayList resultado = new ArrayList();
        for(Object obj : carros){
            Carros car = (Carros) obj;
            if(masbajo && car.precio < precioLimite){
                resultado.add(car);
            } else if(!masbajo && car.precio > precioLimite){
                resultado.add(car);
            }
        }
        if(resultado.isEmpty()){
            System.out.println("no hay" + (masbajo ? "abajo" : "above" + precioLimite + "\n"));
        }
        return resultado;
    }

    public static void main(String[]args){
        BusquedaCarros busqueda = new BusquedaCarros();
        System.out.println("Lista de carros en Stock");
        ArrayList carencontrado = busqueda.buscarviabilidad("En Stock");
        for(Object obj : carencontrado){
            Carros car = (Carros) obj;
            System.out.println(car);
        }
        System.out.println();
        System.out.println("\n Lista de Mustangs Rojos");
        ArrayList mustang = busqueda.buscar("Ford","Mustang","Rojo");
        for(Object obj : mustang){
            Carros car = (Carros) obj;
            System.out.println(car);
        }

        System.out.println();
        carencontrado = busqueda.buscarPrecio(200000,true);
        for(Object obj : carencontrado){
            Carros car = (Carros) obj;
            System.out.println(car);
        }
        System.out.println();
    }
}
