package org.example.Insercion.PlacasCoche;


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
            Registro reg = (Registro)obj;
            System.out.println(reg);
        }
    }



    public static void main(String[]args){
        BaseDatos bd = new BaseDatos();
        System.out.println("Lista sin ordenar");
        bd.imprimirTodo();
        System.out.println("Lista ordenada");
        bd.Insercion();
        bd.imprimirTodo();
    }

    public void Insercion(){
        int n = registro.size();
        for(int isinOrdenar = 1; isinOrdenar < n; isinOrdenar++){
            Registro rsinOrdenar = (Registro)registro.get(isinOrdenar);
            int iOrdenado = isinOrdenar - 1;
            while(iOrdenado >=0){
                Registro rOrdenado = (Registro)registro.get(iOrdenado);
                int compararValor = rOrdenado.licencia.compareTo(rsinOrdenar.licencia);
                if(rOrdenado.licencia.compareTo(rsinOrdenar.licencia) > 0 ){
                    registro.set(iOrdenado + 1, rOrdenado );
                    iOrdenado--;
                }else{
                    break;
                }
            }
            registro.set(iOrdenado + 1, rsinOrdenar);
        }
    }

}
