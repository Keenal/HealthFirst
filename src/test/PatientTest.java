package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import medicationprocessing.Medication;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import patientprocessing.Patient;
import patientprocessing.PatientDose;

class PatientTest {
	
	@Test
	public void setNameTest() {
		Patient patient = new Patient();
		patient.setName("test");
		assertEquals("test", patient.getName());
	}
	
	@Test
	public void setPrimaryDoctorNameTest() {
		Patient patient = new Patient();
		patient.setPrimaryDoctorName("test");
		assertEquals("test", patient.getPrimaryDoctorName());
	}
	
	@Test
	public void setAgeTest() {
		IntegerProperty intP = new SimpleIntegerProperty(21);
		Patient patient = new Patient();
		patient.setAge(intP.getValue());
		assertEquals(patient.getAge(), intP.getValue().intValue(),0);

	}
	
	@Test
	public void setPatientIDTest() {
		IntegerProperty intP = new SimpleIntegerProperty(1);
		Patient patient = new Patient();
		patient.setPatientID(intP.getValue());
		assertEquals(patient.getPatientID(), intP.getValue().intValue(),0);

	}
	
	@Test
	public void setBloodPressureTest() {
		Patient patient = new Patient();
		patient.setBloodPressure("90");
		assertEquals("90", patient.getBloodPressure());
	}
	
	@Test
	public void setHeartRate() {
		IntegerProperty intP = new SimpleIntegerProperty(90);
		Patient patient = new Patient();
		patient.setHeartRate(intP.getValue());
		assertEquals(patient.getHeartRate(), intP.getValue().intValue(),0);

	}
	
	@Test 
	public void setWeightInLbsTest() {
		DoubleProperty doubleP = new SimpleDoubleProperty(183.4);
		Patient patient = new Patient();
		patient.setWeightInLbs(doubleP.doubleValue());
		assertEquals(patient.getWeightInLbs(), doubleP.getValue().doubleValue(), 0);
		
		
	}
	
	@Test
	public void setHeightInInchesTester() {
		DoubleProperty doubleP = new SimpleDoubleProperty(64.3);
		Patient patient = new Patient();
		patient.setHeightInInches(doubleP.doubleValue());
		assertEquals(patient.getHeightInInches(), doubleP.getValue().doubleValue(), 0);
	}

	
	@Test
	public void setFamilyHistoryTest() {
		Patient patient = new Patient();
		patient.setFamilyHistory("test");
		assertEquals("test", patient.getFamilyHistory());
		
	}
	
	@Test
	public void setCurrentIllnessTest() {
		Patient patient = new Patient();
		patient.setCurrentIllness("test");
		assertEquals("test", patient.getCurrentIllness());
		
	}
	
	@Test
	public void setAllergies() {
		Patient patient = new Patient();
		patient.setAllergies("test");
		assertEquals("test", patient.getAllergies());
		
	}
	
	@Test 
	public void addDoseTest() {
		PatientDose patientDose = new PatientDose(null, null, null, "testNurse", 500);
		Patient patient = new Patient();
		patient.addDose(patientDose);	
		assertEquals(patientDose, patient.dosesGivenToPatient[patient.numOfDosesGiven-1]);
	
	}
	
	@Test
	public void addPrescriptionTest() {
		Medication medication = new Medication("test", "test", 500, 4, false, false, false, false);
		Patient patient = new Patient();
		patient.addPrescription(medication);
		assertEquals(medication, patient.prescriptionsAwaitingVerification[patient.numOfPrescriptionsAwaitingVerification - 1]);
		
	}
	
	@Test
	public void findPrescriptionTest() {
		
	}
	/**
	
	@Test
	public void toStringTest() {
		
		String result = patient.toString();
		assertTrue(result.contains("Patient [name=" + patient.getName() + ", patientID=" + patient.getPatientID() + ", primaryDoctorName=" + patient.getPrimaryDoctorName() + ", prescriptionsAwaitingVerification=" + patient.getNumOfPrescriptionsAwaitingVerification() + 
				", numOfPrescriptionsVerified=" + numOfPrescriptionsVerified + "]"));
		
	}
	*/
}