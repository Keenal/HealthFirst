package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import medicationprocessing.MedicationDatabaseManager;
import medicationprocessing.MedicationList;

class MedDbmgrTest {
	MedicationDatabaseManager db = new MedicationDatabaseManager();

	// test user name
		@Test
		public void testFileName() {
			db.setFileName("med");
			assertEquals("fileName", "med", db.getFileName());	
		} // end of testFileName method
		
	// test opening the file
		@Test
		public void testOpeningFile() {
			boolean didOpen = db.openFile("Medications.txt");
			assertEquals(true, didOpen);
		} // end of testOpeningFile method
		
	// test input
		@Test
		public void testProcessInput() {
			MedicationList medicationList = new MedicationList();
			db.openFile("Medications.txt");
			db.processInput(medicationList);
			assertNotNull(MedicationList.medications[0]);
		} // end of testProcessInput method
}
