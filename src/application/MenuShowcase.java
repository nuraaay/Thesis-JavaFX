package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuShowcase extends Application {
	@Override
	public void start(Stage stage) {
		MenuBar MenuBar = new MenuBar();
		Menu menu1 = new Menu("Menu1");
		Menu menu2 = new Menu("Menu2");
		Menu menu3 = new Menu("Menu3");

		EventHandler<ActionEvent> myHandler = myActionEventHandler();

		MenuItem menuItem1 = new MenuItem("MenuItem1");
		menuItem1.setOnAction(myHandler);

		MenuItem menuItem2 = new MenuItem("MenuItem2");
		menuItem2.setOnAction(myHandler);

		MenuItem menuItem3 = new MenuItem("MenuItem3");
		menuItem3.setOnAction(myHandler);

		MenuItem menuItem4 = new MenuItem("MenuItem4");
		menuItem4.setOnAction(myHandler);

		menu1.getItems().addAll(menuItem1, menuItem2);
		menu2.getItems().addAll(menuItem3);
		menu3.getItems().addAll(menuItem4);

		MenuBar.getMenus().addAll(menu1, menu2, menu3);

		BorderPane layout = new BorderPane();
		layout.setTop(MenuBar);
		Scene scene = new Scene(layout, 350, 200);

		stage.setTitle("JavaFX-Showcase Menu");
		stage.setScene(scene);
		stage.show();
	}

	private EventHandler<ActionEvent> myActionEventHandler() {
		return new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				MenuItem triggerMenuItem = (MenuItem) event.getSource();
				String MenuItemName = triggerMenuItem.getText();
				if ("MenuItem1".equalsIgnoreCase(MenuItemName)) {
					System.out.println("MenuItem1");
				} // ...examplarisch für ein MenuItem demonstriert
			}
		};
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}