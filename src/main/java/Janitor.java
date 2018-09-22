
public class Janitor extends Employee {

	private boolean isSweeping;

	public boolean getIsSweeping() {
		return isSweeping;
	}

	public Janitor(String empNumber, String empName, boolean isSweeping) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.isSweeping = isSweeping;
	}

	@Override
	public int calculatePay() {
		return 0;
	}

}
