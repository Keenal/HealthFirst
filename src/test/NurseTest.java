package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import medicationprocessing.Medication;
import medicationprocessing.MedicationList;
import patientprocessing.Patient;
import patientprocessing.PatientAccounts;
import users.Doctor;
import users.Nurse;
import users.Pharmacist;

class NurseTest {
	Nurse nurse = new Nurse();

	// test logging a dose 
	@Test
	void test_logDose() {
		new PatientAccounts();
		Patient patient = new Patient("Jane Doe",0,"Phil",20, "200 / 50",90, 155.5, 70.2, "Lots of drugs", "flu","Pollen");
		PatientAccounts.addPatient(patient);
		Medication testMed = new Medication("testMed", "testDescription", 0, 1, false, true, false, false);
		MedicationList medList = new MedicationList();
		medList.addMedication(testMed);
		Doctor.prescribeMedication("testMed", patient);
		Pharmacist pharm = new Pharmacist();
		pharm.verifyMedicaton("testMed", patient);
		nurse.logDose("testMed", patient.getPatientIDProperty().intValue(), 0);
		assertEquals(1, patient.numOfDosesGiven);
	} // end of test_logDose method
		
	// test toString method
	@Test
	void test_toString_returnsNurseName() {
		String result = nurse.toString();
			assertTrue(result.contains("Nurse [name = " + nurse.getName() + "]"));
	} // end of test_toString_returnsNurseName method
}