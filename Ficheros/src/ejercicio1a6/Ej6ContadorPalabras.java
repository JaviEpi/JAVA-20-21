package ejercicio1a6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Ej6ContadorPalabras {
  public static void main(String[] args) {

    finalizarPrograma(args);

    try {

      Scanner fichero = argsPosicion0(args);
      String palabra = argsPosicion1(args);

      int cont = 0;

      cont = leerFichero(fichero, palabra, cont);

      System.out.println("El numero de palabras es: " + cont);

    } catch (FileNotFoundException e) {
      System.err.print("No se ha encontrado el archivo");
    }
  }

  private static void finalizarPrograma(String[] args) {
    if (args.length != 2) {
      System.err.println("Error in the number of arguments");
      System.exit(-1);
    }
  }

  private static String argsPosicion1(String[] args) {
    String palabra = args[1];
    return palabra;
  }

  private static Scanner argsPosicion0(String[] args) throws FileNotFoundException {
    Scanner fichero = new Scanner(new BufferedReader(new FileReader(args[0])));
    return fichero;
  }

  private static int leerFichero(Scanner file, String word, int cont) {
    String palabraFichero;
    while (file.hasNext()) {
      palabraFichero = file.next();
      cont = contarPalabras(word, cont, palabraFichero);
    }
    return cont;
  }

  private static int contarPalabras(String palabra, int cont, String palabraFichero) {
    if (palabraFichero.equals(palabra)) {
      cont++;
    }
    return cont;
  }
}
