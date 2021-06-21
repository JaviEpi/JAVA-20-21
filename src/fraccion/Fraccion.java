package fraccion;
/**
 * Crea una clase Fraccion de forma que podamos hacer las siguientes operaciones:
 *      Contruir un objeto Fraccion pasándole el numerador y el denominador.
 *      Obtener la fracción como cadena de caracteres.
 *      Obtener y modificar numerador y denominador. No se puede dividir por cero.
 *      Obtener resultado de la fracción (número real).
 *      Multiplicar la fracción por un número entero (el resultado es otro objeto fracción).
 *      Multiplicar, sumar y restar fracciones (el resultado es otro objeto fracción).
 *      Simplificar la fracción (cambia el objeto actual).
 * 
 * @author JavierEpifanio
 *
 */
public class Fraccion implements Cloneable, Comparable<Fraccion> {

  private int numerador;
  private int denominador;

  public double calcularFraccion() {
    return (double) this.numerador / this.denominador;
  }

  public Fraccion multiplicarNumero(int number) {
    return new Fraccion(this.numerador * number, this.denominador);
  }

  public Fraccion multiplicarFraccion(Fraccion f) {
    return new Fraccion(this.numerador * f.numerador, this.denominador * f.denominador);
  }

  public Fraccion dividirFraccion(Fraccion f) {
    return new Fraccion(this.numerador * f.denominador, this.denominador * f.numerador);
  }


  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.setDenominator(denominador);
  }

  @Override
  public String toString() {
    return "\nThe fraction is: " + this.numerador + "/" + this.denominador;
  }

  public int getNumerador() {
    return numerador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public int getDenominador() {
    return denominador;
  }

  public void setDenominator(int denominador) throws ArithmeticException {
    try {
      this.denominador = denominador;

    } catch (ArithmeticException ae) {
      throw ae;
    }
  }

  @Override
  public int compareTo(Fraccion f) {
    return 0;
  }

}
