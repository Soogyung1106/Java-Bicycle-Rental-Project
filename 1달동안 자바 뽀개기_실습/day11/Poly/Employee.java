package Poly;

public class Employee extends Person{
	
	//1. 멤버변수
	public String department;
	
	//2. 생성자 
	public Employee(String name,int age, String department) {
		super(name,age); //부모클래스의 생성자에 name, age넣기
		this.department = department; // Employee객체의 instance에 department 
	}
	//3. 메서드 재정의  (재정의 하는 방법)
	public String getDetails() {
		return super.getDetails()+"\t부서 : " + department;
	}
	
}
