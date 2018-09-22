import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class JanitorTest {

	Janitor underTest = new Janitor("1", "Name", true);

	@Test
	public void shouldRenderJanitorProperties() {
		String number = underTest.getEmpNumber();
		String name = underTest.getEmpName();
		boolean isSweeping = underTest.getIsSweeping();
		assertThat(number, is("1"));
		assertThat(name, is("Name"));
		assertThat(isSweeping, is(true));
	}

}
