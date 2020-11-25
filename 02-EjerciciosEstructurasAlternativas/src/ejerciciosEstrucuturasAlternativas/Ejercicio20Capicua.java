package ejerciciosEstrucuturasAlternativas;
import java.util.Scanner;

public class Ejercicio20Capicua {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int numero;
    boolean capicua = false;

    System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
    numero = s.nextInt();


    // número de una cifra
    if (numero < 10) {
      capicua = true;
    }

    // número de dos cifras
    if ((numero >= 10) && (numero < 100)) {
      if ((numero / 10) == (numero % 10)) {
        capicua = true;
      }
    }

    // número de tres cifras
    if ((numero >= 100) && (numero < 1000)) {
      if ((numero / 100) == (numero % 10)) {
        capicua = true;
      }
    }

    // número de cuatro cifras
    if ((numero >= 1000) && (numero < 10000)) {
      if (((numero / 1000) == (numero % 10)) && ((( numero / 100 ) % 10)== (( numero / 10) % 10))) {
        capicua = true;
      }
    }

    // número de cinco cifras
    if (numero >= 10000) {
      if (((numero / 10000) == (numero % 10) ) && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
        capicua = true;
      }
    }

    if (capicua) {
      System.out.println("El número introducido es capicúa.");
    } else {
      System.out.println("El número introducido no es capicúa.");
    }
    
    s.close();
  }
}
