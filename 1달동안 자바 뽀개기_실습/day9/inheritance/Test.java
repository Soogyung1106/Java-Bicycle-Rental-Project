package inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Person p =new Person("홍길동", 25);
		//p.name="홍길동";
		//p.age=25;
		System.out.println(p.getDetails());
		
		Student s =new Student("이순신", 30, "20001234");
//		s.name="이순신";
//		s.age=30;
//		s.studentId="20001234";
		System.out.println(s.getDetails());
		
		Teacher t = new Teacher("강감찬", 40, "자바프로그래밍");
//		t.name="강감찬";
//		t.age=40;
//		t.subject="자바프로그래밍";
		System.out.println(t.getDetails());
		
		Employee e =new Employee("김명주", 30, "교무처");
//		e.name ="김명주";
//		e.age=30;
//		e.department="교무처";
		System.out.println(e.getDetails());
		
	}
	
}
