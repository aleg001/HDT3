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
		File LoggingFile = new File(fileName + ".txt");
		LoggingFile.createNewFile();
		return fileName + ".txt";
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
}