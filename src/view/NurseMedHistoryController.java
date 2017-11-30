package view;

import java.util.ArrayList;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import main.Main;
import medicationprocessing.Medication;
import patientprocessing.Patient;
import patientprocessing.PatientAccounts;
import users.Doctor;
import users.User;
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



public class NurseMedHistoryController extends Main{
	public Main main;

	 @FXML
    private ListView<String> historyTable;


    @FXML
    private TextField pidFieldM;
    @FXML
    private TableView<Medication> detailTable;
    @FXML
    private TableColumn<Medication, String> NameColumn2;
    @FXML
    private TableColumn<Medication, String> DoseColumn2;
	ArrayList<String> list = new ArrayList<String>();
	
    public NurseMedHistoryController() {
			
		}
    @FXML
    private void initialize() {

    	pidFieldM.setText("Patient ID "+User.getPid());
    	
    	
    	
    	Patient pat = PatientAccounts.searchPatient(User.getPid());
    	
    	System.out.println(PatientAccounts.searchPatient(User.getPid()).numOfDosesGiven);

    	for (int i=0;i<PatientAccounts.searchPatient(User.getPid()).numOfDosesGiven;i++) {
    	list.add(PatientAccounts.searchPatient(User.getPid()).dosesGivenToPatient[i].toString());
    	}
    	historyTable.getItems().addAll(list);
    
    }
    
    public void setMainApp(Main main) {
        this.main = main;
        //patientTable.setItems(main.getPatientData());
        }
    
    @FXML
    private void verifyScript() {
    	ObservableList selectedIndices =
    		    historyTable.getSelectionModel().getSelectedIndices();
    	if (!selectedIndices.isEmpty()) {
    		//String drugname = PatientAccounts.searchPatient(User.getPid()).prescriptionsAwaitingVerification[(int)selectedIndices.get(0)].getName();
    		//System.out.println(drugname);;
    				
    				PatientAccounts.searchPatient(User.getPid()).verifyPrescription(PatientAccounts.searchPatient(User.getPid()).prescriptionsAwaitingVerification[(int)selectedIndices.get(0)]);
    				goBack();
    				
    				//Wont refresh
    				//list.remove((int)selectedIndices.get(0));
    				
    				
    	}
    }

    
    
    
    
    @FXML
    private void goBack() {
    	main.showMedTrack();
    }
 @FXML
    private void goHome() {
    	main.showUserSelection();
    }
    
    
}
