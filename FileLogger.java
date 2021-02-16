
/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* BubbleSort.java
* Autores: Alejandro Gomez y Ana Ramirez
* ** Con referencia a los ejemplos brindados por el catedratico Moises en GitHub **
* Link: https://github.com/malonso-gt/SortingExamples/blob/main/src/common/Logging.java
* Fecha de creacion: 09/02/2021
* Ultima edicion: 09/02/2021
********************************************************/

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class FileLogger {
	
	/***
	 * Metodo para crear los logs utilizados
	 * @return el nombre del archivo a utilizar
	 * @throws IOException en caso el archivo ya exista.
	 */
	public static String CrearArchivo() throws IOException{
		String fileName = "Datos.txt";
		File LoggingFile = new File(fileName);
		LoggingFile.createNewFile();
		return fileName;
	}

	/***
     * Crea nuevo archivo para guardar logs
	 * @param filename el nombre del archivo
	 * @return nombre del archivo y su extension .txt
	 * @throws IOException
	 */
	public static String CrearArchivo(String fileName) throws IOException{
		File LoggingFile = new File("datos.txt");
		LoggingFile.createNewFile();
		return fileName + ".txt";
	}

	public static void CreateArchivoTexto(){ 
		try {
			File data = new File("Datos.txt");
			if (data.createNewFile()) {
				System.out.println("Se creo archivo: " + data.getName());
			} else {
				System.out.println("Su archivo ya existe...");
			}
			} catch (IOException e) {
			System.out.println("Cuidado! Ocurrio un error.");}
		}
	
	public static void EscribirLinea(String newline){ 
		try {
			FileWriter escribirFile = new FileWriter("datos.txt");
			escribirFile.write(newline);
			escribirFile.close();
		} catch (IOException e) {
			System.out.println("Ocurrio un error...");
		}
		}
			
	/***
	 * Agrega lineas nuevas de texto al archivo
	 * @param fileName Donde ingresara
	 * @param newLine La linea a agregar
	 * @throws IOException En caso ocurran problemas
	 */
	public static void AgregarTextoLineaNueva(String fileName, String newLine) throws IOException{
		Files.write(Paths.get(fileName), newLine.getBytes(), StandardOpenOption.APPEND);
	}

	public String LeerArchivo(String a) {

        //Referencias: https://stackoverflow.com/questions/13185727/reading-a-txt-file-using-scanner-class-in-java
        //Referencias: https://stackoverflow.com/questions/326390/how-do-i-create-a-java-string-from-the-contents-of-a-file

        //----------------------INSTANCIAS---------------------------

        /* Se crean todas las instancias
            a utilizar en este metodo*/
        Scanner archivoLectura = new Scanner(System.in);
       	String LineasTexto = "";

        //-------------------------PROGRA DEFENSIVA----------------------

        /* Se usa un trycatch para asegurarse
            que exista un archivo, y asi 
            accesarlo de forma correcta     */

        try{archivoLectura = new Scanner(new File(a)); } 
        catch(FileNotFoundException e){
            return("No se ha encontrado un archivo"+ "\n Ingresa un archivo correcto");
        } 
        archivoLectura.useDelimiter("\n");
		return LineasTexto;

	}


	/***
	 * Agrega lineas nuevas de texto al archivo

	 * @param String NombreARchivo
	 * @throws IOException En caso ocurran problemas
	 */

	/*	Se define el metodo para leer los archivos
		ingresados al sistema
	*/
	String Leer(String NombreArchivo) throws IOException {
		//Se crea un buffer para leer
		BufferedReader LectorPro = new BufferedReader(new FileReader(NombreArchivo));
		//Se crea un trycatch para la creacion de Strings
		try {
			StringBuilder CreadorDeStrings = new StringBuilder();
			String line = LectorPro.readLine();
			//Ciclo while para agregar las lineas al String
			while (line != null) {
				CreadorDeStrings.append(line);
				CreadorDeStrings.append("\n");
				line = LectorPro.readLine();
			}
			//Devuelve el string con el texto del archio
			return CreadorDeStrings.toString();
		}catch(FileNotFoundException e){
			return "Archivo no encontrado!";
		}
	}


	
	/***
	 * CreadorDeNumerosEscritura

	 * @param n/a
	 * @return int[]
	 */

	/*	Se crean numeros y genera numeros
		
	*/

    public int[] CreadorDeNumerosEscritura(){
        try{
			//Se declaran instancias
            Random rand = new Random();
			
			BufferedWriter obtenido = null;
			File file = new File("datos.txt");
			obtenido = new BufferedWriter(new FileWriter(file));

			//String Ubicacion = "datos.txt";
			//String lines = "";
			//StringBuilder CreadorDeStrings = new StringBuilder();
			
			int x = rand.nextInt(2990)+10;
			int[] numerosAcumulados = new int[x];
            String acumulador="";
            for(int i=0; i<x;i++){
                int nuevo=rand.nextInt(100)+1;
                acumulador=acumulador+ String.valueOf(nuevo)+",";
				numerosAcumulados[i] = nuevo;
				obtenido.write(acumulador);
            }
			

            //Se almacena lo del archivo creado
            
			//File ArchivoCreado = new File(Ubicacion);
            //if(!ArchivoCreado.exists()){ArchivoCreado.createNewFile();}

            //En el archivo se crea lo indicado
            //FileWriter EscrituraArchivo = new FileWriter(ArchivoCreado); BufferedWriter BufferEscritor = new BufferedWriter(EscrituraArchivo);

            //Los archivos de texto se escriben y cierran
            //BufferEscritor.write(acumulador);BufferEscritor.close();

			//En caso de un error
			return numerosAcumulados;
        }catch(Exception e){
            e.printStackTrace();
			System.out.println("Algo salio mal...");
			return null;
			
        }

		
    }

		
}