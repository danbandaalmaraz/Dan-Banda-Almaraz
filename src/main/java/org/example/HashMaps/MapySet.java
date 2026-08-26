package org.example.HashMaps;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class MapySet {
    public static void main(String[]args){
        Map<String, String> map = new HashMap();

        map.put("LY2048303", "John Wells");
        map.put("AB0649858", "Lori Wells");
        map.put("AB4453455", "David Windston");
        map.put("CS9857859", "John Smith");
        map.put("LY9475958", "Alen Cornworth");
        System.out.println();

        Set<String> llaves = map.keySet();
        for(String llave : llaves){
            String valor = map.get(llaves);
            System.out.println("ID" + llaves + "Nombre" + valor);
        }
        System.out.println();

        Set <Map.Entry<String, String>> entradas = map.entrySet();

        for(Object entrada : entradas){
            Map.Entry mapEntry = (Map.Entry) entrada;
            Object llave = mapEntry.getKey();
            Object valor = mapEntry.getValue();
            System.out.println("ID" + llave + "Nombre" + valor);
        }

        map.forEach((llave, valor) ->{
            System.out.println("ID" + llave + "Nombre" + valor);
        });
    }
}
