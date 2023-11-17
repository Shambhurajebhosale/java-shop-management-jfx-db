package Search_Product;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SearchProduct {
	public static void showSearchProductScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:/C:\\Users\\ShambhurajeBhosale\\eclipse-workspace\\ShopManagementJavafxDB\\src\\Search_Product\\search Product.fxml"));
			
			StageFactory.stage.setTitle("Search Product");
			Scene scene = new Scene(actorGroup,200,400);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(true);
			StageFactory.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
