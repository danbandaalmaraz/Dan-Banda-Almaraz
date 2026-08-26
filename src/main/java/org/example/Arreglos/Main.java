package org.example.Arreglos;

public class Main {
    public static void main(String[]args) {
        Estudiante[] estudiantes = new Estudiante[5];
        estudiantes[0] = new Estudiante(1, "juan", 20);
        estudiantes[1] = new Estudiante(2, "hugo", 20);
        estudiantes[2] = new Estudiante(3, "pako", 20);
        estudiantes[3] = new Estudiante(4, "luis", 20);
        estudiantes[4] = new Estudiante(5, "daniel", 20);



        int IndiceparaEliminar = 4;
        System.out.println("Elimina el elemento del indice:" + IndiceparaEliminar);
        borrarElemento(IndiceparaEliminar, estudiantes);

        System.out.println("Agrega nuevo estudiante numero: 5, Nombre: Dan, Edad: 40");
        Estudiante nuevoEstudiante = new Estudiante(6, "Dan", 40);
        agregarElemento(nuevoEstudiante, estudiantes);

        int indiceparaAgregar = 2;
        System.out.println("Agregar un elemento al indice" + indiceparaAgregar);
        actualizarElemento(2, estudiantes);
    }
    public static void borrarElemento(int IndiceparaEliminar, Estudiante[] arregloOriginal){
        Estudiante[] nuevoArreglo = new Estudiante[arregloOriginal.length -1];
        for(int i = 0, j = 0; i<arregloOriginal.length; i++){
            if(i!= IndiceparaEliminar){
                nuevoArreglo[j++] = arregloOriginal[i];
            }
        }
        imprimirArreglo("Borrar",nuevoArreglo);
    }
    public static void agregarElemento(Estudiante nuevoEstudiante,Estudiante[] arregloOriginal){
        Estudiante[] nuevoArreglo = new Estudiante[arregloOriginal.length +1];
        for(int i = 0; i<arregloOriginal.length; i++){
            if(i == (nuevoArreglo.length-1)){
                nuevoArreglo[i] = nuevoEstudiante;
            }else{
                nuevoArreglo[i] = arregloOriginal[i];
            }
        }
        imprimirArreglo("Añadis",nuevoArreglo);
    }
    public static void actualizarElemento(int indiceparaAgregar, Estudiante[] arregloOriginal){
        arregloOriginal[indiceparaAgregar].setName("Dan");

    }

    public static void imprimirArreglo(String mensaje, Estudiante[] estudiantes){
        System.out.println("Operacion" + mensaje);
        for(int i = 0;i<estudiantes.length; i++){
            System.out.println("NOmbre del estudiante" + estudiantes[i].getNombre());
        }
    }
}
