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
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class RadioButtonShowcase extends Application {
 
   @Override
   public void start(Stage stage) {
	   ToggleGroup  group = new ToggleGroup();
	   
       Label status = new Label();

       RadioButton links = new RadioButton("links");
       RadioButton rechts = new RadioButton("rechts");
             
       links.setToggleGroup(group);
       links.setSelected(true);
       rechts.setToggleGroup(group);
 
       group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
           @Override
           public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
               if (group.getSelectedToggle() != null) {
                   RadioButton button = (RadioButton) group.getSelectedToggle();
                   System.out.println("Button: " + button.getText());
                   status.setText("Du bist " + button.getText());
               }
           }
       });
       
       
       HBox root = new HBox();
       root.setPadding(new Insets(10));
       root.setSpacing(5);
       root.getChildren().addAll(links, rechts, status);
 
       Scene scene = new Scene(root, 400, 150);
       stage.setScene(scene);
       stage.setTitle("RadioButton_Showcase");
       scene.setRoot(root);
       stage.show();
   }
 
   public static void main(String[] args) {
       launch(args);
   }
 
}
