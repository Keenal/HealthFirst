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



public class PharmaUnverifiedController extends Main{
	public Main main;

	 @FXML
    private ListView<String> drugTable;


    @FXML
    private TextField pidFieldM;
    @FXML
    private TableView<Medication> detailTable;
    @FXML
    private TableColumn<Medication, String> NameColumn2;
    @FXML
    private TableColumn<Medication, String> DoseColumn2;
	ArrayList<String> list = new ArrayList<String>();
	
    public PharmaUnverifiedController() {
			
		}
    @FXML
    private void initialize() {

    	pidFieldM.setText("Patient ID "+User.getPid());
    	
    	
    	
    	Patient pat1 = PatientAccounts.searchPatient(User.getPid());
    	
    	System.out.println(pat1.numOfPrescriptionsAwaitingVerification);

    	for (int i=0;i<pat1.numOfPrescriptionsAwaitingVerification;i++) {
    	list.add(PatientAccounts.searchPatient(User.getPid()).prescriptionsAwaitingVerification[i].toString());
    	}
    	drugTable.getItems().addAll(list);
    
    }
    
    public void setMainApp(Main main) {
        this.main = main;
        //patientTable.setItems(main.getPatientData());
        }
    
    @FXML
    private void verifyScript() {
    	ObservableList<Integer> selectedIndices =
    		    drugTable.getSelectionModel().getSelectedIndices();
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
    private void fillMini() {
    	
    }
    
    
    
     @FXML
    private void goHome() {
    	main.showUserSelection();
    }
    
    @FXML
    private void goBack() {
    	main.showPharmacist();
    }

    
}
