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
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class TextFieldExperiments extends Application  {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        boolean correctCoin = false;
        boolean correctCost = false;
        String[] name = {"1060", "1050ti", "1070", "1080", "1080ti"};
        
        primaryStage.setTitle("HBox Experiment 1");

        Text tcurrency = new Text();
        tcurrency.setText("What cyptocoin would you like?\nethhash, cyrptonight or neoscript");
        TextField currency = new TextField();
        
        Text t1060 = new Text();
        t1060.setText("1060 cost");
        TextField g1060 = new TextField();
        
        Text t1050ti = new Text();
        t1050ti.setText("1050ti cost");
        TextField g1050ti = new TextField();
        
        Text t1070 = new Text();
        t1070.setText("1070 cost");
        TextField g1070 = new TextField();
        
        Text t1080 = new Text();
        t1080.setText("1080 cost");
        TextField g1080 = new TextField();
        
        Text t1080ti = new Text();
        t1080ti.setText("1080ti cost");
        TextField g1080ti = new TextField();

        Button button = new Button("Click to get results");

        Text result1060 = new Text();
        Text result1050ti = new Text();
        Text result1070 = new Text();
        Text result1080 = new Text();
        Text result1080ti = new Text();
        
        button.setOnAction(action -> {
            double[] cost = new double[name.length];
            try{
                cost [0] =  Double.parseDouble(g1060.getText());
                cost [1] =  Double.parseDouble(g1050ti.getText());
                cost [2] =  Double.parseDouble(g1070.getText());
                cost [3] =  Double.parseDouble(g1080.getText());
                cost [4] =  Double.parseDouble(g1080ti.getText());
                double[] hash = new double [name.length];
                if (currency.getText().equals("ethhash"))
                {
                    hash[0] = 22.5;
                    hash[1] = 13.9;
                    hash[2] = 23.3;
                    hash[3] = 23.3;
                    hash[4] = 35;
                }
                else if (currency.getText().equals("cryptonight"))
                {
                    hash[0] = 430;
                    hash[1] = 300;
                    hash[2] = 580;
                    hash[3] = 23.3;
                    hash[4] = 830;
                }
                else if (currency.getText().equals("neoscrypt"))
                {
                    hash[0] = 500;
                    hash[1] = 420;
                    hash[2] = 1060;
                    hash[3] = 23.3;
                    hash[4] = 1400;
                }
                else
                {    
                    return;
                }
                
                result1060.setText("using 1060 to mine " + currency.getText() + " " + (cost[0]/hash[0]));
                result1050ti.setText("using 1050TI to mine " + currency.getText() + " " + (cost[1]/hash[1]));
                result1070.setText("using 1070 to mine " + currency.getText() + " " + (cost[2]/hash[2]));
                result1080.setText("using 1080 to mine " + currency.getText() + " " + (cost[3]/hash[3]));
                result1080ti.setText("using 1080TI to mine " + currency.getText() + " " +  (cost[4]/hash[4]));
                
            }catch (Exception e){
                System.out.println("cost invalid");
            }
            
            
        });
        
        VBox back = new VBox();
        back.setAlignment(Pos.CENTER);
        
        VBox vBoxOne = new VBox();
        vBoxOne.setAlignment(Pos.CENTER);
        
        VBox vBoxTwo = new VBox();
        vBoxTwo.setAlignment(Pos.CENTER);
        
        VBox cur = new VBox(tcurrency, currency);
        cur.setAlignment(Pos.CENTER);
        
        VBox s1060 = new VBox(t1060, g1060);
        s1060.setAlignment(Pos.CENTER);
        VBox s1050ti = new VBox(t1050ti, g1050ti);
        s1050ti.setAlignment(Pos.CENTER);
        VBox s1070 = new VBox(t1070, g1070);
        s1070.setAlignment(Pos.CENTER);
        VBox s1080 = new VBox(t1080, g1080);
        s1080.setAlignment(Pos.CENTER);
        VBox s1080ti = new VBox(t1080ti, g1080ti);
        s1080ti.setAlignment(Pos.CENTER);
        
        vBoxOne.getChildren().addAll(s1060, s1050ti, s1070, s1080, s1080ti);
        
        VBox r1060 = new VBox(result1060);
        r1060.setAlignment(Pos.CENTER);
        VBox r1050ti = new VBox(result1050ti);
        r1050ti.setAlignment(Pos.CENTER);
        VBox r1070 = new VBox(result1070);
        r1070.setAlignment(Pos.CENTER);
        VBox r1080 = new VBox(result1080);
        r1080.setAlignment(Pos.CENTER);
        VBox r1080ti = new VBox(result1080ti);
        r1080ti.setAlignment(Pos.CENTER);
        
        vBoxTwo.getChildren().addAll(r1060, r1050ti, r1070, r1080, r1080ti);
        
        back.getChildren().addAll(cur, vBoxOne, vBoxTwo, button);
        Scene scene = new Scene(back);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}