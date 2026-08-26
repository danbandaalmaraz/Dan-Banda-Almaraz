package org.example.ListaCanciones;

public class DoubelLinkedList {
    class Nodo{
        Cancion cancion;
        Nodo siguiente;
        Nodo previo;

        Nodo(Cancion cancion){
            this.cancion = cancion;
            this.siguiente = null;
            this.previo = null;
        }
    }
    private Nodo cabeza;
    private Nodo actual;

    public DoubelLinkedList(){
        cabeza = null;
        actual = null;

    }

    public void aggCancionFav(Cancion nuevacancion){
        if(esDuplicada(nuevacancion)){
            System.out.println("La cancion ya existe en la playlist");
            return;
        }
        Nodo nuevoNodo = new Nodo(nuevacancion);
        if(cabeza == null){
            cabeza = nuevoNodo;
            actual = cabeza;
        }   else{
            Nodo ultimo = cabeza;
            while(ultimo.siguiente != null){
                ultimo = ultimo.siguiente;
            }
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.previo = ultimo;
        }
        System.out.println(nuevacancion.getTitulo() + "agregado a la playlist");
    }
    private boolean esDuplicada(Cancion cancion){
        DoubelLinkedList.Nodo actual = cabeza;
        while(actual != null){
            if(actual.cancion.getTitulo().equals(cancion.getTitulo()) && actual.cancion.getArtista().equals(cancion.getArtista())){
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }
    public void desplegarCancionFav(){
        if(cabeza == null){
            System.out.println("La lista esta vacia");
            return;
        }
        DoubelLinkedList.Nodo actual = cabeza;
        int indice = 1;
        while(actual != null){
            System.out.println(indice + "." +actual.cancion);
            actual = actual.siguiente;
            indice++;

        }
    }
    public void tocarSiguienteCancion(){
        if(actual == null || actual.siguiente == null){
            System.out.println("No hay cancion siguiente en la playlist");
        } else{
            actual = actual.siguiente;
            System.out.println("Ahora tocando" + actual.cancion);
        }
    }
    public void tocarAnteriorCancion(){
        if(actual == null || actual.previo == null){
            System.out.println("no hay");
        }
        else{
            actual = actual.previo;
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
    public void borrarCancionFav(int indice){
        if(indice > 1){
            System.out.println("no hay");
            return;
        }
        if(cabeza == null){
            System.out.println("no hay canciones en lista");
            return;
        }
        if(indice == 1){
            System.out.println(cabeza.cancion.getTitulo() + "Ha sido removido de la playlist");
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
            System.out.println("no se puedo intente otro nuemro");
        }else{
            System.out.println(actual.cancion.getTitulo() + "Ha sido removido de la playlist");
            previo.siguiente = actual.siguiente;
        }
    }
}
