package Shop_Management;

import Login.LoginScreen;
import common.StageFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class ApplicationMain extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		StageFactory.stage=stage;
		LoginScreen.showLoginScreen();
		
	}
}
