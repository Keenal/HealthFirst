package test;

import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.InvocationTargetException;
import static org.junit.Assert.assertEquals;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import medicationprocessing.Medication;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import org.junit.jupiter.api.Test;
import patientprocessing.Patient;
import patientprocessing.PatientDose;

class PatientTest {
	
	@Test
	void getNamePropertyTest() {
		Patient patient = new Patient();
		StringProperty stringP = new SimpleStringProperty("test");
		patient.setName("test");
		assertEquals(patient.getName(), stringP.getValue());
	}
	
	@Test
	public void setNameTest() {
		Patient patient = new Patient();
		patient.setName("test");
		assertEquals("test", patient.getName());
	}
	
	@Test
	public void getPrimaryDoctorNamePropertyTest() {
		Patient patient = new Patient();
		StringProperty stringP = new SimpleStringProperty("test");
		patient.setPrimaryDoctorName("test");
		assertEquals(patient.getPrimaryDoctorName(), stringP.getValue());
	}
	
	@Test
	public void setPrimaryDoctorNameTest() {
		Patient patient = new Patient();
		patient.setPrimaryDoctorName("test");
		assertEquals("test", patient.getPrimaryDoctorName());
	}
	
	@Test
	public void getAgePropertyTest() {
		Patient patient = new Patient();
		IntegerProperty intP = new SimpleIntegerProperty(0);
		patient.setAge(0);
		assertEquals(patient.getAge(), intP.getValue());
	}
	
	@Test
	public void setAgeTest() {
		IntegerProperty intP = new SimpleIntegerProperty(21);
		Patient patient = new Patient();
		patient.setAge(intP.getValue());
		assertEquals(patient.getAge(), intP.getValue().intValue(),0);
	}
	
	@Test
	public void getPatientIDPropertyTest() {
		Patient patient = new Patient();
		IntegerProperty intP = new SimpleIntegerProperty(0);
		patient.setPatientID(0);
		assertEquals(patient.getPatientID(), intP.getValue());
	}
	
	@Test
	public void setPatientIDTest() {
		IntegerProperty intP = new SimpleIntegerProperty(1);
		Patient patient = new Patient();
		patient.setPatientID(intP.getValue());
		assertEquals(patient.getPatientID(), intP.getValue().intValue(),0);
	}
	
	@Test
	public void getBloodPressurePropertyTest() {
		Patient patient = new Patient();
		StringProperty stringP = new SimpleStringProperty("test");
		patient.setBloodPressure("test");
		assertEquals(patient.getBloodPressure(), stringP.getValue());
	}
	
	@Test
	public void setBloodPressureTest() {
		Patient patient = new Patient();
		patient.setBloodPressure("90");
		assertEquals("90", patient.getBloodPressure());
	}
	
	@Test
	public void getHeartRatePropertyTest() {
		Patient patient = new Patient();
		IntegerProperty intP = new SimpleIntegerProperty(0);
		patient.setHeartRate(0);
		assertEquals(patient.getHeartRate(), intP.getValue());
	}
	
	@Test
	public void setHeartRateTest() {
		IntegerProperty intP = new SimpleIntegerProperty(90);
		Patient patient = new Patient();
		patient.setHeartRate(intP.getValue());
		assertEquals(patient.getHeartRate(), intP.getValue().intValue(),0);
	}
	
	@Test
	public void getWeightInLbsPropertyTest() {
		Patient patient = new Patient();
		DoubleProperty doubleP = new SimpleDoubleProperty(0.0);
		patient.setWeightInLbs(0.0);
		assertEquals(patient.getWeightInLbs(), doubleP.getValue());
	}
	
	@Test 
	public void setWeightInLbsTest() {
		DoubleProperty doubleP = new SimpleDoubleProperty(183.4);
		Patient patient = new Patient();
		patient.setWeightInLbs(doubleP.doubleValue());
		assertEquals(patient.getWeightInLbs(), doubleP.getValue().doubleValue(), 0);
	}
	
	@Test
	public void getHeightInInchesPropertyTest() {
		Patient patient = new Patient();
		DoubleProperty doubleP = new SimpleDoubleProperty(0.0);
		patient.setHeightInInches(0.0);
		
		assertEquals(patient.getHeightInInches(), doubleP.getValue());
	}
	
	@Test
	public void setHeightInInchesTester() {
		DoubleProperty doubleP = new SimpleDoubleProperty(64.3);
		Patient patient = new Patient();
		patient.setHeightInInches(doubleP.doubleValue());
		assertEquals(patient.getHeightInInches(), doubleP.getValue().doubleValue(), 0);
	}

	@Test
	public void getFamilyHistoryProperty() {
		Patient patient = new Patient();
		StringProperty stringP = new SimpleStringProperty("test");
		patient.setFamilyHistory("test");
		assertEquals(patient.getFamilyHistory(), stringP.getValue());
	}
	
	@Test
	public void setFamilyHistoryTest() {
		Patient patient = new Patient();
		patient.setFamilyHistory("test");
		assertEquals("test", patient.getFamilyHistory());
	}
	
	@Test
	public void getCurrentIllnessPropertyTest() {
		Patient patient = new Patient();
		StringProperty stringP = new SimpleStringProperty("test");
		patient.setCurrentIllness("test");
		assertEquals(patient.getCurrentIllness(), stringP.getValue());
	}
	
	@Test
	public void getAllergiesPropertyTest() {
		Patient patient = new Patient();
		StringProperty stringP = new SimpleStringProperty("test");
		patient.setAllergies("test");
		assertEquals(patient.getAllergies(), stringP.getValue());
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
		Medication medication = new Medication("test", "test", 0, 0, false, false, false, false);
		Patient patient = new Patient();
		patient.addPrescription(medication);
		assertEquals(0, patient.findPrescription(medication));
	}

	@Test
	public void deletePrescriptionAwaitingVerificationTest() throws NoSuchMethodException,
    InvocationTargetException, IllegalAccessException  {
		Medication medication = new Medication("test", "test", 500, 4, false, false, false, false);
		Patient patient = new Patient();
		boolean deleted = patient.deletePrescriptionAwaitingVerification(medication);
		assertEquals(false, deleted);
	}

	@Test
	public void verifyPrescriptionTest() {
		Medication medication = new Medication();
		Patient patient = new Patient();
		patient.verifyPrescription(medication);
		assertEquals(medication, patient.activePrescriptionsVerified[patient.numOfPrescriptionsAwaitingVerification]);
	}
	
	@Test
	public void medicationHistoryTest() {
		Patient patient = new Patient();
		assertEquals("", patient.medicationHistory());		
	}

	@Test
	public void toStringTest() {
		Patient patient = new Patient("Jane Doe", 0, "Phil", 20, "200 / 50", 90, 155.5, 70.2, "Lots of drugs", "flu","Pollen");
		String result = patient.toString();
		System.out.println(result);
		assertTrue(result.contains("Patient [name=StringProperty [value: Jane Doe], patientID=IntegerProperty [value: 0], "
				+ "primaryDoctorName=StringProperty [value: Phil], prescriptionsAwaitingVerification=0, numOfPrescriptionsVerified=0]"));
	}	
}