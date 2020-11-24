package ejerciciosSecuenciales;

import java.util.Scanner;

/**
 * Ejercicio 02: Realiza un programa que pida una hora por teclado y que muestre luego buenos 
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 * 
 * @author JavierEpifanio
 * Fecha: 10/11/2020
 *
 */
public class Ejercicio02Horas {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // Pedimos la cantidad de euros que quiere convertir a pesetas
    System.out.print("Por favor, introduce la hora: ");
    int hora = s.nextInt();
    
    // SI hora entre 0 y 23
    if ((hora >= 0) && (hora < 24)) {
      
      // SI hora entre 6 y 12 <-- Buenos días
      if ((hora >= 06) && (hora <= 12)) {
        System.out.println("Buenos días");
      }
      // SI hora entre 13 y 21 <-- Buenos tardes
      if ((hora >= 13) && (hora <= 21)) {
        System.out.println("Buenas tardes");
      }
      // SI hora entre 21 y 5 <-- Buenas noches
      if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
        System.out.println("Buenas noches");
      }
      
      }else {
        System.out.println("La hora introducida no es correcta"); // SI NO la hora no es correcta
    }
    
    s.close();
  }

}
