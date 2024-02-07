
public class Salary extends Employee {

	public Salary(String name, double hrRate) {
		super(name, hrRate);
		this.hrsWorked = 40;
		this.payType = new Regular();
	}
}
