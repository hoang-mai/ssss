package com.example.project.gui61;

import com.example.project.gui32.gui32;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class dialog implements Initializable {
    @FXML
    private Label timelimit;
public int b=0;
    @FXML
    void cancel(ActionEvent event) {
        Stage a = (Stage) timelimit.getScene().getWindow();
        a.hide();
    }

    @FXML
    void startattempt(ActionEvent event) {
        b=1;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/project/gui51/gui(5.1).fxml"));
            Scene scene = new Scene(root);
            Stage ag0r = new Stage();
            ag0r.setScene(scene);
            ag0r.show();
            Stage a = (Stage) timelimit.getScene().getWindow();
            a.hide();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}