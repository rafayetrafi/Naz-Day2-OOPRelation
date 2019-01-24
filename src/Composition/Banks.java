package Composition;

import java.io.*; 
import java.util.*;

public class Banks {
	
	private final List<Employee> employee;
	
	Banks(List<Employee> employee)
	{
		this.employee = employee;
	}
	
	public List<Employee> getTotalEmployee(){ 
        
	       return employee;   
	    }

}
