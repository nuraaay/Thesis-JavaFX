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
		primaryStage.setTitle("Accordion Showcast_Vater");
		Label label = new Label("Accordion_Showcast");
		Accordion accordion = new Accordion();
		GridPane grid = new GridPane();
		label.setId("title-label");

		String studentinfo = "Name: X\nGeb:1991\nDurschnitt:1.7";
		String dozenteninfo = "Name: Y\nGeb:1960";
		String doktorinfo = "Name: Z\nGeb:1990\nDurchschnitt:1.3";
		String mitarbeiterinfo = "Name: T\nGeb:1986\nGehaltsklasse:14";
		TitledPane studententab = new TitledPane("Studenten", new Label(studentinfo));
		TitledPane dozententab = new TitledPane("Dozenten", new Label(dozenteninfo));
		TitledPane dotortab = new TitledPane("Doktorranden", new Label(doktorinfo));
		TitledPane mitartab = new TitledPane("Mitarbeiter", new Label(mitarbeiterinfo));

		accordion.getPanes().addAll(studententab, dozententab, dotortab, mitartab);
		accordion.setExpandedPane(dotortab);
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
