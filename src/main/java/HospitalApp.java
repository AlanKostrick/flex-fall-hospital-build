import java.util.Scanner;

public class HospitalApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Hospital myHospital = new Hospital();

		myHospital.hire(new Doctor("1", "Phil", "Brain"));
		myHospital.hire(new Surgeon("2", "Sally", "Plastic", true));
		myHospital.hire(new Nurse("3", "Jackie", 5));
		myHospital.hire(new Janitor("4", "Rosie", true));

		System.out.println("Welcome to High Street Hospital");

		String choice;
		do {
			System.out.println("Press 1 To Admit A Patient");
			System.out.println("Press 2 To Hire An Employee");
			System.out.println("Press 3 To See All Medical Personnel");
			choice = input.nextLine();

			if (choice.equals("1")) {
				System.out.println("You want to admit a patient");
				System.out.println("Is this a general admission (yes or no)");
				String patientAdmissionLevel = input.nextLine();
				if (patientAdmissionLevel.equals("no")) {
					System.out.println("Enter the health level of the patient");
					int healthLevel = input.nextInt();
					System.out.println("Enter the blood level of the patient");
					int bloodLevel = input.nextInt();
					Patient patientToAdmit = new Patient(healthLevel, bloodLevel);
					myHospital.admit(patientToAdmit);
				} else {
					Patient patientToAdmit = new Patient();
					myHospital.admit(patientToAdmit);
				}

			} else if (choice.equals("2")) {
				System.out.println("Are you hiring a [Doctor], [Nurse], [Surgeon] or [Janitor]?");
				String employeeToHire = input.nextLine();
				if (employeeToHire.equals("Doctor")) {
					System.out.println("Enter the emp number");
					String empNumber = input.nextLine();
					System.out.println("Enter the emp name");
					String empName = input.nextLine();
					System.out.println("Enter the speciality area");
					String speciality = input.nextLine();
					myHospital.hire(new Doctor(empNumber, empName, speciality));
				} else if (employeeToHire.equals("Nurse")) {
					System.out.println("Enter the emp number");
					String empNumber = input.nextLine();
					System.out.println("Enter the emp name");
					String empName = input.nextLine();
					System.out.println("Enter the number of patients");
					int numPatients = input.nextInt();
					myHospital.hire(new Nurse(empNumber, empName, numPatients));
					input.nextLine();
				} else if (employeeToHire.equals("Surgeon")) {
					System.out.println("Enter the emp number");
					String empNumber = input.nextLine();
					System.out.println("Enter the emp name");
					String empName = input.nextLine();
					System.out.println("Enter the speciality area");
					String speciality = input.nextLine();
					boolean isOperating = false;
					myHospital.hire(new Surgeon(empNumber, empName, speciality, isOperating));
				} else if (employeeToHire.equals("Janitor")) {
					System.out.println("Enter the emp number");
					String empNumber = input.nextLine();
					System.out.println("Enter the emp name");
					String empName = input.nextLine();
					boolean isSweeping = false;
					myHospital.hire(new Janitor(empNumber, empName, isSweeping));
				} else {
					System.out.println("Invalid entry. Please try again!");
				}
			} else if (choice.equals("3")) {
				System.out.println("Here are all of the Medical Personnel:");
				System.out.println(myHospital.getMedicalEmployees());
			} else {
				System.out.println("Invalid entry...try again");
			}
		} while (!choice.equals("4"));

		System.out.println("Goodbye!");
		input.close();
	}
}
