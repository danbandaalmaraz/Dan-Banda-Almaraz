package org.example.TreeMap;
import java.util.TreeMap;
import java.util.Map;


public class TiendaLibro {
    private TreeMap<String, String> map = new TreeMap<>();

    public void ultimo(){
        Object mayor = map.lastKey();
        System.out.println("Mayor" + mayor + map.get(mayor));
        System.out.println();
    }

    public void penul(){
        Map.Entry salida = map.lastEntry();
        System.out.println("Mayor" + salida);
    }

    public void primero(){
        Map.Entry entrada = map.firstEntry();
        System.out.println("Menor" + entrada);
    }

    public void AggLibro(String isbn, String titulo){
        map.put(isbn, titulo);
        System.out.println("Libro con ISBN" + isbn + "Ah sido agregado actualizado");
    }
    public void BorrarLibro(String isbn) {
        if (map.containsKey(isbn)) {
            map.remove(isbn);
            System.out.println("Libro con ISBN" + isbn + "Ha sido removido");
        } else {
            System.out.println("Libro no esta en la lista");
        }
    }
    public void getTitutloLibro(String isbn){
        String titulo = map.get(isbn);
        if(titulo != null){
            System.out.println("ISBN" + isbn + ":" + titulo);
        }else{
            System.out.println("Libro con ISBN" + isbn + "no esta en el inventario");
        }
    }

    public void desplegarLibros(){
        System.out.println("Inventario" + map);
    }

    public void encontrarSiguiente(String buscar){
        Map.Entry entrada = map.higherEntry(buscar);
        System.out.println(entrada);


    }

    public void encontrarAnterior(String buscar){
        Map.Entry salida = map.lowerEntry(buscar);
        System.out.println(salida);

    }


    public static void main(String[]args){
        TiendaLibro inventario = new TiendaLibro();


        inventario.AggLibro("970","Java");
        inventario.AggLibro("969","SQL");
        inventario.AggLibro("971","Python");

        inventario.desplegarLibros();
        inventario.getTitutloLibro("969");
        inventario.BorrarLibro("970");

        inventario.ultimo();
        inventario.primero();
        inventario.penul();

        inventario.encontrarSiguiente("970");
        inventario.encontrarAnterior("970");
    }
}
