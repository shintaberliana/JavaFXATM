/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxatm;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private Label label;
    @FXML
    private Label label1;
   

    @FXML
    private JFXButton btn1;

    @FXML
    private JFXButton btn2;

    @FXML
    private JFXButton btn3;

    @FXML
    private JFXButton btn4;

    @FXML
    private JFXButton btn5;

    @FXML
    private JFXButton btn6;

    @FXML
    private JFXButton btn7;

    @FXML
    private JFXButton btn8;

    @FXML
    private JFXButton btn9;

    @FXML
    private JFXButton clear;

    @FXML
    private JFXButton btn0;

    @FXML
    private JFXButton ok;

    @FXML
    private JFXPasswordField editpin;
    
    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    void tekan0(ActionEvent event) {
        pin += "0";
        editpin.setText(pin);
    }

    @FXML
    void tekan1(ActionEvent event) {
        pin += "1";
        editpin.setText(pin);
    }

    @FXML
    void tekan2(ActionEvent event) {
        pin += "2";
        editpin.setText(pin);
    }

    @FXML
    void tekan3(ActionEvent event) {
        pin += "3";
        editpin.setText(pin);
    }

    @FXML
    void tekan4(ActionEvent event) {
        pin += "4";
        editpin.setText(pin);
    }

    @FXML
    void tekan5(ActionEvent event) {
        pin += "5";
        editpin.setText(pin);
    }

    @FXML
    void tekan6(ActionEvent event) {
        pin += "6";
        editpin.setText(pin);
    }

    @FXML
    void tekan7(ActionEvent event) {
        pin += "7";
        editpin.setText(pin);
    }

    @FXML
    void tekan8(ActionEvent event) {
        pin += "8";
        editpin.setText(pin);
    }

    @FXML
    void tekan9(ActionEvent event) {
        pin += "9";
        editpin.setText(pin);
    }
    
      @FXML
    void hapus(ActionEvent event) {
        pin = "";
        editpin.setText(pin);
    }

    @FXML
    void oke(ActionEvent event) throws IOException {
        if (pin.equals(PIN)){
            try {
            ((Node) (event.getSource())).getScene().getWindow().hide();
            //load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 400);
            //
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("MenuAwal");
            stage.show();
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
            
        }
        } else {
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN salah \nTersisa " + kesempatan
             + "kesempatan lagi!");
            editpin.setText("");
            pin ="";
            if (kesempatan == 0) {
                System.exit(0);
            }
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
}