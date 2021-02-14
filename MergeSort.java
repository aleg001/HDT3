/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* MergeSort.java
* Autores: Alejandro Gomez y Ana Ramirez
* Fecha de creacion: 09/02/2021
* Ultima edicion: 09/02/2021
********************************************************/
import java.util.Arrays;
import java.util.ArrayList;

public class MergeSort {
    
    

  /**
  * Método para proceso de merge
  * 
  * @param Comparable lista
  * @return Comparable lista
  * @author Alejandro Gomez
  **/

     public static Comparable[] MergeSorter(Comparable[] lista) {
        //Se verifica el tamanio de la lista de tipo Comparable
        if(lista.length<=1){
            return lista;
        }
        //-------------------------INSTANCIAS DE COMPARABLE---------------
        Comparable[] Dato1 = new Comparable[lista.length / 2];
        Comparable[] Dato2 = new Comparable[lista.length - Dato1.length];
        
        //Se copia al array la info requerida
        System.arraycopy(lista, 0, Dato1, 0, Dato1.length); System.arraycopy(lista, Dato1.length, Dato2, 0, Dato2.length);
        MergeSorter(Dato1); MergeSorter(Dato2); Merger(Dato1, Dato2, lista);
        
        //Se devuelve la lista
        return lista;
        
    }

    
  /**
  * Método para proceso de merge
  * 
  * @param Comparable Dato1
  * @param Comparable Dato2
  * @param Comparable Resultado
  * @return N/A
  * @author Alejandro Gomez
  **/

    private static void Merger(Comparable[] Dato1, Comparable[] Dato2, Comparable[] Resultado) {
        
        //Se definen variables a utilizar
        int primerDato = 0; int secDato = 0;int resMergeSort = 0;

        //Se crea ciclo while en el cual se realizara el proceso del merger
        while (primerDato < Dato1.length && secDato < Dato2.length) 
        {
            //Se declara ciclo if para comparar el primer dato y segundo, obteniendo un resultado
            if (Dato1[primerDato].compareTo(Dato2[secDato]) > 0) 
            {Resultado[resMergeSort] = Dato1[primerDato]; primerDato++;} 
            //Se definen condiciones de Else
            else
            {Resultado[resMergeSort] = Dato2[secDato];secDato++;}
            resMergeSort++;
        }
        
        //Se copia al Array la informacion de cada dato.
        System.arraycopy(Dato1, primerDato, Resultado, resMergeSort, Dato1.length - primerDato); System.arraycopy(Dato2, secDato, Resultado, resMergeSort, Dato2.length - secDato);
  }
}
