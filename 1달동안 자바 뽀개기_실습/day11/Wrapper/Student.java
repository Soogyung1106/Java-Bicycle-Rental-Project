package Wrapper;

public class Student extends Person{
	
	public String studentId;
	//�Ϲ������� ��������� �⺻ ������.
	public Student() {
		//������ �ȿ��� �ݵ�� '1��'�� �����ڰ� ȣ���� �Ǿ���.
		//�ƹ��͵�  �� ���ָ� super(); �Ϲ������� ȣ���.
		super(); //�θ� Ŭ������ ������ ����
//		new Person(); //Person��ü�� ����� ����
	}
	
	//������ 
	public Student(String name, int age, String studentId) {
		//super();
		//this.name=name;
		//this.age=age;
		super(name,age);		//<��Ģ>������ �ȿ� ù ���� �ݵ�� �����ڸ� �� ��� �Ѵ�!
		this.studentId = studentId;
	}
	
	//������
	public String getDetails(){	//���� �ʷϻ� �ﰢ�� ǥ�� : �������̵�
		return super.getDetails()+"\t�й� : "+studentId;  //super. �θ� Ŭ������ �����(�޼��� or ����)
	}


}

