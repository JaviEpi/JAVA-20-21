package ejerciciosArraysUnidimensionales;

/**
 * Ejercicio 02: Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 
 * y que no termine de generar números hasta que no saque el 24. El  programa deberá decir al final cuántos números se han generado.
 * 
 * @author JavierEpifanio
 * 
 * Algoritmo:
 * Genero un numero aleatorio
 * i = 1
 * Mientras el número aleatorio sea distinto a 24:
 *  Genero un numero aleatorio
 *  i++
 * Muestro cuántos numeros he generado mostrando i
 */
public class Ejercicio02NumerosAleatorios {
  public static void main(String[] args) {
    int numeroRandom;
    int i = 1;
   
    System.out.println("Programa que genera un número aleatorio entre 0 y 100, y finaliza cuando salga el 24");
    System.out.println("------------------------------------------------------------------------------------");
    
    numeroRandom = (int) (Math.random()*101);
    
    if (numeroRandom % 2 != 0) {
      numeroRandom--;
    }
    
    while (numeroRandom != 24) {
      numeroRandom = (int) (Math.random()*101);
      if (numeroRandom % 2 != 0) {
        numeroRandom--;
      }
      i++;
    }
    System.out.println("¡Ya está! Se han generado "+i+" números hasta alcanzar el 24.");
    
  }
}
