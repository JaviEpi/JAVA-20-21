package tiempo;
/**
 * 1. Crea la clase Tiempo. Los objetos de la clase Tiempo son intervalos de tiempo y se crean de la forma:
 * t = Tiempo(1, 20, 30)
 * donde los parámetros que se le pasan al constructor son las horas, los minutos y los segundos respectivamente. 
 * Crea métodos para:
 *      Sumar y restar otro objeto de la clase Tiempo (el resultado es otro objeto).
 *      Sumar y restar segundos, minutos y/o horas (se cambia el objeto actual).
 *      Devolver una cadena con el tiempo almacenado, de forma que si lo que hay es (10 35 5) la cadena sea 10h 35m 5s.
 *      
 * Realiza un programa de prueba para comprobar que la clase funciona bien.
 * 
 * @author JavierEpifanio
 *
 */
public class Tiempo {
  
  private int horas;
  private int minutos;
  private int segundos;

  public Tiempo sumToObject(Tiempo object) {
    return new Tiempo(
        this.horas + object.horas, this.minutos + object.minutos, this.segundos + object.segundos);
  };

  public Tiempo subtractObject(Tiempo object) {
    return new Tiempo(
        this.horas - object.horas, this.minutos - object.minutos, this.segundos - object.segundos);
  }

  @Override
  public String toString() {
    return horas + "h " + minutos + "m " + segundos + "s ";
  }

  /**
   * Constructor
   *
   * @param hours
   * @param minutes
   * @param seconds
   */
  public Tiempo(int horas, int minutos, int segundos) {
    if (horas < 0 || minutos < 0 || segundos < 0) {
      System.err.println("\nNo puedes introducir un número negativo.");
    }
    int timeInSeconds = (horas * 3600) + (minutos * 60) + segundos;
    this.horas = timeInSeconds / 3600;
    this.minutos = (timeInSeconds % 3600) / 60;
    this.segundos = timeInSeconds % 60;
  }

  public int getHoras() {
    return horas;
  }

  public void setHoras(int horas) {
    if (horas < 0) {
      System.err.println("\nNo puedes introducir un número negativo.");
    }
    this.horas = horas;
  }

  public int getMinutos() {
    return minutos;
  }

  public void setMinutos(int minutos) {
    if (minutos < 0) {
      System.err.println("\nNo puedes introducir un número negativo.");
    }
    this.minutos = minutos;
  }

  public int getSegundos() {
    return segundos;
  }

  public void setSegundos(int segundos) {
    if (segundos < 0) {
      System.err.println("\nNo puedes introducir un número negativo");
    }
    this.segundos = segundos;
  }
}
