package estructurasRepetitivas;
import java.util.Scanner;

/**
 * Ejercicio 10: Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. 
 * A priori, el programa no sabe cuántos números se introducirán. 
 * El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.
 * @author JavierEpifanio
 *
 */
public class Ejercicio10MediaNumeros {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("Este programa calcula la media de los números positivos introducidos.");
    System.out.println("Vaya introduciendo números (puede parar introduciendo un número negativo):");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = s.nextDouble();
      numeros++;
      suma += numeroIntroducido;
    }
    
    System.out.println("La media de los números positivos introducidos es " + (suma - numeroIntroducido)/ (numeros - 1));
    s.close();
  }

}
