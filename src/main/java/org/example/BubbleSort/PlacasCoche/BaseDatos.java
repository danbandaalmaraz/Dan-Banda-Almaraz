package org.example.BubbleSort.PlacasCoche;
import java.util.ArrayList;

public class BaseDatos {
    private ArrayList registro = new ArrayList();

    public BaseDatos(){
        registro.add(new Registro("DSWK","Dan"));
        registro.add(new Registro("FGSH","Dan"));
        registro.add(new Registro("EHBG","Dan"));
        registro.add(new Registro("BASF","Dan"));
        registro.add(new Registro("CBTN","Dan"));
        registro.add(new Registro("AJKN","Dan"));


    }

    public void imprimirTodo(){
        for(Object obj : registro){
            Registro reg = (Registro) obj;
            System.out.println(reg);
        }
    }

    public void OrdenamientoBurbuja(){
        boolean cambio;
        int n = registro.size();
        for(int i = 0; i < n - 1; i++){
            cambio = false;
            for(int j = 0; j < n - 1 - i;j++ ){
                Registro registroactual = (Registro) registro.get(j);
                Registro registrosiguiente = (Registro) registro.get(j+1);
                if(registroactual.licencia.compareTo(registrosiguiente.licencia)>0){
                    registro.set(j,registrosiguiente);
                    registro.set(j+1,registroactual);
                    cambio = true;
                }
            }
            if(!cambio){
                break;
            }
        }
    }

    public static void main(String[]args){
        BaseDatos bd = new BaseDatos();
        System.out.println("Lista sin ordenar");
        bd.imprimirTodo();
        System.out.println("Lista ordenada");
        bd.OrdenamientoBurbuja();
        bd.imprimirTodo();
    }

}
