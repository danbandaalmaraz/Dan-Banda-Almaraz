package org.example.TreeMap;
import java.util.TreeMap;
import java.util.Map;
public class Ejemplo1 {
    public static void main(String[]args){
        TreeMap map = new TreeMap();
        map.put("Dan", "Mexico");
        map.put("AKarla", "CDMX");
        map.put("Valeria", "Toreo");

        printMap(map);
    }

    public static void printMap(TreeMap map){
        int i = 1;
        System.out.println("Registo de estudiantes");
        for(Object entrada : map.entrySet()){
            Map.Entry entradas = (Map.Entry) entrada;
            System.out.println(i + "ID" + entradas.getKey() + ",Nombre" + entradas.getValue());
            i += 1;
        }
    }
}
