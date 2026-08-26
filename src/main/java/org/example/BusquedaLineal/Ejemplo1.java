package org.example.BusquedaLineal;

public class Ejemplo1 {
    public static void main(String[]args){
        int[] numeros = {2,8, 1, 5, 6, 7};
        int target = 5;
        int resultado = busquedalineal(numeros, target);

        if(resultado == -1){
            System.out.println("Numero no encontrado");
        }else{
            System.out.println("Numero encontrado" + resultado);
        }
    }
    public static int busquedalineal(int[]arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}

