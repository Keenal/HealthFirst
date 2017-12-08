package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import patientprocessing.Patient;
import users.Doctor;
import users.Pharmacist;

class PharmTest {
	Pharmacist pharm = new Pharmacist();
	Patient patient = new Patient();
		
	// test verifying a medication
	@Test
	void test_verifyMedication() {
		Doctor.prescribeMedication("advil", patient);
		int numPresAwaitVer = patient.numOfPrescriptionsAwaitingVerification;
		int numPresVer = patient.numOfPrescriptionsVerified;
		pharm.verifyMedicaton("advil", patient);
		// Typically only one assert per test method, but this is really a single action being tested
		// and all of the tutorials say we can do it this way that i have read/watched
		assertEquals(numPresAwaitVer, patient.numOfPrescriptionsAwaitingVerification);
		assertEquals(numPresVer + 1, patient.numOfPrescriptionsVerified);
	} // end of test_verifyMedication method
		
	// test toString method
	@Test
	void test_toString_returnsDoctorName() {
		String result = pharm.toString();
		assertTrue(result.contains("Pharmacist [name = " + pharm.getName() + "]"));
	}  // end of test_toString_returnsDoctorName method
}