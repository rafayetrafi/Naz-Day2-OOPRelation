package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import java.io.*; 
import java.util.*;

import Encapsulation.Employee;
import Encapsulation.StartPoint;
import Inheritance.Calculator;
import Polymorphism.Salary;
import Abstraction.*;
import Association.Bank;
import Composition.Banks;

public class MainStartPoint {

	public static void main(String[] args) {

		System.out.println("------OOP Basic------ ");
		
		System.out.println("Press a for Encapsulation");
		System.out.println("Press b for Polymorphism");
		System.out.println("Press c for Inheritance");
		System.out.println("Press d for Abstraction");
		System.out.println("Press e for Static Block");
		System.out.println("Press f for Association");
		System.out.println("Press g for Composition");
		System.out.println("For exit, press any key");
		
		System.out.println("Choose your option: ");
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		switch (s) {
		case "a":
			Employee person = new Employee();
			
			person.setName("Rafayet");
			person.setAge(23);
			person.setLocation("Khilgaon");
			
			
			System.out.println(person.toString());
			exitP();
			
			break;
		case "b":
			
			Salary salary = new Salary("Rafayet", "Khilgaon", 0133456, 30000);
			
			System.out.println(salary.toString());
			
			break;
		case "c":
			
			Calculator calculation = new Calculator();
			
			
			calculation.addition(20, 30);
			calculation.subtraction(100, 20);
			
			
			
			break;
		case "d":
			Abstraction.Salary salary1 = new Abstraction.Salary("Rafayet", 23, "Khilgaon", 999999);
			
			
			
			break;
		case "e":
			
			StaticBlock.StartPoint startPoint = new StaticBlock.StartPoint();
			System.out.println("This is Main method");
			
			
			break;
		case "f":
			
			
			
			Bank bank = new Bank(); Employee employee = new Employee();
			  
			 bank.setBankName("Bank Asia"); employee.setName("Nazmul Alom");
			  
			 System.out.println("Name: " + employee.getName() + "," + " Bank Name: " +
			 bank.getBankName() );
			
			
			
			break;
			
		case "g":
			
			
			/*
			 * Bank bank = new Bank(); Employee employee = new Employee();
			 * 
			 * bank.setBankName("Bank Asia"); employee.setName("Nazmul Alom");
			 * 
			 * System.out.println("Name: " + employee.getName() + " Bank Name: " +
			 * bank.getBankName() );
			 * 
			 * break; case "g":
			 * 
			 * 
			 * Composition.Employee employee1 = new Composition.Employee("Rafayet", 123456);
			 * Composition.Employee employee2 = new Composition.Employee("Hossain", 987654);
			 * Composition.Employee employee3 = new Composition.Employee("Rafi", 654654);
			 * 
			 * List<Composition.Employee> listEmployee = new
			 * ArrayList<Composition.Employee>();
			 * 
			 * listEmployee.add(employee1); listEmployee.add(employee2);
			 * listEmployee.add(employee3);
			 * 
			 * 
			 * Banks banks = new Banks(listEmployee);
			 * 
			 * 
			 * 
			 * List<Composition.Employee> eNames = Composition.banks.getTotalEmployee();
			 * for(Composition.Employee eName : eNames){
			 * 
			 * System.out.println("Title : " + eName.getName() + " and " +" Author : " +
			 * eName.getSalary()); }
			 */
			
			break;

		default:
			System.out.println("Reload the program again");
			System.exit(0);
			break;
		}
		

		
		
	}
	
	public static void exitP()
	{
		System.out.println("Press 1 for exit");
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		
		if(s == 1)
		{
			System.out.println("Exit Successfully . . .!!");
			System.exit(0);
		}
		else
			System.out.println("Please reload the program");
		
		
		
	}	

}
