package Login;

import java.sql.ResultSet;
import java.sql.SQLException;

import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginScreenController {

	@FXML
	private TextField userName;
	
	@FXML
	private TextField password;
	
	@FXML
	private Button loginButton;

	public void login(ActionEvent event) {
		System.out.println(userName.getText());
		System.out.println(password.getText());
		boolean start=LoginScreenController.isValidateUsernameAndPassword(userName.getText(),password.getText());
		if(start) {
			HomeScreen.showHomeScreen();
		}else {
			System.out.println("Login Failed");
		}

	}
	public static boolean isValidateUsernameAndPassword(String username, String password) {

		String query = " Select * from users where username='" + username + "' and password = '" + password + "' ";

		ResultSet rs = DBUtils.dbutils.executeQueryGetResult(query);
		try {
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}


}
