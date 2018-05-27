package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
 
public class MenuShowcase extends Application {
 
    @Override
    public void start(Stage stage) {
 
        // Create MenuBar
        MenuBar MenuBar = new MenuBar();
        
        // Create menus
        Menu menu1 = new Menu("Menu1");
        Menu menu2 = new Menu("Menu2");
        Menu menu3 = new Menu("Menu3");
        
        // Create MenuItems
        MenuItem menuItem1 = new MenuItem("MenuItem1");
        MenuItem menuItem2 = new MenuItem("MenuItem2");
        MenuItem menuItem3 = new MenuItem("MenuItem3");
        
        MenuItem menuItem4 = new MenuItem("MenuItem4");
        MenuItem menuItem5 = new MenuItem("MenuItem5");
        MenuItem menuItem6 = new MenuItem("MenuItem6");
        
        menu1.getItems().addAll(menuItem1, menuItem2, menuItem3);
        menu2.getItems().addAll(menuItem4, menuItem5);
        menu3.getItems().addAll(menuItem6);
        
        MenuBar.getMenus().addAll(menu1, menu2, menu3);
        
        BorderPane root = new BorderPane();
        root.setTop(MenuBar);
        Scene scene = new Scene(root, 350, 200);
 
        stage.setTitle("JavaFX Menu");
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}