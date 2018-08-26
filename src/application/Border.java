package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Border extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("BorderPane_Darstellung");

		BorderPane myBorderPaneTest = new BorderPane();
		myBorderPaneTest.setPadding(new Insets(20, 40, 40, 10));

		Button top = new Button("Top");
		Button left = new Button("Left");
		Button center = new Button("Center");
		Button right = new Button("Right");
		Button bottom = new Button("Bottom");

		myBorderPaneTest.setTop(top);
		myBorderPaneTest.setLeft(left);
		myBorderPaneTest.setCenter(center);
		myBorderPaneTest.setRight(right);
		myBorderPaneTest.setBottom(bottom);

		Scene scene = new Scene(myBorderPaneTest, 200, 150);

		primaryStage.setScene(scene);
		primaryStage.show();
	}
}