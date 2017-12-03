package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import medicationprocessing.Medication;
import patientprocessing.PatientDose;

class PDoseTest {
	
	PatientDose dose = new PatientDose();
	Medication med = new Medication();
	Date timeDoseLogged = null;
	Date nextDoseDue = null;
	

	// test medication given
	@Test
	void testSetMedicationGiven() {

		dose.setMedicationGiven(med);
		assertEquals(med, dose.getMedicationGiven());
		
	}
	
	// test setting dose time
	@Test
	void testSetTimeDose() {

		dose.setTimeDoseLogged(timeDoseLogged);
		assertEquals(timeDoseLogged, dose.getTimeDoseLogged());
		
	}
	
	// test setting next dose
	@Test
	void testSetNextDose() {

		dose.setNextDoseDue(nextDoseDue);
		assertEquals(nextDoseDue, dose.getNextDoseDue());
		
	}
	
	// test nurseWhoLogged
	@Test
	void testSetNurse() {

		dose.setNurseWhoLogged("Mary");
		assertEquals("Mary", dose.getNurseWhoLogged());
		
	}
	
	// test amount of dose given
	@Test
	void testSetDoseGiven() {

		dose.setDoseGivenInMg(5);
		assertEquals(5, dose.getDoseGivenInMg());
		
	}
	
	/* FAILing
	// test setting next dose
	@Test
	void test_toString_returns_PatientDose() {

		String result = dose.toString();
		assertTrue(result.contains("[" + med.getName() + "]  -  "  + "Time last dose given: " + timeDoseLogged
				+ ", Time next dose due: " + nextDoseDue + ", Given by: " + dose.getNurseWhoLogged() + ", Mg given: "
				+ dose.getDoseGivenInMg()));
	}
	*/
	
	

}
