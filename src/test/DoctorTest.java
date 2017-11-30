package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import users.Doctor;

class DoctorTest {
	
	// create an object of Doctor class
	Doctor doctor = new Doctor();

	// test Doctor name
	@Test
	void testSetDoctor() {
		
		doctor.setName("John");
		assertEquals("John", doctor.getName());
		
	}
	
	// test toString method
	@Test
	void test_toString_returnsDoctorName() {
		
		String result = doctor.toString();
		assertTrue(result.contains("Doctor [name = " + doctor.getName() + "]"));
		
	}

}
