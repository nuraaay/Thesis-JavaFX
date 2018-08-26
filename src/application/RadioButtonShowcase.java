package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RadioButtonShowcase extends Application {
	@Override
	public void start(Stage stage) {
		ToggleGroup gruppe = new ToggleGroup();
		Label status = new Label();
		RadioButton links = new RadioButton("links");
		RadioButton rechts = new RadioButton("rechts");

		links.setToggleGroup(gruppe);
		rechts.setToggleGroup(gruppe);
		links.setSelected(true);

		ChangeListener myHandler = createOnChangeListener(gruppe, status);
		gruppe.selectedToggleProperty().addListener(myHandler);

		HBox layout = new HBox();
		layout.setPadding(new Insets(10));
		layout.setSpacing(5);
		layout.getChildren().addAll(links, rechts, status);

		Scene scene = new Scene(layout, 400, 150);
		stage.setScene(scene);
		stage.setTitle("JavaFX-Showcase-RadioButton");
		scene.setRoot(layout);
		stage.show();
	}

	public ChangeListener createOnChangeListener(ToggleGroup gruppe, Label status) {
		return new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
				if (gruppe.getSelectedToggle() != null) {
					RadioButton button = (RadioButton) gruppe.getSelectedToggle();
					status.setText("Buton " + button.getText() + " ist gewählt ");
				}
			}
		};
	}

	public static void main(String[] args) {
		launch(args);
	}

}
