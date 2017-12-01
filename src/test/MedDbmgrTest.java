package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;


import medicationprocessing.MedicationDatabaseManager;

class MedDbmgrTest {
	
	MedicationDatabaseManager db = new MedicationDatabaseManager();

	// test user name
		@Test
		public void testFileName() {
			
			db.setFileName("med");
			assertEquals("fileName", "med", db.getFileName());
			
		}
		
	// test opening the file
		@Test
		public void testOpeningFile() {
			
			File file = new File("c:/Medications.txt");
			assertTrue(file.exists());
			
		}
		
	// test input
		@Test
		public void testProcessInput() {
			
		}

}
