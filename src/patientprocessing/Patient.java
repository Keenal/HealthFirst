package patientprocessing;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import medicationprocessing.Medication;


public class Patient {
	
	// Constant Variables
	private static int DOSE_GIVEN_LIST_SIZE = 100;
	//private static int PRESCRIPTION_LIST_SIZE = 50;
	//private static int NOTFOUND = -1;
	
	// Instance Variables
	private StringProperty name = new SimpleStringProperty();
	private StringProperty doctorName = new SimpleStringProperty();	
	private IntegerProperty age = new SimpleIntegerProperty();	
	private IntegerProperty pid = new SimpleIntegerProperty();	
	private static String doctor = "Phil";
	private SimpleStringProperty familyHistory;
	
	public Medication[] prescriptionsAwaitingVerification = null;
	private int numOfPrescriptionsAwaitingVerification = 0;
	private Medication[] activePrescriptionsVerified = null;
	private int numOfPrescriptionsVerified = 0;
	private PatientDose[] dosesGivenToPatient = null;
	private int numOfDosesGiven = 0;
	
	/**
	 * Parameterized constructor for the Patient class
	 * @param first = The name of the Patient
	 * @param pid = The patients identification number
	 * @param age =The patients primary doctor
	 */
	public Patient(String name, Integer pid, String primaryDoctor) {
		setName(name);
		setPid(pid);
		setDoctorName(primaryDoctor);
		dosesGivenToPatient = new PatientDose[DOSE_GIVEN_LIST_SIZE];
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
	
	
	public String getDoctor() {
		return doctor;
	}
	
	public String getDoctorName() {
		return doctorNameProperty().get();
	}
	
	public static void setDoctor(String doctor) {
		Patient.doctor = doctor;
	}

	
	public StringProperty doctorNameProperty() {
		return doctorName;
	}
	

	
	public final void setDoctorName(String doctorName) {
		doctorNameProperty().set(doctorName);
	}

	//*********************** age ******************************************//	
	
	
	/**
	 * @return the age
	 */
	public IntegerProperty getAgeProperty() {
		return age;
	}
	
	public Integer getAge() {
		return getAgeProperty().getValue();
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(IntegerProperty age) {
		this.age = age;
	}

	//*********************** pid ******************************************//	
	
	
	public IntegerProperty getPidProperty() {
		return pid;
	}
	
	public final Integer getPid() {
		return getPidProperty().getValue();
	}
	
	public final void setPid(Integer patientIdNum) {
		getPidProperty().setValue(patientIdNum);
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
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient [name=" + name + ", patientID=" + pid + "]";
		} // end of toString method
	
} // end of Patient class
