package Product_Management;

import Add_Product.AddProductScreen;
import Search_Product.SearchProductScreenController;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ProductScreenController {
	@FXML
	private Button addproduct;
	
	@FXML
	private Button searchproduct;
	
	@FXML
	private Button editproduct;
	
	@FXML
	private Button deleteproduct;
	
	@FXML
	private Button quitproduct;
	
	public void addProduct(ActionEvent event) {
		AddProductScreen.showHomeScreen();
	}
	
	public void searchProduct(ActionEvent event) {
		SearchProductScreenController.showSearchProductScreen();
	}
	
	public void editProduct(ActionEvent event) {
		AddProductScreen.showSearchProductScreen();
	}
	
	public void deleteProduct(ActionEvent event) {
		ProductScreen.showSearchProductScreen();
	}
	
	public void quiteProduct(ActionEvent event) {
		HomeScreen.showHomeScreen();
	}

}

