package org.example.MergeSort;

public class EjemploString {
    public static void main(String[]args){
        String[] strings = {"apple","banana","kiwi","grapefruit","pear","orange"};
        mergesortporTamaño(strings, 0, strings.length - 1);
        System.out.println("Ordenados por altura");
        for(String str : strings){
            System.out.println(str +"");
        }
    }

    public static void mergesortporTamaño(String[]arr, int ini, int fin){
        if(ini < fin){
            int medio = (ini + fin) / 2;
            mergesortporTamaño(arr,ini,medio);
            mergesortporTamaño(arr,medio + 1, fin);
            merge2(arr,ini,medio,fin);
        }
    }

    public static void merge2(String[]arr, int izq, int medio, int der){
        int n1 = medio - izq + 1;
        int n2 = der - medio;

        String[] Arrayizq = new String[n1];
        String[] Arrayder = new String[n2];
        //copiar los datos para los arreglos temporadles
        for(int i = 0; i < n1; i++){
            Arrayizq[i] = arr[izq + i];
        }
        for(int j = 0; j < n2; j++){
            Arrayder[j] = arr[medio + 1 + j];
        }
        //Inicializar indices para el ordenamiento
        int i = 0, j = 0, k = izq;
        while(i<n1 && j<n2){
            if(Arrayizq[i].length() <= Arrayder[j].length() ){
                arr[k] = Arrayizq[i];
                i++;
            }else{
                arr[k] = Arrayder[j];
                j++;
            }
            k++;
        }
        while(i< n1){
            arr[k] = Arrayizq[i];
            i++;
            k++;
        }
        while(j< n2){
            arr[k] = Arrayder[j];
            j++;
            k++;
        }

    }

}
