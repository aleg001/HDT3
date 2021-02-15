/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Driver.java
* Autores: Alejandro Gomez y Ana Ramirez
* Fecha de creacion: 09/02/2021
* Ultima edicion: 09/02/2021
********************************************************/

import java.util.*;

public class RadixSort {
	public RadixSort() {
		
	}
	    /**
     * Metodo QuickSorter
     * @param Comparable[] lista
     * @param Int bajo
     * @param Int alto
     * @author Alejandro Gomez y Ana Ramirez
     **/
	
	private int get_max_val(int my_arr[], int arr_len) {
	      int max_val = my_arr[0];
	      for (int i = 1; i < arr_len; i++)
	         if (my_arr[i] > max_val)
	         max_val = my_arr[i];
	      return max_val;
	}
	private void countSort(int my_arr[], int arr_len, int exp) {
	      int result[] = new int[arr_len];
	      int i;
	      int count[] = new int[10];
	      Arrays.fill(count,0);
	      for (i = 0; i < arr_len; i++)
	         count[ (my_arr[i]/exp)%10 ]++;
	      for (i = 1; i < 10; i++)
	         count[i] += count[i - 1];
	      for (i = arr_len - 1; i >= 0; i--) {
	         result[count[ (my_arr[i]/exp)%10 ] - 1] = my_arr[i];
	         count[ (my_arr[i]/exp)%10 ]--;
	      }
	      for (i = 0; i < arr_len; i++)
	         my_arr[i] = result[i];
	 }
	 public int[] compareTo(int[] my_arr) {
		  int arr_len=my_arr.length;
	      int m = get_max_val(my_arr, arr_len);
	      for (int exp = 1; m/exp > 0; exp *= 10)
	      countSort(my_arr, arr_len, exp);
	      return my_arr;
	  }
}
