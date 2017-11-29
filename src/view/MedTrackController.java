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
import users.Nurse;
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



public class MedTrackController extends Main{
	public Main main;
	@FXML
	private Label doctorLabel;
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
    public MedTrackController() {
			
		}
    @FXML
    private void initialize() {
    	doctorLabel.setText(""+Doctor.getDoctor());
    	pidFieldM.setText("Patient ID "+User.getPid());
    	
    	
    	
    	Patient pat1 = PatientAccounts.searchPatient(User.getPid());
    	
    	//System.out.println(pat1.numOfPrescriptionsAwaitingVerification);
    	ArrayList<String> list = new ArrayList<String>();
    	for (int i=0;i<pat1.numOfPrescriptionsVerified;i++) {
    	list.add(PatientAccounts.searchPatient(User.getPid()).activePrescriptionsVerified[i].toString());
    	}
    	drugTable.getItems().addAll(list);
    
    }
    
    public void setMainApp(Main main) {
        this.main = main;
        //patientTable.setItems(main.getPatientData());
        }
    
    @FXML
    private void fillMini() {
    	
    }
    
    @FXML
    private void logDose() {
    	ObservableList selectedIndices =
    		    drugTable.getSelectionModel().getSelectedIndices();
    	System.out.println((int) selectedIndices.get(0));
    	
    	if (!selectedIndices.isEmpty()) {
        	String drugname = PatientAccounts.searchPatient(User.getPid()).activePrescriptionsVerified[(int) selectedIndices.get(0)].getName();

    		nurse1.logDose(drugname, User.getPid(), 1000);
        	System.out.println(User.getPid());

    	}
    }
    
    @FXML
    private void history() {
    	main.showNurseHistory();
    }
    
    @FXML
    private void goBack() {
    	main.showNurse();
    }

    
}
