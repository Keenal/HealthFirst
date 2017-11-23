package view;

import javafx.collections.*;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import main.Main;
import javafx.scene.control.TablePosition;
import patientprocessing.Patient;
import patientprocessing.PatientAccounts;
import users.User;

public class PatientViewController extends Main{

    @FXML
    private TableView<Patient> patientTable;
    @FXML
    private TableColumn<Patient, String> NameColumn;
    @FXML
    private TableColumn<Patient, String> Number;
    @FXML
    private TableColumn<Patient, Number> patientIDColumn;
    @FXML
    private TableColumn<Patient, String> PrimaryDrColumn;    

    //reference main app
	public Main hft;
	public String user;
	int patient;
    public PatientViewController () {
    
    }
    
    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
    	NameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
    	patientIDColumn.setCellValueFactory(cellData -> cellData.getValue().pidProperty());
    	//PrimaryDrColumn.setCellValueFactory(cellData -> cellData.getValue().getPrimaryDoctor2());
        
        new PatientAccounts();


        showPatientDetails(null);
        
        
     
        patientTable.getSelectionModel().setCellSelectionEnabled(true);
        ObservableList<?> selectedCells = patientTable.getSelectionModel().getSelectedCells();

        selectedCells.addListener(new ListChangeListener<Object>() {
            @Override
            public void onChanged(Change<?> c) {
                TablePosition<?, ?> tablePosition = (TablePosition<?, ?>) selectedCells.get(0);
                tablePosition = patientTable.getFocusModel().getFocusedCell();
                patient =tablePosition.getRow();

                System.out.println("Patient set " + patient);
                User.setPid(patient);
                
            }
        }
        );
        
        

    }
    
    
    


    


    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(Main hft) {
        this.hft = hft;
        patientTable.setItems(hft.getPatientData());
        }  
    
    @FXML
    private void handleUserSelect() {
        //dialogStage.close();

    	System.out.println("handlePharmacist from LoginController");
      hft.showUserSelection();;
    }
    
   @FXML
   private void handleUser() { 
   	
   	user = userType.getName();
   	System.out.println("User Type is :"+user+patient);
   	if(user == "Doctor")
   		hft.showDoctor();
   	if(user == "Nurse")
   		hft.showNurse();
   	if(user == "Admin")
   		hft.showAdmin();
   	if(user == "Pharma")
   		hft.showPharmacist();	
   }
	private void showPatientDetails(Patient patient) {
		System.out.println("ShowPatientDetails called Patient is:"+patient);
	    if (patient != null) {
	        // Fill the labels with info from the patient object.
	    	//Patient patient1 = null;
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

