package ejerciciosFx;

/**
 * Mostrar en pantalla los N primeros n�meros primos. Se pide la cantidad
   de n�meros primos que queremos mostrar.
 */

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ej11Primos extends Application {

  @Override
  public void start(Stage primaryStage) throws IOException {
    // Obtenemos nodo ra�z del FXML (otra forma)
    Parent root = FXMLLoader.load(getClass().getResource("Ej11Primos.fxml"));
    
    // A�adimos nodo a una escena y esta al escenario
    primaryStage.setScene(new Scene(root));
    primaryStage.setTitle("App " + this.getClass().getSimpleName());
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}