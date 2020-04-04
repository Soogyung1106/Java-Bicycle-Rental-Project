package Wrapper;

public class StudentWrapper2 extends Student {
	public StudentWrapper2(Student s) {
		this.age=s.age;
		this.name=s.name;
		this.studentId =s.studentId;
	}
	
	public String getDetails() {
		return "이름 = "+name+"\t나이 = "+age+"\t학번 = "+studentId;
	}
}
