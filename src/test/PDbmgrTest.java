package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import patientprocessing.PatientDatabaseManager;

class PDbmgrTest {

	PatientDatabaseManager db = new PatientDatabaseManager();

	// test file name
		@Test
		public void testSetFileName() {
			
			db.setFileName("pat");
			assertEquals("fileName", "pat", db.getFileName());
			
		}
		
	// FAILing 
	//	test opening the file
		@Test
		public void testOpeningFile() {
			
			File file = new File("c:/Patients.txt");
			assertTrue(file.exists());
			
		}
		

}
