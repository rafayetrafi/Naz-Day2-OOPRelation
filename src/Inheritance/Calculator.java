package Inheritance;

public class Calculator {
	
	int answer;
	
	public void addition(int number1, int number2)
	{
		answer = number1 + number2;
		
		System.out.println("Total Number" + answer );
	}
	
	public void subtraction(int number1, int number2)
	{
		answer = number1 - number2;
		
		System.out.println("Total Number" + answer );
	}


}
