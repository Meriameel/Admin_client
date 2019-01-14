package application;

import java.io.IOException;
import java.time.LocalDate;

import javax.xml.datatype.XMLGregorianCalendar;

import com.meriame.soapservice.AgentSOAPDTO;

import Tools.Service;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AgentController {
	
	
   private Stage primaryStage;
   
   @FXML 
   private TextField Cin; 
   
   @FXML 
   private TextField Nom; 
   
   @FXML 
   private TextField Prenom;
   
   @FXML 
   private TextField Adresse;
   
   @FXML 
   private TextField Telephone; 
   
   @FXML 
   private TextField Email;
   
   @FXML 
   private DatePicker dob;
   
   @FXML 
   private TextField admin; 
   
   @FXML 
   private TextField agence; 
   
   @FXML 
   private TextField username; 
   
   @FXML 
   private PasswordField password;
   
   @FXML 
   private Button saveAgent;
   
   @FXML
	private TableColumn<AgentSOAPDTO, String> cin;

	@FXML
	private TableColumn<AgentSOAPDTO, String> nom ;

	@FXML
	private TableColumn<AgentSOAPDTO, String> prenom;
	
	@FXML
	private TableColumn<AgentSOAPDTO, String> adresse;

	@FXML
	private TableColumn<AgentSOAPDTO, String> telephone;
	
	@FXML
   private TableColumn<AgentSOAPDTO, String> email;
	
	@FXML
	 private TableColumn<AgentSOAPDTO, XMLGregorianCalendar> datedenaissance;

	@FXML
	private TableColumn<AgentSOAPDTO, String> Username;
	
	@FXML
   private TableColumn<AgentSOAPDTO, String> Password;
	
	@FXML
   private MenuItem deleteUsers;
	
	
    
	
	
	
	
	
public AgentController(Stage primaryStage) {
		super();
		this.primaryStage=primaryStage;
	}





public void saveAgent(ActionEvent event ) {
	 
	try {
		
		Service s = new Service();
		if(s.getAdmindb().addAgent(arg0, arg1) !=0) {}
	
	} catch(Exception e) {
		e.printStackTrace();
	}

}



	public void Agent(ActionEvent event ) {
		 
		try {
			BorderPane root = new BorderPane();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/AgentMain.fxml"));
			loader.setController(new AgentController(primaryStage));
			Parent parent = loader.load();
			
			Scene scene = new Scene(parent);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

}
	
	
}
