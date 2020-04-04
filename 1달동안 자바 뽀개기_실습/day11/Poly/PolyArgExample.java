package Poly;

public class PolyArgExample {

	public static void main(String[] args) {
		// Person 클래스에 getName(), setName() 메서드 추가해주세요.
		// sayName이라는 메서드를 만들겠습니다.
		Teacher t=new Teacher("지학생", 17, "null");
		Student s=new Student("지승훈", 27, "JAVA/JSP");
		sayName(s);
		//아직 Teacher를 인자로 하는 sayName메서드가 없기 때문에 이름을 말하지 못함.
		//메서드를 추가해야 이름을 말할 수 있음
		sayName(t);
		
		Employee e =new Employee("지사원",30, "IT");
		sayName(e);
		FreeLancer f=new FreeLancer("지프리", 35);
		sayName(f);
		
	}//end main
	
	public static void sayName(Person p) {
		//다형적 인자를 이용하면 클래스 타입마다 메서드를 만들어줄 필요가 없습니다.
		//하지만 그전에 반드시 상속관계가 전제 되어야 이렇게 사용할 수 있습니다.
		//상속관계가 없다면 다형성도 적용할 수 없습니다.
		
		//또 한가지 장점은 Person 클래스를 상속받는 또다른 클래스를 추가하기가 수월해집니다.
		//예를들어 Person클래스를 상속받는 FreeLancer라는 새로운 클래스를 작성한다해도
		//메서드를 추가할 필요 없습니다.
		//어떤 기능을 추가하거나 수정/삭제할 때 다른 파일 혹은 코드를 전체적으로 바꿔야 하는 경우를 
		//종속성이 높다라고 표현할 수 있을 것입니다.
		//다형성을 이용하면 낮은 종속성을 가진 모듈화된 프로그램을 작성하는데 도움이 될 것입니다.
		//객체 지향프로그래밍 개념을 좀 더 자연스럽게 만들어주는 역할도 합니다.
		//예를들어 학생은 사람인데 사람타입 변수에 들어갈 수 있는것이 자연스러움.
		System.out.println("저는 "+p.getName()+" 입니다.");
	}
	
//	public static void sayName(Teacher t) {
//		System.out.println("저는 "+t.getName()+" 입니다.");
//	}
//
//	
//	public static void sayName(Student s) {
//		System.out.println("저는 "+s.getName()+" 입니다.");
//	}
//	
//	public static void sayName(Employee e) {
//		System.out.println("저는 "+e.getName()+" 입니다.");
//	}
	

}
