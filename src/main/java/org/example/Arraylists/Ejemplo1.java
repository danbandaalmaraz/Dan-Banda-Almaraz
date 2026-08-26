package org.example.Arraylists;
import java.util.ArrayList;
public class Ejemplo1 {
    static class Libro{
        String titulo;
        String autor;

        Libro(String titulo, String autor){
            this.titulo = titulo;
            this.autor = autor;
        }
        @Override
        public String toString(){
            return titulo + "by" + autor;
        }
    }
    public static void main(String[]args){
        ArrayList<Libro> recomendaciones = new ArrayList<>();
        recomendaciones.add(new Libro("Java","Saul"));
        recomendaciones.add(new Libro("Python","Miguel"));
        recomendaciones.add(new Libro("C++","Roger"));

        //Nuevas Recomendaciones

        recomendaciones.add(new Libro("C Sharp","Rodrigo"));
        recomendaciones.add(new Libro("Ensamblador","Hugo"));
        recomendaciones.add(new Libro("Java Script","Lucas"));

        System.out.println("Recomendaciones despues de agregar nuevos libros" + recomendaciones);

        recomendaciones.set(1, new Libro("Jonas Brothers","jorge"));
        System.out.println("Recomendaciones actualizadas" + recomendaciones);

        recomendaciones.remove(0);
        System.out.println("Recomendaciones actualizadas" + recomendaciones);
    }
}
