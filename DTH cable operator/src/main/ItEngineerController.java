/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ItEngineerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void connectionrequest(ActionEvent event) {
    }

    @FXML
    private void contactwithcustomer(ActionEvent event) {
    }

    @FXML
    private void requestforaccessories(ActionEvent event) {
    }

    @FXML
    private void manageprofile(ActionEvent event) {
    }

    @FXML
    private void reportingandcommunication(ActionEvent event) {
    }

    @FXML
    private void trainingandeducation(ActionEvent event) {
    }

    @FXML
    private void emergencyresponse(ActionEvent event) {
    }

    @FXML
    private void complainandregulation(ActionEvent event) {
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DashBoard.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setTitle("DashBoard page");
        window.setScene(scene);
        window.show();
    }
    
}
