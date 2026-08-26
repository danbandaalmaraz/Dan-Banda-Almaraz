package org.example.LinkedHashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CalificacionesAlumnos {
    public static void main(String[]args){
        LinkedHashMap<String, Integer> calificaciones = new LinkedHashMap();

        calificaciones.put("Dan", 80);
        calificaciones.put("Karla", 90);
        calificaciones.put("Mariana", 85);

        System.out.println("Calificaciones iniciales");
        for(Map.Entry<String,Integer>entrada : calificaciones.entrySet()){
            System.out.println(entrada.getKey() + ":" +  entrada.getValue());
        }

        calificaciones.put("Karla", 95);
        System.out.println(calificaciones);

        if(calificaciones.containsKey("Karla")){
            System.out.println("Calificaciones de Karla" + calificaciones.get("Karla"));
        }

        calificaciones.remove("Mariana");
        calificaciones.putIfAbsent("Juan", 84);

        System.out.println("Calificaciones finales:");
        for(Map.Entry<String,Integer>salida : calificaciones.entrySet()){
            System.out.println(salida.getKey() + "" + salida.getValue());
        }

    }
}
