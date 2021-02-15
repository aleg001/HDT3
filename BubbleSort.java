/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Driver.java
* Autores: Alejandro Gomez y Ana Ramirez
* Fecha de creacion: 09/02/2021
* Ultima edicion: 09/02/2021
********************************************************/

public class BubbleSort {
	
    //Metodo constructor
    public BubbleSort() {
		
	}
	
    
    /**
     * Metodo compareTo
     * @param int[] lista
     * @author Alejandro Gomez y Ana Ramirez
     * @return lista
     **/
    /* Metodo para comparar, realiza proceso para BubbleSort */
	public int[] compareTo(int[] lista)
    { 
      //Se declaran las variables a utilizar
      int n = lista.length; int temp=0;
      //Ciclo for para i
      for (int i = 0; i < n; i++)
            //Ciclo for para j
          for (int j = 1; j < (n-i); j++) 
            //Se crea if para comparar lista
              if (lista[j-1] >lista[j] )  
              { 
                  // cambia arr[j+1] con arr[j] 
                  temp = lista[j-1]; 
                  lista[j-1] = lista[j]; 
                  lista[j] = temp; 
              }
        return lista;
  }
}
