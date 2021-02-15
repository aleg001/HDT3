import java.util.ArrayList;
import java.util.Arrays;

/*******************************************************
 * Universidad del Valle de Guatemala Algoritmos y Estructuras de Datos
 * Profesor: Moises Gonzales GnomeSort.java Autores: Alejandro Gomez y Ana
 * Ramirez Fecha de creacion: 09/02/2021 Ultima edicion: 09/02/2021
 ********************************************************/

public class GnomeSort {


    /**
     * 
     * @param Comparable[] list
     * @return String
     * @author Alejandro Gomez y Ana Ramirez
     **/

    //sort para tipo Gnome
    public static String GnomeSorter(Comparable[] list){
        //Se declaran variables
        int i=1;int j=2;Comparable tmp;
        
        //Ciclo while para saber longitud de lista.
        while(i<list.length){
            //Ciclo if para comparar tamanio lista
            if(list[i-1].compareTo(list[i])<0){
                tmp = list[i-1]; list[i-1] =list[i]; list[i--] = tmp; i = (i==0) ? j++:i;
            
                //En caso no se cumpla con la condicion antes declarada
            }else{i = j; j++;}
        }
        return ("Sus datos en orden son: ");
    }



}
