package Add_Product;

import java.awt.TextArea;

import DBUtils.dbutils;
import Product_Management.ProductScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AddProductScreenController {

	@FXML
	private TextArea ProductName;
	
	@FXML
	private TextArea ProductId;
	
	@FXML
	private TextArea Price;
	
	@FXML
	private TextArea Quantity;
	
	@FXML
	private TextArea Category;
	
	@FXML
	private Button Save;
	
	@FXML
	private Button Quit;
	
	
	public void saveProductINFO(ActionEvent event) {

		String query = "INSERT INTO products(ProductName,ID,Price,quantity,category) Values ('" + ProductNames.getText() + "','" + id.getText()
				+ "','" +Price.getText() + "','"+Quantity.getText()+"','"+Category.getText()+"')";
		dbutils.DBUtils.executeQuery(query);
	}
	
    public void cancelProduct(ActionEvent event) {
    	ProductScreen.showProductScreen();
}
}