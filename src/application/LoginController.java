package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LoginController {
	
	@FXML
    private Label lblLogin;
	
	 private Stage primaryStage;   
	    
public LoginController(Stage primaryStage) {
		super();
		// TODO Auto-generated constructor stub
		this.primaryStage=primaryStage;
		
	}

public void login(ActionEvent event ) {
	 
	try {
System.out.println("sys works");
		BorderPane root = new BorderPane();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/ChooseMain.fxml"));
		loader.setController(new MainController(primaryStage));
		Parent parent = loader.load();
		
		Scene scene = new Scene(parent);
		primaryStage.setScene(scene);
		primaryStage.show();
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
}
