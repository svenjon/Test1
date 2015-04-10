//********************************************************************
//  Employee.java      
//  Jon Larson
//  SEIS 601
//********************************************************************



package Assignments;

public class Employee extends Person {

	private String name;
	
	public Employee(String strName, int idNum){ 
		
	super(idNum);	
	name = strName;

	}
	public boolean equals(Employee emp1, Employee emp2){
		return(emp1.name.equals(emp2.name) && (emp1.getID() == emp2.getID() ));
		
		
	}
	
	
}
