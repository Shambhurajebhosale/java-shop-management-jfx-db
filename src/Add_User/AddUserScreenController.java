package Add_User;

import java.awt.TextArea;

import DBUtils.dbutils;
import User_Management.UserManagementScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AddUserScreenController {
	@FXML
	private  TextArea UserName;
	
	@FXML
	private TextArea Email;
	
	@FXML
	private TextArea Number;
	
	@FXML
	private TextArea Role;
	
	@FXML
	private TextArea Password;
	
	@FXML
	private TextArea Confirm;
	
	@FXML
	private Button Save; 
	
	@FXML
	private Button Quit;
	
	public void saveUser(ActionEvent event) {
		
		String query = "INSERT INTO users(username,email,number,role,password,confirm) Values ('" + UserName.getText() + "','" + email.getText()
				+ "','" +Number.getText() + "','"+Role.getText()+"','"+Password.getText()+"','"+Confirm.getText()+"')";
		dbutils.DBUtils.executeQuery(query);
		
	}

   public void cancleUser(ActionEvent event) {    
	   UserManagementScreen.showUserManagementScreen();
	}

}
