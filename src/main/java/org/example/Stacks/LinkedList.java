package org.example.Stacks;

public class LinkedList {
    private Nodo top;
    private class Nodo{
        int dato;
        Nodo siguiente;
    }
    public LinkedList(){
        this.top = null;
    }
    public void push(int valor){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato = valor;
        nuevoNodo.siguiente = top;
        top = nuevoNodo;
        System.out.println(valor + "Agregado a la pila");
    }
    public int pop(){
        if(top == null){
            System.out.println("pila vacia");
            return -1;
        }
        else{
            int valorPop = top.dato;
            top = top.siguiente;
            System.out.println("Elemento pop" + valorPop);
            return valorPop;
        }
    }

    public int peek(){
        if(top == null){
            System.out.println("Pila vacia");
            return -1;
        }
        else{
            System.out.println("Top element" + top.dato);
            return(top.dato);
        }
    }
    public static void main(String[]args){
        LinkedList pila = new LinkedList();
        pila.push(10);
        pila.push(11);
        pila.push(12);

        pila.pop();
        pila.peek();
    }
}
