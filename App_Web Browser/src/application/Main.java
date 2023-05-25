package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	@Override
	public void start(Stage stage) throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene.fxml"));
		Parent root = loader.load();	
		loader.getController();
		Scene scene = new Scene(root);		
		
		stage.setScene(scene);
		stage.show();
		
	}	
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
}
