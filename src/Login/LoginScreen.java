package Login;
import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class LoginScreen {
	public static void showLoginScreen()throws Exception {
	try {
			Parent actorGroup = FXMLLoader.load(new URL("file:/C:Users/Shambhuraje Bhosale/OneDrive/Desktop/END SEM/LoginPage.fxml/"));
			
			StageFactory.stage.setTitle("Customer Login");
			Scene scene = new Scene (actorGroup,400,200);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(true);
			StageFactory.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

