import java.util.Arrays;


/*******************************************************
 * Universidad del Valle de Guatemala Algoritmos y Estructuras de Datos
 * Profesor: Moises Gonzales RadixSort.java Autores: Alejandro Gomez y Ana
 * Ramirez Fecha de creacion: 09/02/2021 Ultima edicion: 10/02/2021
 ********************************************************/

public class RadixSort {

    
      /**
      * Método para proceso de Radix
      * 
      * @param Comparable lista
      * @return Comparable lista
      * @author Alejandro Gomez
      **/

      /* Metodo para proceso de RadixSorter */
    public static String RadixSorter(InterfaceComparar[] lista, int n)
    {   //Se declaran variables
        int RadixSorteador = getMax(lista, n);
        //Ciclo for para cada uno de los valores
        for (int xd = 1; RadixSorteador / xd > 0; xd *= 10) countSort(lista, n, xd);
        return ("Sus datos en forma ordenada son: ");}


}


