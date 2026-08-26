package org.example.BusquedaBinaria.MatriculaVehiculos;
import java.util.ArrayList;
import java.util.TreeMap;

public class BaseDatos {
    private TreeMap<String,Registro> map = new TreeMap();
    private Registro[] inscripcion;
    public BaseDatos(){
        ArrayList<Registro> arrayList = new ArrayList();

        arrayList.add(new Registro("SGL", "Daniel"));
        arrayList.add(new Registro("THJ", "Juan"));
        arrayList.add(new Registro("NVF", "Luis"));
        arrayList.add(new Registro("VAS", "Valeria"));
        arrayList.add(new Registro("GSD", "Paco"));
        arrayList.add(new Registro("ODS", "Raul"));
        arrayList.add(new Registro("HEO", "Alejandro"));
        arrayList.add(new Registro("JGF", "Hugo"));
        for(Registro reg : arrayList){
            map.put(reg.licensia, reg);
        }
        inscripcion = map.values().toArray(new Registro[0]);


    }
    public Registro[] getRegistro(){
        return inscripcion;
    }

}
