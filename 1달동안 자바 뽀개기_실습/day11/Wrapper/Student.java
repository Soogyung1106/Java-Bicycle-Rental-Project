package Wrapper;

public class Student extends Person{
	
	public String studentId;
	//암묵적으로 만들어지는 기본 생성자.
	public Student() {
		//생성자 안에는 반드시 '1개'의 생성자가 호출이 되야함.
		//아무것도  안 써주면 super(); 암묵적으로 호출됨.
		super(); //부모 클래스의 생성자 생성
//		new Person(); //Person객체를 만드는 것임
	}
	
	//생성자 
	public Student(String name, int age, String studentId) {
		//super();
		//this.name=name;
		//this.age=age;
		super(name,age);		//<규칙>생성자 안에 첫 줄은 반드시 생성자를 써 줘야 한다!
		this.studentId = studentId;
	}
	
	//재정의
	public String getDetails(){	//옆에 초록색 삼각형 표시 : 오버라이딩
		return super.getDetails()+"\t학번 : "+studentId;  //super. 부모 클래스의 멤버들(메서드 or 변수)
	}


}

