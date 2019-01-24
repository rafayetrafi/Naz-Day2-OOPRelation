package Abstraction;

public abstract class Employee {
	
	private String name;
	private int age;
	private String location;
	



	public Employee(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getAge() {
		return age;
	}
	public final void setAge(int age) {
		this.age = age;
	}
	public final String getLocation() {
		return location;
	}
	public final void setLocation(String location) {
		this.location = location;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", location=" + location + "]";
	}
	
	
	
	
	

}
