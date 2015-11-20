package poker.app.view;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.stage.FileChooser;
import poker.app.MainApp;

/**
 * The controller for the root layout. The root layout provides the basic
 * application layout containing a menu bar and space where other JavaFX
 * elements can be placed.
 * 
 * @author Marco Jakob
 */
public class RootLayoutController implements Initializable {

    // Reference to the main application
    private MainApp mainApp;

    @FXML
    private Menu mnuGame;
    
 
    public final ToggleGroup radioGroup = new ToggleGroup();
    
    @FXML
    private RadioMenuItem fiveCardStud;
    @FXML
    private RadioMenuItem fiveCardJoker;
    @FXML
    private RadioMenuItem fiveCardDraw;
    @FXML
    private RadioMenuItem sevenCardDraw;
    @FXML
    private RadioMenuItem texasHold;
    @FXML
    private RadioMenuItem omaha;
    
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	    fiveCardStud.setToggleGroup(radioGroup);
	    fiveCardStud.selectedProperty().addListener(new ChangeListener(){
            @Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(1);         
            }            
          });
	    
	    //Default
	    fiveCardStud.setSelected(true);
		
		fiveCardJoker.setToggleGroup(radioGroup);
	    fiveCardJoker.selectedProperty().addListener(new ChangeListener(){
            @Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(2);              
            }            
          });
		
		fiveCardDraw.setToggleGroup(radioGroup);
	    fiveCardDraw.selectedProperty().addListener(new ChangeListener(){
            @Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(3);              
            }            
          });
		
		sevenCardDraw.setToggleGroup(radioGroup);
	    sevenCardDraw.selectedProperty().addListener(new ChangeListener(){
            @Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(4);              
            }            
          });
		
	    texasHold.setToggleGroup(radioGroup);
	    texasHold.selectedProperty().addListener(new ChangeListener(){
            @Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(5);              
            }            
          });
	    
	    omaha.setToggleGroup(radioGroup);
	    omaha.selectedProperty().addListener(new ChangeListener(){
            @Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(6);              
            }            
          });
	}
    
	
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }




}