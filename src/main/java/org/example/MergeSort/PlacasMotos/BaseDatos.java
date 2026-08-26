package org.example.MergeSort.PlacasMotos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.List;
public class BaseDatos {
    private ArrayList registros = new ArrayList();
    public BaseDatos(){
        registros.add(new Registro("CFX","Maria"));
        registros.add(new Registro("HFJ","Luis"));
        registros.add(new Registro("NJK","Jose"));
        registros.add(new Registro("UIR","Vale"));
        registros.add(new Registro("AHJ","Dan"));
        registros.add(new Registro("FJD","Karla"));

    }
    public void imprimirDatos(){
        for(Object obj  : registros){
            Registro reg = (Registro) obj;
            System.out.println(reg);
        }
    }
    public void mergeSort(){
        int n = registros.size();
        for(int subArray = 1; subArray < n; subArray*=2){
            for(int izq = 0; izq < n - subArray; izq += 2 * subArray){
                int derecho = izq  + subArray;
                int derechofinal = Math.min(izq + 2 * subArray, n);
                ArrayList izqArray = new ArrayList(registros.subList(izq,derecho));
                ArrayList derArray = new ArrayList(registros.subList(derecho, derechofinal));
                merge(izq,izqArray,derArray);
            }
        }
    }
    private void merge(int indicemerge, ArrayList izqArray, ArrayList derArray){
        int indiceizq = 0, indiceder = 0;
        Registro izqVal;
        Registro derVal;

        while(indiceizq < izqArray.size() && indiceder < derArray.size()){
            izqVal = (Registro) izqArray.get(indiceizq);
            derVal = (Registro) derArray.get(indiceder);

            if(izqVal.licencia.compareTo(derVal.licencia) <= 0){
                this.registros.set(indicemerge, izqVal);
                indiceizq++;
            }else{
                this.registros.set(indicemerge, derVal);
                indiceder++;
            }
            indicemerge++;
        }
        while(indiceizq < izqArray.size()){
            izqVal = (Registro) izqArray.get(indiceizq);
            this.registros.set(indicemerge, izqVal);
            indiceizq++;
            indicemerge++;
        }
        while(indiceder < derArray.size()){
            derVal = (Registro) derArray.get(indiceder);
            this.registros.set(indicemerge, derVal);
            indiceder++;
            indicemerge++;
        }

    }

    public void quickSort(){
        Stack<int[]> pila = new Stack<>();
        pila.push(new int[]{0, registros.size() - 1});
        while(!pila.isEmpty()){
            int[]rango = pila.pop();
            int bajoIndice = rango[0];
            int altoIndice = rango[1];

            if(bajoIndice<altoIndice){
                int pivote = particion(altoIndice, bajoIndice);
                pila.push(new int[]{bajoIndice, pivote - 1});
                pila.push(new int[]{pivote + 1, altoIndice});

            }

        }
    }

    public int particion(int altoIndice, int bajoIndice){
        List subArray = registros.subList(bajoIndice, altoIndice + 1);
        Registro elementopivote = (Registro) subArray.get(subArray.size() - 1);
        int mayorqueIndice = -1;
        for(int actualIndice = 0; actualIndice < subArray.size() - 1; actualIndice++){
            Registro elementoactual = (Registro) subArray.get(actualIndice);
            if(elementoactual.licencia.compareTo(elementopivote.licencia)<=0){
                mayorqueIndice++;
                if(mayorqueIndice < actualIndice){
                    cambiar(subArray, mayorqueIndice, actualIndice);
                }
            }
        }
        int indicePivote = mayorqueIndice + 1;
        cambiar(subArray,indicePivote, subArray.size() - 1);
        return indicePivote + bajoIndice;
    }

    private void cambiar(List subArray, int i, int j){
        Registro iElemento = (Registro) subArray.get(i);
        Registro jElemento = (Registro) subArray.get(j);
        subArray.set(i, jElemento);
        subArray.set(j, iElemento);
    }

    public static void main(String[]args){
        BaseDatos bd = new BaseDatos();
        bd.quickSort();
        System.out.println("Arreglo ordenado");
        bd.imprimirDatos();
    }
}
