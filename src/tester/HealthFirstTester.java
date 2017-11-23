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


package tester;


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
import users.User;
import view.LoginScreenController;
import view.PatientViewController;


public class HealthFirstTester extends Application {

	private Stage primaryStage;
    public BorderPane rootLayout;
	public User userType = new User();
	ObservableList<Patient> patientData = FXCollections.observableArrayList();

	public HealthFirstTester() {
		patientData.add(new Patient("Jane Doe",55));
		patientData.add(new Patient("Johnny Boy",1));
	}
    
	public ObservableList<Patient> getPatientData(){
		return patientData;
	}
	
	
	public static void main(String[] args) {
		//new PatientAccounts();

			
			
			User userType = new User();
            userType.setName("test");
            //System.out.println("User is : "+userType.getName());
            launch(args);
		/*Administrator admin = new Administrator("John");
		System.out.println(admin);
		Doctor doc = new Doctor("Eddy");
		System.out.println(doc);
		Patient steve = new Patient();
		doc.prescribeMedication("drug A", steve);
                Gui.graphics();*/
	}
	
	// Initializes JavaFX window
	public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("HealthFirst");

        initRootLayout();
        showPersonOverview();
        //showDoctor();
        //showPatientSelection();
    }
	
	/**
     * Initializes the main background
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(HealthFirstTester.class.getResource("/view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            System.out.println("Hello?");
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
    public void showPersonOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(HealthFirstTester.class.getResource("/view/LoginScreen.fxml"));
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
	public void showPatientSelection() {
        try {
        	// Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(HealthFirstTester.class.getResource("/view/PatientSelection.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            PatientViewController controller = loader.getController();
            controller.setMainApp(this);
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public static void showDoctor() {

		System.out.println("Display Doctor interface with patient attached");
	}

	public static void showNurse() {
		// TODO Auto-generated method stub
		System.out.println("Display Nurse interface with patient attached");
	}

	public static void showAdmin() {
		// TODO Auto-generated method stub
		System.out.println("Display Admin interface with patient attached");
	}

	public static void showPharmacist() {
		// TODO Auto-generated method stub
		System.out.println("Display Pharmacist interface with patient attached");
	}

}
