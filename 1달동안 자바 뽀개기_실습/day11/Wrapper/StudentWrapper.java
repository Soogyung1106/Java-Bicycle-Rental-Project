package Wrapper;

public class StudentWrapper extends Student {
	//age, name, studentId
	
	//������
	public StudentWrapper(Student s) {
		this.age=s.age;
		this.name=s.name;
		this.studentId =s.studentId;
	}
	
	//������
	public String getDetails() {
		return "�̸� :: "+name+"\t���� :: "+age+"\t�й� :: "+studentId;
	}
}

//������, ���, ������ ���� ��� �����!
