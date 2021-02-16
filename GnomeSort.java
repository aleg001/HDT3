/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Driver.java
* Autores: Alejandro Gomez y Ana Ramirez
* Fecha de creacion: 09/02/2021
* Ultima edicion: 09/02/2021
********************************************************/

public class GnomeSort {
	public GnomeSort() {
		
	}

    /**
    * Método para proceso de comparar
    * 
    * @param int[] lista
    * @return int[] lista
    * @author Alejandro Gomez y Ana Ramirez
    **/

	public int[] compareTo(int[] list){
		//Se definen variables
        int i = 1; int n = list.length;
        //Se realiza un ciclo while para verificar tamano de n
        while (i < n) {
            //En caso cumpla con las condiciones, se le suma a i
            if (i == 0 || list[i - 1] <= list[i]) {
                i++;
            } else {
                int t = list[i];
                list[i] = list[i - 1];
                list[--i] = t;
            }
        }
        return list;
    }

    
    /**
    * Método para sorter de GnomeSorter
    * 
    * @param Comparable[] lista
    * @return String lista
    * @author Alejandro Gomez y Ana Ramirez
    **/

    public static String GnomeSorter(Comparable[] lista){
        //Se definen variables
        int i=1; int j=2;Comparable tmp;
        //Mientras i sea menor a longitud de la lista, se ejecuta lo siguiente:
        while(i<lista.length){
            if(lista[i-1].compareTo(lista[i])<0){
                tmp = lista[i-1];lista[i-1] =lista[i];lista[i--] = tmp;i = (i==0) ? j++:i;}
            else{i = j; j++;}
        }
        return ("Sus datos ordenados son: ");
    }

}
