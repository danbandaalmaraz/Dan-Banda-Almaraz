package org.example.Stacks;
import java.util.Scanner;
import java.util.InputMismatchException;

public class EditorTextoListaIndexada {
    class Nodo{
        String dato;
        Nodo siguiente;

        public Nodo(String dato){
            this.dato = dato;
            this.siguiente = null;
        }
    }
    private Nodo top;
    public EditorTextoListaIndexada(){
        this.top = null;
    }
    public void push(String valor){
        Nodo nuevoNodo = new Nodo(valor );
        nuevoNodo.dato = valor;
        nuevoNodo.siguiente = top;
        top = nuevoNodo;
        System.out.println(valor + "Agregado a la pila");
    }

    public String pop(){
        if(top == null){
            System.out.println("Pila vacia");
            return null;
        }
        else{
            String valorPop = top.dato;
            top = top.siguiente;
            System.out.println("Elemento borrado" + valorPop);
            return valorPop;
        }
    }
    public String peek(){
        if(top == null){
            System.out.println("Pila vacia");
            return null;
        }
        else{
            System.out.println("Elemento top" + top.dato);
            return top.dato;
        }
    }

    public void desplegar(){
        if(top == null){
            System.out.println("Pila vacia");
            return;
        }
        System.out.println("Elementos de la pila");
        Nodo actual = top;
        while(actual != null){
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
    public static void main(String[]args){
        EditorTextoListaIndexada Lista = new EditorTextoListaIndexada();
        Scanner sc = new Scanner(System.in);
        String accion;
        int indice;

        while(true){
            System.out.println("Operaciones pilas");
            System.out.println("1 Agrega Elementos");
            System.out.println("2 Remuevo elemento");
            System.out.println("3 Despliega elemento top");
            System.out.println("4 Desplega todos los elementos");
            System.out.println("Exit");
            System.out.println("Escoja tu eleccioon");
            indice = -1;
            try{
                indice = sc.nextInt();
                sc.nextLine();

            }   catch(InputMismatchException e){
                System.out.println("Entrada invalida vuelve a escoger");
                sc.nextLine();
                continue;
            }
            switch(indice){
                case 1:
                    System.out.println("Agrega la accion de la pila");
                    accion = sc.nextLine();
                    Lista.push(accion);
                    break;
                case 2:
                    Lista.pop();
                case 3:
                    Lista.peek();
                case 4:
                    Lista.desplegar();
                case 5:
                    System.out.println("Saliendo");
                    sc.close();
                    return;
                default:
                    System.out.println("Eleccion erronea intente denuevo");
            }
        }
    }
}
