package Composition;

import java.io.*; 
import java.util.*;

public class StartPoint {

	public static void main(String[] args) {

		
		Employee employee1 = new Employee("Rafayet", 123456);
		Employee employee2 = new Employee("Hossain", 987654);
		Employee employee3 = new Employee("Rafi", 654654);
		
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		listEmployee.add(employee1);
		listEmployee.add(employee2);
		listEmployee.add(employee3);
		
		
		Banks banks = new Banks(listEmployee);
		
		
		
		List<Employee> eNames = banks.getTotalEmployee(); 
        for(Employee eName : eNames){ 
              
            System.out.println("Title : " + eName.getName() + " and " 
            +" Author : " + eName.getSalary()); 
        } 
        
		
		
		
		
		
		
		
		
	}

}
