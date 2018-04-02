package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class SampleController {
	
	

	public SampleController() { }
	
	@FXML
	private void initialize() { }
	
	 @FXML
	 private void onButtonLoginClicked(ActionEvent event) {
	     // Button was clicked, do something...
		 System.out.println("Button Login clicked");
	 }
	 
	 @FXML
	 private void onButtonRegisterClicked(ActionEvent event) {
	     // Button was clicked, do something...
		 System.out.println("Button Register clicked");
	 }
	 
	 @FXML
	 private void onCheckBoxSelected (ActionEvent event) {
		 System.out.println("Checkbox selected");
	 }
	 
	 @FXML
	 public void exitApplication(ActionEvent event) {
	    Platform.exit();
	    System.exit(0);
	 }

}
