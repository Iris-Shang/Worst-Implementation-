import java.util.ArrayList;

public class Company {
	
	ArrayList<Employee> roster; 
	
	public Company(ArrayList<Employee> roster) {
		this.roster = new ArrayList<Employee>();
	}
	
	public void addEmployee(String name, double hrRate, double hrsWorked, String eType) {
		if(eType == "Contractor") {
			Employee e = new Contrator(name, hrRate, hrsWorked);
			roster.add(e);
		}
		else if(eType == "Hourly") {
			Employee e = new Hourly(name, hrRate, hrsWorked);
			roster.add(e);
		}
		else if(eType == "Salary") {
			Employee e = new Salary(name, hrRate);
			roster.add(e);
		}
		else {
			System.out.println("Error: " + eType + " is not a valid employee type.");
		}
	}
	
	public ArrayList<Double> payDay() {
		
		ArrayList<Double> paid = new ArrayList<Double>();
		
		for(int i = 0; i < this.roster.size(); i++) {
			paid.add(this.roster.get(i).getPay());
			
		}
		
		return paid;
	}
	
}
