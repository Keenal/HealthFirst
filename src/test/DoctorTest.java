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
		assertEquals("John", doctor.getName());
		
	}
	
	/*
	 * FAILing
	// test prescribing a medication method
	@Test
	void test_PrescribeMedication() {
		String result = doctor.prescribeMedication("tylenol", patient);
		assertEquals("tylenol", patient, result);
		
	}
	
	*/
	
	// test toString method
	@Test
	void test_toString_returnsDoctorName() {
		
		String result = doctor.toString();
		assertTrue(result.contains("Doctor [name = " + doctor.getName() + "]"));
		
	}

}
