
public class Overtime implements PayType {public double cPay(double hrRate, double hrsWorked) {if(hrsWorked <= 40) {return hrRate * hrsWorked;}else{return hrRate * 40 + hrRate * 1.5 * (hrsWorked-40);
}
																}
	
	

}
