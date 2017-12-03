package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import medicationprocessing.Medication;
import patientprocessing.Patient;
import patientprocessing.PatientDose;

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
		assertEquals("age", 37, patient.getAgeProperty());
		
	}
	
	// test patient ID
	@Test
	public void testSetPatientID() {
		
		patient.setPatientID(6);
		assertEquals(6, patient.getPatientIDProperty());
		
	}
	
	// test bloodPressure
	@Test
	public void testSetBloodPressure() {
		
		patient.setBloodPressure("high");
		assertEquals("bPressure", "high", patient.getBloodPressure());
		
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
	
	// test height
	@Test
	public void testSetHeight() {
		
		patient.setHeightInInches(67.5);;
		assertEquals("height", 67.5, patient.getHeightInInchesProperty());
		
	}
	
	// test family history
	@Test
	public void testSetFamilyHistory() {
		
		patient.setFamilyHistory("none");
		assertEquals("none", patient.getFamilyHistory());
		
	}
	
	// test current illness
	@Test
	public void testSetCurrentIllness() {
		
		patient.setCurrentIllness("none");
		assertEquals("none", patient.getCurrentIllness());
		
	}
	
	// test allergies
	@Test
	public void testSetAllergies() {
		
		patient.setAllergies("none");
		assertEquals("none", patient.getAllergies());
		
	}
	
	/* FAILing
	// test adding a dose
	@Test
	public void testAddDose() {
		
		PatientDose doseGiven = patient.dosesGivenToPatient[patient.numOfDosesGiven++];
		assertEquals(0, patient.addDose(doseGiven);
		
	}
	*/
	
	/* FAILing
	// test adding a prescription
	@Test
	public void testAddPrescription() {
		
		Medication newPrescription = patient.prescriptionsAwaitingVerification[patient.numOfPrescriptionsAwaitingVerification++];
		assertEquals(0, patient.addPrescription(newPrescription);
		
	}
	*/
	
	// test finding prescription
	@Test
	public void testFindPrescription() {
		
		
		
	}
	
	// test deleting prescription
		@Test
		public void testDeletePrescription() {
			
			
			
		}
		
	// test finding prescription
	@Test
	public void testVerifyPrescription() {
		
		
		
	}
	
	// test medication history
	@Test
	public void test_medicationHistory() {
		
		
		
	}
	
	// test toString
	@Test
	public void test_toString_retunrns_PatientInfo() {
		
		
		
	}
		
		
	
	
	
	
	

}
