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
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Driver {
    public static void main(String[] args){
        FileLogger f=new FileLogger();
        vistaSort v=new vistaSort();
        v.bienve();
        Scanner scan = new Scanner(System.in);
        boolean bandc=false;
        int opcion=0;
        while (opcion != 6 && bandc==true) {//loop que genera el menú para el usuario
            try{
                opcion = scan.nextInt(); //se copia la respuesta del ususario en una variable

            }catch(Exception e){
                //System.out.println("Por favor ingrese un numero validop");
                bandc=false;
            }
            //crear random
            Random rand= new Random();
            int x = rand.nextInt(2990)+10;
            String acumulador="";
            for(int i=0; i<x;i++){
                int nuevo=rand.nextInt(100)+1;
                acumulador=acumulador+ String.valueOf(nuevo)+",";
            }
            //creación de archivo
            f.CrearArchivo();
            f.AgregarTextoLineaNueva("Datos.txt",acumulador);
            //lectura de archivo
            String leido= f.Leer("Datos.txt");
            //creación de Array para ordenar
            ArrayList<Integer> lista=new ArrayList<Integer>();
            String[] arrOfStr = leido.split(",");
            for(String a: arrOfStr){
                lista.add(Integer.valueOf(a));
            }

            v.fileCreated();

            if (opcion == 1 ){//se llama a gnome sort
                GnomeSort g=new GnomeSort();
                ArrayList<Integer> ordenada=new ArrayList<Integer>();
                ordenada=g.compareTo(lista);
                v.printOrden(ordenada,"Gnome Sort");
                String reordenada=String.valueOf(g.compareTo(ordenada));

            } else if (opcion == 2){//se llama a merge sort
                MergeSort g=new MergeSort();
                ArrayList<Integer> ordenada=new ArrayList<Integer>();
                ordenada=g.compareTo(lista);
                v.printOrden(ordenada,"Merge Sort");
                String reordenada=String.valueOf(g.compareTo(ordenada));


            } else if (opcion == 3){//se llama a quick sort
                QuickSort g=new QuickSort();
                ArrayList<Integer> ordenada=new ArrayList<Integer>();
                ordenada=g.compareTo(lista);
                v.printOrden(ordenada,"Quick Sort");
                String reordenada=String.valueOf(g.compareTo(ordenada));

            }else if (opcion == 4){//se llama a radix sort
                RadixSort g=new RadixSort();
                ArrayList<Integer> ordenada=new ArrayList<Integer>();
                ordenada=g.compareTo(lista);
                v.printOrden(ordenada,"Radix Sort");
                String reordenada=String.valueOf(g.compareTo(ordenada));

            }else if (opcion == 5){//se llama a bubble sort
                BubbleSort g=new BubbleSort();
                ArrayList<Integer> ordenada=new ArrayList<Integer>();
                ordenada=g.compareTo(lista);
                v.printOrden(ordenada,"Bubble Sort");
                String reordenada=String.valueOf(g.compareTo(ordenada));


            } else if (opcion == 6){
                v.opSalir();//se cierra el programa
            }
            else{
                v.noValid();//el programa se cierra si se ingresó una letra
            }
        }

    }
}