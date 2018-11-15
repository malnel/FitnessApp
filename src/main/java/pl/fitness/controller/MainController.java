package pl.fitness.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import pl.fitness.Main;

public class MainController {

    @FXML
    private AnchorPane background;

    @FXML
    private ImageView logo;

    @FXML
    private Button start_btn;

    @FXML
    void goToWorkout(ActionEvent event) throws IOException {
    		Parent parent = FXMLLoader.load(getClass().getResource("/view/WorkoutView.fxml"));
		Scene scene = new Scene(parent);
		Main.getPrimaryStage().setScene(scene);

    }

}