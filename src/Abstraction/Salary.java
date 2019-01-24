package Abstraction;



public class Salary extends Employee {
	
	
	private int salary;


	public Salary(String name, int age, String location ,int salary ) {
		super(name,age,location);
		
		setSalary(salary); 
		
		
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

}
