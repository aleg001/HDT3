
/*******************************************************
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructuras de Datos
 * Profesor: Moises Gonzales 
 * QuickSort.java 
 * Autores: Alejandro Gomez y Ana Ramirez 
 * Fecha de creacion: 09/02/2021 
 * Ultima edicion: 10/02/2021
 ********************************************************/

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class QuickSort implements InterfaceComparar {

    @Override
    public ArrayList compareTo(ArrayList list) {
        // TODO Auto-generated method stub
        return null;
    }

	/**
     * 
     * @param Comparable[] list
     * @param int inf
     * @param int sup
     * @param String FileSort
     * @return n/a
     * @author Alejandro Gomez y Ana Ramirez
     **/

    public static void QuickSort()
    {
        int j = sup;
        int i = inf -1;
        boolean valorBooleano = true;
        Comparable temp = 0;
	   
         String newLine = "";
         
         try {
             File logFile = new File(FileSort);
             
             if (!logFile.exists()) {
                 
                 for (int k = inf; k < sup + 1; k++) {
                     newLine += " " + list[k];
                 }
                 
                 newLine += "\r\n";
                 
                 FileLogger.CrearArchivo(FileSort);
                 
                 FileLogger.AgregarTextoLineaNueva(FileSort + ".txt", newLine);
             }
             
         } catch (IOException e) {
             System.out.println(e.getMessage());
         }
 
         /*<Log in file />*/
        
        if (inf >= sup) {
            return;
        }
        
        Comparable elem_div = list[sup];
        
        try {
            FileLogger.AgregarTextoLineaNueva(FileSort + ".txt", "inf => " + inf + " sup => " + sup + " elem_div => " + elem_div + " \r\n");   
        } catch (IOException e) {
            System.out.println(e.getMessage());   
        }
        
        
        while (valorBooleano) {
            while(list[++i].compareTo(elem_div) < 0) ; //Move the index i until it finds an element bigger than elem_div
            while((list[--j].compareTo(elem_div) > 0) && (j > inf)); //Move the index j until it finds element smaller than elem_div
            
            if (i < j) {
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            } else {
                valorBooleano = false;
            }
        }
        
        temp = list[i];
        list[i] = list[sup];
        list[sup] = temp;
        QuickSorter(list, inf, i - 1, FileSort);
        QuickSorter(list, i + 1, sup, FileSort);
    }
    
}
    

