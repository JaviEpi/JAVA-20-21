package ejerciciosSecuenciales;

import java.util.Scanner;

/**
 * Ejercicio 05: Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
 * 
 * @author JavierEpifanio
 * Fecha: 10/11/2020
 * 
 */
public class Ejercicio05Ecuacion {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Mostramos lo que va a hacer este programa
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    // Pedimos los valores de "a" y "b"
    System.out.print("Por favor, introduzca el valor de a: ");
    Double a = s.nextDouble();
    System.out.print("Ahora introduzca el valor de b: ");
    Double b = s.nextDouble();
   
    // Si a es igual a 0 no tiene solución
    if (a == 0) {
      System.out.println("Esa ecuación no tiene solución real."); 
    } else {
      System.out.println("x = " + (-b/a)); // Calculamos el valor de la "x" = (-b/a) y lo mostramos.
    }
    
    s.close();
  }
}
