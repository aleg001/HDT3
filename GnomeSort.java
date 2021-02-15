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
	public int[] compareTo(int[] list){
		int i = 1;
        int n = list.length;
        while (i < n) {
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

    public static String GnomeSorter(Comparable[] lista){
        int i=1; int j=2;Comparable tmp;
        
        while(i<lista.length){
            if(lista[i-1].compareTo(lista[i])<0){
                tmp = lista[i-1];lista[i-1] =lista[i];lista[i--] = tmp;i = (i==0) ? j++:i;}
            else{i = j; j++;}
        }
        return ("Sus datos ordenados son: ");
    }

}
