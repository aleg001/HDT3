
/*******************************************************
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructuras de Datos
 * Profesor: Moises Gonzales 
 * InterfaceComparar.java 
 * Autores: Alejandro Gomez y Ana Ramirez 
 * Fecha de creacion: 09/02/2021 
 * Ultima edicion: 14/02/2021
 ********************************************************/


import java.util.ArrayList;

public class InterfaceComparar implements Comparable<InterfaceComparar>{
    
    /*---------Instancias------------------ */
    private Integer UltimoDato;

    /* Se define metodo que recibe
        valor y lo vuelve el   
        ultimo valor, constructor  */    
    
    /** InterfaceComparar
     * 
     * @param Integer valor
     * @return UltimoDato
     * @author Alejandro Gomez y Ana Ramirez
     **/

    public InterfaceComparar(Integer valor){
        
        UltimoDato = valor;
    }

    /* Metodo para comparar */
    /** compareTo
     * 
     * @param InterfaceComparar dato
     * @return datoResultante
     * @author Alejandro Gomez y Ana Ramirez
     **/
    public int compareTo(InterfaceComparar dato){
        Integer datoResultante;
        Integer datoDos = dato.getUltimoDato();
        datoResultante=datoDos.compareTo(UltimoDato);
        //Devuelve el dato resultante
        return datoResultante;
    }

    /* Metodo para obtener el ultimo
    dato a utilizar*/
    
    /** getUltimoDato
     * 
     * @param n/a
     * @return UltimoDato
     * @author Alejandro Gomez y Ana Ramirez
     **/

    public Integer getUltimoDato(){
        //Devuelve el ultimo dato
        return UltimoDato;
    }
    /* Metodo toString con el ultimo dato   */
    public String toString(){
        //Devuelve en forma de string el ultimo dato
        return String.valueOf(UltimoDato);
    }
}



