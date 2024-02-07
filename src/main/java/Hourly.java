
public class Hourly extends Employee {

	public Hourly(String name, double hrRate, double hrsWorked) {
		super(name, hrRate);
		this.hrsWorked = hrsWorked;
		this.payType = new Overtime();
		// TODO Auto-generated constructor stub
	}
	
}
