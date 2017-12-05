package patientprocessing;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import medicationprocessing.Medication;

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
File Name: Patient.java
*/
public class Patient {
	
	// Constant Variables
	private static final int DOSE_GIVEN_LIST_SIZE = 100;
	private static final int PRESCRIPTION_LIST_SIZE = 50;
	private static final int NOTFOUND = -1;
	
	// Instance Variables
	private StringProperty 	name = 			new SimpleStringProperty();
	private IntegerProperty patientID = 	new SimpleIntegerProperty();
	private StringProperty 	primaryDoctorName = new SimpleStringProperty();	
	private IntegerProperty age = 			new SimpleIntegerProperty();	
	private StringProperty 	bloodPressure = new SimpleStringProperty();  
	private IntegerProperty heartRate = 	new SimpleIntegerProperty();		
	private DoubleProperty 	weightInLbs = 	new SimpleDoubleProperty();
	private DoubleProperty 	heightInInches = 	new SimpleDoubleProperty();
	private StringProperty 	familyHistory = 	new SimpleStringProperty(); 
	private StringProperty 	currentIllness = 	new SimpleStringProperty(); 
	private StringProperty 	allergies =		 new SimpleStringProperty();
	
	// the 3 arrays needed for each Patient 
	// 1) prescriptionsAwaitingVerification 2) activePrescriptionsVerified 3) dosesGivenToPatient
	public Medication[] prescriptionsAwaitingVerification = null;
	public int numOfPrescriptionsAwaitingVerification = 0;
	
	public Medication[] activePrescriptionsVerified = null;
	public int numOfPrescriptionsVerified = 0;
	
	public PatientDose[] dosesGivenToPatient = null;
	public int numOfDosesGiven = 0;
	
	//*********************** constructor ******************************************//

	public Patient() {
		setName(""); 
		setPatientID(0); 
		setPrimaryDoctorName("");
		setAge(0);  
		setBloodPressure("");
		setHeartRate(0); 
		setWeightInLbs(0.0); 
		setHeightInInches(0.0); 
		setFamilyHistory(""); 
		setCurrentIllness(""); 
		setAllergies(""); 

		dosesGivenToPatient = 				new PatientDose[DOSE_GIVEN_LIST_SIZE];
		prescriptionsAwaitingVerification = new Medication[PRESCRIPTION_LIST_SIZE];
		activePrescriptionsVerified = 		new Medication[PRESCRIPTION_LIST_SIZE];
	}
	
	/**
	 * Parameterized constructor for the Patient class
	 * @param age 
	 * @param bloodPressure 
	 * @param heartRate
	 * @param weightInLbs
	 * @param heightInInches
	 * @param familyHistory
	 * @param currentIllness
	 * @param allergies
	 * @param first = The name of the Patient
	 * @param pid = The patients identification number
	 * @param age =The patients primary doctor
	 */
	public Patient(String name, Integer patientID, String primaryDoctorName, Integer age, String bloodPressure, Integer heartRate, Double weightInLbs, Double heightInInches, String familyHistory, String currentIllness, String allergies) {
		setName(name); //tested
		setPatientID(patientID); // tested
		setPrimaryDoctorName(primaryDoctorName); //tested
		setAge(age);  //tested
		setBloodPressure(bloodPressure);
		setHeartRate(heartRate); //tested
		setWeightInLbs(weightInLbs); //tested 
		setHeightInInches(heightInInches); //tested
		setFamilyHistory(familyHistory); // tested
		setCurrentIllness(currentIllness); //tested
		setAllergies(allergies); //tested
		
		
		
		
		dosesGivenToPatient = 				new PatientDose[DOSE_GIVEN_LIST_SIZE];
		prescriptionsAwaitingVerification = new Medication[PRESCRIPTION_LIST_SIZE];
		activePrescriptionsVerified = 		new Medication[PRESCRIPTION_LIST_SIZE];
	} // end of constructor method

	//*********************** name ******************************************//
	
	/**
	 * @return the StringProperty name
	 */
	public StringProperty getNameProperty() {
		return name;
	}
	/**
	 * @return the String name
	 */
	public String getName() {
		return getNameProperty().get();
	}
	/**
	 * @param name = the Patient's name to set
	 */
	public void setName(String name) {
		getNameProperty().set(name);
	}
	
	//*********************** primaryDoctor ******************************************//	
	
	/**
	 * @return the StringProperty of primaryDoctorName
	 */
	public StringProperty getPrimaryDoctorNameProperty() {
		return primaryDoctorName;
	}
	/**
	 * @return the String primaryDoctorName
	 */
	public String getPrimaryDoctorName() {
		return getPrimaryDoctorNameProperty().get();
	}
	/**
	 * @param primaryDoctorName = the Patient's primary doctors name to set
	 */
	public void setPrimaryDoctorName(String primaryDoctorName) {
		getPrimaryDoctorNameProperty().set(primaryDoctorName);
	}
	
	//*********************** age ******************************************//	
	
	/**
	 * @return the IntegerProperty of age
	 */
	public IntegerProperty getAgeProperty() {
		return age;
	}
	/**
	 * @return the Integer age
	 */
	public Integer getAge() {
		return getAgeProperty().getValue();
	}
	/**
	 * @param age = the Patients age to set
	 */
	public void setAge(Integer age) {
		getAgeProperty().setValue(age);
	}

	//*********************** pid ******************************************//	
	
	/**
	 * @return the IntegerProperty of patientID
	 */
	public IntegerProperty getPatientIDProperty() {
		return patientID;
	}
	/**
	 * @return the Integer patientID
	 */
	public final Integer getPatientID() {
		return getPatientIDProperty().getValue();
	}
	/**
	 * @param patientID = the Patients ID to set
	 */
	public void setPatientID(Integer patientID) {
		getPatientIDProperty().setValue(patientID);
	}
	
	//*********************** bloodPressure ******************************************//
	
	/**
	 * @return the StringProperty of bloodPressure
	 */
	public StringProperty getBloodPressureProperty() {
		return bloodPressure;
	}
	/**
	 * @return the String bloodPressure
	 */
	public String getBloodPressure() {
		return getBloodPressureProperty().get();
	}
	/**
	 * @param bloodPressure = the Patient's bloodPressure to set
	 */
	public void setBloodPressure(String bloodPressure) {
		getBloodPressureProperty().set(bloodPressure);
	}

	//*********************** heartRate ******************************************//	
	
	/**
	 * @return the IntegerProperty of heartRate
	 */
	public IntegerProperty getHeartRateProperty() {
		return heartRate;
	}
	/**
	 * @return the Integer heartRate
	 */
	public Integer getHeartRate() {
		return getHeartRateProperty().getValue();
	}
	/**
	 * @param heartRate = the Patients heartRate to set
	 */
	public void setHeartRate(Integer heartRate) {
		getHeartRateProperty().setValue(heartRate);
	}

	//*********************** weightInLbs ******************************************//
	
	/**
	 * @return the DoubleProperty of weightInLbs
	 */
	public DoubleProperty getWeightInLbsProperty() {
		return weightInLbs;
	}
	/**
	 * @return the Double weightInLbs
	 */
	public Double getWeightInLbs() {
		return getWeightInLbsProperty().getValue();
	}
	/**
	 * @param weightInLbs = the Patients weightInLbs to set
	 */
	public void setWeightInLbs(Double weightInLbs) {
		getWeightInLbsProperty().setValue(weightInLbs);
	}

	//*********************** heightInInches ******************************************//
	
	/**
	 * @return the DoubleProperty of heightInInches
	 */
	public DoubleProperty getHeightInInchesProperty() {
		return heightInInches;
	}
	/**
	 * @return the Double heightInInches
	 */
	public Double getHeightInInches() {
		return getHeightInInchesProperty().getValue();
	}
	/**
	 * @param heightInInches = the Patients heightInInches to set
	 */
	public void setHeightInInches(Double heightInInches) {
		getHeightInInchesProperty().setValue(heightInInches);
	}

	//*********************** familyHistory ******************************************//
	
	/**
	 * @return the StringProperty of familyHistory
	 */
	public StringProperty getFamilyHistoryProperty() {
		return familyHistory;
	}
	/**
	 * @return the String familyHistory
	 */
	public String getFamilyHistory() {
		return getFamilyHistoryProperty().get();
	}
	/**
	 * @param familyHistory = the Patient's familyHistory to set
	 */
	public void setFamilyHistory(String familyHistory) {
		getFamilyHistoryProperty().set(familyHistory);
	}

	//*********************** currentIllness ******************************************//
	
	/**
	 * @return the StringProperty of currentIllness
	 */
	public StringProperty getCurrentIllnessProperty() {
		return currentIllness;
	}
	/**
	 * @return the String currentIllness
	 */
	public String getCurrentIllness() {
		return getCurrentIllnessProperty().get();
	}
	/**
	 * @param currentIllness = the Patient's currentIllness to set
	 */
	public void setCurrentIllness(String currentIllness) {
		getCurrentIllnessProperty().set(currentIllness);
	}

	//*********************** allergies ******************************************//
	
	/**
	 * @return the StringProperty of allergies
	 */
	public StringProperty getAllergiesProperty() {
		return allergies;
	}
	/**
	 * @return the String allergies
	 */
	public String getAllergies() {
		return getAllergiesProperty().get();
	}
	/**
	 * @param allergies = the Patient's allergies to set
	 */
	public void setAllergies(String allergies) {
		getAllergiesProperty().set(allergies);
	}
	
	//*********************** working content methods ******************************************//
	
	/**
	 * adds a dose to the patients dosesGivenToPatient array 
	 * and increments the numOfDosesGiven instance variable by 1
	 * @param doseGiven = the dose to add to the dosesGivenToPatient array
	 */
	public void addDose(PatientDose doseGiven) {
		dosesGivenToPatient[numOfDosesGiven++] = doseGiven;
	} // end of addDose method
	
	/**
	 * adds a prescription to the patients prescriptionsAwaitingVerification array 
	 * and increments the numOfPrescriptionsAwaitingVerification instance variable by 1
	 * @param newPrescription = the new prescription to add
	 */
	public void addPrescription(Medication newPrescription) {
		prescriptionsAwaitingVerification[numOfPrescriptionsAwaitingVerification++] = newPrescription;
	} // end of addPrescription method

	/**
	 * attempts to find a prescription in the prescriptionsAwaitingVerification array, returns NOTFOUND constant if not found
	 * @param precriptionToFind = the prescription to find
	 * @return int = the array index number that was found, or NOTFOUND constant if the prescription was not found
	 */
	public int findPrescription(Medication precriptionToFind) {
		for (int indexNumber = 0; indexNumber < prescriptionsAwaitingVerification.length; indexNumber++) {
			if (prescriptionsAwaitingVerification[indexNumber] == null) {
				continue;
			}
			else if (prescriptionsAwaitingVerification[indexNumber].getName().equalsIgnoreCase(precriptionToFind.getName())) {
				return indexNumber;
			}
			else { 
				continue;
			}
		}
		return NOTFOUND;
	} // end of findPrescription method*/
	
	/**
	 * uses findPrescription() method to find and delete an prescriptionsAwaitingVerification after it is verified
	 * this method also re-organizes the users array to get rid of null or empty objects in the middle of the array 
	 * @param precriptionToDelete = the prescription to delete
	 * @return boolean = true if account was found and deleted, or false if not
	 */
	private boolean deletePrescriptionAwaitingVerification(Medication precriptionToDelete) {
		int findPrescriptionResult = findPrescription(precriptionToDelete);
		int j = 0;
		if (findPrescriptionResult >= 0) {
			prescriptionsAwaitingVerification[findPrescriptionResult] = null;
			for (int i = 0; i < prescriptionsAwaitingVerification.length; i++) {
				if ((prescriptionsAwaitingVerification[i] != null) && !(prescriptionsAwaitingVerification[i].getName().equalsIgnoreCase(""))) {
					prescriptionsAwaitingVerification[j] = prescriptionsAwaitingVerification[i];
					j++;
				}
			}
			numOfPrescriptionsAwaitingVerification = j;
			for (int k = j; k < prescriptionsAwaitingVerification.length; k++) {
				prescriptionsAwaitingVerification[k] = null;
			}
			return true;
		} else {
			return false;
		}
	} // end of deletePrescriptionAwaitingVerification method
	
	/**
	 * adds a prescription to the patients activePrescriptionsVerified array 
	 * and increments the numOfPrescriptionsVerified instance variable by 1
	 * @param prescriptionAwaitingVerification = the prescription to verify
	 */
	public void verifyPrescription(Medication prescriptionAwaitingVerification) {
		activePrescriptionsVerified[numOfPrescriptionsVerified++] = prescriptionAwaitingVerification;
		deletePrescriptionAwaitingVerification(prescriptionAwaitingVerification);
	} // end of verifyPrescription method
	
	/* returns a nicely formatted String representing the history of the medication given to the patient
	 * @return a formatted String
	 */
	public String medicationHistory() {
		String completeString = "";
			for (int l = 0; l < this.numOfDosesGiven; l++) {
				completeString += dosesGivenToPatient[l].toString() + "\n";
			} 
			return completeString;
	} // end of medicationHistory method
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient [name=" + name + ", patientID=" + patientID + ", primaryDoctorName=" + primaryDoctorName + ", prescriptionsAwaitingVerification=" + numOfPrescriptionsAwaitingVerification + 
				", numOfPrescriptionsVerified=" + numOfPrescriptionsVerified + "]";
		} // end of toString method
	
} // end of Patient class
