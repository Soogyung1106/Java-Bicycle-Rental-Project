package Poly;

public class Teacher extends Person{  //상속받겠다.
	//1. 멤버 변수
	public String subject;
	
	//2. 생성자
	public Teacher(String name,int age,String subject)
	{
		super(name, age);
		this.subject=subject;
	}
	//3. 메서드 (재정의)  (getDetails : 부모 클래스 Person에 있는 메서드 )
	public String getDetails() {
		return super.getDetails() +"\t과목: "+ subject; 
		// 부모 클래스에 있는 함수를 재정의하기 때문에 
		// super.을 붙여줌으로써 부모클래스에 있는 메서드라는 것 표시!
	}
	
	@Override
	public String toString() {  //? toString() 정확히 뭐 하는 함수임??
		return "Teacher [subject=" + subject + "]";
	}
}




