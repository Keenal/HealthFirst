package view;

import tester.HealthFirstTester;
//import users.User;
import javafx.fxml.FXML;
public class LoginScreenController extends HealthFirstTester {

	public HealthFirstTester healthFirstTester;
	public String user = "";

	public LoginScreenController() {
		
	}
	
	/**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param HealthFirstTester
     */
    public void setMainApp(HealthFirstTester HealthFirstTester) {
        this.healthFirstTester = HealthFirstTester;
        }   
    
    
    @FXML
    private void handleUser() { 
    	
    	user = userType.getName();
    	System.out.println("User Type is :"+user);
    	if(user == "Doctor")
    		HealthFirstTester.showDoctor();
    	if(user == "Nurse")
    		HealthFirstTester.showNurse();
    	if(user == "Admin")
    		HealthFirstTester.showAdmin();
    	if(user == "Pharma")
    		HealthFirstTester.showPharmacist();	
    }
    @FXML
    private void handleUserSelect() {
    	
    }
    
    @FXML
    private void handleDoctor() {
    	userType.setName("Doctor");
    	System.out.println("doctor selected");
    	healthFirstTester.showPatientSelection();
    }
    
    @FXML
    private void handleNurse() {
    	userType.setName("Nurse");
    	System.out.println("nurse selected");
    	healthFirstTester.showPatientSelection();

    }
    
    @FXML
    private void handlePharmacist() {
    	userType.setName("Pharma");
    	System.out.println("phama selected");
    	healthFirstTester.showPatientSelection();

    }
    
    @FXML
    private void handleAdministrator() {
    	userType.setName("Admin");
    	System.out.println("admin selected");
    	healthFirstTester.showPatientSelection();
    
    }
    
    @FXML
    private void handlePatientSelect() {

    }
	
    
}
