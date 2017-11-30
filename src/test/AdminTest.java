package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import patientprocessing.Patient;
import patientprocessing.PatientAccounts;
import users.Administrator;
import users.User;

class AdminTest {
	
	Administrator admin = new Administrator();
	PatientAccounts accounts = new PatientAccounts();

	// FAILing
	// test to create a new patient
	@Test
	void test_createPatient() {
		
		Patient actual = admin.createNewPatient("name", 1, "primaryDoctorName", 1, "bloodPressure", 87, 45.2, 54.2, "familyHistory", "currentIllness", "allergies");
		accounts.addPatient(actual);
	//	assertEquals()
		
		
	}
	
	// test toString to return Admin name
	@Test
	void test_toString_returnsAdminName() {
		
		String result = admin.toString();
		assertTrue(result.contains("Administrator [name = " + User.getName() + "]"));
	}

}
