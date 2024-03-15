package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		//Controls
		Label lb1=new Label("Enter First Number");
		TextField tf1=new TextField();
		
		Label lb2=new Label("Enter Second Number");
		TextField tf2=new TextField();
		
		Button addBtn=new Button("Sum");
		Button minusBtn=new Button("Difference");
		Button multiplyBtn=new Button("Product");
		Button divideBtn=new Button("Divide");
		
		Label result=new Label();
		
		//Layout
		GridPane gridPane=new GridPane();
		
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		gridPane.add(lb1, 0, 0);
		gridPane.add(tf1, 1, 0);
		
		gridPane.add(lb2, 0, 1);
		gridPane.add(tf2, 1, 1);
		
		
		gridPane.add(addBtn, 0, 2);
		gridPane.add(minusBtn, 1, 2);
		gridPane.add(multiplyBtn, 2, 2);
		gridPane.add(divideBtn, 3, 2);
		
		gridPane.add(result, 0, 3);
		
		addBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				int number1=Integer.parseInt(tf1.getText());
				int number2=Integer.parseInt(tf2.getText());
				int sum=number1+number2;
				result.setText(Integer.toString(sum));
			}
		});
		
		minusBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				int number1=Integer.parseInt(tf1.getText());
				int number2=Integer.parseInt(tf2.getText());
				int diff=number1-number2;
				result.setText(Integer.toString(diff));
			}
		});
		Scene sc=new Scene(gridPane);
		
		stage.setScene(sc);
		stage.setHeight(500);
		stage.setWidth(500);
		
		stage.show();
	}

}
