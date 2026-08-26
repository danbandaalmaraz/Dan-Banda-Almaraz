package org.example.BusquedaLineal;
import java.util.ArrayList;
import java.util.List;

public class Ejemplo2 {
    public static void main(String[]args){
        int[] arr = {10,20,30,20,50,20};
        int target = 20;

        int[] indice = encontrarocurrencias(arr, target);
        System.out.println("Encontrar ocurrencias");
        if(indice.length > 0){
            for(int index : indice){
                System.out.println(index + "");
            }
        } else{
            System.out.println("No hay ocurrencias");
        }
        System.out.println();

    }

    public static int[] encontrarocurrencias(int[]arr, int target){
        List<Integer> indiceLista = new ArrayList();

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                indiceLista.add(i);
            }
        }
        int[] indiceArray = new int[indiceLista.size()];
        for(int i = 0; i < indiceArray.length; i++){
            indiceArray[i] = indiceLista.get(i);
        }
        return indiceArray;
    }
}
