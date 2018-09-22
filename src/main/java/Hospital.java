import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {

	Map<String, Employee> employees = new HashMap<>();
	Map<Integer, Patient> patients = new HashMap<>();
	private int patientNum;

	public void hire(Employee employee) {
		employees.put(employee.getEmpNumber(), employee);
	}

	public Employee findEmployee(String empNumber) {
		return employees.get(empNumber);
	}

	public Collection<Employee> getAllEmployees() {
		return employees.values();
	}

	public Collection<Employee> getMedicalEmployees() {
		Collection<Employee> medicalEmployees = new ArrayList<>();
		for (Employee employee : employees.values()) {
			if (employee instanceof MedicalDuties) {
				medicalEmployees.add(employee);
			}
		}
		return medicalEmployees;
	}

	public void admit(Patient patient) {
		patientNum++;
		patients.put(patientNum, patient);
	}

	public Collection<Patient> getAllPatients() {
		return patients.values();
	}

	public List<Employee> sortEmployees() {
		List<Employee> toSort = new ArrayList<>(employees.values());
		Collections.sort(toSort, (emp1, emp2) -> emp1.getEmpName().compareTo(emp2.getEmpName()));
		return toSort;
	}

}
