package view;

import javafx.fxml.FXML;
//import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import main.Main;
import patientprocessing.Patient;
import users.User;
import patientprocessing.PatientAccounts;

public class AdminViewControllerCreate extends Main {
    public Main main;
    @FXML
    private TextField nameLabel;
    @FXML
    private TextField ageLabel;
    @FXML
    private TextField famLabel;
    @FXML
    private TextField illLabel;
    @FXML
    private TextField allLabel;
    @FXML
    private TextField bpLabel;
    @FXML
    private TextField hrLabel;
    @FXML
    private TextField weightLabel;
    @FXML
    private TextField heightLabel;
    @FXML
    private TextField pid;
	
    public AdminViewControllerCreate(){
    	
    }
    @FXML
    private void initialize() {
    	//System.out.println("User pid is:" +User.getPid());
    	//System.out.println(User.getPid());
    //System.out.println(PatientAccounts.searchPatient(User.getPid()));
		patientData.add(admin1.createNewPatient("New Pat",PatientAccounts.numOfElements-1,"Phil"));	
		User.setPid(PatientAccounts.numOfElements-1);
    	pid.setText("Patient ID "+User.getPid());

    //showPersonDetails(PatientAccounts.searchPatient(User.getPid()));
    }
    public void setMainApp(Main main) {
        this.main = main;
        //patientTable.setItems(main.getPatientData());
        }  
    
   
    
    @FXML
    private void adminReturn() {
    	main.showAdmin();
    }


   
    @FXML
    private void saveEdit() {
    	int age = Integer.parseInt(ageLabel.getText());
    	int hr = Integer.parseInt(hrLabel.getText());
    	Double lbs = Double.parseDouble(weightLabel.getText());
    	Double in = Double.parseDouble(heightLabel.getText());
    	PatientAccounts.searchPatient(User.getPid()).setAge(age);
    	PatientAccounts.searchPatient(User.getPid()).setHeartRate(hr);
    	PatientAccounts.searchPatient(User.getPid()).setHeightInInches(in);
    	PatientAccounts.searchPatient(User.getPid()).setFamilyHistory(famLabel.getText());
    	PatientAccounts.searchPatient(User.getPid()).setWeightInLbs(lbs);
    	PatientAccounts.searchPatient(User.getPid()).setCurrentIllness(illLabel.getText());
    	PatientAccounts.searchPatient(User.getPid()).setAllergies(allLabel.getText());
    	PatientAccounts.searchPatient(User.getPid()).setBloodPressure(bpLabel.getText());
    	PatientAccounts.searchPatient(User.getPid()).setName(nameLabel.getText());
    	main.showAdmin();
}
    
    
}
