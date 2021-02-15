/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* BubbleSort.java
* Autores: Alejandro Gomez y Ana Ramirez
* Fecha de creacion: 09/02/2021
* Ultima edicion: 09/02/2021
********************************************************/


import java.io.IOException;

public class BubbleSort {
    
	/**
     * 
     * @param Comparable[] list
     * @return int
     * @author Alejandro Gomez y Ana Ramirez
     **/

    public static String bubbleSort(Comparable[] list) {
		
		/*	Metodo creado para la realizacion 
			de procesos del 
			tipo BubbleSort */

		//Se declaran variables
		int n = list.length; 
		//Se crea ciclo for para cada i
		for (int i = 0; i < n-1; i++)
			//Se crea ciclo for para cada j 
			for (int j = 0; j < n-i-1; j++) 
				//Se realiza proceso if para comparar
				if (list[j].compareTo(list[j+1]) < 0 )  
				{ 
					// cambia arr[j+1] con arr[j] 
					Comparable temp = list[j]; 
					list[j] = list[j+1]; 
					list[j+1] = temp; 
				}
		return ("Sus datos en orden son: ");}
	
}
