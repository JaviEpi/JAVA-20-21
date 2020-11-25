package estructurasRepetitivas;
import java.util.Scanner;

/**
 * Ejercicio 09: Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * @author JavierEpifanio
 *
 */

public class Ejercicio09DigitosNumero {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numeroDeDigitos = 1, n, numeroIntroducido;

    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    numeroIntroducido = s.nextInt();
    
    n = numeroIntroducido;
    
    while (n > 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
    s.close();
  }

}
