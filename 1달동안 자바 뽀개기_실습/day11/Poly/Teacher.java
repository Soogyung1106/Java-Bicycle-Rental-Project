package Poly;

public class Teacher extends Person{  //��ӹްڴ�.
	//1. ��� ����
	public String subject;
	
	//2. ������
	public Teacher(String name,int age,String subject)
	{
		super(name, age);
		this.subject=subject;
	}
	//3. �޼��� (������)  (getDetails : �θ� Ŭ���� Person�� �ִ� �޼��� )
	public String getDetails() {
		return super.getDetails() +"\t����: "+ subject; 
		// �θ� Ŭ������ �ִ� �Լ��� �������ϱ� ������ 
		// super.�� �ٿ������ν� �θ�Ŭ������ �ִ� �޼����� �� ǥ��!
	}
	
	@Override
	public String toString() {  //? toString() ��Ȯ�� �� �ϴ� �Լ���??
		return "Teacher [subject=" + subject + "]";
	}
}




