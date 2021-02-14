import java.util.ArrayList;


/*******************************************************
 * Universidad del Valle de Guatemala Algoritmos y Estructuras de Datos
 * Profesor: Moises Gonzales RadixSort.java Autores: Alejandro Gomez y Ana
 * Ramirez Fecha de creacion: 09/02/2021 Ultima edicion: 10/02/2021
 ********************************************************/

public class RadixSort {

    public RadixSort(){

    }

    public ArrayList<Integer> compareTo(ArrayList<Integer> list) {

        //ArrayList<Integer> sidelist = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> sidelist=new ArrayList<ArrayList<Integer>>();
        //sidelist=crearSide(sidelist);
        //ArrayList<Integer> sidelist=new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
        {
            ArrayList<Integer> nueva = new ArrayList<Integer>();
            sidelist.add( nueva) ;
        }

        boolean maxim= false;
        int pos = -1;
        int lugar = 1;
        while (!maxim){
            maxim=true;
            for(Integer i:list){
                pos=i/lugar;
                sidelist.get(pos % 10).add(i);
                if(maxim && pos>0) {
                    maxim = false;
                }
            }
            int a=0;
            for(int i=0;i<10; i++){
                for(int r=0;r<sidelist.get(i).size();r++){
                    list.set(a++,sidelist.get(i).get(r));
                }
                sidelist.remove(i);
            }
            lugar=lugar*10;
        }
        return list;
    }

    /*private ArrayList<Integer>  crearSide(com List<Integer>){
        for (int i = 0; i < 10; i++)
        {
            com.get(i) = new ArrayList<Integer>();
        }
        return com;
    }*/

}


