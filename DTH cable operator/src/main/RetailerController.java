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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class RetailerController implements Initializable {

    @FXML
    private TextField retailerName;
    @FXML
    private TextField contactNumber;
    @FXML
    private DatePicker expDate;
    @FXML
    private ComboBox<?> combobox;
    @FXML
    private Button submitButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        combobox.getItems().addAll("Senior retailer","Junior retailer","Manager");
        combobox.setValue("Choose");
    }    

    private void submit(ActionEvent event) throws IOException {
                        Parent root = FXMLLoader.load(getClass().getResource("submitSuccess.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setTitle("submitSuccess Page");
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void submitButtonOnClick(ActionEvent event) {
    }
    
}
