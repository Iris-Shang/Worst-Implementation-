
public class Employee {

	String name;
	double hrRate;
	double hrsWorked;
	PayType payType;
	
	public Employee(String name, double hrRate) {
		this.name = name;
		this.hrRate = hrRate;
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
