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

public class AdvancedHelloWorld extends Application
{
    Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox root = new VBox(8);
        root.setAlignment(Pos.CENTER);
        
        HBox buttons = new HBox(8);
        buttons.setAlignment(Pos.CENTER);
        
        Button Button1 = new Button ("1");
        
        Button Button2 = new Button ("2");
        
        Button Button3 = new Button ("3");
       
        Button Button4 = new Button ("4");
        
        Button Button5 = new Button ("5");
        
        Button Button6 = new Button ("6");
        
        buttons.getChildren().addAll(Button1, Button2, Button3);
        
        this.primaryStage= primaryStage;
        
        primaryStage.setTitle("Click Me");
        
        root.getChildren().addAll(buttons, Button4, Button5, Button6);
        
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
