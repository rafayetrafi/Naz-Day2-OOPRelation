package Polymorphism;

public class Salary extends Employee {
	
	private int salary;
	
	
	public Salary(String name, String address, int number, int salary) {
		super(name, address, number);
		setSalary(salary);
	
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Salary [salary=" + salary + ", Name=" + getName() + ", Address=" + getAddress()
				+ ", Number=" + getNumber() + "]";
	}


	 

	


	
	
	
	

	

}
