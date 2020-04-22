package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class PresentationModel {

	private StringProperty title;
	private StringProperty buttonText;
	
	PresentationModel() {
		title = new SimpleStringProperty("JavaFX Application");
		buttonText = new SimpleStringProperty("Hello World!");
		//setInitionalValues();
		
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
