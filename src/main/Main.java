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
File Name: HealthFirstTester.java 
*/


package main;


import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import patientprocessing.Patient;
import patientprocessing.PatientAccounts;
import users.Administrator;
import users.Doctor;
import users.User;
import view.LoginScreenController;
import view.MedTrackController;
import view.NurseViewController;
import view.PatientViewController;
import view.AddScriptController;
import view.DoctorViewController;


public class Main extends Application {

	private Stage primaryStage;
    public static BorderPane rootLayout;
	public User userType = new User();
	ObservableList<Patient> patientData = FXCollections.observableArrayList();
	
	//public static Patient p1 = new ;
	static Patient p1 = new Patient("Jane Doe",0,"Phil");
	static Patient p2 = new Patient("Johnny Boy",1,"Eddy");	
	
	static Patient p3 = new Patient("John Dough",2,"joe");
	
	
	public static void main(String[] args) {
		
		//new PatientAccounts();
		new Administrator("John");
		new Doctor("Eddy");
		new PatientAccounts();

		
		System.out.println(p3);
		
		PatientAccounts.addPatient(p1);
		PatientAccounts.addPatient(p2);
		PatientAccounts.addPatient(p3);
			
			
            //userType.setName("test");
            //System.out.println("User is : "+userType.getName());
		/*
		System.out.println(admin);
		
		System.out.println(doc);
		Patient steve = new Patient();
		doc.prescribeMedication("drug A", steve);
                Gui.graphics();*/
            launch(args);

	}

	public Main() {
		patientData.add(p1);
		patientData.add(p2);
		patientData.add(p3);
	}
    
	public ObservableList<Patient> getPatientData(){
		return patientData;
	}
	
	
	
	
	// Initializes JavaFX window
	public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("HealthFirst");

        initRootLayout();
        //showMedTrack();
        //showAddAScript();
        showUserSelection();
        //showDoctor();
        //showPatientSelection();
       
    }
	
	/**
     * Initializes the main background
     */
    public void initRootLayout() throws Exception{
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            //System.out.println("Hello?");
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
    }
	
    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    
	// Display Patient Selection stage /view/PatientSelection.fxml
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
    }
	// Display Patient Selection stage /view/PatientSelection.fxml
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
	    }
		// /view/DoctorView.fxml   DoctorViewController
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
	}

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
	    }


	public void showAdmin() {
		// TODO Auto-generated method stub
		System.out.println("Display Admin interface with patient attached");
	}

	public void showPharmacist() {
		// TODO Auto-generated method stub
		System.out.println("Display Pharmacist interface with patient attached");
	}

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
	}

}
