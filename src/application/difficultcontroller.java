package application;



import java.io.IOException;

import javafx.animation.KeyFrame;
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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class difficultcontroller {

	
	
	
	
	
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
		Button cpubutton;
		@FXML
		
		public void switchToScene2(ActionEvent event)throws IOException
		{
			Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
			stage =(Stage)((Node)event.getSource()).getScene().getWindow();
			scene=new Scene(root);
			stage.setFullScreen(true);
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
		
	
	
		  //private static final int IMAGE_WIDTH = 406;  // Width of the image
	       // boys.setFitWidth(IMAGE_WIDTH);
	       		
	
		public void cpu(ActionEvent event) throws IOException {

			Media media = new Media(getClass().getResource("song.mp3").toExternalForm());
			 MediaPlayer l= new MediaPlayer(media);
			 l.play();
			 
			 int min = 0;
		      int max = 100;
		     
		      lp = (int)Math.floor(Math.random() * (max - min + 1) + min);
		     
		      screen.setText("ENTER : "+lp);
				textfield.setText(null);

		     
			
			
	        if (timeline != null && timeline.getStatus() == Timeline.Status.RUNNING) {
	            // The // animation is already running, no need to start again
	            return;
	        }
			
	        
	        timeline = new Timeline(new KeyFrame(Duration.millis(1300), e -> {
	        	
				double rx=boys.getLayoutX();

				if(boys.getLayoutX()>695)
				{
					instructions.setVisible(true);
					restart.setVisible(true);
					lose.setVisible(true);
					
					cpubutton.setVisible(false);
					screen.setVisible(false);
					textfield.setVisible(false);
					userbutton.setVisible(false);  
					
					  	timeline.stop();
				}
				else if(boys.getLayoutX()<361)
				{
					instructions.setVisible(true);
					restart.setVisible(true);
					win.setVisible(true);
					
					cpubutton.setVisible(false);
					screen.setVisible(false);
					textfield.setVisible(false);
					userbutton.setVisible(false);
					  
					  	timeline.stop();
				}
	        	rx+=4;
	        	boys.setLayoutX(rx);
	        	
	        	
	        })
	        		);
	        timeline.setCycleCount(Timeline.INDEFINITE);
	        		        	
			timeline.play();
		
		
			
		}
		
		
	public void user(ActionEvent e)  {
			
			
			try {
			in=Integer.parseInt(textfield.getText());
			if(lp==in)
			{
			double rx=boys.getLayoutX();
			rx-=4;
			boys.setLayoutX(rx);
			}
			
			lp = (int)Math.floor(Math.random() * (100 - 0 + 1) +0);
		      screen.setText("ENTER : "+lp);

			textfield.setText(null);
			
			}
			
					catch (Exception ex) {
						// TODO: handle exception
					}
			
		}
	
	
	   public void exit(ActionEvent e)
	   {
		   Platform.exit();
	   }
	
	   public void difficultmode(ActionEvent event)throws IOException
		{
			Parent root = FXMLLoader.load(getClass().getResource("difficult.fxml"));
			
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
		
		}	
		
		
		
		
		
	
		        
		      

		      
		      
		    
		

		
		
		
		
		
	

	

