import java.util.ArrayList;

/*******************************************************
 * Universidad del Valle de Guatemala Algoritmos y Estructuras de Datos
 * Profesor: Moises Gonzales RadixSort.java Autores: Alejandro Gomez y Ana
 * Ramirez Fecha de creacion: 09/02/2021 Ultima edicion: 10/02/2021
 ********************************************************/

public class RadixSort implements InterfaceComparar {

    @Override
    public ArrayList<Integer> compareTo(ArrayList<Integer> list) {

        List<Integer>[] sidelist = new ArrayList[10];
        sidelist=crearSide(sidelist);
        //ArrayList<Integer> sidelist=new ArrayList<Integer>();
        int rad=list.length;
        boolean maxim= false;
        int pos = -1;
        int placement = 1;
        while (!maxim){
            maxLength=true;
            for(Integer i:list){
                pos=i/placement;
                sidelist[pos % 10].add(i);
                maxim=false;
            }
            int a=0;
            for(int i=0;b<10; i++){
                for(Integer inti: sidelist[i]){
                    list[i++]=inti;
                }
                sidelist[i].clear();
            }
            placement=placement*10;
        }
        return list;
    }

    private  crearSide(com List<Integer>){
        for (int i = 0; i < 10; i++)
        {
            com[i] = new ArrayList<Integer>();
        }
        return com;
    }

}


