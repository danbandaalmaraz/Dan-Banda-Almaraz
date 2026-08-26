package org.example.MergeSort;

public class Main {
    public static void mergeSort(int[] numeros, int izq, int der){
        if(numeros == null || numeros.length <= 1){
            return;
        }
        if(izq < der){
            int medio = izq + (der - izq)/2;
            mergeSort(numeros,  izq,  medio);
            mergeSort(numeros, medio + 1, der);
            merge(numeros, izq,medio,der);
        }
    }
    public static void merge(int[]numeros, int izq, int medio, int der){
        int tamañoArrIzq = medio - izq + 1;
        int tamañoArrDer = der - medio;

        int[]arrIzq = new int[tamañoArrIzq];
        int[]arrDer = new int[tamañoArrDer];

        for(int indice = 0; indice < tamañoArrIzq; indice++){
            arrIzq[indice] = numeros[izq + indice];
        }

        for(int indice = 0; indice < tamañoArrDer; indice++){
            arrDer[indice] = numeros[medio + 1 + indice];
        }

        int indiceArrIzq = 0;
        int indiceArrDer = 0;
        int indiceMergeArr = izq;

        while(indiceArrIzq < tamañoArrIzq && indiceArrDer < tamañoArrDer){
            if(arrIzq[indiceArrIzq] <= arrDer[indiceArrDer]){
                numeros[indiceMergeArr] = arrIzq[indiceArrIzq];
                indiceArrIzq++;
            }else{
                numeros[indiceMergeArr] = arrDer[indiceArrDer];
                indiceArrDer++;

            }
            indiceMergeArr++;
        }
        while(indiceArrIzq < tamañoArrIzq){
            numeros[indiceMergeArr] = arrIzq[indiceArrIzq];
            indiceArrIzq++;
            indiceMergeArr++;
        }
        while(indiceArrDer < tamañoArrDer){
            numeros[indiceMergeArr] = arrDer[indiceArrDer];
            indiceArrDer++;
            indiceMergeArr++;
        }

    }

    public static void main(String[]args){
        int[]numeros = {38,27,43,3,9,82,19};
        System.out.println("Arreglo original");
        for(int indice = 0; indice < numeros.length; indice++){
            System.out.println(numeros[indice] + "");
        }
        mergeSort(numeros, 0, numeros.length - 1);
        System.out.println("\nArreglo ordenado:");
        for(int indice = 0;indice <  numeros.length; indice++){
            System.out.println(numeros[indice] + "");
        }
    }

}
