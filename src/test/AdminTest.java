package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import medicationprocessing.MedicationList;
import patientprocessing.Patient;
import patientprocessing.PatientAccounts;
import users.Administrator;
import users.User;

class AdminTest {
	
	Administrator admin = new Administrator();

	// test to create a new patient
	@Test
	void test_createPatient() {
		new PatientAccounts();
		Patient p2 = admin.createNewPatient("testName", 0, "testPrimDocName", 0, "testBloodPressure", 0, 0.0, 0.0, 
				"testFamilyHistory", "testCurrentIllness", "testAllergies");
		assertEquals(p2, PatientAccounts.patientAccounts[0]);
	} // end of test_createPatient method
	
	// test toString to return Admin name
	@Test
	void test_toString_returnsAdminName() {
		String result = admin.toString();
		assertTrue(result.contains("Administrator [name = " + User.getName() + "]"));
	} // end of test_toString_returnsAdminName method
}


