package com.jsp;

public class ConstructorChaning {
	int emp_id;
	String name;
	double salary;
	String designation;
	String department;
	
	ConstructorChaning(){
		System.out.println("no argument called");
	}
	ConstructorChaning(int emp_id,String name){
this();
this.name=name;
this.emp_id=emp_id;
	}
	ConstructorChaning(int emp_id,String name,double salary){
		this(emp_id,name);
		this.salary=salary;
			}
			
	ConstructorChaning(int emp_id,String name,double salary,String deparment){
		this(emp_id,name,salary);
		this.department=deparment;
			}
	
ConstructorChaning(int emp_id,String name,double salary,String deparment,String designation){
	this(emp_id,name,salary,deparment);
	this.designation=designation;
		}
}

//when constructor call anther constructor in java is know AN constructor chaning
//we can acheive in java 
//this ()-this call statement
//super()-super cALL statement
//
//this call satement=this()statement is used to call another constructor for a constructor which is in the same class
//rules=
//this() statement should be the frist line of code inside the constructor
// recursive call of constructor is not allow
// if there are n constructor then we can have a maximum of n-1 this call statement(this())