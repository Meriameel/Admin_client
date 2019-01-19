package application;

import javax.xml.bind.JAXBElement;

import com.meriame.soapservice.AddAgent;
import com.meriame.soapservice.GetAgence;
import com.meriame.soapservice.ObjectFactory;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainController {
	
	private Stage primaryStage;

	public MainController(Stage primaryStage) {
		super();
		this.primaryStage=primaryStage;
	}
	public void ChooseAgent(ActionEvent event ) {
		 
		try {
			BorderPane root = new BorderPane();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Agent.fxml"));
			loader.setController(new AgentController(primaryStage));
			Parent parent = loader.load();
			
			Scene scene = new Scene(parent);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	
}
	
	public void ChooseAgence(ActionEvent event ) {
		 
		try {
			BorderPane root = new BorderPane();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Agence.fxml"));
			loader.setController(new AgenceController(primaryStage));
			Parent parent = loader.load();
			
			/*GetAgence getAgence = new GetAgence();
			
			JAXBElement<GetAgence> jax = new ObjectFactory().createGetAgence(getAgence);*/
			
			
			Scene scene = new Scene(parent);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	
}
}