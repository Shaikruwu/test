package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Exercice4Pane extends Application {
    @Override
    public void start(Stage primaryStage)  {
        Button btn1 = new Button("Bouton 1");
        Button btn2 = new Button("Bouton 2");
        Button btn3 = new Button("Peut changer de taille");
        Button btn4 = new Button("lalalalalalal");
        Button btn5 = new Button("Ne peut pas changer de taille");
        TilePane pane = new TilePane(btn1, btn2, btn3, btn4, btn5);
        Scene scene1 = new Scene(pane, 1000, 100);

        pane.setMaxSize(1000,50);
        pane.setAlignment(Pos.CENTER);

        for (Node node : pane.getChildren()){
            if(node instanceof Button button){
                button.setMaxWidth(300);
            }
        }

        primaryStage.setTitle("Exercice 4");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(){
        launch();
    }
}
