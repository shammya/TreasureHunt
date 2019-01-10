
package treasurehunt;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;


public class SignUpFXMLController implements Initializable {

 @FXML
    private AnchorPane rootpane1;
 
  @FXML
    private void goback(ActionEvent e) throws Exception{
        AnchorPane pane =FXMLLoader.load(getClass().getResource("LogInFXML.fxml"));
        rootpane1.getChildren().setAll(pane);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
