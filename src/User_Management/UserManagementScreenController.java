package User_Management;

import common.StageFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class UserManagementScreenController {
	@FXML
	private Button addUser;
	
	@FXML
	private Button searchUser;
	
	@FXML
	private Button editUser;
	
	@FXML
	private Button quitUser;
	
	@FXML
	private Button deleteUser; 
	
	public void AddUser(ActionEvent event) {
		AddUserScreen.showAddUserScreen();
	}
	
   public void SearchUser(ActionEvent event) {
	   search_user.SearchUser.showUserScreen();
	}
  
   public void EditUser(ActionEvent event) {
	   search_user.SearchUser.showUserScreen();
   }

   public void QuitUser(ActionEvent event) {
	   HomeScreen.showHomeScreen();
   }

   public void DeleteUser(ActionEvent event) {
	   search_user.SearchUser.showUserScreen();
   }
	