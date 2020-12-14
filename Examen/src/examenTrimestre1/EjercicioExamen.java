package examenTrimestre1;
import java.util.Scanner;

/**
 * Ejercicio: Guardamos en un array de 15 × 5 elementos la calificación obtenida por 15 estudiantes (a los que conocemos por su número de lista) 
 * en la evaluación de 5 ejercicios entregados semanalmente (cuando un ejercicio no se ha entregado, la calificación es −1).
 * También guardamos en otro array los nombres de los 15 estudiantes, inicializa este array con los valores que quieras.
 * Haz un programa en Java que muestre y ejecute el siguiente menú:
 *      1. Generar aleatoriamente las calificaciones (enteros entre -1 y 10).
 *      2. Mostrar el número de ejercicios entregados por un estudiante.
 *      3. Mostrar la media de los ejercicios entregados por un estudiante (si los entregó todos; en caso contrario, la media es 0).
 *      4. Mostrar la cantidad de estudiantes que han entregado todos los ejercicios y tienen una media superior o igual a un 5.
 *      5. Mostrar el número de estudiantes que han presentado un ejercicio dado.
 *      6. Dado el número de un ejercicio, mostrar la nota media obtenida por los estudiantes que lo presentaron.
 *      7. Dado el número de un ejercicio, mostrar la nota más alta obtenida.
 *      8. Dado el número de un ejercicio, mostrar la nota más baja obtenida.
 *      9. Mostrar la relación de estudiantes y sus notas.
 *      10. Finalizar.
 *
 * A tener en cuenta:
 *      • Cuando una opción necesite saber a qué estudiante nos referimos damos su número (empezamos en 1) y 
 *      al mostrar el resultado tiene que salir este número y su nombre.
 *      • Cuando una opción necesite saber a qué ejercicio nos referimos damos su número (empezamos en 1).
 *      • Si el array de calificaciones no se ha generado no funcionan las demás opciones.
 *      • Si se da una opción equivocada en el menú se muestra un error.
 *      
 * Para este programa tienes que hacer y usar (como mínimo) las siguientes funciones:
 *      • Dado el número de un estudiante, devolver el número de ejercicios entregados. 
 *      • Dado el número de un estudiante, devolver la media sobre los ejercicios entregados, si los entregó todos; en caso contrario, la media es 0. 
 *      • Devolver el número de todos los estudiantes que han entregado todos los ejercicios y tienen una media superior a un valor pasado a 
 *      la función como parámetro.
 *      • Dado el número de un ejercicio, devolver el número de estudiantes que lo han presentado.
 *      • Dado el número de un ejercicio, devolver la nota media obtenida por los estudiantes que lo presentaron.
 *      • Dado el número de un ejercicio, devolver la nota más alta obtenida.
 *      • Dado el número de un ejercicio, devolver la nota más baja obtenida (sin contar -1).
 * 
 * @author JavierEpifanio
 * Fecha: 14/12/2020
 * 
 */


public class EjercicioExamen {

  public static final int FILAS = 15;
  public static final int COLUMNAS = 5;
  public static final int MAXNOTA = 10;
  public static final int MINNOTA = -1;
  public static final String[] NOMALUMNOS = {"Estudiante 1","Estudiante 2","Estudiante 3","Estudiante 4", "Estudiante 5","Estudiante 6",
      "Estudiante 7","Estudiante 8","Estudiante 9","Estudiante 10","Estudiante 11","Estudiante 12","Estudiante 13","Estudiante 14","Estudiante 15"};



  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Boolean continuar = false;
    int opcion = 0;
    int [][] acabadoArray = null;

    // Creamos el menu
    do {
      System.out.println("Menu");
      System.out.println("--------------------------------------------------------------------");
      System.out.println("1. Generar aleatoriamente las calificaciones (enteros entre -1 y 10)");
      System.out.println("2. Mostrar el número de ejercicios entregados por un estudiante.");
      System.out.println("3. Mostrar la media de los ejercicios entregados por un estudiante (si los entregó todos; en caso contrario, la media es 0)");
      System.out.println("4. Mostrar la cantidad de estudiantes que han entregado todos los ejercicios y tienen una media superior o igual a un 5");
      System.out.println("5. Mostrar el número de estudiantes que han presentado un ejercicio dado");
      System.out.println("6. Dado el número de un ejercicio, mostrar la nota media obtenida por los estudiantes que lo presentaron.");
      System.out.println("7. Dado el número de un ejercicio, mostrar la nota más alta obtenida.");
      System.out.println("8. Dado el número de un ejercicio, mostrar la nota más baja obtenida.");
      System.out.println("9. Mostrar la relación de estudiantes y sus notas.");
      System.out.println("10. Finalizar");
      System.out.println("");
      System.out.println("Introduce el numero de la opción que deseas : ");
      opcion = s.nextInt();

      switch (opcion) {
        case 1: // Generamos el array
          acabadoArray = generaArrays(FILAS,COLUMNAS,MAXNOTA,MINNOTA);
          continuar = true;
          break;
        case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
          if (continuar == true) {
            switch (opcion) {
              case 2: // Mostrar el número de ejercicios entregados por un estudiante
                int estudiante = 0;
                int contEjercicios = 0;
                System.out.println("¿De que estudiante quieres conocer los ejercicios entregados?");
                estudiante = s.nextInt() -1; 
                contEjercicios = ejerciciosEntregados(acabadoArray, estudiante,contEjercicios);
                estudiante = estudiante +1; 
                System.out.println("El alumno número "+ estudiante +" ha entregado " +contEjercicios +" ejercicios");
                break;

              case 3: // Mostrar la media de los ejercicios entregados por un estudiante (si los entregó todos; en caso contrario, la media es 0)
                int estudiante1 = 0;
                double media = 0;
                System.out.println("¿De cuál estudiante quiere saber la media?: ");
                estudiante1 = s.nextInt() -1; 
                media = mediaEjercicios(acabadoArray,estudiante1,media);
                estudiante1 = estudiante1 + 1; 
                System.out.println("El alumno numero "+ estudiante1+ " tiene una media de " + media);
                break;

              case 4: // Mostrar la cantidad de estudiantes que han entregado todos los ejercicios y tienen una media superior o igual a un 5
                int estudiantesTodosEjercicios = 0;
                int estudiante2 = 0;
                double media1 = 0;
                int contadorEntregados = 0;
                estudiantesTodosEjercicios = totalEntregados(acabadoArray,estudiante2,media1,contadorEntregados);
                System.out.println("Un total de "+estudiantesTodosEjercicios+" alumnos cumple las condiciones");
                break;

              case 5: // Mostrar el número de estudiantes que han presentado un ejercicio dado
                int numEntregado;
                int ejercicio = 0;
                int contEntregado = 0;
                System.out.println("¿De cuál de los siguientes ejercicios quieres conocer el número de los estudiantes que lo han realizado?: ");
                ejercicio = s.nextInt() -1 ;
                numEntregado = contadorEntregas(acabadoArray,ejercicio,contEntregado);
                ejercicio = ejercicio + 1;
                System.out.println("El ejercicio número "+ejercicio+ " ha sido entregado por " +numEntregado +" Alumnos");
                break;

              case 6: // Dado el número de un ejercicio, mostrar la nota media obtenida por los estudiantes que lo presentaron.
                double media2 = 0;
                int ejercicio1 = 0;
                System.out.println("De que ejercicio deseas saber la media: ");
                ejercicio1 = s.nextInt() -1; 
                media2 = mediaEstudiantes(acabadoArray,media2,ejercicio1);
                System.out.println("La media de este ejericico es de: " + media2);
                break;

              case 7: // Dado el número de un ejercicio, mostrar la nota más alta obtenida.
                int maxNota;
                int maximaNota = Integer.MIN_VALUE;
                int ejercicio2 = 0;
                System.out.println("¿De cuál de los ejercicios quieres ver la nota máxima?: ");
                ejercicio2 = s.nextInt() -1; 
                maxNota = notaAlta(acabadoArray,maximaNota,ejercicio2);
                ejercicio2 = ejercicio2 + 1; 
                System.out.println("La nota maxima del ejercicio "+ejercicio2 +" es "+maxNota);
                break;

              case 8: // Dado el número de un ejercicio, mostrar la nota más baja obtenida.
                int notaMin;
                int notaMinima = Integer.MAX_VALUE;
                int ejercicio3 = 0;
                System.out.println("¿De cuál de los ejercicios quieres ver la nota mínima?: ");
                ejercicio3 = s.nextInt() -1;
                notaMin = notaBaja(acabadoArray,notaMinima,ejercicio3);
                ejercicio3 = ejercicio3 +1;
                System.out.println("La nota minima del ejercicio "+ejercicio3+" es: "+notaMin);
                break;

              case 9: //  Mostrar la relación de estudiantes y sus notas.
                System.out.println("");
                for (int i = 0; i < NOMALUMNOS.length; i++) {
                  System.out.printf("%10s",NOMALUMNOS[i]);
                  for (int k = 0; k < COLUMNAS; k++) {
                    System.out.printf("%7d " ,acabadoArray[i][k]);
                  }
                  System.out.println("");
                }
                break;

              case 10:  // Finalizado
                System.out.println("¡Finalizado!");
                break;
            }
          }else {
              System.out.println("No se han generado las notas de los estudiantes");
            }
        default:
          System.out.println("\n\nOpción incorrecta\n\n");
          }
      } while (opcion  != 10);
      System.out.println("¡Finalizado!");
      
      s.close();
    }
  
  
  /**
   * Función que genera las notas del los estudiantes de forma aleatoria.
   * 
   * @param FILAS
   * @param COLUMNAS
   * @param MAXNOTA
   * @param MINNOTA
   * @return arrayNotas
   */
  public static int[][] generaArrays(int FILAS,int COLUMNAS,int MAXNOTA,int MINNOTA) {
    int arrayNotas [][] = new int [FILAS][COLUMNAS];
    for (int i = 0; i < FILAS; i++) {
      for (int j = 0; j < COLUMNAS; j++) {
        arrayNotas[i][j] = (int) (Math.random() * (MAXNOTA +1 -MINNOTA)) + (MINNOTA);  
      }
    }
    return arrayNotas;
  }
  
  /**
   * Función que muestra el número de ejercicios entregados por un estudiante.
   * 
   * @param arrayTerminado
   * @param estudiante
   * @param contEjerciciosEntregados
   * @return contEjerciciosEntregados
   */
  
  public static int ejerciciosEntregados(int[][] arrayTerminado,int estudiante,int contEjerciciosEntregados) {
    int nota = 0;
    for (int i = 0; i < COLUMNAS; i++) {
       nota = arrayTerminado[estudiante][i];
       if (nota > (-1)) {
        contEjerciciosEntregados++;
      }
    }
    return contEjerciciosEntregados;
  }
  
  /**
   * Función que muestra la media de los ejercicios entregados por un estudiante (si los entregó todos; en caso contrario, la media es 0)
   * 
   * @param arrayTerminado
   * @param estudiante1
   * @param media
   * @return media
   */
  
  public static double mediaEjercicios(int[][] arrayTerminado,int estudiante1,double media) {
    int noEntregado = 0;
    for (int i = 0; i < COLUMNAS; i++) {
      media += arrayTerminado[estudiante1][i];
      if (arrayTerminado[estudiante1][i] == -1) {
        noEntregado++;
      }
     }
    if (noEntregado > 0) {
      media = 0;
    }
    else
        media = media/ COLUMNAS;
    
    return media;
  }
  
  /**
   * Función que la cantidad de estudiantes que han entregado todos los ejercicios y tienen una media superior o igual a un 5.
   * 
   * @param acabadoArray
   * @param estudiante2
   * @param media1
   * @param contadorEntregados
   * @return total
   */
  
  public static int totalEntregados (int[][] acabadoArray,int estudiante2,double media1,int contadorEntregados) {
    int total = 0;
    while (estudiante2<FILAS) {
      media1 = mediaEjercicios(acabadoArray,estudiante2,media1);
      contadorEntregados = ejerciciosEntregados(acabadoArray, estudiante2,contadorEntregados);
      estudiante2++;
      if (media1>5 && contadorEntregados ==COLUMNAS) {
        total++;
      }
    }
    return total;  
  }
  
  /**
   * Función el número de ejercicios entregados por un estudiante.
   * 
   * @param arrayTerminado
   * @param ejercicio
   * @param contadorEntregados
   * @return contadorEntregados
   */
  
  public static int contadorEntregas(int[][] arrayTerminado,int ejercicio,int contadorEntregados) {
    int entregado = 0;
    for (int i = 0; i < FILAS; i++) {
      entregado = arrayTerminado[i][ejercicio];
      if (entregado > (-1)) {
       contadorEntregados++;
     }
   }
    return contadorEntregados;
   }
  
  /**
   * Función para calcular la media de los estudiantes del ejercicio.
   * 
   * @param arrayTerminado
   * @param media
   * @param ejercicio
   * @return media
   */
  
  public static double mediaEstudiantes(int[][] arrayTerminado, double media, int ejercicio) {
    int entregado = 0;
    int contadorEntregas = 0;
    for (int i = 0; i < FILAS; i++) {
      entregado = arrayTerminado[i][ejercicio];
      if (entregado > -1) {
        media =+ entregado;
        contadorEntregas++;
      }
    media =  media/contadorEntregas;
    }
    return media;
  }
  
  /**
   * Función para calcular la nota mas alta del ejercicio.
   * @param arrayTerminado
   * @param notaMaxima
   * @param ejercicio
   * @return notaMaxima
   */
  public static int notaAlta(int[][] arrayTerminado,int notaMaxima,int ejercicio) {
    for (int i = 0; i < FILAS; i++) {
      if (notaMaxima < arrayTerminado[i][ejercicio]) {
        notaMaxima = arrayTerminado[i][ejercicio];
      }
    }
    return notaMaxima;
  }
  
  /**
   * Función para calcular la nota mas baja del ejercicio
   * 
   * @param arrayTerminado
   * @param notaMinima
   * @param ejercicio
   * @return notaMinima
   */
  public static int notaBaja(int[][] arrayTerminado,int notaMinima,int ejercicio) {
    for (int i = 0; i < FILAS; i++) {
      if (notaMinima > arrayTerminado[i][ejercicio]) {
        notaMinima = arrayTerminado[i][ejercicio];
      }
    }
    return notaMinima;
    
  }

  }
