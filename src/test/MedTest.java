package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import medicationprocessing.Medication;

class MedTest {
	Medication med = new Medication();

	// test medication name
	@Test
	public void testSetName() {
		med.setName("test");
		assertEquals("name", "test", med.getName());
	}
	
	// test description
	@Test
	public void testSetDescription() {	
		med.setDescription("test");
		assertEquals("description", "test", med.getDescription());	
	}
	
	// test dosage
	@Test
	public void testDosage() {	
		med.setDosageInMg(5);
		assertEquals("dosage", 5, med.getDosageInMg());	
	}	
	
	// test minDosage
	@Test
	public void testSetMinDosage() {
		med.setMinDosageTimeHours(5);
		assertEquals("Mindosage", 5, med.getMinDosageTimeHours());
	}	
	
	// test if the drug is narcotic
	@Test
	public void test_ifNarcotic() {
		med.setNarcotic(true);
		assertEquals("narcotic", true, med.isNarcotic());
	}	
	
	// test if the drug is over the counter
	@Test
	public void test_ifOverTheCounter() {
		med.setOverTheCounter(true);
		assertEquals("counter", true, med.isOverTheCounter());
	}	
	
	// test if the drug is antibiotic
	@Test
	public void test_ifAntibiotic() {
		med.setAntibiotic(true);
		assertEquals("antibiotic", true, med.isAntibiotic());
	}	
	
	// test if the drug is antiInflamitory
	@Test
	public void test_ifAntiInflamitory() {
		med.setAntiInflamitory(true);
		assertEquals("antiInfamitory", true, med.isAntiInflamitory());
	}	
	
	// test toString method
	@Test
	public void test_toString_returnsMedInfo() {	
	}
}
