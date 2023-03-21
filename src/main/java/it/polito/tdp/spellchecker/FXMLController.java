/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class FXMLController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btClearText"
    private Button btClearText; // Value injected by FXMLLoader

    @FXML // fx:id="btnSpellCheck"
    private Button btnSpellCheck; // Value injected by FXMLLoader

    @FXML // fx:id="cmbChooseLanguage"
    private ComboBox<String> cmbChooseLanguage; // Value injected by FXMLLoader

    @FXML // fx:id="lblErrors"
    private Label lblErrors; // Value injected by FXMLLoader

    @FXML // fx:id="lblPerformance"
    private Label lblPerformance; // Value injected by FXMLLoader

    @FXML // fx:id="txtAreaUserInput"
    private TextArea txtAreaUserInput; // Value injected by FXMLLoader

    @FXML // fx:id="txtAreaWrongWords"
    private TextArea txtAreaWrongWords; // Value injected by FXMLLoader

    @FXML
    void onMouseClickedClearText(MouseEvent event) {
    	txtAreaUserInput.clear();
    	txtAreaWrongWords.clear();
    	lblErrors.setText("");
    }

    @FXML
    void onMouseClickedSpellCheck(MouseEvent event) {
    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btClearText != null : "fx:id=\"btClearText\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnSpellCheck != null : "fx:id=\"btnSpellCheck\" was not injected: check your FXML file 'Scene.fxml'.";
        assert cmbChooseLanguage != null : "fx:id=\"cmbChooseLanguage\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblErrors != null : "fx:id=\"lblErrors\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblPerformance != null : "fx:id=\"lblPerformance\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtAreaUserInput != null : "fx:id=\"txtAreaUserInput\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtAreaWrongWords != null : "fx:id=\"txtAreaWrongWords\" was not injected: check your FXML file 'Scene.fxml'.";
        
        cmbChooseLanguage.getItems().addAll("English", "Italian");
        
    }

}
