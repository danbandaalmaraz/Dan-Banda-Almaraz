package org.example.QuickSort;

public class Main {
    public static int particion(int[] array, int bajo, int alto){
        int pivot = array[alto];
        int i = bajo - 1;

        for(int j = bajo; j < alto; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[alto];
        array[alto] = temp;
        return i + 1;
    }
    public static void quickSort(int[] array, int bajo, int alto){
        if(bajo<alto){
            int pi = particion(array, bajo, alto);
            quickSort(array, bajo, pi - 1);
            quickSort(array, pi + 1, alto);
        }
    }
    public static void main(String[]args){
        int[]array = new int[]{300, 150, 400, 200, 500, 100, 450, 250};
        quickSort(array, 0, array.length - 1);
        for(int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }
}
