package org.example.Stacks;
import java.util.Stack;
public class NavegadorWeb {
    public static void main(String[]args){
    Stack<String> historial = new Stack<>();

    historial.push("google.com");
    historial.push("facebook.com");
    historial.push("youtube.com");
    historial.push("instagram.com");
    System.out.println("Historial despues de usarse" + historial);

    String ultimavisita = historial.peek();
    System.out.println("Ultima visita" + ultimavisita);

    String elementoborrado = historial.pop();
    System.out.println("Eleemtno borrado" + elementoborrado);
    System.out.println("Lista" + historial);

    }
}
