import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class TestPayroll {

	Employee a;
	Employee b;
	Employee c;
	Employee d;
	
	ArrayList<Employee> employees;
	Company corp = new Company(employees);
	
	
	@BeforeEach
	void setUp(){
		
		a = new Contrator("A", 10, 77);
		b = new Hourly("B", 10, 35);
		c = new Hourly("C", 10, 45);
		d = new Salary("C", 10);
		
		employees = new ArrayList<Employee>();
		
		corp.a.add(a);
		corp.a.add(b);
		corp.a.add(c);
		corp.a.add(d);
	
	}

	@Test
	void test() {
		
		ArrayList<Double> paid = corp.f();
		assertEquals(paid.get(0), 770);
		assertEquals(paid.get(1), 350);
		assertEquals(paid.get(2), 475);
		assertEquals(paid.get(3), 400);
		
	}
	
}
