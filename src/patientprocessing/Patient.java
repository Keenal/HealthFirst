package patientprocessing;

import javafx.beans.property.IntegerProperty;
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

	private static int PRESCRIPTION_LIST_SIZE = 50;
	private static int DOSE_GIVEN_LIST_SIZE = 100;
	private static int NOTFOUND = -1;
	
	private String name = "";
	private int patientID = 0;
	private static int nextIDNum = 1000;
	private int age = 0;
	private String bloodPressure = "";
	private int heartRate = 0;
	private double weightInLbs = 0.0;
	private double heightInInches = 0.0;
	private String familyHistory = ""; 
	private String currentIllness = "";
	private String allergies = "";
	private Medication[] prescriptionsAwaitingVerification = null;
	private int numOfPrescriptionsAwaitingVerification = 0;
	private Medication[] activePrescriptionsVerified = null;
	private int numOfPrescriptionsVerified = 0;
	private PatientDose[] dosesGivenToPatient = null;
	private int numOfDosesGiven = 0;
	
	/* 
	 * Testing
	 */
	private StringProperty firstName;
	private IntegerProperty patientID2;
	public StringProperty getFirstName() {
		return firstName;
	}

	public void setFirstName(StringProperty firstName) {
		this.firstName = firstName;
	}

	public IntegerProperty getPatientID2() {
		return patientID2;
	}

	public void setPatientID2(IntegerProperty patientID2) {
		this.patientID2 = patientID2;
	}
	

	/**
	 * Default constructor for the Patient class
	 */
	public Patient() {
		setName("");
		setPatientID();
		setAge(0);
		setBloodPressure("");
		setHeartRate(0);
		setWeightInLbs(0.0);
		setHeightInInches(0.0);
		setFamilyHistory("");
		setCurrentIllness("");
		setAllergies("");
		dosesGivenToPatient = new PatientDose[DOSE_GIVEN_LIST_SIZE];
		prescriptionsAwaitingVerification = new Medication[PRESCRIPTION_LIST_SIZE];
		activePrescriptionsVerified = new Medication[PRESCRIPTION_LIST_SIZE];
	} // end of default constructor
	
	/**
	 * Parameterized constructor for the Patient class
	 * @param name = The name of the Patient
	 * @param age = The age of the patient
	 * @param bloodPressure = The patients blood pressure
	 * @param heartRate = The patients heart rate
	 * @param weightInLbs = The patients weight measured in pounds (lbs)
	 * @param heightInInches = The patients height measured in inches (in)
	 * @param familyHistory = The patients family history
	 * @param currentIllness = Any illness' that the patient currently has
	 * @param allergies = Any allergies that the patient has
	 */
	public Patient(String name, int age, String bloodPressure,
			int heartRate, double weightInLbs, double heightInInches, String familyHistory, 
			String currentIllness, String allergies) {
		setName(name);
		setPatientID();
		setAge(age);
		setBloodPressure(bloodPressure);
		setHeartRate(heartRate);
		setWeightInLbs(weightInLbs);
		setHeightInInches(heightInInches);
		setFamilyHistory(familyHistory);
		setCurrentIllness(currentIllness);
		setAllergies(allergies);
		dosesGivenToPatient = new PatientDose[DOSE_GIVEN_LIST_SIZE];
		prescriptionsAwaitingVerification = new Medication[PRESCRIPTION_LIST_SIZE];
		activePrescriptionsVerified = new Medication[PRESCRIPTION_LIST_SIZE];
	} // end of parameterized constructor

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the patientID
	 */
	public int getPatientID() {
		return patientID;
	}

	/**
	 * sets the ID for the patient using a static variable nextIDNum
	 * and increments the ID in preparation for the next patient.
	 */
	public void setPatientID() {
		this.patientID = nextIDNum++;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the bloodPressure
	 */
	public String getBloodPressure() {
		return bloodPressure;
	}

	/**
	 * @param bloodPressure the bloodPressure to set
	 */
	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	/**
	 * @return the heartRate
	 */
	public int getHeartRate() {
		return heartRate;
	}

	/**
	 * @param heartRate the heartRate to set
	 */
	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}

	/**
	 * @return the weightInLbs
	 */
	public double getWeightInLbs() {
		return weightInLbs;
	}

	/**
	 * @param weightInLbs the weightInLbs to set
	 */
	public void setWeightInLbs(double weightInLbs) {
		this.weightInLbs = weightInLbs;
	}

	/**
	 * @return the heightInInches
	 */
	public double getHeightInInches() {
		return heightInInches;
	}

	/**
	 * @param heightInInches the heightInInches to set
	 */
	public void setHeightInInches(double heightInInches) {
		this.heightInInches = heightInInches;
	}

	/**
	 * @return the familyHistory
	 */
	public String getFamilyHistory() {
		return familyHistory;
	}

	/**
	 * @param familyHistory the familyHistory to set
	 */
	public void setFamilyHistory(String familyHistory) {
		this.familyHistory = familyHistory;
	}

	/**
	 * @return the currentIllness
	 */
	public String getCurrentIllness() {
		return currentIllness;
	}

	/**
	 * @param currentIllness the currentIllness to set
	 */
	public void setCurrentIllness(String currentIllness) {
		this.currentIllness = currentIllness;
	}

	/**
	 * @return the allergies
	 */
	public String getAllergies() {
		return allergies;
	}

	/**
	 * @param allergies the allergies to set
	 */
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	} 
	
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
	private int findPrescription(Medication precriptionToFind) {
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
	} // end of findPrescription method
	
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
		return "Patient [name=" + name + ", patientID=" + patientID + ", age=" + age + ", bloodPressure="
				+ bloodPressure + ", heartRate=" + heartRate + ", weightInLbs=" + weightInLbs + ", heightInInches="
				+ heightInInches + ", familyHistory=" + familyHistory + ", currentIllness=" + currentIllness
				+ ", allergies=" + allergies + ", prescriptionsAwaitingVerification=" + numOfPrescriptionsAwaitingVerification + 
				", numOfPrescriptionsVerified=" + numOfPrescriptionsVerified + "]";
	}
	
} // end of Patient class
