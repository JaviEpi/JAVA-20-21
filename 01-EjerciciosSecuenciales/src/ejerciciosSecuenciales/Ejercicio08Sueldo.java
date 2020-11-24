package ejerciciosSecuenciales;

import java.util.Scanner;

/**
 * Ejercicio 08: Escribe un programa que calcule el salario semanal de un empleado en base a 
 * las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author JavierEpifanio
 * Fecha: 10/11/2020
 *
 */
public class Ejercicio08Sueldo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Preguntamos las horas trabajadas
    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    int horasTrabajadas = s.nextInt();
    
    // Mostramos el salario semanal
    System.out.println("Su salario semanal es de " + (horasTrabajadas * 12) + " euros.");
    
    s.close();

  }

}
