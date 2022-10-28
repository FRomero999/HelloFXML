package com.mycompany.hellofxml;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button primaryButton;
    @FXML
    private Label texto;
    @FXML
    private TextField cajetin;

    @FXML
    private void switchToSecondary() throws IOException {
        //App.setRoot("secondary");
        texto.setText("Hola a  " + cajetin.getText());
    }
}
