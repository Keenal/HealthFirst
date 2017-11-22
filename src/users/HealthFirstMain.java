package users;

import medicationprocessing.MedicationDatabaseManager;
import medicationprocessing.MedicationList;
import patientprocessing.Patient;
import patientprocessing.PatientAccounts;

public class HealthFirstMain {

	public static void main(String[] args) {
		String inputFileName = "Medications.txt";
		MedicationList medicationList = new MedicationList();
		MedicationDatabaseManager medDB = new MedicationDatabaseManager(inputFileName);
		medDB.openFile(inputFileName);
		medDB.processInput(medicationList);
		new PatientAccounts();
		
		System.out.println(medicationList);
		
		Administrator admin1 = new Administrator("Nancy Lee");
		System.out.println(admin1);
		
		Doctor doctor1 = new Doctor("Robert Smith");
		System.out.println(doctor1);

		Pharmacist pharm1 = new Pharmacist("Christy Kent");
		System.out.println(pharm1);
		
		Nurse nurse1 = new Nurse("Pat Kline");
		System.out.println(nurse1);
		
		Patient patient1 = admin1.createNewPatient("Jane Doe", 40, "120/80", 67, 176, 
				72, "Mother: none, Father: heart attack", "Cancer", "shrimp");
		System.out.println(patient1);
		
		Patient patient2 = admin1.createNewPatient("John Doe", 45, "125/85", 82, 111, 
				65, "Mother: cancer, Father: dibeties", "Heart Attack", "none");
		System.out.println(patient2);
		doctor1.prescribeMedication("motrin", patient2);
		System.out.println(patient2);
		pharm1.verifyMedicaton("motrin", patient2);
		System.out.println(patient2);
		
		nurse1.logDose("motrin", patient2.getPatientID(), 600, "Inflamation");
		nurse1.logDose("motrin", patient2.getPatientID(), 400, "Pain");
 
		System.out.println(patient2.medicationHistory());
	}

}
