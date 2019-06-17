package application;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * Clase controladora de la ventana dos.
 * @author Alvaro Santa Cruz Esteban
 * @version 1.0
 *
 */

public class Control2FX {
	
	@FXML
	private ImageView imagen;
	
	@FXML
	private AnchorPane ventanaDos;
	
	/**
	 * he intentado meter un fadein pero no lo he logrado
	 */
	
	public void fadeIn() {
		FadeTransition fade = new FadeTransition(Duration.seconds(5), imagen);
		fade.setFromValue(0);
		fade.setToValue(1);
		fade.play();
	}

}
