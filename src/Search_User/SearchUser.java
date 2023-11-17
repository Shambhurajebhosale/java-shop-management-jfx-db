package Search_User;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SearchUser {
	public static void showUserScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:/C:\\Users\\ShambhurajeBhosale\\eclipse-workspace\\Shop_ManagementJavafxDB\\src\\Search_User\\edit user.fxml"));
			
			StageFactory.stage.setTitle("Search User Screen");
			Scene scene = new Scene(actorGroup,600,400);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(true);
			StageFactory.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
