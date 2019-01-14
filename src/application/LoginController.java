package application;



import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.meriame.soapservice.AdminLogin;
import com.meriame.soapservice.AgentSOAPDTO;

import Tools.Service;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LoginController {
	
	@FXML
    private Label lblLogin;
	
	 private Stage primaryStage; 
	 
	 @FXML 
	   private JFXTextField username; 
	   
	@FXML 
	private JFXPasswordField password;
	    
public LoginController(Stage primaryStage) {
		super();
		// TODO Auto-generated constructor stub
		this.primaryStage=primaryStage;
		
	}

public void login(ActionEvent event ) {
	 
	try {
		
		Service s = new Service();

		
		if(s.getAdmindb().adminLogin(username.getText(), password.getText())==true) {
        System.out.println("sys works");
		BorderPane root = new BorderPane();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/ChooseMain.fxml"));
		loader.setController(new MainController(primaryStage));
		Parent parent = loader.load();
		
		Scene scene = new Scene(parent);
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		else {
			Alert a= new Alert(AlertType.ERROR);
			a.setTitle("Erreur");
			a.setContentText("username or password unknown!!");
			a.showAndWait();
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
}
