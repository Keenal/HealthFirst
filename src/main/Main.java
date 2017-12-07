package main;

import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import medicationprocessing.MedicationDatabaseManager;
import medicationprocessing.MedicationList;
import patientprocessing.Patient;
import patientprocessing.PatientAccounts;
import users.Administrator;
import users.Doctor;
import users.Nurse;
import users.Pharmacist;
import users.User;
import view.LoginScreenController;
import view.MedTrackController;
import view.NurseMedHistoryController;
import view.NurseViewController;
import view.PatientViewController;
import view.PharmaUnverifiedController;
import view.PharmacistViewController;
import view.AddScriptController;
import view.AdminPatientViewController;
import view.AdminViewController;
import view.AdminViewControllerCreate;
import view.AdminViewControllerEdit;
import view.DoctorViewController;

/**
This program:
HealthFirst allows doctors, nurses, and pharmacists to prescribe, review, distribute, 
and track patient medications simultaneously. This would reduce the confusion that might 
come from the use of paper records/logs, and reduce the risk of potential over/under 
dosage and conflicts with other medications.

@author Timothy McWatters
@author Keenal Shah
@author Chris Ault
@author Jimmy Le

@version 1.0

CEN3031    "HealthFirst" SE1-Afternoon Group 1's class project
File Name: Main.java 
*/

public class Main extends Application {

	private Stage primaryStage;
    public static BorderPane rootLayout;
    
	public User userType = new User();
	public static ObservableList<Patient> patientData = FXCollections.observableArrayList();
	public static Administrator admin1 = new Administrator("John");
	public static Nurse nurse1 = new Nurse("Test");

	public static void main(String[] args) {
	
		//Populate from Medication DB
		String inputFileName = "Medications.txt";
		MedicationList medicationList = new MedicationList();
		MedicationDatabaseManager medDB = new MedicationDatabaseManager(inputFileName);
		medDB.openFile(inputFileName);
		medDB.processInput(medicationList);
	
		//Create Patients  
		new PatientAccounts();			
		patientData.add(admin1.createNewPatient("Jane Doe",0,"Phil",20, "200 / 50",90, 155.5, 70.2, "Lots of drugs", "flu","Pollen"));	
		patientData.add(admin1.createNewPatient("Johnny Boy",1,"Eddy",33, "160 / 100",110, 255.6, 68.0, "Heart Disease, Diabetes", "Chest Pain","Bee Stings"));
		patientData.add(admin1.createNewPatient("John Dough",2,"joe",56, "110 / 65",60, 137.5, 75.0, "No Issues", "Broken Wrist","None"));
		
		//Create default Pharmacist for use in prototype demonstration
		Pharmacist pharm1 = new Pharmacist("Donald Drug");
		
		//Prescribe patients with medications using default doctor for use in prototype demonstration
		Patient patient1 = PatientAccounts.patientAccounts[0];
		Doctor.prescribeMedication("Codeine", patient1);
		Doctor.prescribeMedication("Tylenol", patient1);
		Doctor.prescribeMedication("Aleve", patient1);
		pharm1.verifyMedicaton("Codeine", patient1);
		
		Patient patient2 = PatientAccounts.patientAccounts[1];
		Doctor.prescribeMedication("Advil", patient2);
		
		Patient patient3 = PatientAccounts.patientAccounts[2];
		Doctor.prescribeMedication("Penicillin V", patient3);
		Doctor.prescribeMedication("Oxycodone", patient3);
		pharm1.verifyMedicaton("Penicillin V", patient3);
		
		
		
		System.out.println(patient3);
		System.out.println(PatientAccounts.searchPatient(0));
		
	
		//Launch Gui
		launch(args);

	} // end of main method
    
	public ObservableList<Patient> getPatientData(){
		return patientData;
	} // end of ObservableList method
	
	/**
     * Initializes JavaFX window
     */
	public void start(Stage primaryStage) throws Exception {
		//Build Bootstrap GUI
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Health First");

        initRootLayout();
        showUserSelection();
    } // end of start method
	
	/**
     * Initializes the main background
     */
    public void initRootLayout() throws Exception{
        try {
        		// Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            	// Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // end of initRootLayout method

    /**
     * Shows the LoginScreen
     * 
     */
    public void showUserSelection() {
        try {
        		// Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/LoginScreen.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            LoginScreenController controller = loader.getController();
            controller.setMainApp(this);
            
            	// Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // end of showUserSelection method
	
    /**
     * Returns the main stage.
     * @return primaryStage = the primary stage
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    } // end of getPrimaryStage method
    
    /**
     * Display Patient Selection  screen /view/PatientSelection.fxml
     */
	public  void showPatientSelection() {
        try {
        		// Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/PatientSelection.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            PatientViewController controller = loader.getController();
            controller.setMainApp(this);
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // end of showPatientSelection method
	
    /**
     * Display Patient Selection  screen /view/AdminPatientSelection.fxml
     */
	public  void showAdminPatientSelection() {
        try {
        		// Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/AdminPatientSelection.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            AdminPatientViewController controller = loader.getController();
            controller.setMainApp(this);
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // end of showAdminPatientSelection method	
	
    /**
     * Display Patient Selection  screen /view/AdminPatientSelection.fxml
     */
	public  void showAddAScript() {
		try {
			// Load person overview.
	       	FXMLLoader loader = new FXMLLoader();
	       	loader.setLocation(Main.class.getResource("/view/AddScriptView.fxml"));
	       	AnchorPane script = (AnchorPane) loader.load();
	      	AddScriptController controller = loader.getController();
	       	controller.setMainApp(this);
	            
	        	// Set person overview into the center of root layout.
	       	rootLayout.setCenter(script);
	   	} catch (IOException e) {
	       	e.printStackTrace();
	   	}
	} // end of showAddAScript method	
	
    /**
     *  /view/DoctorView.fxml   
     *  DoctorViewController screen
     */
	public void showDoctor() {
        try {
        		// Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/DoctorView.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            DoctorViewController controller = loader.getController();
            controller.setMainApp(this);
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
	} // end of showDoctor method

    /**
     *  /view/NurseView.fxml   
     *  NurseViewController screen
     */
	public void showNurse() {
		// Display Patient Selection stage /view/PatientSelection.fxml
	        try {
	        	// Load person overview.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(Main.class.getResource("/view/NurseView.fxml"));
	            AnchorPane personOverview = (AnchorPane) loader.load();
	            NurseViewController controller = loader.getController();
	            controller.setMainApp(this);
	            
	            // Set person overview into the center of root layout.
	            rootLayout.setCenter(personOverview);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    } // end of showNurse method

    /**
     *  shows nurse history screen
     */
	public void showNurseHistory() {
		// Display Patient Selection stage /view/PatientSelection.fxml
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/view/NurseMedHistoryView.fxml"));
	    		AnchorPane personOverview = (AnchorPane) loader.load();
	      	NurseMedHistoryController controller = loader.getController();
	       	controller.setMainApp(this);
	            
	       	// Set person overview into the center of root layout.
	       	rootLayout.setCenter(personOverview);
	  	} catch (IOException e) {
	       	e.printStackTrace();
		}
	} // end of showNurseHistory method

    /**
     *  shows Administrator screen
     */
	public void showAdmin() {
        try {
        		// Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/AdministratorView.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            AdminViewController controller = loader.getController();
            controller.setMainApp(this);
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
	} // end of showAdmin method
	
	 /**
     *  shows Administrator edit screen
     */
	public void showAdminEdit() {
        try {
        		// Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/AdministratorViewEdit.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            AdminViewControllerEdit controller = loader.getController();
            controller.setMainApp(this);
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
 	} // end of showAdminEdit method
	
	 /**
     *  shows Administrator create screen
     */
	public void showAdminCreate() {
        try {
        		// Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/AdministratorViewCreate.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            AdminViewControllerCreate controller = loader.getController();
            controller.setMainApp(this);
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
	} // end of showAdminCreate method
	
	 /**
     *  shows Pharmacist screen
     */
	public void showPharmacist() {
		// Display Patient Selection stage /view/PatientSelection.fxml
        try {
        		// Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/PharmacistView.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            PharmacistViewController controller = loader.getController();
            controller.setMainApp(this);
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
	} // end of showPharmacist method
	
	 /**
     *  shows unverified screen
     */
	public void showUnverified() {
		// Display Patient Selection stage /view/PatientSelection.fxml
        try {
        		// Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/PharmaUnverifiedView.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            PharmaUnverifiedController controller = loader.getController();
            controller.setMainApp(this);
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
	} // end of showUnverified method
	
	 /**
     *  shows Administrator screen
     */
	public void showMedTrack() {
        try {
        		// Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/MedTrackerView.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            MedTrackController controller = loader.getController();
            controller.setMainApp(this);
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }		
	} // end of showMedTrack method

} // end of Main class
