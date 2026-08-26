package org.example.BusquedaBinaria;

public class Ejemplo1 {

    public static void main(String[]args){
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int target = 4;

        int resultado = busquedaBinaria(numeros,target);

        if(resultado == -1){
            System.out.println("No se encontro numero");
        }
        else{
            System.out.println("Se encontro el numero en el indice" + resultado);
        }
    }

    public static int busquedaBinaria(int[]arr, int target){
        int izquierda = 0;
        int derecha = arr.length-1;
        while(izquierda <= derecha){
            int med = izquierda + (derecha - izquierda) / 2;
            if(arr[med] == target){
                return med;


            }
            else if(target > arr[med]){
                izquierda = med + 1;
            } else{
                derecha = med - 1;
            }
        }
        return -1;
    }
}
