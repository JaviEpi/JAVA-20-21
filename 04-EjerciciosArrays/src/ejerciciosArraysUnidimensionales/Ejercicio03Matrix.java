package ejerciciosArraysUnidimensionales;

/**
 * 
 * @author JavierEpifanio
 *
 */

public class Ejercicio03Matrix {

  public static void main(String[] args) throws InterruptedException {
    // definimos las variables
    int matrix = 0;
    
    do {
      for (int i = 0; i<200; i++) {  // bucle for que imprimira 200 caracteres por linea
        matrix = (int) (Math.random() * (95 + 32));
        System.out.print((char)(matrix));
        Thread.sleep(1);
      }
      System.out.println();
    }while(true);
    
  }

}
