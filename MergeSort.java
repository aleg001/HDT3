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

public class MergeSort implements InterfaceComparar {
    
    

      /**
      * Método para proceso de merge
      * 
      * @param Comparable lista
      * @return Comparable lista
      * @author Alejandro Gomez
      **/

    private static void MergeSorter(Comparable[] primero, Comparable[] segundo, Comparable[] resultado) {
      //Se declaran variables
      int xprimero = 0; int xsegundo = 0;int resultadod = 0;
      //Ciclo while para comparar longitud
      while (xprimero < primero.length && xsegundo < segundo.length) 
      //Se declara if para comparar el primero con el segundo
      {if (primero[xprimero].compareTo(segundo[xsegundo]) > 0) 
          { //Si cumple con las condiciones, continua
            resultado[resultadod] = primero[xprimero];
              xprimero++;} 
          else{resultado[resultadod] = segundo[xsegundo];
              xsegundo++;}
          //Despues que acaba el else o continua el if
            resultadod++;}
      //Se copia a los arrays la informacion
      System.arraycopy(primero, xprimero, resultado, resultadod, first.length - xprimero);System.arraycopy(segundo, xsegundo, resultado, resultadod, second.length - xsegundo);
}

}
