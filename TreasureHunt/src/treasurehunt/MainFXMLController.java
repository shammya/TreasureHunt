/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasurehunt;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class MainFXMLController implements Initializable {

    @FXML
    private Button LogIn;
    @FXML
    private Button SignUp;
    @FXML
    private AnchorPane rootpane;
    
    @FXML
    private void gotosignup(ActionEvent e) throws Exception{
        AnchorPane pane =FXMLLoader.load(getClass().getResource("SignUpFXML.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
