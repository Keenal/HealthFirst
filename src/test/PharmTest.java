package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import patientprocessing.Patient;
import users.Nurse;
import users.Pharmacist;

class PharmTest {

// create an object of Nurse class
		Pharmacist pharm = new Pharmacist();
		Patient patient = new Patient();
		
	/*
	 * NOTCompleted, but it's a void method, so how do we test it?
	 * 
	 * There is a way to test void methods if the methods have got "side effects" 
	 * 
	// test verifying a medication
	@Test
	void test_verifyMedication() {
		
		
	}
	
	*/
		
		
// test toString method
		@Test
		void test_toString_returnsDoctorName() {
			
			String result = pharm.toString();
			assertTrue(result.contains("Doctor [name = " + pharm.getName() + "]"));
			
		}

}
