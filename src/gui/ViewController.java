package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		System.out.println("Click teste");
		Alerts.showAlert("Alert title", null, "Hello Teste", AlertType.ERROR);
	}

}
