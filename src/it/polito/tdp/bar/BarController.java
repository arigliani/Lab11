package it.polito.tdp.bar;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class BarController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea result;

    @FXML
    private Button btnCallcola;

    @FXML
    void calcola(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'Bar.fxml'.";
        assert btnCallcola != null : "fx:id=\"btnCallcola\" was not injected: check your FXML file 'Bar.fxml'.";

    }
}

