
public class Regular implements PayType{

	public double calcPay(double hrRate, double hrsWorked) {
		return hrRate * hrsWorked;
	}
	
}
