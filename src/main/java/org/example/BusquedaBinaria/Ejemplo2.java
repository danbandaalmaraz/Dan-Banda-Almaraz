package org.example.BusquedaBinaria;

public class Ejemplo2 {

    public static void main(String[]args){
        int[] numeros = {1, 2, 3, 4, 4, 6, 7, 8, 9,10};
        int target = 4;

        boolean resultado = busquedaBinaria(numeros,target);
        System.out.println("¡Hay multiples ocurrencias?" + resultado);


    }

    public static boolean busquedaBinaria(int[]arr, int target){
        int izquierda = 0;
        int derecha = arr.length-1;
        while(izquierda <= derecha){
            int med = izquierda + (derecha - izquierda) / 2;
            if(arr[med] == target){

                if(med > 0 && arr[med - 1] == target){
                    return true;
                }if(med < arr.length - 1 && arr[med + 1] == target){
                    return true;
                }
                return false;
            }
            else if(target > arr[med]){
                izquierda = med + 1;
            } else{
                derecha = med - 1;
            }
        }
        return false;
    }
}