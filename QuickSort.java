
/*******************************************************
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructuras de Datos
 * Profesor: Moises Gonzales 
 * QuickSort.java 
 * Autores: Alejandro Gomez y Ana Ramirez 
 * Fecha de creacion: 09/02/2021 
 * Ultima edicion: 10/02/2021
 ********************************************************/

import java.util.ArrayList;

public class QuickSort  {

    public QuickSort(){

    }
    /**
     *
     * @param ArrayList<Integer> list
     * @return ArrayList<Integer> list
     * @author Alejandro Gomez y Ana Ramirez
     **/


    public ArrayList<Integer> compareTo(ArrayList<Integer> list) {
        int begi=0;
        int end=list.size()-1;
        begi=list.get(begi);
        end=list.get(end);
        quickSort(list,begi,end);
        return list;
    }

    private void quickSort(ArrayList<Integer>  arr, int begi, int end) {
        if (begi < end) {
            int partin = divi(arr, begi, end);

            quickSort(arr, begi, partin-1);
            quickSort(arr, partin+1, end);
        }
    }

    private int divi(ArrayList<Integer> l, int begi, int end) {
        int pivote = l.get(end);
        int i = (begi-1);

        for (int j = begi; j < end; j++) {
            if (l.get(j)<= pivote) {
                i++;
                int temp = l.get(i);
                l.set(i,l.get(j));
                l.set(j,temp);
            }
        }

        int t = l.get(i+1);
        l.set(i+1,l.get(end));
        l.set(end,t);
        return i+1;
    }

    
}
    

