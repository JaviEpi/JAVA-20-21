package javaFx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class HolaJavaFx extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		Label label = new Label("Hola mundo, JavaFX!");
		label.setFont(new Font("Arial", 30));
		label.setAlignment(Pos.TOP_LEFT);
		Scene scene = new Scene(label);		
		
		primaryStage.setScene(scene);
		primaryStage.setMaximized(true);
		primaryStage.setTitle("Hola Mundo");
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
