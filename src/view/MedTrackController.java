package view;

import java.util.ArrayList;

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
    
    	ArrayList<String> list = new ArrayList<String>();
    	//for (int i=0;i<PatientAccounts.searchPatient(User.getPid()).prescriptionsAwaitingVerification.length;i++)
    	//list.add(PatientAccounts.searchPatient(User.getPid()).prescriptionsAwaitingVerification[i]);
    	//NameColumn.
    
    
    }
    
    public void setMainApp(Main main) {
        this.main = main;
        //patientTable.setItems(main.getPatientData());
        }
    
    @FXML
    private void fillMini() {
    	
    }
    
    
    
    
    @FXML
    private void goBack() {
    	main.showNurse();
    }

    
}
