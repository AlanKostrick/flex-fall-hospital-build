import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	Doctor underTest = new Doctor("1", "Name", "Speciality");
	Patient sickPatient = new Patient();

	@Test
	public void shouldRenderDoctorProperties() {
		String empNumber = underTest.getEmpNumber();
		String empName = underTest.getEmpName();
		String speciality = underTest.getSpeciality();
		assertThat(empNumber, is("1"));
		assertThat(empName, is("Name"));
		assertThat(speciality, is("Speciality"));
	}

	@Test
	public void shouldIncreaseHealthLevelFrom10To20WhenCaringForPatient() {
		underTest.careForPatient(sickPatient);
		int healthLevel = sickPatient.getHealthLevel();
		assertThat(healthLevel, is(20));
	}

	@Test
	public void shouldIncreaseHealthLevelFrom10To30WhenCaringForPatient() {
		underTest.careForPatient(sickPatient);
		underTest.careForPatient(sickPatient);
		int healthLevel = sickPatient.getHealthLevel();
		assertThat(healthLevel, is(30));
	}

	@Test
	public void shouldDecreaseBloodLevelFrom20To15WhenDrawingBlood() {
		underTest.drawBlood(sickPatient);
		int bloodLevel = sickPatient.getBloodLevel();
		assertThat(bloodLevel, is(15));
	}

	@Test
	public void shouldExpectASalaryOf90K() {
		int salary = underTest.calculatePay();
		assertThat(salary, is(90_000));
	}

}
