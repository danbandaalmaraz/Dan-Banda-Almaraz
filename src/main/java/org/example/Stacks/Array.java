package org.example.Stacks;

public class Array {
    private int[] pila;
    private int top;

    public Array(int tamaño){
        pila = new int[tamaño];
        top = -1;
    }
    public void push(int valor){
        if(top == pila.length - 1){
            System.out.println("la pila esta llena");
        }
        else{
            pila[++top] = valor;
            System.out.println(valor + "Agregado a la pila");
        }
    }

    public int pop(){
        if(top == -1){
            System.out.println("la pila esta vacia");
            return -1;
        } else{
            int valorPop = pila[top--];
            System.out.println("Elemento eliminado" + valorPop);
            return valorPop;
        }
    }

    public int peek(){
        if(top == -1){
            System.out.println("La pila esta vacia");
            return -1;
        }else{
            System.out.println("Elemento top" + pila[top]);
            return pila[top];
        }
    }

    public static void main(String[]args){
        Array pila = new Array(8);
        pila.push(10);
        pila.push(12);
        pila.push(13);
        pila.push(14);

        pila.pop();
        pila.peek();



        System.out.println(pila);
    }
}
