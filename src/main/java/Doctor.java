
public class Doctor extends Employee implements MedicalDuties {

	private String speciality;

	public String getSpeciality() {
		return speciality;
	}

	public Doctor(String empNumber, String empName, String speciality) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.speciality = speciality;
	}

	@Override
	public void careForPatient(Patient aPatient) {
		aPatient.increaseHealthLevel(10);
	}

	@Override
	public void drawBlood(Patient aPatient) {
		aPatient.reduceBloodLevel();
	}

	@Override
	public int calculatePay() {
		return 90_000;
	}

}
