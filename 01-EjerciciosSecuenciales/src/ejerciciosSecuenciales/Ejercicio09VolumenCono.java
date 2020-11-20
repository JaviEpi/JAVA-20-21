package ejerciciosSecuenciales;

import java.util.Scanner;

/**
 * Ejercicio 09: Escribe un programa que calcule el volumen de un cono según la fórmula V = (1/3 * pi * (r ** 2) * h)
 * 
 * @author JavierEpifanio
 *
 */
public class Ejercicio09VolumenCono {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    final double PI = 3.141592654;

    // Pedimos los datos altura y radio
    System.out.println("Volumen de un cono");
    System.out.print("Por favor, introduzca la altura (cm): ");
    double altura = s.nextDouble();
    System.out.print("Introduzca el radio (cm): ");
    double radio = s.nextDouble();
    
    // Calculamos el volumen
    double volumen = (1.0/3.0) * PI * radio * radio * altura;
    System.out.println("El volumen del cono es de " +  volumen + " cm³");

    s.close();
  }

}
