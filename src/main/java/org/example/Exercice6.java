package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;

public class Exercice6 extends Application {
    public void start(Stage primaryStage) throws Exception{
        Text text = new Text("Interface Graphique Java");
        ToggleGroup listradio = new ToggleGroup();
        RadioButton radioR = new RadioButton("Rouge");
        RadioButton radioB = new RadioButton("Bleu");
        RadioButton radioV = new RadioButton("Green");
        CheckBox checkGras = new CheckBox("Gras");
        CheckBox checkItalique = new CheckBox("Italique");
        Button majBouton = new Button("Majuscule");
        Button minBouton = new Button("Minuscule");
        radioR.setToggleGroup(listradio);
        radioB.setToggleGroup(listradio);
        radioV.setToggleGroup(listradio);
        checkGras.setSelected(true);

        text.setFont(Font.font("Serif", FontWeight.BOLD, 30));
        radioR.setFont(Font.font("Serif",  FontWeight.BOLD,20));
        radioB.setFont(Font.font("Serif",  FontWeight.BOLD,20));
        radioV.setFont(Font.font("Serif",  FontWeight.BOLD,20));
        checkGras.setFont(Font.font("Serif",  FontWeight.BOLD,20));
        checkItalique.setFont(Font.font("Serif",  FontWeight.BOLD,20));
        majBouton.setFont(Font.font("Serif",  FontWeight.BOLD,20));
        minBouton.setFont(Font.font("Serif",  FontWeight.BOLD,20));

        VBox vboxRadio = new VBox(10, radioR, radioB, radioV);
        VBox vboxCheck = new VBox(10, checkGras, checkItalique);
        HBox hboxCheck = new HBox(10,vboxRadio, vboxCheck);
        HBox hboxButton = new HBox(10,majBouton, minBouton);
        VBox root = new VBox(30, text, hboxCheck, hboxButton);
        hboxCheck.setAlignment(Pos.CENTER);
        hboxButton.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root);

        root.setPadding(new Insets(30));


        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercice 6");
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();

    }

    public static void main(){
        launch();
    }
}
