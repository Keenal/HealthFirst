package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
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
		IntegerProperty intP = new SimpleIntegerProperty(1);
		DoubleProperty doubleP = new SimpleDoubleProperty(1.3);
		Patient actual = new Patient();
		actual.setPatientID(intP.getValue());
		actual.setAge(intP.getValue());
		actual.setHeartRate(intP.getValue());
		actual.setWeightInLbs(doubleP.doubleValue());
		actual.setHeightInInches(doubleP.doubleValue());
		actual = admin.createNewPatient("name", actual.getPatientID(), "primaryDoctorName", actual.getAge(), "bloodPressure",
										actual.getHeartRate(), actual.getWeightInLbs(), actual.getHeightInInches(), 
										"familyHistory", "currentIllness", "allergies");
		//actual = admin.createNewPatient("name", 0, "primaryDoctorName", 1, "bloodPressure", 87, 45.2, 54.2, "familyHistory", "currentIllness", "allergies");
		accounts.addPatient(actual);
		assertEquals(actual, admin.createNewPatient("name", accounts.addPat);, "primaryDoctorName", actual.getAge(), "bloodPressure",
				actual.getHeartRate(), actual.getWeightInLbs(), actual.getHeightInInches(), 
				"familyHistory", "currentIllness", "allergies"));
//		assertEquals(medication, patient.prescriptionsAwaitingVerification[patient.numOfPrescriptionsAwaitingVerification - 1]);

		
	}
	
	// test toString to return Admin name
	@Test
	void test_toString_returnsAdminName() {
		
		String result = admin.toString();
		assertTrue(result.contains("Administrator [name = " + User.getName() + "]"));
	}

}
