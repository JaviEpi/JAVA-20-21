package ejercicio1a6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Ej1NumerosPrimos {
  public static void main(String[] args) throws IOException {

    int num = 1;
    int num2 = 500;

    writePrimeNumberInTheFile(num, num2);
  }

  private static void writePrimeNumberInTheFile(int num, int num2)
      throws IOException {

    String fileName = "primos.dat";

    var file = Files.newBufferedWriter(Paths.get(fileName), StandardOpenOption.CREATE);

    for (int i = num; i <= num2; i++) {
      System.out.println(esPrimo(i));
    }

    file.close();
  }

  /**
   * Method that return true if the @param is Prime
   *
   * @param i the number to know if is prime
   */
  private static boolean esPrimo(int i) {
    if (i % 1 == 0 && i % i > 0) {
      System.out.println(i);
      return false;
    } else {
      return true;
    }
  }
}
