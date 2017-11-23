package view;

import javafx.fxml.FXML;
import main.Main;
public class LoginScreenController extends Main {

	public Main healthFirstTester;
	public String user = "";

	public LoginScreenController() {
		
	}
	
	/**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param HealthFirstTester
     */
    public void setMainApp(Main HealthFirstTester) {
        this.healthFirstTester = HealthFirstTester;
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
