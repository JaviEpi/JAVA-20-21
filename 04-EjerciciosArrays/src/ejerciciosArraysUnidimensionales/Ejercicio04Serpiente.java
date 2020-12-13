package ejerciciosArraysUnidimensionales;
import java.util.Scanner;

/**
 * 
 * @author JavierEpifanio
 *
 */
public class Ejercicio04Serpiente {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int lenght;
    int position;
    int numRandom;
    String serpentBuilder;

    System.out.println("Bienvenido a este programa para generar una serpiente aleatoria.");
    System.out.println("----------------------------------------------------------------\n");

    System.out.print("Inserta cuán larga será la serpiente: ");
    lenght = s.nextInt();

    System.out.println("            @");
    position = 12; //Número de espacios que tiene la cabeza

    for (int i=1; i<lenght; i++) {
      numRandom = (int) (Math.random()*3);
      
      if (numRandom == 0) { //Uno a la izquierda
        serpentBuilder = "";
        position--;
        for (int aux=0; aux<position; aux++) {
          serpentBuilder = serpentBuilder + " ";
        }
        serpentBuilder = serpentBuilder + "*";
        System.out.println(serpentBuilder);

      } else if (numRandom == 1) { //Mantiene el sitio
        serpentBuilder = "";
        for (int aux=0; aux<position; aux++) {
          serpentBuilder = serpentBuilder + " ";
        }
        serpentBuilder = serpentBuilder + "*";
        System.out.println(serpentBuilder);
        
      } else { //Uno a la derecha
        serpentBuilder = "";
        position++;
        for (int aux=0; aux<position; aux++) {
          serpentBuilder = serpentBuilder + " ";
        }
        serpentBuilder = serpentBuilder + "*";
        System.out.println(serpentBuilder);
      }
    }
    
    s.close();
  }

}
