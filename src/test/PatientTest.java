package test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import medicationprocessing.Medication;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import patientprocessing.Patient;
import patientprocessing.PatientDose;

class PatientTest {
	/**
	@Test
	void getNamePropertyTest() {
		Patient patient = new Patient();
		StringProperty stringP = new SimpleStringProperty("test");
		patient.setName("test");
		assertEquals(stringP, patient.getNameProperty());
		
	}
	
	*/
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
	
	// * DOES NOT WORK
	@Test
	public void findPrescriptionTest() {
		Medication medication = new Medication("test", "test", 0, 0, false, false, false, false);
		Patient patient = new Patient();
		patient.addPrescription(medication);
		
		assertEquals(0, patient.findPrescription(medication));
		
	}
	
	
	/**
	//* DOES NOT WORK
	@Test
	public void deletePrescriptionAwaitingVerificationTest() throws NoSuchMethodException,
    InvocationTargetException, IllegalAccessException  {
		Medication medication = new Medication("test", "test", 500, 4, false, false, false, false);
		Patient patient = new Patient();
		Boolean input = true;
		Method method = Patient.class.getDeclaredMethod("deletePrescriptionAwaitingVerification", Boolean.class);
		method.setAccessible(true);
		Boolean output = (Boolean) method.invoke(patient, input);
		//assertEquals(output.equals("test"));
		
	}
	*/
	/**
	 * Reflection Example to test Private Class
    @Test
    public void privateShout() throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
 
        String input = "This is magic.";
 
        Method method = NovelWriter.class.getDeclaredMethod("shout", String.class);
        method.setAccessible(true);
        String output = (String) method.invoke(novelWriter, input);
 
        assertThat(output, notNullValue());
        assertThat(output, is("THIS IS MAGIC!"));
        */
	
	@Test
	public void verifyPrescriptionTest() {
		Medication medication = new Medication("test", "test", 500, 4, false, false, false, false);
		Patient patient = new Patient();
		patient.verifyPrescription(medication);
		assertEquals(medication, patient.activePrescriptionsVerified[patient.numOfPrescriptionsAwaitingVerification - 1]);
		
	}
	
	//Special assert to find equalities objects
	
	/**
	@Test
	public void toStringTest() {
		
		String result = patient.toString();
		assertTrue(result.contains("Patient [name=" + patient.getName() + ", patientID=" + patient.getPatientID() + ", primaryDoctorName=" + patient.getPrimaryDoctorName() + ", prescriptionsAwaitingVerification=" + patient.getNumOfPrescriptionsAwaitingVerification() + 
				", numOfPrescriptionsVerified=" + numOfPrescriptionsVerified + "]"));
		
	}
	*/
}