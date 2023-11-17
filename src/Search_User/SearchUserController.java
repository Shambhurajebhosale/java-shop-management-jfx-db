package Search_User;

import java.sql.ResultSet;
import java.sql.SQLException;

import User_Management.UserManagementScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SearchUserController {
	@FXML 
	private TextField usernametosearch;

	@FXML 
	private TextField UserName;

	@FXML 
	private TextField Phone ;

	@FXML 
	private TextField Email;

	@FXML 
	private TextField Role;

	@FXML 
	private TextField Password;

	@FXML 
	private TextField ConfirmPassword;

	@FXML 
	private Button Search;

	@FXML 
	private Button Edit;

	@FXML 
	private Button Delete;
	
	@FXML 
	private Button Close;



	public void searchButton(ActionEvent event) throws SQLException {
		boolean status = Search_User(usernametosearch.getText());

		if(status) {
			
		}else {
			System.out.println(" ##USER NOT FOUND ##");
		}
	}
	public boolean Search_User(String usernametosearch) throws SQLException {
		String query = "SELECT * FROM users WHERE username = '"+usernametosearch+"'";

		ResultSet rs = DBUtils.dbutils.executeQueryGetResult(query);

		try {
			if(rs.next()) {
				UserName.setText(rs.getString("Username"));
				Email.setText(rs.getString("Email"));
				Phone.setText(rs.getString("Number"));
				Role.setText(rs.getString("Role"));
				Password.setText(rs.getString("Password"));
				ConfirmPassword.setText(rs.getString("ConfirmPassword"));
				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	public void editButton(ActionEvent event) {
		boolean status = Edit_User(usernametosearch.getText());
		if(status) {
			System.out.println(" User Edited Get Successfully ");
		}
		else {
			System.out.println(" ##USER NOT FOUND##");
		}
	}
	public boolean Edit_User(String usernametosearch) {
		String Query = "select * from users where username = '"+usernametosearch+"'";

		ResultSet rs = DBUtils.dbutils.executeQueryGetResult(Query);
		try {
			if(rs.next()) {
				String query = "UPDATE users SET username = '"+UserName.getText()+"', "
						+ "Email = '" +Email.getText()  + "', " 
						+ "Number = '"+Phone.getText()+"', "
						+ "Role = '"+Role.getText()+"',"
						+ "Password = '"+Password.getText()+"',"
					    + "ConfirmPassword = '"+ConfirmPassword.getText()+"'"
						+ "WHERE username = '"+usernametosearch+"'";

				DBUtils.dbutils.executeQuery(query);

				System.out.println("User updated get successfully.");

				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	public void deleteButton(ActionEvent event) {
		boolean status =  SearchUserController.Delete_User(usernametosearch.getText());

		if(status) {
			System.out.println("USER DELETED GET SUCCESSFULLY");
		}
		else {
			System.out.println(" ##USER NOT FOUND##");
		}
	}
	public static boolean Delete_User(String Username) {

		String query = "DELETE FROM users WHERE username = '"+Username+"'";

		DBUtils.dbutils.executeQuery(query);
		return true;
	}
		

	
	public void closeButton(ActionEvent event) {
		UserManagementScreen.showUserManagementScreen();
	}
	
}

