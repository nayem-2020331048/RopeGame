package application;




import java.io.IOException;

import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class uservsuser {

	
	
	
	
	
		@FXML
		private Stage stage;
		@FXML
	    private Scene scene;
		@FXML
		private Parent root;
		@FXML
		Timeline timeline;
		@FXML
		Button userbutton;
		@FXML
		
		
		
		public void back(ActionEvent event)throws IOException
		{
			Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
			stage =(Stage)((Node)event.getSource()).getScene().getWindow();
			scene=new Scene(root);
			
			stage.setScene(scene);
			stage.show();
		}
	
		@FXML
		private Button Generate;
		@FXML
		int lp;
		@FXML
		private TextField textfield;
		@FXML
		private Label screen;
		@FXML
		private Label prompt;
		@FXML
		private ImageView win;
		@FXML
		private ImageView lose;
		
		@FXML
		private Button restart;
		@FXML
		private Button instructions;
		

		
		
		
		@FXML
	ImageView boys;
		@FXML
		int in;
		
	
		private double x;
		private double y;
		
		  //private static final int IMAGE_WIDTH = 406;  // Width of the image
	       // boys.setFitWidth(IMAGE_WIDTH);
	       		
		private double rx; 
		/*
	public void user1(ActionEvent e)  {
			
			
			try {
		
			if(boys.getLayoutX()<330)
				{
					instructions.setVisible(true);
					restart.setVisible(true);
					win.setVisible(true);
					
					  
					  
				}
				
				
			
			rx=boys.getLayoutX();
			rx-=4;
			boys.setLayoutX(rx);
			
			
			

		
			
			}
			
					catch (Exception ex) {
						
					}
			
		}
	
	*/
	public void key(KeyEvent event)  {
		
		if(event.getCode()==KeyCode.A) {
			
		
		try {
	
		if(boys.getLayoutX()<339)
			{
				instructions.setVisible(true);
				restart.setVisible(true);
				win.setVisible(true);
				USER1.setVisible(false);
				USER2.setVisible(false);
				  
				  
			}
			
			
		
		rx=boys.getLayoutX();
		rx-=10;
		boys.setLayoutX(rx);
		
		
		

	
		
		}
		
				catch (Exception ex) {
					
				}
		
	}
		else if(event.getCode()==KeyCode.P) {
			

			
			try {
			
			 rx=boys.getLayoutX();
			rx+=10;
			boys.setLayoutX(rx);
			
			
			if(boys.getLayoutX()>720)
			{
				instructions.setVisible(true);
				restart.setVisible(true);
				lose.setVisible(true);
				USER1.setVisible(false);
				USER2.setVisible(false);
				  
				  	
			}
			
			
			}
			
					catch (Exception ex) {
					
					}
			
			
			
			
		}
		
		
		
		
	}
	
	/*
	public void user2(ActionEvent e)  {
		
		
		try {
		
		 rx=boys.getLayoutX();
		rx+=4;
		boys.setLayoutX(rx);
		
		
		if(boys.getLayoutX()>717)
		{
			instructions.setVisible(true);
			restart.setVisible(true);
			lose.setVisible(true);
			
			  
			  	
		}
		
		
		}
		
				catch (Exception ex) {
					// TODO: handle exception
				}
		
	}
	
	*/


	
	

	
	   public void exit(ActionEvent e)
	   {
		   Platform.exit();
	   }
	
	   public void instructions(ActionEvent event) throws IOException
		{
			Parent root = FXMLLoader.load(getClass().getResource("instructions.fxml"));
			stage =(Stage)((Node)event.getSource()).getScene().getWindow();
			scene=new Scene(root);
			stage.setScene(scene);
			

			stage.show();
		}
	   public void uservsuserpage(ActionEvent event) throws IOException
	 		{
	 			Parent root = FXMLLoader.load(getClass().getResource("uservsuser.fxml"));
	 			stage =(Stage)((Node)event.getSource()).getScene().getWindow();
	 			scene=new Scene(root);
	 			stage.setScene(scene);
	 			

	 			stage.show();
	 		}
	   @FXML
	   private Button USER1;
	   @FXML
	   private Button USER2;
	   @FXML
	   private Button Startgame;
	   
	   
	   public void startgame(ActionEvent event) throws IOException
		{
			USER1.setVisible(true);
			USER2.setVisible(true);
			Startgame.setVisible(false);
		   
		   
		   
		   
		}
	   
	   
	   
	   
		}	
		
		
		
		
		
	
		        
		      

		      
		      
		    
		

		
		
		
		
		
	

	


