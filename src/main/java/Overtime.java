
public class Overtime implements PayType {

	public double calcPay(double hrRate, double hrsWorked) {
		// TODO Auto-generated method stub
		if(hrsWorked <= 40) {
			return hrRate * hrsWorked;
		}
		else{
			return hrRate * 40 + hrRate * 1.5 * (hrsWorked-40);
		}
	}
	
	

}
