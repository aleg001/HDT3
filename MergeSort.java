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
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    private void Sort(int arr[], int l, int r) 
    { 
      
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            Sort(arr, l, m); 
            Sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            MergeSorter(arr, l, m, r); 
        } 
        
    } 
    
    public int[] compareTo(int[] list) {
      int l=0;
      int r=list.length-1;
      Sort(list,l,r);
      return list;
    }
}
