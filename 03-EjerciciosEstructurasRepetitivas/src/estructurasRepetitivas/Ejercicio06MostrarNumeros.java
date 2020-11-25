package estructurasRepetitivas;
/**
 * Ejercicio 06: Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle do while.
 * @author JavierEpifanio
 *
 */
public class Ejercicio06MostrarNumeros {

  public static void main(String[] args) {
    int i = 320;
    
    do {
      System.out.println(i);
      i -= 20;
    } while(i >= 160);

  }

}
