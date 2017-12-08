package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import medicationprocessing.Medication;
import medicationprocessing.MedicationList;

class MedListTest {
	MedicationList ml = null;
	
	// tests getting a medication
	@Test
	void getMedTest() {
		Medication newMed = new Medication("testMed", "testDescription", 0, 1, false, true, false, false);
		MedicationList.addMedication(newMed);
		assertEquals(newMed, MedicationList.getMedication("testMed"));
	} // end of getMedTest method

	//tests adding a medication
	@Test
	void addMedTest() {
		MedicationList ml = new MedicationList();
		Medication newMed1 = new Medication("testMed1", "testDescription1", 0, 1, false, true, false, false);
		MedicationList.addMedication(newMed1);
		assertEquals(1, MedicationList.numOfElements);
	} // end of addtMedTest method
}
