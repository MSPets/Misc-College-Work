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

public class GridHelloWorld extends Application
{
    Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        Button Button1 = new Button ("1");
        Button Button2 = new Button ("2");
        Button Button3 = new Button ("3");
        Button Button4 = new Button ("4");
        Button Button5 = new Button ("5");
        Button Button6 = new Button ("6");
        Button Button7 = new Button ("7");
        Button Button8 = new Button ("8");
        Button Button9 = new Button ("9");
        
        VBox root = new VBox(8);
        root.setAlignment(Pos.CENTER);
        
        HBox top = new HBox(8);
        top.setAlignment(Pos.CENTER);
        
        top.getChildren().addAll(Button1, Button2, Button3);
        
        HBox middle = new HBox(8);
        middle.setAlignment(Pos.CENTER);
        middle.getChildren().addAll(Button4, Button5, Button6);
        
        HBox bottom = new HBox(8);
        bottom.setAlignment(Pos.CENTER);
        bottom.getChildren().addAll(Button7, Button8, Button9);
        
        this.primaryStage = primaryStage;
        
        primaryStage.setTitle("Click Me");
        
        root.getChildren().addAll(top, middle, bottom);
        
        boolean click1= false;
        
        Button1.addEventHandler(MouseEvent.MOUSE_CLICKED,
        new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent e) {
                
                 Button1.setText("Not 1");
                 click1 = true;
                if (click1 == true){
                    Button1.setText("1");
                    click1 = false;
                }
                else{
                    Button1.setText("may or may not be 1");
                    click1 = false;
                }
            }
        });
        
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
