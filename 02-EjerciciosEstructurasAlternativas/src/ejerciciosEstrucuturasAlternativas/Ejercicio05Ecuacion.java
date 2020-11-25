package ejerciciosEstrucuturasAlternativas;
import java.util.Scanner;

/**
 * Ejercicio 05: Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
 * 
 * @author JavierEpifanio
 *
 */
public class Ejercicio05Ecuacion {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Por favor, introduzca el valor de a: ");
    Double a = s.nextDouble();
    System.out.print("Ahora introduzca el valor de b: ");
    Double b = s.nextDouble();

    if (a == 0) {
      System.out.println("Esa ecuación no tiene solución real.");
    } else {
      System.out.println("x = " + (-b/a));
    }
    
    s.close();
  }

}
