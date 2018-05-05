package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AccordionTest extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("AccordionTest");
		
		final Label label = new Label("Accordion_Showcast");
		Accordion accordion = new Accordion();
		GridPane grid = new GridPane();

		String studentinfo = "Name: X\nGeb:1991\nDurschnitt:1.7";
		String dozenteninfo = "Name: Y\nGeb:1960\nWerke:12";
		
		TitledPane studententab = new TitledPane("Studenten", new Label(studentinfo));
		TitledPane dozententab = new TitledPane("Dozenten", new Label(dozenteninfo));

		accordion.getPanes().addAll(studententab, dozententab);
		accordion.setExpandedPane(studententab);
		
		grid.setAlignment(Pos.CENTER);
		grid.add(accordion, 1, 1);
		grid.setGridLinesVisible(false);

		Scene scene = new Scene(grid, 300, 250);
	
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}