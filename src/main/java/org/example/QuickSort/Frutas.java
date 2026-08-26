package org.example.QuickSort;

public class Frutas {
    public static void main(String[]args){
        String[] palabras = {"platano","manzana","naranja","kiwi","uva"};
        quickSort(palabras,0,palabras.length-1);
        System.out.println("Palabras ordenadas");
        for(String palabra : palabras){
            System.out.println(palabra + "");
        }
    }
    public static void quickSort(String[]arr, int bajo, int alto){
        if(bajo<alto){
            int pi = particion(arr, bajo, alto);
            quickSort(arr, bajo, pi-1);
            quickSort(arr, pi+1, alto);
        }
    }
    public static int particion(String[]arr, int bajo, int alto){
        String pivote = arr[alto];
        int i = bajo - 1;
        for(int j = bajo; j < alto; j++){
            if(arr[j].compareTo(pivote)<0){
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i + 1];
        arr[i + 1]= arr[alto];
        arr[alto] = temp;
        return i +1;
    }
}
