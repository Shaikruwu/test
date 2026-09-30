package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Exercice5 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception{
        TextField champ = new TextField("ceci est un champ de texte");
        TextArea grandChamp = new TextArea("ceci est un champ de texte\nÀ deux lignes");
        Button quitBouton = new Button("Quitter");
        Button effaceBouton = new Button("Effacer");
        HBox hbox = new HBox(10, quitBouton, effaceBouton);
        FlowPane root = new FlowPane(champ, grandChamp, hbox);
        BorderStrokeStyle styleBleu = new BorderStrokeStyle(StrokeType.OUTSIDE, null, null, 10, 0, null);
        BorderStroke bordureBleu = new BorderStroke(Color.BLUE, styleBleu, null, new BorderWidths(5));
        Border bordure = new Border(bordureBleu);
        Scene scene = new Scene(root);
        Image image = new Image("tournesol.png");
        ImageView imageview = new ImageView(image);

        imageview.setFitHeight(16);
        imageview.setFitWidth(16);

        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10));
        root.setOrientation(Orientation.VERTICAL);
        root.setAlignment(Pos.CENTER);

        champ.setEditable(false);
        champ.setBorder(bordure);

        grandChamp.setWrapText(false);
        grandChamp.setTooltip(new Tooltip("Écrit ici"));

        HBox.setHgrow(quitBouton, Priority.ALWAYS);
        HBox.setHgrow(effaceBouton, Priority.ALWAYS);

        quitBouton.setMaxWidth(Double.MAX_VALUE);
        quitBouton.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        quitBouton.setTextFill(Color.BLUE);
        quitBouton.setGraphic(imageview);

        effaceBouton.setMaxWidth(Double.MAX_VALUE);
        effaceBouton.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        effaceBouton.setTextFill(Color.BLUE);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();

        primaryStage.setTitle("Exercice 5");

        primaryStage.show();

    }

    public static void main(){
        launch();
    }
}
