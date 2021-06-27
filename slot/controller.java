package slot;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.util.Random;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class controller {
    @FXML
    Label lab1;
    @FXML
    Label lab2;
    @FXML
    Label lab3;
    @FXML
    TextField cr;
    @FXML
    Label lab4;
    @FXML
    Label lab5;
    String col [] = {"Buffalo","2X","bar","7bar","doublebar","7","cherries","10X"};
    Random rnd = new Random();
    String col1;
    String col2;
    String col3 = col[rnd.nextInt(col.length)];
    int Credits;
    public void points(){
        if(col1.equals(col2)&&col1.equals(col3)){
            lab5.setText("you won jackpot");
        }
        else if(col1.equals("2X")&& col2.equals("2X") || col2.equals("2X")&& col3.equals("2X")){
            lab5.setText("You got two Cr");
            Credits+=2;
        }
        else if(col1.equalsIgnoreCase("buffalo")&& col2.equalsIgnoreCase("buffalo")|| col2.equalsIgnoreCase("buffalo")&& col3.equalsIgnoreCase("buffalo")){
            lab5.setText("You got hundred Cr");
            Credits+=100;
        }
        else if((col1.indexOf("bar")>=0)&& (col2.indexOf("bar")>=0)||(col2.indexOf("bar")>=0)&&(col3.indexOf("bar")>=0)){
            lab5.setText("You Bar'ed");
            Credits+=1;
        }
        else if(col1.indexOf("7")>=0&& (col2.indexOf("7")>=0)&& (col3.indexOf("7")>=0)){
            lab5.setText("JACkPOT!!!!");
        }
        else if(col1.equalsIgnoreCase("10x")|| col2.equalsIgnoreCase("10x")||col3.equalsIgnoreCase("10x")){
            lab5.setText("You got 10 Cr");
            Credits+=10;
        }
        else if(col1.equalsIgnoreCase("cherries")&& col2.equalsIgnoreCase("cherries")|| col2.equalsIgnoreCase("cherries")&&col3.equalsIgnoreCase("cherries")){
            lab5.setText("You got 5 Cr");
            Credits+=5;
        }
    }
    String c;
    public void getCr(){
        c = cr.getText();
        Credits  = Integer.parseInt(c);
    }
    
    public void rol(ActionEvent e)throws Exception {
        String cr3 = String.valueOf(Credits);
        Credits--;
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        if(Credits<0){
            stage.close();
        }
        lab1.setText(col1 = col[rnd.nextInt(col.length)]);
        lab2.setText(col2 = col[rnd.nextInt(col.length)]);
        lab3.setText(col3 = col[rnd.nextInt(col.length)]);
        lab4.setText(cr3);
        points();
    }

    
}
