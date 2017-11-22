package view;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import patientprocessing.Patient;
import tester.HealthFirstTester;

public class PatientViewController extends HealthFirstTester{

	public HealthFirstTester hft;
    @FXML
    private TableView<Patient> personTable;
    @FXML
    private TableColumn<Patient, String> NameColumn;
    @FXML
    private TableColumn<Patient, String> Number;
    @FXML
    private TableColumn<Patient, Number> patientIDColumn;
    @FXML
    private TableColumn<Patient, String> PrimaryDrColumn;    

    public PatientViewController () {
    
    }
    
    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
    	NameColumn.setCellValueFactory(cellData -> cellData.getValue().getFirstName());
        patientIDColumn.setCellValueFactory(cellData -> cellData.getValue().getPatientID2());
    }
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(HealthFirstTester hft) {
        this.hft = hft;
        }  
    
   public void handleUserSelect() {
	   
   }
    
	private void showPatientDetails(Patient patient) {
	    if (patient != null) {
	        // Fill the labels with info from the patient object.
	        NameColumn.setText(patient.getName());
	        //lastNameLabel.setText(patient.getLastName());
	        patientIDColumn.setText("NeedDrGetter");
	       

	        // TODO: We need a way to convert the birthday into a String! 
	        // birthdayLabel.setText(...);
	    } else {
	        // patient is null, remove all the text.
	    	PrimaryDrColumn.setText("");
	    	NameColumn.setText("");
	       
	}
	    }
	    }

