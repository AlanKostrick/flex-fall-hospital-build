
public abstract class Employee {

	protected String empNumber;
	protected String empName;

	public String getEmpNumber() {
		return empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public abstract int calculatePay();

	@Override
	public String toString() {
		return empName;
	}

}