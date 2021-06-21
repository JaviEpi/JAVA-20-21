package fraccion;

import java.util.Scanner;

public class TestFraccion {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    /** Create a new object */
    Fraccion fraccion1 = new Fraccion(15, 0);
    Fraccion fraccion2 = new Fraccion(30, 5);

    /** Print the fraction */
    System.out.println(fraccion1.toString());

    /** To organize the code */
    for (int i = 0; i <= 60; i++) {
      System.out.print("-");
    }
    System.out.println();
    /** Obtain and modify the numerator and denominator */
    System.out.println("\nThe numerator is " + fraccion1.getNumerador());
    System.out.println("The denominator is " + fraccion1.getDenominador());

    System.out.print("\nTell me a number for the numerator: ");
    int introducedNum = s.nextInt();

    System.out.print("Tell me a number for the denominator: ");
    int introducedDenom = s.nextInt();

    /** Modify the numerator and denominator */
    fraccion1.setNumerador(introducedNum);
    fraccion1.setDenominator(introducedDenom);

    System.out.println(fraccion1.toString());
    /** To organize the code */
    for (int i = 0; i <= 60; i++) {
      System.out.print("-");
    }
    System.out.println();
    /** Show the result of the fraction */
    System.out.println("\nThe result of the fraction is --> " + fraccion1.calcularFraccion());


    /** To organize the code */
    for (int i = 0; i <= 60; i++) {
      System.out.print("-");
    }
    System.out.println();

    /** Multiply the fraction with another number */
    System.out.println(fraccion1.toString());
    System.out.print("\nTell me the number for multiply: ");
    int numeroMultiplicar = s.nextInt();
    System.out.println();

    System.out.print("--- The Multiplication ---");
    System.out.println(fraccion1.multiplicarNumero(numeroMultiplicar));

    /** Multiply, add and subtract fractions */
    System.out.println(fraccion1.toString());
    System.out.println(fraccion2.toString());

    System.out.println("\nMultiplication" + fraccion1.multiplicarFraccion(fraccion2));

    System.out.println(fraccion1.toString());
    System.out.println(fraccion2.toString());
    System.out.println("\nDivision" + fraccion1.dividirFraccion(fraccion2));

    /** Simplify a fraction */
    s.close();
  }
}
