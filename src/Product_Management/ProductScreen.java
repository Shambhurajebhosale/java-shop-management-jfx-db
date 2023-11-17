package Product_Management;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ProductScreen {
	
    public static void showProductScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:/C:\\Users\\Abhijeet\\eclipse-workspace\\ShopManagementJavafxDB\\src\\productmanagement\\Product Management.fxml"));
			
			StageFactory.stage.setTitle("Customer Login");
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
