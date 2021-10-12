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

    GraphicsContext gc;
    ClickData clickData;
    int squareSize;
    int paintSize;
    int paintOffset;
    Stage primaryStage;
    //Color colours[] = {Color.RED};

    @Override
    public void start(Stage primaryStage) throws Exception {
        squareSize = 16;
        paintSize = 16;
        paintOffset = paintSize / 4;
        
        int x = 20, y = 30;
        clickData = new ClickData(x, y);

        VBox root = new VBox(8);

        HBox buttons = new HBox(5);
        HBox cButtons = new HBox(5);
        HBox sizeButton = new HBox(5);
        
        buttons.setAlignment(Pos.CENTER);
        cButtons.setAlignment(Pos.CENTER);
        sizeButton.setAlignment(Pos.CENTER);

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(new clearButtonHandler());
        
        Button fillButton = new Button("Fill");
        fillButton.setOnAction(new fillButtonHandler());
        
        Button closeButton = new Button("Close");
        closeButton.setOnAction(new closeButtonHandler());
        
        buttons.getChildren().addAll(clearButton, fillButton, closeButton);
        
        Button sizeButtonPossitive = new Button("Increase size");
        sizeButtonPossitive.setOnAction(new sizeButtonPossitiveHandler());
        
        Button sizeButtonNegative = new Button("Decrease size");
        sizeButtonNegative.setOnAction(new sizeButtonNegativeHandler());
        
        sizeButton.getChildren().addAll(sizeButtonPossitive, sizeButtonNegative);
        
        Button red = new Button("Red");
        red.setOnAction(new redHandler());
        
        Button pink = new Button("Pink");
        pink.setOnAction(new pinkHandler());
        
        Button blue = new Button("Blue");
        blue.setOnAction(new blueHandler());
        
        cButtons.getChildren().addAll(red, pink, blue);

        Canvas canvas = new Canvas(x * squareSize, y * squareSize);
        
        gc = canvas.getGraphicsContext2D();
        
        canvas.addEventHandler(MouseEvent.MOUSE_CLICKED, new mouseClickHandler());
        canvas.addEventHandler(MouseEvent.MOUSE_DRAGGED, new mouseClickHandler());

        this.primaryStage = primaryStage;
        primaryStage.setTitle("Click me");
        root.getChildren().addAll(canvas,cButtons, buttons, sizeButton);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

        private class redHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            gc.setFill(Color.RED);
        }
    }
    
        private class pinkHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            gc.setFill(Color.PINK);
        }
    }
    
        private class blueHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            gc.setFill(Color.BLUE);
        }
    }
    
        private class fillButtonHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            gc.fillRect(0, 0, clickData.getX() * squareSize, clickData.getY() * squareSize);
        }
    }
    
    private class clearButtonHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            clickData.clear();
            gc.setFill(Color.WHITE);
            gc.fillRect(0, 0, clickData.getX() * squareSize, clickData.getY() * squareSize);
        }
    }

    private class closeButtonHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            primaryStage.close();
        }
    }
    
    private class sizeButtonPossitiveHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
                paintSize += 8;
                paintOffset = paintSize / 4;
        }
    }
    
        private class sizeButtonNegativeHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            if (paintSize > 16)
            {
                paintSize -= 8;
                paintOffset = paintSize / 4;
            }
        }
    }

    private class mouseClickHandler implements EventHandler<MouseEvent> {
        public void handle(MouseEvent e) {
            double x = e.getX(), y = e.getY();
            int cx = (int)x / squareSize, cy = (int)y / squareSize;

            System.out.println("Click (" + x + ", " + y + ")");

            clickData.setCell(cx, cy, clickData.getCell(cx, cy) + 1);

            //gc.setFill(colours[clickData.getCell(cx, cy) % colours.length]);
            gc.fillRect((cx * squareSize) - paintOffset, (cy * squareSize) - paintOffset, paintSize, paintSize);
        }
    }

    private class ClickData {
        int[][] grid;

        public ClickData(int x, int y) {
            grid = new int[y][x];
        }

        public int getX() {
            return grid[0].length;
        }

        public int getY() {
            return grid.length;
        }

        public int getCell(int x, int y) {
                return grid[y][x];
        }

        public void setCell(int x, int y, int v) {
            grid[y][x] = v;
        }

        public void clear() {
            for(int y = 0; y < getY(); y++) {
                for(int x = 0; x < getX(); x++) {
                    setCell(x, y, 0);
                }
            }
        }
    }
}