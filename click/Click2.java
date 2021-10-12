import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Click2 extends Application {

    Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        VBox root = new VBox(8);

        HBox buttons = new HBox(5);
        buttons.setAlignment(Pos.CENTER);

        Button helloButton = new Button("hello");
        helloButton.setOnAction(new helloButtonHandler());
        
        Button helpButton = new Button("help");
        helpButton.setOnAction(e -> helpProgram());
        
        Button closeButton = new Button("close");
        closeButton.setOnAction(e -> closeButtonHandler());

        buttons.getChildren().addAll(helloButton,helpButton, closeButton);
        
        root.getChildren().addAll(buttons);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        
    }
    
    public void helpProgram() {
        System.out.println("please help");
    }
    
    public void closeButtonHandler() {
        primaryStage.close();
    }
    
    public class helloButtonHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
          System.out.println("hello");
        }
    }
    
    public static void main(String[] args) throws Exception {
        launch(args);
    }

}