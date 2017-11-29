package users;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import medicationprocessing.Medication;
import medicationprocessing.MedicationList;
import patientprocessing.Patient;
import patientprocessing.PatientAccounts;
import patientprocessing.PatientDose;

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
File Name: Nurse.java
*/

public class Nurse extends User {
	private static GregorianCalendar calendar = new GregorianCalendar();
	
	/**
	 * Default constructor for the Nurse class
	 */
	public Nurse() {
		super();
	} // end of default constructor
	
	/**
	 * Parameterized constructor for the Nurse class
	 * @param name = The name of the Nurse
	 */
	public Nurse(String name) {
		super(name);
	} // end of parameterized constructor
	
	/**
	 * Allows the Nurse to log a dose of medication
	 * @param medicationName = The name of the medication to log
	 * @param patientID = The patientID of the Patient to log the medication for
	 * @param doseGivenInMg = the dose given to the patient in Mg
	 * @param doseGivenFor = The reason the dose was given to the patient
	 */
	public void logDose(String medicationName, int patientID, int doseGivenInMg) {
		Patient patient = PatientAccounts.searchPatient(patientID);
		Medication medicationGiven = MedicationList.getMedication(medicationName);
		Date timeDoseLogged = calendar.getTime();
		int minHoursTillDue = medicationGiven.getMinDosageTimeHours();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR, minHoursTillDue);
		Date nextDoseDue = cal.getTime();
		
		PatientDose dose = new PatientDose(medicationGiven, timeDoseLogged, nextDoseDue, "Linda Carter", doseGivenInMg);
		patient.addDose(dose);
	} // end of logDose method
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nurse [name = " + super.getName() + "]";
	}
}
