package test;

<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import org.junit.jupiter.api.Test;
import patientprocessing.Patient;
import patientprocessing.PatientDose;
class PatientTest {
	Patient patient = new Patient();
	
	@Test
	public void setNameTest() {
		patient.setName("test");
		assertEquals("test", patient.getName());
	}
	
	@Test
	public void setPrimaryDoctorNameTest() {
		patient.setPrimaryDoctorName("test");
		assertEquals("test", patient.getPrimaryDoctorName());
	}
	
	@Test
	public void setAgeTest() {
		IntegerProperty intP = new SimpleIntegerProperty(21);
		assertEquals(21, intP.getValue().intValue());

	}
	
	@Test
	public void setPatientIDTest() {
		IntegerProperty intP = new SimpleIntegerProperty(1);
		assertEquals(1, intP.getValue().intValue());

	}
	
	@Test
	public void setBloodPressureTest() {
		patient.setBloodPressure("90");
		assertEquals("90", patient.getBloodPressure());
	}
	
	@Test
	public void setHeartRate() {
		IntegerProperty intP = new SimpleIntegerProperty(90);
		assertEquals(90, intP.getValue().intValue());

	}
	
	@Test 
	public void setWeightInLbsTest() {
		DoubleProperty doubleP = new SimpleDoubleProperty(183.4);
		assertEquals(183.4, doubleP.getValue().doubleValue(), 0);
		
		
	}
	
	@Test
	public void setHeightInInchesTester() {
		DoubleProperty doubleP = new SimpleDoubleProperty(64.3);
		assertEquals(64.3, doubleP.getValue().doubleValue(), 0);
	}

	
	@Test
	public void setFamilyHistoryTest() {
		patient.setFamilyHistory("test");
		assertEquals("test", patient.getFamilyHistory());
		
	}
	
	@Test
	public void setCurrentIllnessTest() {
		patient.setCurrentIllness("test");
		assertEquals("test", patient.getCurrentIllness());
		
	}
	
	@Test
	public void setAllergies() {
		patient.setAllergies("test");
		assertEquals("test", patient.getAllergies());
		
	}
	
	/**
	@Test 
	public void addDoseTest() {
		PatientDose dose = new PatientDose();
		
	}
	*/
	/**
	
	@Test
	public void toStringTest() {
		
		String result = patient.toString();
		assertTrue(result.contains("Patient [name=" + patient.getName() + ", patientID=" + patient.getPatientID() + ", primaryDoctorName=" + patient.getPrimaryDoctorName() + ", prescriptionsAwaitingVerification=" + patient.getNumOfPrescriptionsAwaitingVerification() + 
				", numOfPrescriptionsVerified=" + numOfPrescriptionsVerified + "]"));
		
	}
	*/
=======
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
		
		
	
	
	
	
	

>>>>>>> d97871311dc7d7d81ba81bee2d2d1a778df2c1fa
}
