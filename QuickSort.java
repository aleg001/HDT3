
/*******************************************************
 /*******************************************************
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructuras de Datos
 * Profesor: Moises Gonzales 
 * QuickSort.java 
 * Autores: Alejandro Gomez y Ana Ramirez 
 * Fecha de creacion: 09/02/2021 
 * Ultima edicion: 10/02/2021
 ********************************************************/


public class QuickSort  {

     public QuickSort() {
    	 
     }
    /**
     * Metodo CompareTo
     * @param Comparable[] lista
     * @param Int bajo
     * @param Int alto
     * @author Alejandro Gomez y Ana Ramirez
     **/
     
     public int[] compareTo(int[] lista) {
    	 int alto=lista.length-1;
    	 int bajo=0;
    	 QuickSorter(lista,bajo,alto);
    	 return lista;
     }

     /* Metodo para proceso de quicksort */
      /**
     * Metodo QuickSorter
     * @param int[] lista
     * @param Int bajo
     * @param Int alto
     * @author Alejandro Gomez y Ana Ramirez
     **/
      private void QuickSorter(int[] lista, int bajo, int alto)
      //Se realiza un ciclo if en caso el dato alto es mas pequeno que el bajo.
      {
    	  if (bajo < alto){
    		  int IndexParticion = MetodoParticion(lista, bajo, alto); 
              QuickSorter(lista, bajo, IndexParticion-1); 
              QuickSorter(lista, IndexParticion+1, alto);
    	  }
      }


      
    /**
     * Metodo MetodoParticion
     * @param Comparable[] lista
     * @param Int bajo
     * @param Int alto
     * @author Alejandro Gomez y Ana Ramirez
     **/

     /* Metodo para proceso de particion */

      private static int MetodoParticion(int[] list, int bajo, int alto) {
        //Se definen instancias
        int Pivote = list[alto]; 
        int i = (bajo-1);
        //Se crea ciclo for:
        for (int j=bajo; j<alto; j++)
        //Se crea ciclo if en la cual se compara el tamano del pivote.
        {
        	if (list[j] <= Pivote) {
        		i++; 
            	int temp = list[i];
            	list[i] = list[j];
            	list[j] = temp;        	
        	}
        }
        //Se define una instancia temporal
        int temp = list[i+1];
        list[i+1] = list[alto];
        list[alto] = temp;
        //Se devuelve i+1.
        return i+1;
    }

    
} 

