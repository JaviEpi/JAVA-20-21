package ejerciciosSecuenciales;
import java.util.Scanner;
/**
 * Ejercicio 02: Realiza un conversor de euros a pesetas. La cantidad de pesetas que se quiere convertir debe ser introducida
 * teclado.
 * 
 * Fecha: 8/11/2020
 * @author JavierEpifanio
 *
 */
public class Ejercicio02EurosPesetas {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
	// Pedimos la cantidad de euros que quiere convertir a pesetas
    System.out.print("Por favor, introduce la cantidad de euros que quieres convertir: ");
    double euros = s.nextDouble();
    
    // Convertimos de euros a pesetas
    int pesetas = (int) (euros * 166.386);
    
    // Mostramos por pantalla las pesetas
    System.out.print(euros + " euros son " + pesetas + " pesetas.");
    
    s.close();
  }

}
