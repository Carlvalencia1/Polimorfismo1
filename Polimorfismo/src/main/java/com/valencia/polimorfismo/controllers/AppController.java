package com.valencia.polimorfismo.controllers;

import com.valencia.polimorfismo.App;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class AppController {

    @FXML
    private Button addButton;

    @FXML
    private Button base1;

    @FXML
    private Button base2;

    @FXML
    private Button base3;

    @FXML
    private Button closeButton;

    @FXML
    private Button updataButton;

    @FXML
    void onMouseClickedBase1(MouseEvent event) {
        App.newStage("unicach-view", "UNICAH");
    }

    @FXML
    void onMouseClickedBase2(MouseEvent event) {
        App.newStage("unach-view", "UNACH");
    }

    @FXML
    void onMouseClickedBase3(MouseEvent event) {
        App.newStage("politecnica-view", "Politécnica");
    }

    @FXML
    void onMouseClickedAñadir(MouseEvent event) {
        App.newStage("add-view", "Agregar");
    }

    @FXML
    void onMouseClickedUpdata(MouseEvent event) {
        App.newStage("update-view", "Actualizar");
    }

    @FXML
    void onMouseClickedCerrar(MouseEvent event) {
        Platform.exit();
    }
}
