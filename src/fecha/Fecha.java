package fecha;
/**
 * 3. Crea una clase Fecha. Los objetos de la clase Fecha son fechas de tiempo y se crean de la forma:
 * Fecha f = Fecha(1, 10, 2020);
 * donde los parámetros que se le pasan al constructor son el día, el mes y el año respectivamente. 
 * Si la fecha creada es incorrecta mostraremos un mensaje de error en la salida estándar de errores 
 * (lo ideal sería lanzar una excepción, ya lo haremos cuando se vea en clase).
 * Crea métodos para:
 *      Saber si la fecha almacenada es correcta.
 *      Sumar y restar días a la fecha. 
 *      Comparar la fecha almacenada con otra, el método devolverá un valor negativo si la fecha almacenada es ANTERIOR a la otra, 7
 *      0 si son IGUALES y un valor positivo si es POSTERIOR.
 *      Saber si el año de la fecha almacenada es bisiesto.
 *      El método toString() devuelve una cadena con el formato "<día del mes> de <nombre del mes> de <año>".
 * Las opciones a partir de la segunda, solo se realizarán si la fecha almacenada es correcta, en caso de no serlo, se dará un aviso, 
 * por la salida estándar de errores, de que la operación no se puede realizar.
 * 
 * Puedes usar una variable de clase para almacenar el número de días de cada mes del año (que no sea bisiesto).
 *
 * @author JavierEpifanio
 */
public class Fecha implements Cloneable, Comparable<Fecha> {

  private int dia;
  private int mes;
  private int anno;

  public boolean fechaCorrecta() {
    if (dia > 0 && dia < 31) {
      return true;
    }
    if (mes > 0 && mes < 13) {
      return true;
    }
    if (anno > 0) {
      return true;

    } else {
      return false;
    }
  }

  public Fecha(int dia, int mes, int anno) {
    this.setDia(dia);
    this.setMes(mes);
    this.setAnno(anno);
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public int getAnno() {
    return anno;
  }

  public void setAnno(int anno) {
    this.anno = anno;
  }

  @Override
  public String toString() {
    return +this.dia + " of " + this.mes + " of " + this.anno;
  }

  @Override
  public int compareTo(Fecha d) {

    return this.anno - d.anno;
  }

  public Fecha clone() {
    return new Fecha(this.dia, this.mes, this.anno);
  }
}
