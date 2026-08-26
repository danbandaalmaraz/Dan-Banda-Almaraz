package org.example.LinkedHashMap.LRU;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String []args){
        OrdenAccesoMap map = new OrdenAccesoMap(4);
        map.put("001", new Estudiante("001","Juan","Perez","Java"));
        map.put("002", new Estudiante("002","Dan","Perez","C++"));
        map.put("003", new Estudiante("003","Karla","Perez","Python"));
        map.put("004", new Estudiante("004","Jula","Perez","Java"));

        map.get("001");
        map.get("002");

        map.put("005", new Estudiante("005","Luis","Pablo","SQL"));
        System.out.println("Elementos del mapa LRU");

        imprimirMapa(map);

    }
    public static void imprimirMapa(LinkedHashMap map){
        for(Object entrada : map.entrySet()){
            Map.Entry entradas = (Map.Entry) entrada;
            Estudiante e = (Estudiante) entradas.getValue();
            String id = (String) entradas.getKey();
            System.out.println("ID"+id + "Nombre" + e.nombre + "Apellido" + e.apellido + "Lenguaje" +  e.lenguaje );
        }

    }
}
