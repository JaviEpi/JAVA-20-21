package estructurasRepetitivas;
import java.util.Scanner;

/**
 * Ejercicio 08: Muestra la tabla de multiplicar de un número introducido por teclado.
 * @author JavierEpifanio
 *
 */

public class Ejercicio08TablaMultiplicar {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero y le mostraré la tabla de multiplicar: ");
    int numeroIntroducido = s.nextInt();
        
    for (int i = 0; i <= 10; i++) {
      System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
    }
    
    s.close();
  }

}
