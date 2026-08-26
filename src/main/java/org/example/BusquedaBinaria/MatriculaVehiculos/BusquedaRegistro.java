package org.example.BusquedaBinaria.MatriculaVehiculos;

public class BusquedaRegistro {
    Registro[] inscripcion;

    public BusquedaRegistro(){
        BaseDatos db = new BaseDatos();
        inscripcion = db.getRegistro();
    }

    public Registro search(String licensia){
        int izquierda = 0;
        int derecha = inscripcion.length - 1;

        while(izquierda <= derecha){
           int med = izquierda + (derecha-izquierda)/2;
           int comparador = inscripcion[med].licensia.compareTo(licensia);
           if(comparador == 0){
               return inscripcion[med];
           } else if(comparador < 0){
               izquierda = med + 1;
           }else{
               derecha = med - 1;
           }
        }
        return null;

    }
    public void imprimirTodo(){
        for(Registro red : inscripcion){
            System.out.println(red);
        }
    }

    public static void main(String[]args){
        String licencia = "SGL";
        BusquedaRegistro regR = new BusquedaRegistro();
        System.out.println();
        regR.imprimirTodo();
        System.out.println();

        Registro reg = regR.search(licencia);

        if(reg != null){
            System.out.println("Registro encontrado");
            System.out.println(reg);
        }else{
            System.out.println("No se encontro registro de la licencia" + licencia);
        }

    }

}
