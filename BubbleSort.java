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

    public static void bubbleSort(Comparable[] list) {
		
		/*	Metodo creado para la realizacion 
			de procesos del 
			tipo BubbleSort */

		//Se definen las variables a utilizar
		int countCompareOps = 0;
		int countReplacement = 0;
		String FileBurbujas = "";
		String newLine = "";

		//Se crea un trycatch para la realización del log de este sorter
		try {
			System.out.println(FileBurbujas);
			FileBurbujas = FileLogger.CrearArchivo("Log_Burbujas");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		for (int i = 0; i < list.length; i++) {
			newLine += " " + list[i];
		}
		newLine += "\r\n";
		
		//Se crea un trycatch para agregar las lineas al archivo de texto creado
		try {
			FileLogger.AgregarTextoLineaNueva(FileBurbujas, " *** BubbleSort ***\r\n");
			FileLogger.AgregarTextoLineaNueva(FileBurbujas, "Original: " + newLine);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				countCompareOps++;
				if (list[i].compareTo(list[j]) > 0) {
					
					String actualArray = "";
					for (int k = 0; k < list.length; k++) {
						if (k == i) {
							actualArray += " i => (";
						}
						
						if (k == j) {
							actualArray += " j => (";
						}
						
						actualArray += " " + list[k];
						
						if (k == i || k == j) {
							actualArray += " ) ";
						}
						
					}
					
					actualArray += "\r\n";
					
					try {
						FileLogger.AgregarTextoLineaNueva(FileBurbujas, actualArray);
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
					
					
					Comparable temp = list[i];
					list[i] = list[j];
					list[j] = temp;
					countReplacement++;
					
				}
			}
		}
		
		newLine = "";
		
		for (int i = 0; i < list.length; i++) {
			newLine += " " + list[i];
		}
		newLine += "\r\n";
				
		try {
			FileLogger.AgregarTextoLineaNueva(FileBurbujas, "Ordenado: " + newLine);
			FileLogger.AgregarTextoLineaNueva(FileBurbujas, "Comparar: " + countCompareOps + " Intercambios: " + countReplacement);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
