package Search_Product;

import java.awt.TextArea;
import java.sql.ResultSet;
import java.sql.SQLException;

import DBUtils.dbutils;
import Product_Management.ProductScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SearchProductScreenController {
	@FXML
	private TextArea Productname;
	
	@FXML
	private TextArea ProductId;
	
	@FXML
	private TextArea Price;
	
	@FXML
	private TextArea Quantity;
	
	@FXML
	private TextArea Category;
	
	@FXML
	private Button Search;
	
	@FXML
	private Button Close;
	
	@FXML
	private Button Delete;
	
	@FXML
	private Button Edit;
	
	public void searchProduct(ActionEvent event) throws SQLException {
		boolean status = Search_Product(Productname.getText());

		if(status) {
			
		}else {
			System.out.println(" ##Product Not Found## ");
	}
	}
	public boolean Search_Product(String productnames) throws SQLException {
			String query = "SELECT * FROM products WHERE productName = '"+productnames+"'";

			ResultSet rs = DBUtils.dbutils.executeQueryGetResult(query);

			try {
				if(rs.next()) {
					Productname.setText(rs.getString("ProductName"));
					ProductId.setText(rs.getString("ProductID"));
					Price.setText(rs.getString("Price"));
					Quantity.setText(rs.getString("Quantity"));
					Category.setText(rs.getString("Category"));

					return true;
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
	
    public void closeProduct(ActionEvent event) {
    	ProductScreen.showProductScreen();
	} 
    
    public void editProduct(ActionEvent event) {
    	boolean status = Edit_Product(Productname.getText());
		if(status) {
			System.out.println("Product Edited successfully.");
		}
		else {
			System.out.println(" ##Product not found##");
		}
	} 
    public boolean Edit_Product(String productnametosearch) {
		String Query = "select * from products where productName = '"+productnametosearch+"'";

		ResultSet rs = DBUtils.dbutils.executeQueryGetResult(Query);
		try {
			if(rs.next()) {
				String query = "UPDATE products SET productName = '"+Productname.getText()+"', "
						+ "ProductID = '" +ProductId.getText()  + "', " 
						+ "Price = '"+Price.getText()+"', "
						+ "Quantity = '"+Quantity.getText()+"',"
						+ "Category = '"+Category.getText()+"'"
						+ "WHERE productName = '"+productnametosearch+"'";

				DBUtils.executeQuery(query);

				System.out.println("Product updated successfully.");

				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
    
    public void deleteProduct(ActionEvent event) {
    	boolean status = Delete_Product(Productname.getText());

		if(status) {
			System.out.println("PRODUCT DELETED SUCCESSFULLY");
		}
		else {
			System.out.println(" ##PRODUCT NOT FOUND##");
		}
	}
	public static boolean Delete_Product(String name) {

		String query = "DELETE FROM products WHERE productName = '"+name+"'";

		DBUtils.dbutils(query);
		return true;
	}
		

}
