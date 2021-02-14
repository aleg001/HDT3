/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Driver.java
* Autores: Alejandro Gomez y Ana Ramirez
* Fecha de creacion: 09/02/2021
* Ultima edicion: 09/02/2021
********************************************************/
import java.util.Scanner;
import java.lang.Math;

public class Driver {
    public static void main(String[] args){
        System.out.println("\n\nBienvenido al programa de Sorts");
        System.out.println("1. Gnome Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Radix Sort");
        System.out.println("5. Bubble Sort");
        System.out.println("6. Salir\n\n");
        try{
            opcion = scan.nextInt(); //se copia la respuesta del ususario en una variable

        }catch(Exception e){
            //System.out.println("Por favor ingrese un numero validop");
            bandc=false;
        }
        //crear random


        if (opcion == 1 ){//se llama a gnome sort

        } else if (opcion == 2){//se llama a merge sort

        } else if (opcion == 3){//se llama a quick sort

        }else if (opcion == 4){//se llama a radix sort

        }else if (opcion == 5){//se llama a bubble sort

        } else if (opcion == 6){
            System.out.println("Gracias por utilizar este programa.¡Hasta pronto!");//se cierra el programa
        }
        else{
            System.out.println("Por favor ingrese un numero valido, si usted ingresa una letra EL PROGRAMA SE CIERRA");//el programa se cierra si se ingresó una letra
        }
    }
}