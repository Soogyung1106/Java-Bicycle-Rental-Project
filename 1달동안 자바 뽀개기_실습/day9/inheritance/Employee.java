package inheritance;

public class Employee extends Person{
	
	public String department;
	public Employee(String name,int age, String department) {
		super(name,age);
		this.department = department;
	}
	//������ �ϴ� ���
	public String getDetails() {
		return super.getDetails()+"\t�μ� : " + department;
	}
	
}
