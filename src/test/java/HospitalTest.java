import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;
import java.util.List;

import org.junit.Test;

public class HospitalTest {

	Hospital underTest = new Hospital();
	Doctor doctor = new Doctor("1", "doctor name", "Speciality");
	Nurse nurse = new Nurse("2", "nurse name", 5);
	Janitor janitor = new Janitor("3", "janitor name", true);

	@Test
	public void shouldBeAbleToHireADoctor() {
		underTest.hire(doctor);
		Employee foundDoctor = underTest.findEmployee("1");
		assertThat(foundDoctor, is(doctor));
	}

	@Test
	public void shouldBeAbleToHireADoctorAndNurseAndJanitor() {
		underTest.hire(doctor);
		underTest.hire(nurse);
		underTest.hire(janitor);
		Collection<Employee> hiredEmployees = underTest.getAllEmployees();
		assertThat(hiredEmployees, containsInAnyOrder(doctor, nurse, janitor));
	}

	@Test
	public void shouldDisplayAllMedicalPersonnel() {
		underTest.hire(doctor);
		underTest.hire(nurse);
		underTest.hire(janitor);
		Collection<Employee> medicalEmployees = underTest.getMedicalEmployees();
		assertThat(medicalEmployees, containsInAnyOrder(doctor, nurse));
	}

	@Test
	public void shouldAdmitTwoPatients() {
		Patient sickPatient = new Patient();
		Patient sickerPatient = new Patient(5, 15);
		underTest.admit(sickPatient);
		underTest.admit(sickerPatient);
		Collection<Patient> ourPatients = underTest.getAllPatients();
		assertThat(ourPatients, containsInAnyOrder(sickPatient, sickerPatient));
	}

	@Test
	public void shouldOrderEmployeesByName() {
		underTest.hire(doctor);
		underTest.hire(nurse);
		underTest.hire(janitor);
		List<Employee> sortedEmployees = underTest.sortEmployees();
		assertThat(sortedEmployees, contains(doctor, janitor, nurse));
	}

}
