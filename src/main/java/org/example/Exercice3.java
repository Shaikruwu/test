package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class Exercice3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 400);
        BackgroundFill bgFillVert = new BackgroundFill(Color.GREEN, null, new Insets(40));
        BackgroundFill bgFillRouge = new BackgroundFill(Color.RED, new CornerRadii(25), new Insets(60));
        Background bg = new Background(bgFillVert,bgFillRouge);
        Image image = new Image("tournesol.png");
        BackgroundSize bgTaille = new BackgroundSize(0.5,0.5,true,true,false,false);
        BackgroundImage bgImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER, bgTaille);
        Background bg1 = new Background(bgImage);
        Background bg2 = new Background(bg.getFills(), bg1.getImages());
        BorderStrokeStyle styleBleu = new BorderStrokeStyle(StrokeType.CENTERED, StrokeLineJoin.MITER, StrokeLineCap.BUTT, 10 , 0 ,null);
        BorderStrokeStyle styleCyan = new BorderStrokeStyle(StrokeType.INSIDE, StrokeLineJoin.MITER, StrokeLineCap.BUTT, 10 , 0 ,null);
        BorderStroke bordureBleue = new BorderStroke(Color.BLUE, styleBleu, CornerRadii.EMPTY, new BorderWidths(30), new Insets(20));
        BorderStroke bordureCyan = new BorderStroke(Color.CYAN, styleCyan, new CornerRadii(15), new BorderWidths(15), new Insets(15));
        Border bordure = new Border(bordureBleue, bordureCyan);
        root.setBackground(bg2);
        root.setBorder(bordure);
        primaryStage.setTitle("Exercice 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(){
        launch();
    }
}
