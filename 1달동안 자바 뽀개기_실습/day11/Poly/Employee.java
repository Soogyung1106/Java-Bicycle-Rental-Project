package Poly;

public class Employee extends Person{
	
	//1. �������
	public String department;
	
	//2. ������ 
	public Employee(String name,int age, String department) {
		super(name,age); //�θ�Ŭ������ �����ڿ� name, age�ֱ�
		this.department = department; // Employee��ü�� instance�� department 
	}
	//3. �޼��� ������  (������ �ϴ� ���)
	public String getDetails() {
		return super.getDetails()+"\t�μ� : " + department;
	}
	
}
