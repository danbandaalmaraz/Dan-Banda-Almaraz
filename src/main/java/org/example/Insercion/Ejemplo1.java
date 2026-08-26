package org.example.Insercion;

public class Ejemplo1 {
    public static void main(String[]args){
        Ejemplo1 db = new Ejemplo1();
        String[] nombre = {"Zara", "Mia","Ana","Sofia","Juan"};
        db.algoritmoInsercion(nombre);

        System.out.println("Nombres ordenados en orden reverso");
        for(String nombres : nombre){
            System.out.println(nombres + "");
        }
    }

    public void algoritmoInsercion(String[] arr){
        int n = arr.length;
        for(int contador1 = 1; contador1 < n; contador1++){
            String llave = arr[contador1];
            int contador2 = contador1 - 1;
            while(contador2 >=0 && arr[contador2].compareTo(llave)>0){
                arr[contador2 + 1] = arr[contador2];
                contador2 = contador2 - 1;

            }
            arr[contador2 + 1] = llave;
        }
    }
}
