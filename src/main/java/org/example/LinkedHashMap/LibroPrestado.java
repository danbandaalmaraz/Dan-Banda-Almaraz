package org.example.LinkedHashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LibroPrestado {
    private LinkedHashMap<String, String> librosPrestados = new LinkedHashMap();

    public void LibroPrestado(String alumno, String Titulolibro){
        librosPrestados.put(alumno,Titulolibro);
        System.out.println(alumno + "rento" + Titulolibro);

    }
    public void LibroRegresado(String alumno){
        if(librosPrestados.containsKey(alumno)){
            librosPrestados.remove(alumno);
            System.out.println(alumno + "Regreso el libro" );
        } else{
            System.out.println(alumno + "No ha pedido prestado Libros");
        }
    }

    public void checarLibroPrestado(String alumno){
        if(librosPrestados.containsKey(alumno)){
            String tituloLibro = librosPrestados.get(alumno);
            System.out.println(alumno + "ha rentado" + tituloLibro);
        }
    }

    public void desplegarLibrosPrestados(){
        if(librosPrestados.isEmpty()){
            System.out.println("No hay libros prestados");
        }else{
            System.out.println("lista de libros prestados");
            for(Map.Entry<String, String>entrada : librosPrestados.entrySet()){
                System.out.println(entrada.getKey() + "prestado" + entrada.getValue());
            }
        }

    }

    public static void main(String[]args){
        LibroPrestado libreria = new LibroPrestado();
        libreria.LibroPrestado("Dan", "Programacion java");
        libreria.LibroPrestado("Karla", "Estructura de Datos");

        libreria.desplegarLibrosPrestados();
        libreria.checarLibroPrestado("Karla");
        libreria.LibroRegresado("Karla");


    }
}
