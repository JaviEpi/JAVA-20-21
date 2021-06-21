package ejercicio1a6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;

public class Ej4OrdenarPalabras {
  public static void main(String[] args) {

    numeroArgsValido(args);

    List<String> arrayPalabras;

    try {
      arrayPalabras = Files.readAllLines(Paths.get(args[0]));

      ordernarArray(arrayPalabras);

      escribirFichero(args, arrayPalabras);

    } catch (IOException e) {
      System.err.println("No se ha podido realizar la operación.");
      System.exit(-2);
    }
  }

  private static void numeroArgsValido(String[] args) {
    if (args.length != 1) {
      System.err.println("Error en el número de argumentos.");
      System.exit(-1);
    }
  }

  private static void ordernarArray(List<String> arrayPalabras) {
    Collections.sort(arrayPalabras);
  }

  private static void escribirFichero(String[] args, List<String> arrayPalabras) throws IOException {
    var fileWr =
        Files.newBufferedWriter(Paths.get(escribirFichero(args[0])), StandardOpenOption.CREATE);

    for (String r : arrayPalabras) {
      fileWr.write(r);
      fileWr.newLine();
    }
    fileWr.close();
  }

  private static String escribirFichero(String nombre) {
    int puntoPos = nombre.lastIndexOf(".");
    String nombreFichero = nombre.substring(0, puntoPos);
    String extension = nombre.substring(puntoPos);
    return nombreFichero + "_sort" + extension;
  }
}
