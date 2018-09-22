import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {

	Surgeon underTest = new Surgeon("1", "Name", "Speciality", true);
	Patient sickPatient = new Patient();

	@Test
	public void shouldIncreaseHealthLevelFrom10To20WhenCaringForPatient() {
		underTest.careForPatient(sickPatient);
		int healthLevel = sickPatient.getHealthLevel();
		assertThat(healthLevel, is(20));
	}

	@Test
	public void shouldDecreaseBloodLevelFrom20To15WhenDrawingBlood() {
		underTest.drawBlood(sickPatient);
		int bloodLevel = sickPatient.getBloodLevel();
		assertThat(bloodLevel, is(15));
	}

}
