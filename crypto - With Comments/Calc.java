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
import java.math.*;

public class Calc extends Application
{
    // Main stage
    Stage primaryStage;
    
    // Arrays for different graphics cards hashrates
    // 1050ti, 1060, 1070, 1080, 1080ti
    double[] ethhash =     {13.9, 22.5, 30, 23.3, 35};
    double[] cryptonight = {300, 430, 580, 580, 830};
    double[] neoscrypt =   {420, 620, 1000, 1060, 1400};
    
    // Rounds double to set number of places (dont need to know how really)
    private static double round(double value, int places) {
        // tries to do something if it fails return 0
        try{
            BigDecimal bd = new BigDecimal(Double.toString(value));
            bd = bd.setScale(places, RoundingMode.HALF_UP);
            return bd.doubleValue();
        }
        catch(Exception e){
            return 0;
        }
    
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        // Vertical box for the main root
        VBox root = new VBox(8);
        // Centers
        root.setAlignment(Pos.CENTER);
        
        // Horizontal box to hold buttons within the main box
        HBox buttons = new HBox(8);
        buttons.setAlignment(Pos.CENTER);

        // Grid to organise everything easily
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        
        // Horizontal gap
        grid.setHgap(10);
        // Vertical gap 
        grid.setVgap(10);
        // Padding
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        // Text
        Text gfxCard = new Text ("Graphics card name");
        Text s1050ti = new Text ("1050ti");
        Text s1060 = new Text ("1060");
        Text s1070 = new Text ("1070");
        Text s1080 = new Text ("1080");
        Text s1080ti = new Text ("1080ti");

        // Adds to grid first him is second and Vertical is horizontal (maybe idk)
        grid.add(gfxCard, 0, 0);
        grid.add(s1050ti, 0, 1);
        grid.add(s1060, 0, 2);
        grid.add(s1070, 0, 3);
        grid.add(s1080, 0, 4);
        grid.add(s1080ti, 0, 5);
        
        
        Text gfxCardCost = new Text ("Graphics card cost");
        // Text field for user input
        TextField t1050ti = new TextField ();
        TextField t1060 = new TextField ();
        TextField t1070 = new TextField ();
        TextField t1080 = new TextField ();
        TextField t1080ti = new TextField ();
        
        grid.add(gfxCardCost, 1, 0);
        grid.add(t1050ti, 1, 1);
        grid.add(t1060, 1, 2);
        grid.add(t1070, 1, 3);
        grid.add(t1080, 1, 4);
        grid.add(t1080ti, 1, 5);
        
        
        Text gfxCardEthhash = new Text ("ethhash (Mh/s)");
        Text e1050ti = new Text ("0");
        Text e1060 = new Text ("0");
        Text e1070 = new Text ("0");
        Text e1080 = new Text ("0");
        Text e1080ti = new Text ("0");
        
        grid.add(gfxCardEthhash, 2, 0);
        grid.add(e1050ti, 2, 1);
        grid.add(e1060, 2, 2);
        grid.add(e1070, 2, 3);
        grid.add(e1080, 2, 4);
        grid.add(e1080ti, 2, 5);
        
        
        Text gfxCardCryptonight = new Text ("cryptonight (h/s)");
        Text c1050ti = new Text ("0");
        Text c1060 = new Text ("0");
        Text c1070 = new Text ("0");
        Text c1080 = new Text ("0");
        Text c1080ti = new Text ("0");
        
        grid.add(gfxCardCryptonight, 3, 0);
        grid.add(c1050ti, 3, 1);
        grid.add(c1060, 3, 2);
        grid.add(c1070, 3, 3);
        grid.add(c1080, 3, 4);
        grid.add(c1080ti, 3, 5);
        
        
        Text gfxCardNeoscrypt = new Text ("neoscrypt (kh/s)");
        Text n1050ti = new Text ("0");
        Text n1060 = new Text ("0");
        Text n1070 = new Text ("0");
        Text n1080 = new Text ("0");
        Text n1080ti = new Text ("0");
        
        grid.add(gfxCardNeoscrypt, 4, 0);
        grid.add(n1050ti, 4, 1);
        grid.add(n1060, 4, 2);
        grid.add(n1070, 4, 3);
        grid.add(n1080, 4, 4);
        grid.add(n1080ti, 4, 5);
        
        // Buttons
        Button submit = new Button ("Submit");
        
        Button reset = new Button ("Reset");
        
        // Ads buttons to buttons HBox
        buttons.getChildren().addAll(submit, reset);
        // do not forget to add this
        this.primaryStage = primaryStage;
        // Sets title of window
        primaryStage.setTitle("Crypto currency");
        
        root.getChildren().addAll(grid, buttons);
        // set size of scene
        primaryStage.setScene(new Scene(root, 800, 300));
        primaryStage.show();
        
        // Reset Button
        reset.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                // clears text
                t1050ti.clear();
                t1060.clear();
                t1070.clear();
                t1080.clear();
                t1080ti.clear();
                
                e1050ti.setText("0");
                c1050ti.setText("0");
                n1050ti.setText("0");
                
                e1060.setText("0");
                c1060.setText("0");
                n1060.setText("0");
                
                e1070.setText("0");
                c1070.setText("0");
                n1070.setText("0");
                
                e1080.setText("0");
                c1080.setText("0");
                n1080.setText("0");
                
                e1080ti.setText("0");
                c1080ti.setText("0");
                n1080ti.setText("0");
            }
        });
        
        submit.setOnAction(new EventHandler<ActionEvent>() {
            // System.out.println("\nUsing " + name[i] + " to mine " + coin + " will earn you " + (cost[i] / hash[i]) + " per hash");
            // Tries to calculte effeciency and rounds to three decimals if it fails it just outputs 0
            public void handle(ActionEvent event) {
                if (t1050ti.getText() != null) {
                    try{
                        Double c = Double.parseDouble(t1050ti.getText());
                        e1050ti.setText(Double.toString(round(c/ethhash[0], 3)));
                        c1050ti.setText(Double.toString(round(c/cryptonight[0], 3)));
                        n1050ti.setText(Double.toString(round(c/neoscrypt[0], 3)));
                    }
                    catch(Exception e){
                        e1050ti.setText("0");
                        c1050ti.setText("0");
                        n1050ti.setText("0");
                    }
                }
                
                if (t1060.getText() != null) {
                    try{
                        Double c = Double.parseDouble(t1060.getText());
                        e1060.setText(Double.toString(round(c/ethhash[1], 3)));
                        c1060.setText(Double.toString(round(c/cryptonight[1], 3)));
                        n1060.setText(Double.toString(round(c/neoscrypt[1], 3)));
                    }
                    catch(Exception e){
                        e1060.setText("0");
                        c1060.setText("0");
                        n1060.setText("0");
                    }
                }
                
                if (t1070.getText() != null) {
                    try{
                        Double c = Double.parseDouble(t1070.getText());
                        e1070.setText(Double.toString(round(c/ethhash[2], 3)));
                        c1070.setText(Double.toString(round(c/cryptonight[2], 3)));
                        n1070.setText(Double.toString(round(c/neoscrypt[2], 3)));
                    }
                    catch(Exception e){
                        e1070.setText("0");
                        c1070.setText("0");
                        n1070.setText("0");
                    }
                }
                
                if (t1080.getText() != null) {
                    try{
                        Double c = Double.parseDouble(t1080.getText());
                        e1080.setText(Double.toString(round(c/ethhash[3], 3)));
                        c1080.setText(Double.toString(round(c/cryptonight[3], 3)));
                        n1080.setText(Double.toString(round(c/neoscrypt[3], 3)));
                    }
                    catch(Exception e){
                        e1080.setText("0");
                        c1080.setText("0");
                        n1080.setText("0");
                    }
                }
                
                if (t1080ti.getText() != null) {
                    try{
                        Double c = Double.parseDouble(t1080ti.getText());
                        e1080ti.setText(Double.toString(round(c/ethhash[4], 3)));
                        c1080ti.setText(Double.toString(round(c/cryptonight[4], 3)));
                        n1080ti.setText(Double.toString(round(c/neoscrypt[4], 3)));
                    }
                    catch(Exception e){
                        e1080ti.setText("0");
                        c1080ti.setText("0");
                        n1080ti.setText("0");
                    }
                }
            }
        });

    }
    
    public static void main(String[] args) {
        launch(args);
    }
}