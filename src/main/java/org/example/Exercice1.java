package org.example;

import javafx.application.Application;
import javafx.beans.binding.NumberBinding;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Exercice1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Long texte blablablablabla");
        Button button = new Button("Quitter");
        Button btnOk = new Button("Ok");
        Button btnAnnuler = new Button("Annuler");
        Group root = new Group(label, button);
        Scene scene = new Scene(root, 320, 200);


        label.relocate(20,30);
        button.relocate(30,60);
        btnOk.relocate(10,150);
        button.setRotate(45);
        root.setTranslateX(100);

        NumberBinding layX = btnOk.layoutXProperty().add(btnOk.widthProperty().add(10));
        btnAnnuler.layoutXProperty().bind(layX);
        btnAnnuler.layoutYProperty().bind(btnOk.layoutYProperty());
        root.getChildren().addAll(btnOk,btnAnnuler);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercice2");
        primaryStage.show();
    }

    public static void main(){
        launch();
    }
}
