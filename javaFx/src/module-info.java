module javaFx {
	requires transitive javafx.graphics;
	 requires javafx.controls;
	 requires javafx.fxml;

	 opens javaFx to javafx.fxml;
	 opens ejerciciosFx to javafx.fxml;
	 
	 exports javaFx;
	 exports ejerciciosFx;
}