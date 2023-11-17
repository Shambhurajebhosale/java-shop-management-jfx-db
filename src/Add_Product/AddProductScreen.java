package Add_Product;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddProductScreen {
    public static void showHomeScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:/C:/Users/Shambhuraje Bhosale/OneDrive/Desktop/END SEM/Add Product.fxml"));
			
			StageFactory.stage.setTitle("Home Screen");
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
