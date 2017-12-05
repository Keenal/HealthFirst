package patientprocessing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
File Name: PatientDatabaseManager.java
*/


/**
 * This Class Patient Database Manager is for later development producing and requesting
 * patient information from flat files for use in HealthFirst Systems.
 */
public class PatientDatabaseManager {

	 
	private String fileName = "";
	
	/**
	 * Default constructor for the PatientDatabaseManager class
	 */
	public PatientDatabaseManager() {
		setFileName("");
	} // end of default constructor
	
	/**
	 * Parameterized constructor for the PatientDatabaseManager class
	 * @param name = The name of the patient database file
	 */
	public PatientDatabaseManager(String name) {
		setFileName(name);
	} // end of parameterized constructor

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	/**
	 * attempts to open the file to process, and throws an exception if it can't
	 * @param patientFileName = the file name of the patient database
	 */
	public void openFile(String patientFileName) {
		
		try {
			// Attempt to open the file
			Scanner fileIn ; // default empty
			fileIn = new Scanner(new FileInputStream(patientFileName));
			fileIn.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(0);
		}
	} // end of openFile method
	
	/**
	 * processes the file input (reads in the file, processes in the information to create 
	 * Patient objects stored in the file to populate the Patient Accounts) 
	 */
	public void processInput() {
		// this feature not written for prototype
	}
	
	/**
	 * processes the file output (writes to the file, processes in the information to record 
	 * Patient objects in the file for Patient database) 
	 */
	public void processOutput() {
		// this feature not written for prototype
	}
	
} // end of PatientDatabaseManager class
