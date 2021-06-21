package rectangulo;

public class TestRectangulo {
  public static void main(String[] args) {

    Rectangulo rect1 = new Rectangulo(32.5, 20.3);
    Rectangulo rect2 = new Rectangulo(20.2, 10.3);

    System.out.println("\nEl perimetro del rectangulo 1 es: " + rect1.calcularPerimetro());
    System.out.println("El perimetro del rectangulo 2 es: " + rect2.calcularPerimetro());

    System.out.println();
    for (int i = 0; i <= 60; i++) {
      System.out.print("-");
    }
    System.out.println();

    System.out.println("\nEl área del rectangulo 1 es: " + rect1.calcularArea());
    System.out.println("El área del rectangulo 2 es: " + rect2.calcularArea());

    System.out.println();
    for (int i = 0; i <= 60; i++) {
      System.out.print("-");
    }
    System.out.println();

    rect1.dibujar();

    System.out.println();
    for (int i = 0; i <= 60; i++) {
      System.out.print("-");
    }
    System.out.println();

    System.out.println(rect1.compareTo(rect2));

    System.out.println(rect1.clone());


    System.out.println(rect1.toString());
    System.out.println(rect2.toString());
  }
}
