package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SecondDemo extends Application {

	public static void main(String[] args) {
		launch(args);

	}
/*
 * Stage :Entire window
 * Layouts :
 * Scene :
 * Controls :
 * Evenets :
 */
	@Override
	public void start(Stage stage) throws Exception {
		//Controls
		Button btn1= new Button("First Button");
		Button btn2= new Button("Second Button");
		Button btn3= new Button("Third Button");
		Button btn4= new Button("Fourth Button");
		Button btn5= new Button("Fifth Button");
		
		//Layout
//		HBox root=new HBox();
		VBox root=new VBox();
		
		root.getChildren().addAll(btn1,btn2,btn3,btn4,btn5);
		
		//Scene
		Scene sc=new Scene(root);
		
		//Stage
		stage.setScene(sc);
		stage.setHeight(500);
		stage.setWidth(500);
		stage.setTitle("First Demo");
		
		stage.show();
		
		
	}

}
