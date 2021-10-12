import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.geometry.Pos;
import javafx.geometry.Insets;

import javafx.scene.Scene;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

import javafx.scene.paint.Color;

import javafx.scene.text.*;

import javafx.stage.Stage;

public class test extends Application
{
    Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        // root box
        VBox root = new VBox(8);
        
        // makes root centered
        root.setAlignment(Pos.CENTER);
        
        // hbox to hold buttons
        HBox buttons = new HBox(8);
        buttons.setAlignment(Pos.CENTER);
        
        // new grid
        GridPane grid = new GridPane();        
        
        // new text
        Text gfxCard = new Text ("Graphics card name");
        
        // add to grid row and column 
        grid.add(gfxCard, 0, 0);
        
        // allow text input
        TextField t1050ti = new TextField ();
        
        // add to grid again
        grid.add(t1050ti, 1, 0);       
        
        // button 
        Button reset = new Button ("Reset");
        
        // holds all the buttons
        buttons.getChildren().addAll(reset);
        
        // DONTT FORGET THIS.PRIMARYSTAGE 
        this.primaryStage = primaryStage;
        
        // add title
        primaryStage.setTitle("Crypto currency");
        
        // add to root box
        root.getChildren().addAll(grid, buttons);
        
        // add to scene
        primaryStage.setScene(new Scene(root, 800, 300));
        primaryStage.show();
        
        reset.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                // do things on click
            }
        });

    }
    
    public static void main(String[] args) {
        launch(args);
    }
}