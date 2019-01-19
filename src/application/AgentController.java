package application;


import java.net.URL;

import java.util.ResourceBundle;

import javax.annotation.PostConstruct;

import com.meriame.soapservice.AdminLogin;
import com.meriame.soapservice.Agent;
import com.meriame.soapservice.AgentSOAPDTO;

import Tools.Service;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;

import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
   private TextField username; 
   
   @FXML 
   private PasswordField password;
   
   @FXML 
   private Button saveAgent;
   
   
   
   
   @FXML
	private TableView<Agent> agentTable;
   
   @FXML
	private TableColumn<Agent, String> cin;

	@FXML
	private TableColumn<Agent, String> nom ;

	@FXML
	private TableColumn<Agent, String> prenom;
	
	@FXML
	private TableColumn<Agent, String> adresse;

	@FXML
	private TableColumn<Agent, String> telephone;
	
	@FXML
   private TableColumn<Agent, String> email;
	

	@FXML
	private TableColumn<Agent, String> Username;
	
	@FXML
   private TableColumn<Agent, String> Password;
	
	@FXML
   private MenuItem deleteUsers;
	
    private Service s;
	
	private ObservableList<Agent> agentList = FXCollections.observableArrayList();
    
	
	
	
	
	
public AgentController(Stage primaryStage) {
		super();
		this.primaryStage=primaryStage;
	}




@FXML
public void saveAgent(ActionEvent event ) {
	 
	try {
		
		Service s = new Service();
		AgentSOAPDTO agent = new AgentSOAPDTO();
		 String adminusername = new AdminLogin().getArg0();
		agent.setCin(Cin.getText());
		agent.setNom(Nom.getText());
		agent.setPrenom(Prenom.getText());
		agent.setAdresse(Adresse.getText());
		agent.setTelephone(Telephone.getText());
		agent.setEmail(Email.getText());
		agent.setUsername(username.getText());
		agent.setPassword(password.getText());
		if(s.getAdmindb().addAgent(agent, adminusername) !=null) {
			
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


@FXML
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
/*	
	@FXML
	public void back(ActionEvent event ) {
		 
		try {
			BorderPane root = new BorderPane();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/ChooseMain.fxml"));
			loader.setController(new AgentController(primaryStage));
			Parent parent = loader.load();
			
			Scene scene = new Scene(parent);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

}

	@FXML
	public void Logout(ActionEvent event ) {
		 
		try {
			BorderPane root = new BorderPane();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Login.fxml"));
			loader.setController(new AgentController(primaryStage));
			Parent parent = loader.load();
			
			Scene scene = new Scene(parent);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

}
	*/
	
	
	
/*	
@Override
@PostConstruct 
public void initialize(URL location, ResourceBundle resources) {
		
		s= new Service();
	
		agentTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		setColumnProperties();
		
		
		// Add all users into table
		loadAgentsDetails();
	}
	
	
	
	
	private void setColumnProperties(){
	
		
		cin.setCellValueFactory(new PropertyValueFactory<>("cin"));
		nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
		prenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
		adresse.setCellValueFactory(new PropertyValueFactory<>("adresse "));
		telephone.setCellValueFactory(new PropertyValueFactory<>("telephone"));
		email.setCellValueFactory(new PropertyValueFactory<>("email"));
		Username.setCellValueFactory(new PropertyValueFactory<>("username"));
		Password.setCellValueFactory(new PropertyValueFactory<>("password"));
	}
	
	private void loadAgentsDetails(){
		agentList.clear();
		s = new Service();
		agentList.addAll(s.getAdmindb().findAllAgent());	
		
		

		agentTable.setItems(agentList);
	}*/
}
