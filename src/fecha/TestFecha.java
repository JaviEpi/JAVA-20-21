package fecha;

public class TestFecha {
  public static void main(String[] args) {

    /** Creating new objects */
    Fecha tiempo1 = new Fecha(34, 12, 2020);
    Fecha tiempo2 = new Fecha(25, 10, 1845);

    /** Checking the date */
    System.out.println(tiempo1.fechaCorrecta());
    System.out.println(tiempo2.fechaCorrecta());

    System.out.println();
    /** To organize the code */
    for (int i = 0; i <= 60; i++) {
         System.out.print("-");
    }
    System.out.println();
    //Print the date
    System.out.println();
    System.out.println(tiempo1.toString());
    System.out.println(tiempo2.toString());
    System.out.println();
    
    /** To organize the code */
    for (int i = 0; i <= 60; i++) {
         System.out.print("-");
    }
    System.out.println();
    
    /** Comparing two objects */
    System.out.println(tiempo1.compareTo(tiempo2));
}
}
