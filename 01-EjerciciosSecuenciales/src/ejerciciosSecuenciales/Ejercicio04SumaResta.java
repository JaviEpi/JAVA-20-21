package ejerciciosSecuenciales;

import java.util.Scanner;

/**
 * Ejercicio 04: Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado.
 * 
 * @author JavierEpifanio
 * 
 */
public class Ejercicio04SumaResta {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int x;
    int y;
    String linea;

    System.out.print("Por favor, introduzca el primer número: ");
    linea = s.nextLine();
    x = Integer.parseInt( linea );
    System.out.print("Introduzca el segundo número: ");
    linea = s.nextLine();
    y = Integer.parseInt( linea );

    System.out.println("Suma: "+ (x + y));
    System.out.println("Resta: "+ (x - y));
    System.out.println("División: "+ (x / y));
    System.out.println("Multiplicación: " + (x * y));

    s.close();
  }

}
