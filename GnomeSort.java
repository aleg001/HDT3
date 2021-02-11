import java.util.ArrayList;
import java.util.Arrays;

/*******************************************************
 * Universidad del Valle de Guatemala Algoritmos y Estructuras de Datos
 * Profesor: Moises Gonzales GnomeSort.java Autores: Alejandro Gomez y Ana
 * Ramirez Fecha de creacion: 09/02/2021 Ultima edicion: 09/02/2021
 ********************************************************/

public class GnomeSort implements InterfaceComparar {


    /**
     * 
     * @param Comparable[] list
     * @return String
     * @author Alejandro Gomez y Ana Ramirez
     **/
    public static String GnomeSorter(Comparable[] lista) {
        
        /* Se define el metodo para realizar
        el sorting del tipo Gnome */

        int i = 1; int j = 2;
        Comparable Temporary;

        while (i < lista.length) {
            if (lista[i - 1].compareTo(lista[i]) < 0) 
            {
                Temporary = lista[i - 1];
                lista[i - 1] = lista[i]; lista[i--] = Temporary;
                i = (i == 0) ? j++ : i;
            } else {
                i = j;
                j++;
            }
        }
        return ("Al ordenar los datos, quedan asi: ");
    }

    @Override
    public ArrayList compareTo(ArrayList list) {
        // TODO Auto-generated method stub
        return null;
    }
}
