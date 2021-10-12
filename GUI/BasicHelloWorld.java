import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class BasicHelloWorld extends Application
{
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        root.getChildren().add(new Button("Hello World"));
        root.getChildren().add(new Button("This"));
        root.getChildren().add(new Button("Is"));
        root.getChildren().add(new Button("Button"));
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
