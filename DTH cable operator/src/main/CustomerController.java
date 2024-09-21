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
public class CustomerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void makepaymentbill(ActionEvent event) throws IOException {
                        Parent root = FXMLLoader.load(getClass().getResource("Make Payment Bill.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Make Payment Bill Page");
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void broadbandserviceandpackages(ActionEvent event) throws IOException {
                                
        Parent root = FXMLLoader.load(getClass().getResource("BroadBand services and packages.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setTitle("BroadBand services and packages");
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void customercareservice(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("customercareservice.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setTitle("customercareservice");
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void buyaccessories(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Buy Accessories.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Buy Accessories");
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void paymentdateextend(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Payment Date Extend.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Payment Date Extend");
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void emergencyservice(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Emergency Service.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Emergency Service");
        window.setScene(scene);
        window.show();
   
    }

    @FXML
    private void onlineserver(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Online Server.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Online Server");
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void transferservice(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Transfer Service.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Transfer Service");
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void signout(ActionEvent event) {
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
