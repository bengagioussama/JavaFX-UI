package com.example.journeywiseguijaxafx;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Page2Controller {

    @FXML
    private AnchorPane ap;

    @FXML
    private BorderPane bord;

    @FXML
    private StackPane stp;

    Alert a = new Alert(Alert.AlertType.NONE);



    @FXML
    protected void page1() {
        loadPage("page1");

    }
    @FXML
    protected void page2() {
        loadPage("page2");
    }
    @FXML
    protected void page3() {
        loadPage("page3");
    }
    @FXML
    protected void page4() {
        loadPage("page4");
    }



    @FXML
    protected void loadPage(String page)  {

        try {

            System.out.println("went into loadPage");

            Parent root = FXMLLoader.load(getClass().getResource(page+".fxml"));
            bord.setCenter(root);

            System.out.println("FINISHED THE TASKS");

        }
        catch (Exception e) {
            System.out.println(e);
        }


    }


}
