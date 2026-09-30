package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class Exercice4 extends Application {
    @Override
    public void start(Stage primaryStage)  {
        Button btn1 = new Button("Bouton 1");
        Button btn2 = new Button("Bouton 2");
        Button btn3 = new Button("Peut changer de taille");
        Button btn4 = new Button("lalalalalalal");
        Button btn5 = new Button("Ne peut pas changer de taille");
        Button btn6 = new Button("4");
        Button btn7 = new Button("gros bouton");
        HBox hbox = new HBox(10,btn1, btn2, btn3, btn4, btn5, btn6, btn7);
        Scene scene1 = new Scene(hbox, 1000, 150);
        BorderStrokeStyle styleBleu = new BorderStrokeStyle(StrokeType.OUTSIDE, null, null, 10, 0, null);
        BorderStroke bordureBleu = new BorderStroke(Color.BLUE, styleBleu, null, new BorderWidths(15), new Insets(20));
        Border bordure = new Border(bordureBleu);

        hbox.setMaxSize(1000,50);
        btn7.setPrefHeight(50);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.setPadding(new Insets(30));
        hbox.setBorder(bordure);


        primaryStage.setTitle("Exercice 4");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(){
        launch();
    }
}
