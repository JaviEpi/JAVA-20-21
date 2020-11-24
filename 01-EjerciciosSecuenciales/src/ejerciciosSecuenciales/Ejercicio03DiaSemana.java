package ejerciciosSecuenciales;

import java.util.Scanner;

/**
 * Ejercicio 03: Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
 * nombre del día de la semana.
 * 
 * @author JavierEpifanio
 * Fecha: 10/11/2020
 *
 */

public class Ejercicio03DiaSemana {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    String dia = null;
    
    // Pedimos el día de la semana
    System.out.print("Introduce el día de la semana: ");
    int diaSemana = s.nextInt();

    switch(diaSemana) {
      case 1:
        dia = "Lunes"; // Caso 1 <-- Lunes
        break;
      case 2:
        dia = "Martes"; // Caso 2 <-- Martes
        break;
      case 3:
        dia = "Miércoles"; // Caso 3 <-- Miércoles
        break;
      case 4:
        dia = "Jueves"; // Caso 4 <-- Jueves
        break;
      case 5:
        dia = "Viernes"; // Caso 5 <-- Viernes
        break;
      case 6:
        dia = "Sábado"; // Caso 6 <-- Sábado
        break;
      case 7:
        dia = "Domingo"; // Caso 7 <-- Domingo
        break;
    }
    
    // Mostramos el dia
    System.out.println(dia);
    
    s.close();
  }

}
