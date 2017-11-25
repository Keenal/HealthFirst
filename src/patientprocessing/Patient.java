package patientprocessing;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Patient {
	
	//private static int PRESCRIPTION_LIST_SIZE = 50;
	private static int DOSE_GIVEN_LIST_SIZE = 100;
	//private static int NOTFOUND = -1;
	private PatientDose[] dosesGivenToPatient = null;
	private int numOfDosesGiven = 0;

	
	
	public Patient(String first,Integer pid) {
this.setFirstName(first);
this.setPid(pid);
dosesGivenToPatient = new PatientDose[DOSE_GIVEN_LIST_SIZE];

	}
	
	
	/* 
	 * JavaFX compliance Requirements
	 */
	private final StringProperty firstName = new SimpleStringProperty();
	public StringProperty firstNameProperty() {
		return firstName;
	}
	public final String getName() {
		return firstNameProperty().get();
	}
	public final void setFirstName(String firstname) {
		firstNameProperty().set(firstname);
	}
	
	private final IntegerProperty pid = new SimpleIntegerProperty();
	public IntegerProperty pidProperty() {
		return pid;
	}
	public final Integer getPatientID() {
		return pidProperty().getValue();
	}
	public final void setPid(Integer number) {
		pidProperty().setValue(number);
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
//public void addPrescription(Medication newPrescription) {
//	prescriptionsAwaitingVerification[numOfPrescriptionsAwaitingVerification++] = newPrescription;
//} // end of addPrescription method
	
	/**
	 * attempts to find a prescription in the prescriptionsAwaitingVerification array, returns NOTFOUND constant if not found
	 * @param precriptionToFind = the prescription to find
	 * @return int = the array index number that was found, or NOTFOUND constant if the prescription was not found
	 */
/*private int findPrescription(Medication precriptionToFind) {
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
	/*private boolean deletePrescriptionAwaitingVerification(Medication precriptionToDelete) {
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
	*/
	/**
	 * adds a prescription to the patients activePrescriptionsVerified array 
	 * and increments the numOfPrescriptionsVerified instance variable by 1
	 * @param prescriptionAwaitingVerification = the prescription to verify
	 */
	/*public void verifyPrescription(Medication prescriptionAwaitingVerification) {
		activePrescriptionsVerified[numOfPrescriptionsVerified++] = prescriptionAwaitingVerification;
		deletePrescriptionAwaitingVerification(prescriptionAwaitingVerification);
	} // end of verifyPrescription method
	*/
	/* returns a nicely formatted String representing the history of the medication given to the patient
	 * @return a formatted String
	 *//*
	public String medicationHistory() {
		String completeString = "";
			for (int l = 0; l < this.numOfDosesGiven; l++) {
				completeString += dosesGivenToPatient[l].toString() + "\n";
			} 
			return completeString;
	} // end of medicationHistory method
	
	*/
	
	
	@Override
	public String toString() {
		return "Patient [name=" + firstName + ", patientID=" + pid + "]";
		}
}
