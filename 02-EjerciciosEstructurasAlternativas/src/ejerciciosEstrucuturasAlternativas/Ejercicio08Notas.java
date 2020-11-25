package ejerciciosEstrucuturasAlternativas;

import java.util.Scanner;

/**
 * Ejercicio 08: Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 * 
 * @author JavierEpifanio
 *
 */
public class Ejercicio08Notas {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa calcula la media de tres notas.");
    
    System.out.print("Por favor, introduzca la primera nota: ");
    Double nota1 = s.nextDouble();
    
    System.out.print("Ahora introduzca la segunda nota: ");
    Double nota2 = s.nextDouble();
    
    System.out.print("Por último introduzca la tercera nota: ");
    Double nota3 = s.nextDouble();

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("La media es %.2f\n", media);
    
    if (media < 5) {
      System.out.print("Insuficiente");
    }
    
    if ((media >= 5) && (media < 6)) {
      System.out.print("Suficiente");
    }
    
    if ((media >= 6) && (media < 7)) {
      System.out.print("Bien");
    }
    
    if ((media >= 7) && (media < 9)) {
      System.out.print("Notable");
    }
    
    if (media >= 9) {
      System.out.print("Sobresaliente");
    }
    
    s.close();
  }

}
