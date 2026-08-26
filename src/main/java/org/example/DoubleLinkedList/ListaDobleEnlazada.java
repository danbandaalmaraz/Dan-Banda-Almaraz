package org.example.DoubleLinkedList;

public class ListaDobleEnlazada {

    // Clase interna para los nodos
    public static class Nodo {
        int datos;
        Nodo siguiente;
        Nodo anterior;

        Nodo(int datos) {
            this.datos = datos;
            this.siguiente = null;
            this.anterior = null;
        }
    }

    // Atributos de la lista
    private Nodo cabeza;
    private Nodo cola;

    // Constructor
    public ListaDobleEnlazada() {
        this.cabeza = null;
        this.cola = null;
    }

    // ✅ MÉTODO GETTER PARA ACCEDER A LA CABEZA DESDE FUERA
    public Nodo obtenerCabeza() {
        return cabeza;
    }

    // ✅ MÉTODO GETTER PARA ACCEDER A LA COLA DESDE FUERA
    public Nodo obtenerCola() {
        return cola;
    }

    // ============ MÉTODOS DE AGREGAR ============

    public void agregarInicio(int datos) {
        Nodo nuevoNodo = new Nodo(datos);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        }
    }

    public void agregarFinal(int datos) {
        Nodo nuevoNodo = new Nodo(datos);

        if (cola == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.anterior = cola;
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
    }

    // ============ MÉTODOS DE RECORRIDO ============

    public void recorrerAdelante() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.datos + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void recorrerAtras() {
        Nodo actual = cola;
        while (actual != null) {
            System.out.print(actual.datos + " ");
            actual = actual.anterior;
        }
        System.out.println();
    }

    // ============ MÉTODOS DE ELIMINAR ============

    public void eliminarInicio() {
        if (cabeza == null) {
            return;
        }

        cabeza = cabeza.siguiente;
        if (cabeza != null) {
            cabeza.anterior = null;
        } else {
            cola = null;
        }
    }

    public void eliminarFinal() {
        if (cola == null) {
            return;
        }

        cola = cola.anterior;
        if (cola != null) {
            cola.siguiente = null;
        } else {
            cabeza = null;
        }
    }

    public void eliminarNodo(Nodo nodo) {
        if (nodo == null) {
            return;
        }

        if (nodo == cabeza) {
            eliminarInicio();
            return;
        }

        if (nodo == cola) {
            eliminarFinal();
            return;
        }

        nodo.anterior.siguiente = nodo.siguiente;
        nodo.siguiente.anterior = nodo.anterior;
    }
}