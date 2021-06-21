package rectangulo;

public class Rectangulo implements Comparable<Rectangulo>, Cloneable {
  
  private double base;
  private double altura;

  public Rectangulo(double base, double altura) {
    this.setBase(base);
    this.setAltura(altura);
  }

  public double calcularPerimetro() {
    return (this.base + this.altura) * 2;
  }

  public double calcularArea() {
    return this.base * this.altura;
  }

  public double calcularArea(double base, double altura) {
    return base * altura;
  }
  
  public void dibujar() {
    System.out.println("*".repeat((int) this.base));

    for (int i = 1; i <= altura; i++) {
      System.out.println("*" + " ".repeat(((int) this.base) - 2) + "*");
    }

    System.out.println("*".repeat((int) this.base));
  }

  public double getAltura() {
    return altura;
  }
  
  public void setAltura(double altura) {
    if (altura < 0) {
      System.err.println("\nNo se puede introducir un número negativo.");
    }
    this.altura = altura;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    if (base < 0) {
      System.err.println("\nNo se puede introducir un número negativo.");
    }
    this.base = base;
  }

  
  @Override
  public String toString() {
    return "\nThe Base del rectangulo " + base + " y altura " + altura;
  }

  @Override
  public int compareTo(Rectangulo r) {
    return (int) (this.calcularArea() - this.calcularArea(r.base, r.altura));
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = Double.doubleToLongBits(base);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(altura);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Rectangulo other = (Rectangulo) obj;
    if (Double.doubleToLongBits(base) != Double.doubleToLongBits(other.base)) return false;
    if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura)) return false;
    return true;
  }

  public Rectangulo clone() {
    return new Rectangulo(this.base, this.altura);
  }
}
