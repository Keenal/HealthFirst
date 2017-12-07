package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import patientprocessing.Patient;
import users.Doctor;

class DoctorTest {
	
	// create an object of Doctor class
	Doctor doctor = new Doctor();
	Patient patient = new Patient();

	// test Doctor name
	@Test
	void testSetDoctor() {
		doctor.setName("John");
		assertEquals("John", Doctor.getName());
	} // end of testSetDoctor method
	
	// test prescribing a medication method
	@Test
	void test_PrescribeMedication() {
		String result = Doctor.prescribeMedication("tylenol", patient);
		String resultShouldBe = "tylenol is prescribed to " + patient;
		assertEquals(resultShouldBe, result);
	} // end of test_PrescribeMedication method

	// test toString method
	@Test
	void test_toString_returnsDoctorName() {
		String result = doctor.toString();
		assertTrue(result.contains("Doctor [name = " + doctor.getName() + "]"));
	} // end of test_toString_returnsDoctorName method
}

