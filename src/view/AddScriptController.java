package view;

import java.util.ArrayList;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import main.Main;
import medicationprocessing.Medication;
import medicationprocessing.MedicationList;
import patientprocessing.Patient;
import patientprocessing.PatientAccounts;
import users.Doctor;
import users.User;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

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
	@FXML
    private ListView<String> drugList;
	@FXML
	private Text confirmText;

	
	public AddScriptController(){
		
	}
	
    @FXML
    private void initialize() {
    	//drugColumn.setCellValueFactory(cellData -> cellData.getValue().getName());  //MedicationList.medications[0].getName()
    	
		ArrayList<String> list = new ArrayList<String>();

		
    	for (int i = 0; i < MedicationList.numOfElements; i++) {
    		list.add(MedicationList.medications[i].getName());
    	}
  
    	 drugList.getItems().addAll(list);
    
        

     	pid.setText("Patient ID "+User.getPid());

    	
    	//
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
    	ObservableList selectedIndices =
    		    drugList.getSelectionModel().getSelectedIndices();
    	if (!selectedIndices.isEmpty()) {
	    	System.out.println(MedicationList.medications[(int) selectedIndices.get(0)].getName());
	    	Doctor.prescribeMedication(MedicationList.medications[(int) selectedIndices.get(0)].getName(),PatientAccounts.searchPatient(User.getPid()));
	    	confirmText.setText("Prescription "+MedicationList.medications[(int) selectedIndices.get(0)].getName()+" Added");
    	}
    	System.out.println(PatientAccounts.searchPatient(User.getPid()).prescriptionsAwaitingVerification[0]);
    	
    }
    
}
