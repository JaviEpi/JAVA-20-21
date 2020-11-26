package estructurasRepetitivas;

import java.util.Scanner;

/**
 * Ejercicio 48: Realiza un programa que diga los dígitos que aparecen y los que no aparecen 
 * en un número entero introducido por teclado. El orden es el que se muestra en
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números largos.
 * 
 * @author JavierEpifanio
 *
 */
public class Ejercicio48Digitos {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número entero: ");
    long numero = Long.parseLong(s.nextLine());

    long aux;
    boolean encontrado;

    System.out.print("Dígitos que aparecen en el número: ");
    
    for (int i = 0; i < 10; i++) {
      // Comprueba si i está en el número
      encontrado = false;
      aux = numero;
      while (aux > 0) {
        if (aux % 10 == i) {
          encontrado = true;
        }
        aux /= 10;
      }
      if (encontrado) {
        System.out.print(i + ", ");
      }
    }
      
    System.out.print("\nDígitos que no aparecen: ");
    
    for (int i = 0; i < 10; i++) {
      // Comprueba si i está en el número
      encontrado = false;
      aux = numero;
      while (aux > 0) {
        if (aux % 10 == i) {
          encontrado = true;
        }
        aux /= 10;
      }
      if (!encontrado) {
        System.out.print(i + ", ");
      }
    }
    
    s.close();
  }

}
