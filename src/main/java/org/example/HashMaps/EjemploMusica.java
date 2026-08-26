package org.example.HashMaps;
import java.util.HashMap;

public class EjemploMusica {
    public static void main(String[]args){
        HashMap map = new HashMap();

        map.put("Satisfaction", "Rolling Stones");
        map.put("Yesterday", "Ray Charles");

        System.out.println(map);
        System.out.println();

        String nombreartista = (String) map.put("Yesterday" , "The Beatles");
        System.out.println(nombreartista);
        System.out.println(map);

        String nombreartistas = (String) map.replace("Yesterday" , "The Beatles");
        System.out.println(nombreartistas);
        System.out.println(map);

        String artista =(String) map.replace("LOVE", "Nat King Cole");
        System.out.println(artista);
        System.out.println(map);

        boolean isKey = map.containsKey("Yesterday");
        System.out.println(isKey);
        isKey = map.containsKey("LOVE");
        System.out.println(isKey);

        int tamaño = map.size();
        System.out.println(tamaño);

        boolean isEmpty = map.isEmpty();
        System.out.println(isEmpty);
    }
}
