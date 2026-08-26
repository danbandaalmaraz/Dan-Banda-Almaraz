package org.example.Stacks;
import java.util.Scanner;
import java.util.InputMismatchException;

public class EditorTextoArray {
    private String[] pila;
    private int top;

    public EditorTextoArray(int tamaño){
        pila = new String[tamaño];
        top = -1;
    }
    public void push(String valor){
        if(top == pila.length - 1){
            System.out.println("la pila esta llena");
        }
        else{
            pila[++top] = valor;
            System.out.println(valor + "Agregado a la pila");
        }
    }

    public String pop(){
        if(top == -1){
            System.out.println("la pila esta vacia");
            return null;
        } else{
            String valorPop = pila[top--];
            System.out.println("Elemento eliminado" + valorPop);
            return valorPop;
        }
    }

    public String peek(){
        if(top == -1){
            System.out.println("La pila esta vacia");
            return null;
        }else{
            System.out.println("Elemento top" + pila[top]);
            return pila[top];
        }
    }

    public void display(){
        if(top == -1){
            System.out.println("la pila esta vacia");
        }else{
            System.out.println("undo stack");
            for(int i = 0; i<= top; i++){
                System.out.println("\"" + pila[i] + "\" ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        EditorTextoArray undoStack = new EditorTextoArray(10); // Maximum 10 actions
        while (true) {
            System.out.println("\nText Editor Undo Mechanism");
            System.out.println("1. Add Edit Action");
            System.out.println("2. Undo Last Edit");
            System.out.println("3. View Last Edit");
            System.out.println("4. Display All Actions");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice;
            try {
                choice = keyboard.nextInt();
                keyboard.nextLine(); // Consume newline character
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                keyboard.nextLine(); // Clear invalid input
                continue; // Skip the rest of the loop iteration
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter edit action: ");
                    String action = keyboard.nextLine();
                    undoStack.push(action);
                    break;
                case 2:
                    undoStack.pop();
                    break;
                case 3:
                    String lastAction = undoStack.peek();
                    if (lastAction != null) {
                        System.out.println("Last edit action: \"" + lastAction + "\"");
                    }
                    break;
                case 4:
                    undoStack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    keyboard.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
