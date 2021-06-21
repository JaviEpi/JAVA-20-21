package rectangulo;

public class Cuadrado extends Rectangulo{

  public Cuadrado(int lado) {
    super(lado, lado);
  }

  public void setLado(int lado) {
    this.setBase(lado);
    this.setAltura(lado);
  }

  /**
   * Method to return the square's side
   *
   * @return side of the square
   */
  public double getLado() {
    return this.getBase();
  }

  @Override
  public String toString() {
    return "\nEl cuadrado tiene las siguientes dimensiones:  " + getLado();
  }

}
