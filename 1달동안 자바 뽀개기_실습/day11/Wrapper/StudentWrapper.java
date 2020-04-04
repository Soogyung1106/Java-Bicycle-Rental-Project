package Wrapper;

public class StudentWrapper extends Student {
	//age, name, studentId
	
	//생성자
	public StudentWrapper(Student s) {
		this.age=s.age;
		this.name=s.name;
		this.studentId =s.studentId;
	}
	
	//재정의
	public String getDetails() {
		return "이름 :: "+name+"\t나이 :: "+age+"\t학번 :: "+studentId;
	}
}

//다형성, 상속, 재정의 개념 모두 적용됨!
