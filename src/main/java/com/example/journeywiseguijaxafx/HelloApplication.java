package com.example.journeywiseguijaxafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {
    double x,y;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.initStyle(StageStyle.UNDECORATED);
        root.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getScreenX();
            y = mouseEvent.getScreenY();
        });

        root.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getX() - x);
            stage.setY(mouseEvent.getY() - y);
        });
        Scene scene = new Scene(fxmlLoader.load(), 1000, 750);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}