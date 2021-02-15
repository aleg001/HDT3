/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Driver.java
* Autores: Alejandro Gomez y Ana Ramirez
* Fecha de creacion: 09/02/2021
* Ultima edicion: 09/02/2021
********************************************************/

import java.util.ArrayList;

import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

import java.util.*;

public class vistaSort{
    
    //Se declara metodo constructor
    public vistaSort(){

    }
    
    /**
     * Metodo bienve
     * @param n/a
     * @author Alejandro Gomez y Ana Ramirez
     * @return n/a
     **/
    public void bienve(){
        System.out.println("\nBienvenido al programa de Sorts");
        System.out.println("1. Gnome Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Radix Sort");
        System.out.println("5. Bubble Sort");
        System.out.println("6. Salir\n");
        System.out.println("Ingrese su opcion:  ");
    }
        

    
    /**
     * Metodo printOrden
     * @param int[] lista
     * @param String TipoDeSort
     * @author Alejandro Gomez y Ana Ramirez
     * @return n/a
     **/
    public void printOrden(int[] lista, String TipoDeSort){
        String paraImp=" ";
        paraImp = Arrays.toString(lista);
        //for(int i=0; i < lista.length; i++){
            //paraImp=String.valueOf(lista[i])+", ";
        //}
        paraImp=paraImp+"]";
        System.out.println("La lista ordenada con "+TipoDeSort+" es : "+paraImp);
    }


    /**
     * Metodo OpSalir
     * @param n/a
     * @author Alejandro Gomez y Ana Ramirez
     * @return n/a
     **/
    public void opSalir(){
        System.out.println("Gracias por utilizar este programa.¡Hasta pronto!");
    }
   
   
    /**
     * Metodo noValid
     * @param n/a
     * @author Alejandro Gomez y Ana Ramirez
     * @return n/a
     **/
    public void noValid(){
        System.out.println("Por favor ingrese un numero valido, si usted ingresa una letra EL PROGRAMA SE CIERRA");
    }

    /**
     * Metodo fileCreated
     * @param n/a
     * @author Alejandro Gomez y Ana Ramirez
     * @return n/a
     **/
    public void fileCreated(){
        System.out.println("Su archivo ha sido creado y leido con exito");
    }

    /**
     * Metodo lordenada
     * @param n/a
     * @author Alejandro Gomez y Ana Ramirez
     * @return n/a
     **/
    public void lordenada(long nano){
        System.out.println("La lista se ha ordenado en "+String.valueOf(nano)+" nanosegundos" );
    }
     /**
     * Metodo lreordenada
     * @param n/a
     * @author Alejandro Gomez y Ana Ramirez
     * @return n/a
     **/
    public void lreordenada(long nano){
        System.out.println("La lista se ha reordenado en "+String.valueOf(nano)+" nanosegundos" );
    }

}