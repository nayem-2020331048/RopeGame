package application;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SampleController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchToScene1(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	public void instructions(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("instructions.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		

		stage.show();
	}
	public void switchToScene2(ActionEvent event)throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);

		stage.setScene(scene);
		

		stage.show();
	}
	public void switchToScene3(ActionEvent event)throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("Easy.fxml"));
		
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);

		stage.setScene(scene);
		

		stage.show();
	}
	public void switchToScene4(ActionEvent event)throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("difficult.fxml"));
		
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);

		stage.setScene(scene);
		

		stage.show();
	}
	
	
	public void uservsuser(ActionEvent event)throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("uservsuser.fxml"));
		
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);

		stage.setScene(scene);
		

		stage.show();
	}
	
	
	 public void exit(ActionEvent e)
	   {
		   Platform.exit();
	   }
	
}
