
public class Patient {

	private int healthLevel;
	private int bloodLevel;
	private int patientId;

	public Patient(int healthLevel, int bloodLevel) {
		this.healthLevel = healthLevel;
		this.bloodLevel = bloodLevel;

	}

	public Patient() {
		healthLevel = 10;
		bloodLevel = 20;

	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void increaseHealthLevel(int amount) {
		healthLevel += amount;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	public void reduceBloodLevel() {
		bloodLevel -= 5;
	}

	public int getPatientId() {
		return patientId;
	}

}
