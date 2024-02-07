
public class Employee {

	String name;
	double hrRate;
	double hrsWorked;
	PayType payType;
	
	public Employee(String name, double hrRate, double hrsWorked, PayType payType) {
		super();
		this.name = name;
		this.hrRate = hrRate;
		this.hrsWorked = hrsWorked;
		this.payType = payType;
	}

	public String getName() {
		return name;
	}

	public double getHrRate() {
		return hrRate;
	}

	public void setHrRate(double hrRate) {
		this.hrRate = hrRate;
	}

	public double getHrsWorked() {
		return hrsWorked;
	}

	public void setHrsWorked(double hrsWorked) {
		this.hrsWorked = hrsWorked;
	}
	
	public void setPayType(PayType payType) {
		this.payType = payType;
	}
	
	public double getPay(){
		return payType.calcPay(hrRate, hrsWorked);
	}
	
}
