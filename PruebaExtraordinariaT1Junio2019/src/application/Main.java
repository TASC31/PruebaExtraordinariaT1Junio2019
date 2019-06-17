package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("view/Login.fxml"));
		try {
			AnchorPane panelPrincipal = loader.load();
			primaryStage.setScene(new Scene(panelPrincipal));
			primaryStage.setTitle("Recuperacion T1 Alvaro Santa Cruz Esteban");
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
