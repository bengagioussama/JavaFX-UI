package com.example.journeywiseguijaxafx;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button btnn;
    @FXML
    private Button offre_voyage;
    @FXML
    private Label label;

    @FXML
    private StackPane stp;

    Parent page1;



    @FXML
    protected void onHelloButtonClick() {
        btnn.setText("This is a test");


        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onVoyageButtonClick() {
        stp.getChildren().add(page1);
    }


}