package inheritance;

public class Employee extends Person{
	
	public String department;
	public Employee(String name,int age, String department) {
		super(name,age);
		this.department = department;
	}
	//재정의 하는 방법
	public String getDetails() {
		return super.getDetails()+"\t부서 : " + department;
	}
	
}
