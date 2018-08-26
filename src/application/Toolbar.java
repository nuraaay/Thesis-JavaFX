package application;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;


public class Toolbar extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Showcase ToolBar");

		ToolBar toolBar = new ToolBar();
		Label button1 = new Label("ToolBarElement 1");
		Label button2 = new Label("ToolBarElement 2");

		toolBar.getItems().add(button1);
		toolBar.getItems().add(button2);

		VBox vBox = new VBox(toolBar);
		Scene scene = new Scene(vBox, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}