package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.Test;
import medicationprocessing.Medication;
import patientprocessing.Patient;
import patientprocessing.PatientAccounts;
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
	
	// test toString
	@Test
	void test_toString_returns_PatientDose() {
		new PatientAccounts();
		Patient patient = new Patient("Jane Doe",0,"Phil",20, "200 / 50",90, 155.5, 70.2, "Lots of drugs", "flu","Pollen");
		PatientAccounts.addPatient(patient);
		Medication medicationGiven = new Medication("testMed", "testDescription", 0, 1, false, true, false, false);
		Calendar cal = Calendar.getInstance();
		Date timeDoseLogged = cal.getTime();
		int minHoursTillDue = medicationGiven.getMinDosageTimeHours();
		cal.add(Calendar.HOUR, minHoursTillDue);
		Date nextDoseDue = cal.getTime();
		PatientDose dose = new PatientDose(medicationGiven, timeDoseLogged, nextDoseDue, "Linda Carter", 350);
		String expectedResult = dose.toString();
		String result = "[" + medicationGiven.getName() + "]  -  " + "Time last dose given: " + timeDoseLogged + ", Time next dose due: " + nextDoseDue + ", Given by: " + "Linda Carter" + ", Mg given: " + 350;
		assertEquals(expectedResult, result);
	} // end of test_toString_returns_PatientDose method
}
