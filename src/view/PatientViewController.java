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
    private TableColumn<Patient, Number> Number;
    @FXML
    private TableColumn<Patient, Number> patientIDColumn;
    @FXML
    private TableColumn<Patient, String> PrimaryDrColumn;    

    //reference main app
	public Main hft;
	public String user;
	String patient;
    public PatientViewController () {
    
    }
    
    
    /**
     * Initialize is called when the fxml is accessed and displays
     * patient information onto the view.
     */
    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
    	NameColumn.setCellValueFactory(cellData -> cellData.getValue().getNameProperty());
    	patientIDColumn.setCellValueFactory(cellData -> cellData.getValue().getPatientIDProperty());
    	PrimaryDrColumn.setCellValueFactory(cellData -> cellData.getValue().getPrimaryDoctorNameProperty());
    	//Number.setCellValueFactory(cellData -> cellData.setValue("1"));
       // new PatientAccounts();


       // showPatientDetails(null);
        User.setPid(Integer.MAX_VALUE);
        
     /*
      * *****The following code catches user selection in a table and gets the row number
      * *****After getting the row number user.setPid is set to that row number
      */
        patientTable.getSelectionModel().setCellSelectionEnabled(true);
        ObservableList<?> selectedCells = patientTable.getSelectionModel().getSelectedCells();
        selectedCells.addListener(new ListChangeListener<Object>() {
            @Override
            public void onChanged(Change<?> c) {
                TablePosition<?, ?> tablePosition = (TablePosition<?, ?>) selectedCells.get(0);
                //Object val = tablePosition.getTableColumn().getCellData(tablePosition.getRow());
                Object val = tablePosition.getRow();
           //Debug shows selected row
                // System.out.println("Selected Value" + val);
                User.setPid((int)val);
            }
        });
        
        

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
    /**
     * handle user select switches the view back to user selection
     */
    @FXML
    private void goBack() {
        //dialogStage.close();
      hft.showUserSelection();;
    }
     @FXML
    private void goHome() {
    	hft.showUserSelection();
    }
    
    
    /**
     * handleuser is called upon patient selection to determine 
     * the current user privilege level and calls for the correct
     * view to be displayed.
     */
   @FXML
   private void handleUser() { 
   	
   	user = userType.getName();
   	//System.out.println("User Type is :"+user+" userType.getName returns:"+patient);
   	if(User.getPid() !=  Integer.MAX_VALUE) {
	   	if(user == "Doctor")
	   		hft.showDoctor();
	   	if(user == "Nurse")
	   		hft.showNurse();
	   	if(user == "Admin")
	   		hft.showAdmin();
	   	if(user == "Pharma")
	   		hft.showPharmacist();	
	   }
   }
   

	    
	    }

