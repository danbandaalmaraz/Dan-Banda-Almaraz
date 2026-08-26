package org.example.DoubleLinkedList;
// Esta clase puede estar en el MISMO archivo, pero FUERA de ListaDobleEnlazada
// O en un archivo separado llamado "EjemploLista.java"
public class EjemploLista {

    public static void main(String[] args) {
        ListaDobleEnlazada lista = new ListaDobleEnlazada();

        // Agregar elementos
        System.out.println("=== AGREGANDO ELEMENTOS ===");
        lista.agregarFinal(10);
        lista.agregarFinal(20);
        lista.agregarFinal(30);
        lista.agregarFinal(40);
        lista.agregarFinal(50);

        System.out.print("Lista: ");
        lista.recorrerAdelante();  // 10 20 30 40 50

        // 1. BUSCAR UN ELEMENTO
        System.out.println("\n=== BUSCAR ELEMENTO ===");
        boolean existe30 = buscarEnLista(lista, 30);
        System.out.println("¿Existe el 30? " + existe30);

        boolean existe99 = buscarEnLista(lista, 99);
        System.out.println("¿Existe el 99? " + existe99);

        // 2. CONTAR ELEMENTOS
        System.out.println("\n=== CONTAR ELEMENTOS ===");
        int total = contarElementos(lista);
        System.out.println("Total de elementos: " + total);

        // 3. OBTENER POR POSICIÓN
        System.out.println("\n=== OBTENER POR POSICIÓN ===");
        int elementoEnPos2 = obtenerElemento(lista, 2);
        System.out.println("Elemento en posición 2: " + elementoEnPos2);

        // 4. ENCONTRAR EL MÁXIMO
        System.out.println("\n=== ENCONTRAR EL MÁXIMO ===");
        int maximo = encontrarMaximo(lista);
        System.out.println("El valor máximo es: " + maximo);

        // 5. ENCONTRAR EL MÍNIMO
        System.out.println("\n=== ENCONTRAR EL MÍNIMO ===");
        int minimo = encontrarMinimo(lista);
        System.out.println("El valor mínimo es: " + minimo);

        // 6. RECORRIDO CONDICIONAL (solo pares)
        System.out.println("\n=== RECORRIDO CONDICIONAL (SOLO PARES) ===");
        imprimirPares(lista);
    }

    // ============ MÉTODOS AUXILIARES ============

    public static boolean buscarEnLista(ListaDobleEnlazada lista, int valor) {
        ListaDobleEnlazada.Nodo actual = lista.obtenerCabeza();
        while (actual != null) {
            if (actual.datos == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public static int contarElementos(ListaDobleEnlazada lista) {
        int contador = 0;
        ListaDobleEnlazada.Nodo actual = lista.obtenerCabeza();
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    public static int obtenerElemento(ListaDobleEnlazada lista, int posicion) {
        int indice = 0;
        ListaDobleEnlazada.Nodo actual = lista.obtenerCabeza();
        while (actual != null) {
            if (indice == posicion) {
                return actual.datos;
            }
            indice++;
            actual = actual.siguiente;
        }
        throw new IndexOutOfBoundsException("Posición " + posicion + " no existe");
    }

    public static int encontrarMaximo(ListaDobleEnlazada lista) {
        ListaDobleEnlazada.Nodo actual = lista.obtenerCabeza();
        if (actual == null) {
            throw new IllegalStateException("La lista está vacía");
        }

        int maximo = actual.datos;
        while (actual != null) {
            if (actual.datos > maximo) {
                maximo = actual.datos;
            }
            actual = actual.siguiente;
        }
        return maximo;
    }

    public static int encontrarMinimo(ListaDobleEnlazada lista) {
        ListaDobleEnlazada.Nodo actual = lista.obtenerCabeza();
        if (actual == null) {
            throw new IllegalStateException("La lista está vacía");
        }

        int minimo = actual.datos;
        while (actual != null) {
            if (actual.datos < minimo) {
                minimo = actual.datos;
            }
            actual = actual.siguiente;
        }
        return minimo;
    }

    public static void imprimirPares(ListaDobleEnlazada lista) {
        ListaDobleEnlazada.Nodo actual = lista.obtenerCabeza();
        System.out.print("Números pares: ");
        while (actual != null) {
            if (actual.datos % 2 == 0) {
                System.out.print(actual.datos + " ");
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
