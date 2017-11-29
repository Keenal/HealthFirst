package patientprocessing;

import java.util.Date;

import medicationprocessing.Medication;
import users.Nurse;

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
File Name: PatientDose.java
*/

public class PatientDose {
	Medication medicationGiven = null;
	Date timeDoseLogged = null;
	Date nextDoseDue = null;
	String nurseWhoLogged = "";
	int doseGivenInMg = 0;
	
	/**
	 * Default constructor for the PatientDose class
	 */
	public PatientDose() {
		setMedicationGiven(null);
		setTimeDoseLogged(null);
		setNextDoseDue(null);
		setNurseWhoLogged("");
		setDoseGivenInMg(0);
	}
	
	/**
	 * Default constructor for the PatientDose class
	 * @param medicationGiven = The name of the Medication that the dose was given of
	 * @param timeDoseLogged2 = The time the dose was given
	 * @param nextDoseDue2 = The time the next dose is due
	 * @param nurseWhoLogged = The Nurse who gave the dose
	 * @param doseGivenInMg = The amount in Mg of dose given
	 */
	public PatientDose(Medication medicationGiven, Date timeDoseLogged, Date nextDoseDue, String nurseWhoLogged, int doseGivenInMg) {
		setMedicationGiven(medicationGiven);
		setTimeDoseLogged(timeDoseLogged);
		setNextDoseDue(nextDoseDue);
		setNurseWhoLogged(nurseWhoLogged);
		setDoseGivenInMg(doseGivenInMg);
	}

	/**
	 * @return the medicationGiven
	 */
	public Medication getMedicationGiven() {
		return medicationGiven;
	}

	/**
	 * @param medicationGiven the medicationGiven to set
	 */
	public void setMedicationGiven(Medication medicationGiven) {
		this.medicationGiven = medicationGiven;
	}

	/**
	 * @return the timeDoseLogged
	 */
	public Date getTimeDoseLogged() {
		return timeDoseLogged;
	}

	/**
	 * @param timeDoseLogged the timeDoseLogged to set
	 */
	public void setTimeDoseLogged(Date timeDoseLogged) {
		this.timeDoseLogged = timeDoseLogged;
	}

	/**
	 * @return the nextDoseDue
	 */
	public Date getNextDoseDue() {
		return nextDoseDue;
	}

	/**
	 * @param nextDoseDue the nextDoseDue to set
	 */
	public void setNextDoseDue(Date nextDoseDue) {
		this.nextDoseDue = nextDoseDue;
	}
	
	/**
	 * @return the nurseWhoLogged
	 */
	public String getNurseWhoLogged() {
		return nurseWhoLogged;
	}

	/**
	 * @param nurseWhoLogged the nurseWhoLogged to set
	 */
	public void setNurseWhoLogged(String nurseWhoLogged) {
		this.nurseWhoLogged = nurseWhoLogged;
	}

	/**
	 * @return the doseGivenInMg
	 */
	public int getDoseGivenInMg() {
		return doseGivenInMg;
	}

	/**
	 * @param doseGivenInMg the doseGivenInMg to set
	 */
	public void setDoseGivenInMg(int doseGivenInMg) {
		this.doseGivenInMg = doseGivenInMg;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ("[" + medicationGiven.getName() + "]  -  "  + "Time last dose given: " + timeDoseLogged
				+ ", Time next dose due: " + nextDoseDue + ", Given by: " + nurseWhoLogged + ", Mg given: "
				+ doseGivenInMg);
	} // end of toString method
	
} // end of PatientDose class
