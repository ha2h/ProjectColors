
package color;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXColorPicker;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javax.swing.JFrame;

/**
 *
 * @author Hash
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane cc;
    
    @FXML
    private JFXButton hhhh;

    @FXML
    private JFXColorPicker cha;

    @FXML
    private JFXButton exi;

    @FXML
    private AnchorPane c1;

    @FXML
    private JFXCheckBox cont1;

    @FXML
    private AnchorPane c2;

    @FXML
    private JFXCheckBox cont2;

    @FXML
    private AnchorPane c3;

    @FXML
    private JFXCheckBox cont3;

    @FXML
    private AnchorPane c4;

    @FXML
    private JFXCheckBox cont4;

    @FXML
    void changeColor(ActionEvent event) {
        Color selectedColorc = cha.getValue();
        cc.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColorc.toString()), CornerRadii.EMPTY, Insets.EMPTY)));
        if(cont1.isSelected()){
            Color selectedColor = cha.getValue();
            c1.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColor.toString()), CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if(cont2.isSelected()){
            Color selectedColor = cha.getValue();
            c2.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColor.toString()), CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if(cont3.isSelected()){
            Color selectedColor = cha.getValue();
            c3.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColor.toString()), CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if(cont4.isSelected()){
            Color selectedColor = cha.getValue();
            c4.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColor.toString()), CornerRadii.EMPTY, Insets.EMPTY)));
        }

    }
    @FXML
    void hashUp(ActionEvent event){
//        Parent fxml = FXMLLoader.load(getClass().getResource("Color/color/FXML.fxml"));
//        hhhh.getChilderen
        hello dada = new hello();
        dada.setVisible(true);
        dada.setLocationRelativeTo(null);
        dada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @FXML
    void closeAll(ActionEvent event) {
//        Stage stage=(Stage)exi.getScene().getWindow();
//        stage.close();
        System.exit(0);
//        Stage stage = (Stage)((Button)event.getSource()).getScene().getWindow();
//        stage.close();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
