import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {

	Nurse underTest = new Nurse("1", "Name", 5);
	Patient sickPatient = new Patient();

	@Test
	public void shouldRenderNurseProperties() {
		String empNumber = underTest.getEmpNumber();
		String empName = underTest.getEmpName();
		int numPatients = underTest.getNumPatients();
		assertThat(empNumber, is("1"));
		assertThat(empName, is("Name"));
		assertThat(numPatients, is(5));
	}

	@Test
	public void shouldIncreaseHealthLevelFrom10To15WhenCaringForPatient() {
		underTest.careForPatient(sickPatient);
		int healthLevel = sickPatient.getHealthLevel();
		assertThat(healthLevel, is(15));
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
		assertThat(salary, is(50_000));
	}

}
