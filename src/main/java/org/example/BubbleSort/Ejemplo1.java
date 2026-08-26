package org.example.BubbleSort;

public class Ejemplo1 {
    public static void main(String[]args){
        int[] libros = {12, 5, 7, 4, 6};
        System.out.println("Orden natural del Arreglo");
        imprimirArreglo(libros);
        System.out.println("Orden ordenado del arreglo");
        OrdenamientoBurbuja(libros);
        imprimirArreglo(libros);



    }

    public static void OrdenamientoBurbuja(int[]libros){
        int numeroLibros = libros.length;
        boolean cambio;

        for(int contador1 = 0; contador1 < numeroLibros; contador1++){
            cambio = false;
            for(int contador2 = 0; contador2 < numeroLibros - 1 - contador1; contador2++){
                if(libros[contador2] > libros[contador2 + 1]){
                    int temp = libros[contador2];
                    libros[contador2] = libros[contador2 + 1];
                    libros[contador2 + 1] = temp;
                    cambio = true;
                }
            }
            if(!cambio){
                break;
            }
        }

    }

    public static void imprimirArreglo(int[]libros){
        for(int altura : libros){
            System.out.println(altura + "libros");
        }
        System.out.println();
    }
}
