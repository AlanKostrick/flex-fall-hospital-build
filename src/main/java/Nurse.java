
public class Nurse extends Employee implements MedicalDuties {

	private int numPatients;

	public int getNumPatients() {
		return numPatients;
	}

	public Nurse(String empNumber, String empName, int numPatients) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.numPatients = numPatients;
	}

	@Override
	public void careForPatient(Patient aPatient) {
		aPatient.increaseHealthLevel(5);
	}

	@Override
	public void drawBlood(Patient aPatient) {
		aPatient.reduceBloodLevel();
	}

	@Override
	public int calculatePay() {
		return 50_000;
	}

}
