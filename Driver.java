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
import java.io.File;

public class Driver {
    public static void main(String[] args){
        
        //Se declaran instancias y declaran variables
        FileLogger f=new FileLogger();
        vistaSort v=new vistaSort();
        
        Scanner scan = new Scanner(System.in);
        boolean bandc=true;
        int opcion=0;int counter = 0;
        int[] lista = f.CreadorDeNumerosEscritura();
        v.ElementosLista(lista.length);
        while (opcion != 6 && bandc==true) {//loop que genera el menú para el usuario
            try{
                v.bienve();
                opcion = scan.nextInt(); //se copia la respuesta del ususario en una variable

            }catch(Exception e){
                //System.out.println("Por favor ingrese un numero validop");
                bandc=false;
            }
            //crear random
            //Random rand= new Random();
            //int x = rand.nextInt(2990)+10;
            //String acumulador="";
            //for(int i=0; i<x;i++){
              //  int nuevo=rand.nextInt(100)+1;
                //acumulador=acumulador+ String.valueOf(nuevo)+",";
            //}
            //creación de archivo
            //f.CreateArchivoTexto();
            /* f.CrearArchivo(); */
            //f.AgregarTextoLineaNueva("Datos.txt",acumulador);
            //f.EscribirLinea(acumulador);
            //lectura de archivo
            //String leido= f.LeerArchivo("Datos.txt");
            //String leido= f.Leer("Datos.txt");
            //creación de Array para ordenar

           
            //InterfaceComparar[] info = new InterfaceComparar[3000];
            //for(int i=0;i<3000;i++){info[i] = new InterfaceComparar (numeros.get(i));}

            
      
     
            
            
           
            /*
            acu=0;
            for(String a: arrOfStr){
                int valor=Integer.valueOf(a);
                lista[acu]=valor;
                acu++;
            } */

            v.fileCreated(); 
            
            if (opcion == 1 ){//se llama a gnome sort
                
                //String stringGnome = GnomeSort.GnomeSorter(info);
                //System.out.println(stringGnome);
               // for(InterfaceComparar ordenado: info)
               // {System.out.println(info); counter++;}
              //  System.out.println("El numero de datos es: "+counter);
              //  counter = 0;
                
                
                GnomeSort g = new GnomeSort();
                int[] ordenada = new int[lista.length];
                long start = System.nanoTime();
                ordenada=g.compareTo(lista);
                v.printOrden(ordenada,"Gnome Sort");
                
                
                long elapsedTime = System.nanoTime() - start;
                v.lordenada(elapsedTime);
                start = System.nanoTime();
                String reordenada=String.valueOf(g.compareTo(ordenada));
                elapsedTime = System.nanoTime() - start;
                v.lreordenada(elapsedTime);

            } else if (opcion == 2){//se llama a merge sort
                MergeSort g=new MergeSort();
                int[] ordenada=new int[lista.length];
                long start = System.nanoTime();
                ordenada=g.compareTo(lista);
                long elapsedTime = System.nanoTime() - start;
                start = System.nanoTime();
                v.printOrden(ordenada,"Merge Sort");
                v.lordenada(elapsedTime);
                String reordenada=String.valueOf(g.compareTo(ordenada));
                elapsedTime = System.nanoTime() - start;
                v.lreordenada(elapsedTime);

            } else if (opcion == 3){//se llama a quick sort
                QuickSort g=new QuickSort();
                int[] ordenada=new int[lista.length];
                long start = System.nanoTime();
                ordenada=g.compareTo(lista);
                long elapsedTime = System.nanoTime() - start;
                start = System.nanoTime();
                v.printOrden(ordenada,"Quick Sort");
                v.lordenada(elapsedTime);
                String reordenada=String.valueOf(g.compareTo(ordenada));
                elapsedTime = System.nanoTime() - start;
                v.lreordenada(elapsedTime);

            }else if (opcion == 4){//se llama a radix sort
                RadixSort g=new RadixSort();
                int[] ordenada=new int[lista.length];
                long start = System.nanoTime();
                ordenada=g.compareTo(lista);
                long elapsedTime = System.nanoTime() - start;
                
                start = System.nanoTime();
                v.printOrden(ordenada,"Radix Sort");
                v.lordenada(elapsedTime);
                String reordenada=String.valueOf(g.compareTo(ordenada));
                elapsedTime = System.nanoTime() - start;
                v.lreordenada(elapsedTime);


            }else if (opcion == 5){//se llama a bubble sort
                BubbleSort g=new BubbleSort();
                int[] ordenada=new int[lista.length];
                long start = System.nanoTime();
                ordenada=g.compareTo(lista);
                long elapsedTime = System.nanoTime() - start;
                start = System.nanoTime();
                v.printOrden(ordenada,"Bubble Sort");
                v.lordenada(elapsedTime);
                String reordenada=String.valueOf(g.compareTo(ordenada));
                elapsedTime = System.nanoTime() - start;
                v.lreordenada(elapsedTime);


            } else if (opcion == 6){
                v.opSalir();//se cierra el programa
            }
            else{
                v.noValid();//el programa se cierra si se ingresó una letra
            }
        }

    }
}