package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class PresentationModel {

	private StringProperty title;
	private StringProperty buttonText;
	private StateButton stateButton;
	
	PresentationModel() {
		title = new SimpleStringProperty("JavaFX Application");
		stateButton = StateButton.On;
		buttonText = new SimpleStringProperty(stateButton.name());
		}
	
	public void toggle() {
		if (stateButton.equals(StateButton.On)) {
			stateButton = StateButton.Off;
			buttonText.set(stateButton.name());
		} else {
			stateButton = StateButton.On;
			buttonText.set(stateButton.name());
		}
	}
	
	
	//Title Text Property
	
	public String getTitle() {
		return title.getValue();
	}

	public void setTitle(StringProperty title) {
		this.title = title;
	}
	
	public StringProperty getTitleProperty() {
		return title;
	}

	
	//Button Text Property
	
	public String getButtonText() {
		return buttonText.getValue();
	}

	public void setButtonText(StringProperty buttonText) {
		this.buttonText = buttonText;
	}
	
	public StringProperty getButtonTextProperty() {
		return buttonText;
	}
}
