package org.example.LinkedHashMap.LRU;
import java.util.LinkedHashMap;
import java.util.Map;

public class OrdenAccesoMap extends LinkedHashMap{
    private final int capacidad;

    public OrdenAccesoMap(int capacidad){
        super(capacidad, .75f,true);
        this.capacidad = capacidad;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry entrada){
        return size() > capacidad;
    }
}
