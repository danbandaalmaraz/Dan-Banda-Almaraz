package org.example.LinkedList;

public class Main {
    public static void main(String[]args){
        LinkedList listaespera = new LinkedList();

        listaespera.agregaCliente("Dan", "Fiesta de dos");
        listaespera.agregaCliente("Karla", "Fiesta de tres");

        listaespera.agregaVip("Vip Karleta", "Fiesta de uno");
        listaespera.agregaVip("Vip Jose", "Fiesta de tres");

        listaespera.imprimirLista();
    }
}
class Nodo{
    String nombre;
    String detalles;
    Nodo next;
    Nodo(String nombre, String detalles){
        this.nombre = nombre;
        this.detalles = detalles;
        this.next = null;
    }
}

class LinkedList{
    Nodo head;
    LinkedList(){
        this.head = null;
    }
    void agregaCliente(String nombre, String detalles){
        Nodo nuevoNodo = new Nodo(nombre, detalles);
        if(head == null){
            head = nuevoNodo;
        }
        else{
            Nodo actual = head;
            while(actual.next != null){
                actual = actual.next;
            }
            actual.next = nuevoNodo;
        }
    }

    void agregaVip(String nombre, String detalles){
        Nodo nuevoNodo = new Nodo(nombre, detalles);
        nuevoNodo.next = head;
        head = nuevoNodo;
    }
    void imprimirLista(){
        Nodo actual = head;
        while (actual != null){
            System.out.println(actual.nombre + "(" + actual.detalles + ")");
            actual = actual.next;
            if(actual != null){
                System.out.println("->");
            }
        }
        System.out.println("-> null");
    }
}
