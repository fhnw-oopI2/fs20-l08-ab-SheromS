package ch.fhnw.oop2.module08.ab1;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {

	private PresentationModel pm;
	private Button button;

	ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	ApplicationUI(PresentationModel pm) {
		this.pm = pm;
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		button = new Button();
		button.textProperty().bindBidirectional(pm.getButtonTextProperty());
		
	}

	private void layoutControls() {
		this.getChildren().add(button);
	}
}
