package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import main.Main;
import users.Doctor;
import javafx.scene.control.TextField;

/** Label
 *  doctorLabel 
 *  Text Field
 *  nameField
 *  bioField
 *  qtyField
 *  unitsField
 *  refillsField
 *  
 *  DatePicker
 *  startDatePicker
 */



public class AddScriptController extends Main{
	Main main;
	@FXML
	private Label doctorLabel;
	@FXML
	private TextField pid;
	
	public AddScriptController(){
		
	}
	
    @FXML
    private void initialize() {
    	doctorLabel.setText(""+Doctor.getDoctor());
    }
    
    public void setMainApp(Main main) {
        this.main = main;
        //patientTable.setItems(main.getPatientData());
        }  
    @FXML
    private void goBack() {
    	main.showDoctor();
    }
    
    @FXML
    private void addScript() {
    	System.out.println("Add Script");
    }
    
}
