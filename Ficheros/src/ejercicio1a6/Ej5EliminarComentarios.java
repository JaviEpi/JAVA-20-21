package ejercicio1a6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ej5EliminarComentarios {
  public static void main(String[] args) {
    finalizarPrograma(args);

    String ficheroComentarios = args[0];
    String ficheroSinComentarios = args[1];

    try {

      escribirFichero(ficheroComentarios, ficheroSinComentarios);

    } catch (IOException e) {
      System.out.println("No se puede abrir el fichero");
      System.out.println(e.getClass());
    }
  }

  private static void escribirFichero(String ficheroComentarios, String ficheroSinComentarios)
      throws IOException {
    List<String> lines = Files.readAllLines(Paths.get(ficheroComentarios));

    BufferedWriter ficheroNoComentarios = new BufferedWriter(new FileWriter(ficheroSinComentarios));

    for (int i = 0; i < lines.size(); i++) {
      String line = lines.get(i);

      if (!bloqueComentarios(line) || !lineaComentarios(line)) {
        ficheroNoComentarios.write(line);
        ficheroNoComentarios.newLine();
      }
    }
    System.out.println("Programa escrito");
    ficheroNoComentarios.close();
  }

  private static boolean bloqueComentarios(String line) {
    return line.contains("/**") || line.contains("*/") || line.contains("*");
  }

  private static boolean lineaComentarios(String line) {
    return line.contains("//");
  }

  private static void finalizarPrograma(String[] args) {
    if (args.length < 1 || args.length > 2) {
      System.err.println("Numero incorrecto para el argumento.");
      System.err.println("Finaliza programa.");
      System.exit(1);
    }
  }
}
