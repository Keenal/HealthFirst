package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import patientprocessing.Patient;

class PatientTest {
	
	Patient patient = new Patient();

	// test patient name
	@Test
	public void testSetName() {
		
		patient.setName("test");
		assertEquals("name", "test", patient.getName());
		
	}
	
	// test primary doctor name
	@Test
	public void testSetPrimaryDoctorName() {
		
		patient.setPrimaryDoctorName("test");
		assertEquals("Dname", "test", patient.getPrimaryDoctorName());
		
	}
	
	// test age
	@Test
	public void testSetAge() {
		
		patient.setAge(37);
		assertEquals("age", "37", patient.getAge());
		
	}
	
	// test patient ID
	@Test
	public void testSetPatientID() {
		
		patient.setPatientID(6);
		assertEquals(6, patient.getPatientIDProperty());
		
	}
	
	// test blood pressure
	@Test
	public void testSetHeartRate() {
		
		patient.setHeartRate(65);
		assertEquals("heartrate", "high", patient.getHeartRate());
		
	}
	
	// test weight 
	@Test
	public void testSetWeight() {
		
		patient.setWeightInLbs(54.5);
		assertEquals("weight", 54.5, patient.getWeightInLbsProperty());
		
	}
	
	

}
