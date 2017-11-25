package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import main.Main;
import patientprocessing.Patient;
import users.User;
import patientprocessing.PatientAccounts;

public class DoctorViewController extends Main {
    public Main main;
   @FXML
    private Text nameLabel;
    @FXML
    private Text bmiLabel;
    @FXML
    private Text famLabel;
    @FXML
    private Text illLabel;
    @FXML
    private Text allLabel;

	
    public DoctorViewController(){
    	
    }
    @FXML
    private void initialize() {
    	//System.out.println("User pid is:" +User.getPid());
    	//System.out.println(User.getPid());
    //System.out.println(PatientAccounts.searchPatient(User.getPid()));
    	
    showPersonDetails(p3);
    }
    public void setMainApp(Main main) {
        this.main = main;
        //patientTable.setItems(main.getPatientData());
        }  
    
    private void showPersonDetails (Patient patient) {
    	if (patient != null) {
    		nameLabel.setText(patient.getName());
    	} else {
    		nameLabel.setText("nope");
    	}
    }
    
    @FXML
    private void handlePatientSelect() {
        //dialogStage.close();
     main.showPatientSelection();
    }
    @FXML
    private void handleAddAScript() {
        //dialogStage.close();
     main.showAddAScript();
    }
    
}
