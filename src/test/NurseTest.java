package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import patientprocessing.Patient;
import users.Doctor;
import users.Nurse;

class NurseTest {
	
	// create an object of Nurse class
		Nurse nurse = new Nurse();
		Patient patient = new Patient();

		
	/*
	 * NOTCompleted, but it's a void method, so how do we test it?
	 * There is a way to test void methods if the methods have got "side effects" 
	// test logging a dose 
	@Test
	void test_logDose() {
		
		
	}
	
	*/
		
	// test toString method
		@Test
		void test_toString_returnsDoctorName() {
			
			String result = nurse.toString();
			assertTrue(result.contains("Doctor [name = " + nurse.getName() + "]"));
			
		}

}
