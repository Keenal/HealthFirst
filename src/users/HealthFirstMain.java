package users;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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
		

    	//System.out.println(list);
		System.out.println(MedicationList.medications[0].getName());
	    System.out.println(MedicationList.medications[3].getName());

		Administrator admin1 = new Administrator("Nancy Lee");
		System.out.println(admin1);
		
		Doctor doctor1 = new Doctor("Robert Smith");
		System.out.println(doctor1);

		Pharmacist pharm1 = new Pharmacist("Christy Kent");
		System.out.println(pharm1);
		
		Nurse nurse1 = new Nurse("Pat Kline");
		System.out.println(nurse1);
		
		Patient patient1 = admin1.createNewPatient("Ozzy Osborn", 123, "Dr Feelgood"); //"Jane Doe", "Robert Smith", 40, "120/80", 67, 176, 72, "Mother: none, Father: heart attack", "Cancer", "shrimp");
		System.out.println(patient1);
		
		Patient patient2 = admin1.createNewPatient("Sharon Osborn", 234, "Dr Feelgood");//"John Doe", "Robert Smith", 45, "125/85", 82, 111, 65, "Mother: cancer, Father: dibeties", "Heart Attack", "none");
		System.out.println(patient2);
		doctor1.prescribeMedication("Codeine", patient2);
		System.out.println(patient2);
		pharm1.verifyMedicaton("Codeine", patient2);
		System.out.println(patient2);
		
		nurse1.logDose("Codeine", patient2.getPatientID(), 600);
		nurse1.logDose("Codeine", patient2.getPatientID(), 400);
 
		System.out.println(patient2.medicationHistory());
	}

}
