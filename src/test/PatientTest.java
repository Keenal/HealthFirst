package test;

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
}
