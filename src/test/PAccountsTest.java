package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import patientprocessing.Patient;
import patientprocessing.PatientAccounts;

class PAccountsTest {

	@Test
	void addPatientTest() {
		Patient patient = new Patient();
		new PatientAccounts();
		PatientAccounts.addPatient(patient);
		assertEquals(patient, PatientAccounts.patientAccounts[PatientAccounts.numOfElements-1]);
	} // end of addPatientTest method
	
	@Test
	void searchPatientFirstTest() {
		Patient patient1 = new Patient();
		Patient patient2 = new Patient();
		Patient patient3 = new Patient("mufasa", 123, "primaryDoctorName", 1, "bloodPressure", 1, 1.1, 1.1, 
				"familyHistory", "currentIllness", "allergies");
		PatientAccounts.addPatient(patient1);
		PatientAccounts.addPatient(patient2);
		PatientAccounts.addPatient(patient3);
		Patient patientFound = PatientAccounts.searchPatient("mufasa");
		assertEquals(patient3, patientFound);
	}

}

