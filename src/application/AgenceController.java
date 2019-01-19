package application;

import com.meriame.soapservice.AdminLogin;
import com.meriame.soapservice.AgenceSOAPDTO;
import com.meriame.soapservice.AgentSOAPDTO;

import Tools.Service;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AgenceController {
	
	private Stage primaryStage;
	
	@FXML 
	   private TextField Adresse; 
	   
	   @FXML 
	   private TextField id; 
	   
	   public void saveAgence(ActionEvent event ) {
			 
			try {
				
				Service s = new Service();
				AgenceSOAPDTO agence = new AgenceSOAPDTO();
				 String adminusername = new AdminLogin().getArg0();
				
				agence.setAdresse(Adresse.getText());
				agence.setId(Long.parseLong(id.getText()));
				
				if(s.getAdmindb().addAgence(agence, adminusername) !=null) {
					
					Alert a= new Alert(AlertType.CONFIRMATION);
					a.setTitle("Confirmation");
					a.setContentText("Données ajoutés avec succées");
					a.showAndWait();
				}else  {
					Alert a= new Alert(AlertType.ERROR);
					a.setTitle("Erreur");
					a.setContentText("Données non ajoutés");
					a.showAndWait();
				}
			
			} catch(Exception e) {
				e.printStackTrace();
			}

		}
	
	
	
	
	
	   
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
