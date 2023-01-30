package com.Constructor;

public class Employee {
	
private String empName;
private String empCity;
private String empMobile;
private int salary;




public Employee(String empName, String empCity, String empMobile, int salary) {
	super();
	this.empName = empName;
	this.empCity = empCity;
	this.empMobile = empMobile;
	this.salary = salary;
}




@Override
public String toString() {
	return "Employee [empName=" + empName + ", empCity=" + empCity + ", empMobile=" + empMobile + ", salary=" + salary
			+ "]";
}




public void getMessage(String Message) {
	System.out.println("Hello" +Message+ "," +empName);
	
	
}


}
