package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AgenceController {
	
	private Stage primaryStage;
	
	public AgenceController(Stage primaryStage) {
			super();
			this.primaryStage=primaryStage;
		}
		public void Save(ActionEvent event ) {
			 
			try {
				BorderPane root = new BorderPane();
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/AgenceMain.fxml"));
				loader.setController(new AgenceController(primaryStage));
				Parent parent = loader.load();
				
				Scene scene = new Scene(parent);
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}

	}

}
