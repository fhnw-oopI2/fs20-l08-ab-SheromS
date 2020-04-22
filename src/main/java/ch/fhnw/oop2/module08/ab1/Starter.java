package ch.fhnw.oop2.module08.ab1;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		PresentationModel pm = new PresentationModel();
		
		Parent rootPanel = new ApplicationUI(pm);
		
		Scene myScene = new Scene(rootPanel);
		
		primaryStage.setTitle(pm.getTitle());
		primaryStage.setScene(myScene);
		
		primaryStage.setWidth(400);
		primaryStage.setHeight(300);
		//primaryStage.centerOnScreen();
		
		primaryStage.show();
		
	}

}
