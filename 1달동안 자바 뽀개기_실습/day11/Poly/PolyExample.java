package Poly;  

public class PolyExample {

	public static void main(String[] args) {
		Person p=new Person();
		Student s =new Student("학생 김학생", 17, "123123");
		
		//ps, 다형적 객체란 부모클래스 타입의 변수에 자식클래스이 인스턴스를 할당한 것임.
		Person ps =new Student("인간 김학생", 17, "123123");
		//어떻게 가능할까요? 말그대로 다형! 형(타입)이 여러개이기 때문입니다.
		System.out.println(ps instanceof Person);//true
		System.out.println(ps instanceof Student);//true
		
//?		//다형적 객체는 부모클래스에 있는 메서드만 사용 가능합니다.   -> 그렇다면 자식 클래스에 있는 다른 메서드 사용 못함???
		//왜? Student 객체를 Student 타입으로 보는게 아니라 Person 타입으로 보기 때문에
		p.walk();
		s.walk();
		ps.walk();
		
		//p.study();
		s.study();
		//ps.study();
		//형변환을 통해서 기존의 ps 다형적 객체를 Student타입으로 보게 만들음
		//다형적 객체의 특징1 : 자식클래스 타입으로 형변환이 가능함.
		Student ps1=(Student)ps;  //부모 클래스는 자식 클래스로 형변환이 가능하다!(자료형의 특징)
		ps1.study();
		
		//다형적 객체의 특징2
		//부모 클래스에 있는 메서드만 사용 가능하지만 만일 동일한 이름의 메서드가 자식클래스에서 재정의되어있다면
		//재정의된 메서드가 실행됩니다. 
		//Virtual Method Invocation
		//메서드의 존재여부는 부모클래스에서 확인 --> 실행은 자식클래스에서 재정의된 메서드가 실행
		
		//이렇게 다형성은 객체개념을 조금 더 유연하게 만드는 역할을 합니다.

	}

}
