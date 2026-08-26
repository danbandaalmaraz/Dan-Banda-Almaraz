package org.example.ListaCanciones;

public class LinkedList {
    class Nodo{
        Cancion cancion;
        Nodo siguiente;
        Nodo(Cancion cancion){
            this.siguiente = null;
            this.cancion = cancion;
        }
    }
    private Nodo cabeza;
    private Nodo actual;

    public LinkedList(){
        cabeza = null;
        actual = null;
    }

    public void aggCancionFav(Cancion nuevaCancion){
        if(esDuplicada(nuevaCancion)){
            System.out.println("La cancion ya existe en la playlist");
            return;
        }
        Nodo nuevoNodo = new Nodo(nuevaCancion);
        if(cabeza == null){
            cabeza = nuevoNodo;
            actual = cabeza;
        }
        else{
            Nodo ultimo = cabeza;
            while(ultimo.siguiente != null){
                ultimo = ultimo.siguiente;
            }
            ultimo.siguiente = nuevoNodo;
        }
        System.out.println(nuevaCancion.getTitulo() + "Agregada Nueva Cancion a la PlayList");
    }

    private boolean esDuplicada(Cancion cancion){
        Nodo actual = cabeza;
        while(actual != null){
            if(actual.cancion.getTitulo().equals(cancion.getTitulo()) && actual.cancion.getArtista().equals(cancion.getArtista())){
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }
     public void borrarCancionFav(int indice){
        if(indice < 1){
            System.out.println("Rango invalido");
        }
        if(cabeza == null){
            System.out.println("Lista vacia");
            return;
        }
        if(indice == 1){
            System.out.println(cabeza.cancion.getTitulo() + "Ha sido removida de la playlist");
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo actual = cabeza;
        Nodo previo = null;
        int contador = 1;

        while(actual != null && contador < indice){
            previo = actual;
            actual = actual.siguiente;
            contador++;
        }

        if(actual == null){
            System.out.println("Rango invalido");

        }else{
            System.out.println(actual.cancion.getTitulo() + "Ha sido removido de la playlist");
            previo.siguiente = actual.siguiente;
        }

    }


    public void desplegarCancionFav(){
        if(cabeza == null){
            System.out.println("La lista esta vacia");
            return;
        }
        Nodo actual = cabeza;
        int indice = 1;
        while(actual != null){
            System.out.println(indice + "." +actual.cancion);
            actual = actual.siguiente;
            indice++;

        }
    }

    public void tocarSiguienteCancion(){
        if(actual == null && actual.siguiente == null){
            System.out.println("No hay cancion siguiente en la playlist");
        } else{
            actual = actual.siguiente;
            System.out.println("Ahora tocando" + actual.cancion);
        }
    }

    public void mandarActualPrimero(){
        actual = cabeza;
        if(actual != null){
            System.out.println("Ahora tocando" + actual.cancion);
        }else{
            System.out.println("Lista vacia");
        }
    }

    public boolean estaVacio(){
        return cabeza == null;
    }

    public void tocarAnteriorCancion(){
        if(actual == null || actual == cabeza){
            System.out.println("no hay cancion previa");
        }
        else{
            Nodo temp = cabeza;
            while(temp.siguiente != null){
                temp = temp.siguiente;
            }
            actual = temp;
            System.out.println("Ahora tocando" + actual.cancion);
        }
    }

}
