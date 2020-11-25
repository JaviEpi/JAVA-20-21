package ejerciciosEstrucuturasAlternativas;
import java.util.Scanner;

/**
 * Ejercicio 02: Realiza un programa que pida una hora por teclado y que muestre luego buenos días, 
 * buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5.
 * respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
 *
 * @author JavierEpifanio
 *
 */
public class Ejercicio02Horario {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca una hora del día (0 - 23): ");
    int hora = s.nextInt();

    // Si la hora no esta entre las 00 y las 23 
    if ((hora >= 0) && (hora < 24)) {
      
      if ((hora >= 6) && (hora <= 12)) {
        System.out.println("Buenos días");
      }
          
      if ((hora >= 13) && (hora <= 20)) {
        System.out.println("Buenas tardes");
      }
        
      if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
        System.out.println("Buenas noches");
      }
    }else {
      System.out.println("La hora introducida no es correcta"); // SI NO la hora no es correcta
    }
    
    
    s.close();

  }

}
