import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Click extends Application {


    
    Stage primaryStage;


    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox(8);
        root.setAlignment(Pos.CENTER);

        HBox buttons = new HBox(8);
        buttons.setAlignment(Pos.CENTER);

        Button aButton = new Button("A");
    

        Button bButton = new Button("B");
        
        Button cButton = new Button("C");
        
        Button dButton = new Button("D");
        
        Button eButton = new Button("E");
        
        Button fButton = new Button("F");
     

        buttons.getChildren().addAll(aButton, bButton,cButton);
        
        
        //Creating a GridPane container


       

        this.primaryStage = primaryStage;
        primaryStage.setTitle("Click me");

        root.getChildren().addAll(buttons,dButton,eButton,fButton);
        
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}