
public class Contrator extends Employee {

	public Contrator(String name, double hrRate, double hrsWorked) {
		super(name, hrRate);
		this.hrsWorked = hrsWorked;
		payType = new Regular();
	}
}
