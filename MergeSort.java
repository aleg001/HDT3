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
    * @param arr[] lista
    * @param Comparable lista
    * @param Comparable lista
    * @return Comparable lista
    * @author Alejandro Gomez y Ana Ramirez
    **/

    public void MergeSorter(int arr[], int l, int m, int r) 
    { 
        //Se definen variables
        int n1 = m - l + 1;  int n2 = r - m; 
  
        //Se crean arrays de ints
        int L[] = new int [n1]; int R[] = new int [n2]; 
  
        //La info se pasa a los arrays por medio de un for
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m +1+ j]; 
  
  
        //Se definen variables de uso en el while
        int i = 0, j = 0; int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) {arr[k] = L[i]; i++;} 
            else{arr[k] = R[j]; j++;} 
            k++; 
        } 
  
        while (i < n1) 
        {arr[k] = L[i]; i++; k++; } 
        while (j < n2) 
        {arr[k] = R[j]; j++; k++;} 
    } 


    /**
    * Método para proceso de sorting
    * 
    * @param int[] lista
    * @param int l
    * @param int r
    * @return int[] lista
    * @author Alejandro Gomez y Ana Ramirez
    **/

    private void Sort(int arr[], int l, int r) 
    { 
      
        if (l < r) 
        {int m = (l+r)/2;           
            Sort(arr, l, m); 
            Sort(arr , m+1, r); 
            MergeSorter(arr, l, m, r); } 
        
    }

    /**
    * Método para proceso de comparar
    * 
    * @param int[] lista
    * @return int[] lista
    * @author Alejandro Gomez y Ana Ramirez
    **/

    public int[] compareTo(int[] list) {
      int l=0;
      int r=list.length-1;
      Sort(list,l,r);
      return list;
    }
}
