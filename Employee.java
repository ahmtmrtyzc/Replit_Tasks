package com.neotech.lesson18;

public class Employee {
	int eID;
	int salary;
	static String ceo = "Elion";

	void printInfo() {
		System.out.println("Employee Id: " + eID + " Salary: " + salary + "Ceo: " + ceo);

	}

	public static void main(String[] args) {
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		obj1.eID =1;
		obj1.salary=2000;
		obj2.eID=2;
		obj2.salary=3000;
		obj1.printInfo();	
		obj2.printInfo();
		obj2.ceo="Ahmet";
		obj1.printInfo();	
		obj2.printInfo();
		
	}

}
