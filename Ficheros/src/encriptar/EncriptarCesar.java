package encriptar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class EncriptarCesar {
  private static final String PATH =
      "C:\\Users\\Javier Epifanio\\Programacion\\Ficheros\\src\\encriptar";

  public static void main(String[] args) {
    finalizarPrograma(args);

    try {
      String ficheroEncriptar = PATH + "text.txt";
      String ficheroEncriptado = PATH + "ficheroEncriptado.txt";

      encriptarFichero(ficheroEncriptar, ficheroEncriptado);

    } catch (IOException e) {
      System.out.println("\nNo se puede leer el fichero: " + e.getMessage());
    }
  }

  private static void finalizarPrograma(String[] args) {
    if (args.length < 1 || args.length > 2) {
      System.err.println("Número de argumento incorrecto.");
      System.exit(1);
    }
  }

  //  Method that encrypt the data of a file
  private static void encriptarFichero(String ficheroEncriptar, String ficheroEncriptado) throws IOException {
    var file = leerFichero(ficheroEncriptar);

    var encriptandoFichero = creaNuevoFichero(ficheroEncriptado);

    escribirFicheroNuevo(file, encriptandoFichero);

    encriptandoFichero.close();
    System.out.println("File writed");
  }

  private static void escribirFicheroNuevo(BufferedReader file, BufferedWriter encryptingFile)
      throws IOException {
    String line;
    while ((line = file.readLine()) != null) {
      encryptingFile.write(line);
      encryptingFile.newLine();
      encryptingFile.write("Estoy cifrando el archivo");
    }
  }

  private static BufferedWriter creaNuevoFichero(String encryptedFile) throws IOException {
    String encryptedFilePath = encryptedFile;
    var encryptingFile =
        Files.newBufferedWriter(
            Paths.get(encryptedFilePath),
            StandardOpenOption.CREATE,
            StandardOpenOption.APPEND); // Create a new file for write in it
    return encryptingFile;
  }

  private static BufferedReader leerFichero(String fileToEncrypt) throws IOException {
    String filePath = fileToEncrypt;
    var file = Files.newBufferedReader(Paths.get(filePath));
    return file;
  }
}
