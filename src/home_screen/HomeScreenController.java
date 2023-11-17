package home_screen;

import Product_Management.ProductScreen;
import User_Management.UserManagementScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeScreenController {
	@FXML
	private Button UserManagement;

	@FXML
	private Button ProductManagement;

	@FXML
	private Button Back;

	public void ShowuserManagementScreen(ActionEvent event) {
		UserManagementScreen.showUserManagementScreen();
	}

	public void productManagementScreen(ActionEvent event) {
		ProductScreen.showProductScreen();

	}

	public void bacToHomeScreen(ActionEvent event) {

	}
}
