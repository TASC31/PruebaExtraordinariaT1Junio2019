package application;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Clase controladora.
 * @author Alvaro Santa Cruz Esteban
 * @version 1.0
 *
 */

public class ControlFX {

	@FXML
	private AnchorPane ventanaPrincipal, ventanaDos;
	
	@FXML
	private JFXButton botonStarted;
	
	/**
	 * Metodo void que carga la segunda ventana de la aplicación
	 * @return no tiene retorno
	 */
	public void openStage() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view/FreeSolo.fxml"));
		try {
			ventanaDos = loader.load();
			Stage st = new Stage();
			st.setScene(new Scene(ventanaDos));
			st.centerOnScreen();
			st.show();
			closeStage();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void closeStage() {
		Stage st = (Stage) ventanaPrincipal.getScene().getWindow();
		st.close();
	}
	
}


