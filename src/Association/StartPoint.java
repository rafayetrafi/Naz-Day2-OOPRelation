package Association;

import Encapsulation.Employee;

public class StartPoint {

	public static void main(String[] args) {

		
		 Bank bank = new Bank(); Employee employee = new Employee();
		  
		 bank.setBankName("Bank Asia"); employee.setName("Nazmul Alom");
		  
		 System.out.println("Name: " + employee.getName() + " Bank Name: " +
		 bank.getBankName() );
		 
	}

}
