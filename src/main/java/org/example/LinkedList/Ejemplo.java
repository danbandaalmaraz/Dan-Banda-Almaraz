package org.example.LinkedList;
import java.util.LinkedList;
public class Ejemplo {
    public static void main(String[]args){
        LinkedList<String> ListaRecauderia = new LinkedList<>();
        ListaRecauderia.add("Leche");
        ListaRecauderia.add("Jamon");
        ListaRecauderia.add("Tomate");

        ListaRecauderia.set(1, "Pan blanco");
        ListaRecauderia.remove("Tomate");
        ListaRecauderia.add("Queso");
        System.out.println("Lista final" + ListaRecauderia);
    }
}
