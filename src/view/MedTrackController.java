package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import main.Main;
import medicationprocessing.Medication;
import patientprocessing.Patient;
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
    private TableView<Medication> drugTable;

    @FXML
    private TableColumn<Medication, String> NameColumn;
    @FXML
    private TableColumn<Medication, String> ClassColumn;
    @FXML
    private TableColumn<Medication, String> UsageColumn;
    @FXML
    private TableColumn<Medication, String> DosageColumn;   	
    @FXML
    private TableColumn<Medication, String> NotesColumn;
    @FXML
    private TableColumn<Medication, String> LastColumn;
    @FXML
    private TableColumn<Medication, String> NextColumn;
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
    System.out.println("Patient ID "+User.getPid());	
    }
    
    public void setMainApp(Main main) {
        this.main = main;
        //patientTable.setItems(main.getPatientData());
        }  
    @FXML
    private void goBack() {
    	main.showNurse();
    }

    
}
