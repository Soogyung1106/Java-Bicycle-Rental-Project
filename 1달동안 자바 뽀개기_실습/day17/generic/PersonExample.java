package generic;

public class PersonExample {

	public static void main(String[] args) {
		//제너릭 기능 사용 o
		Person<Character> p1 = new Person<>('딸', 3);
		System.out.println(p1.getName());
		
		Person<String> p2 = new Person<>("아빠", 25);
		System.out.println(p2.getName());
		
//? Test(T,t) 기능이 형변환 안해도 자료형 아무거나 들어갈 수 있다??
		System.out.println(p1.test(4.8)); //double
		System.out.println(p1.test("4.8")); //String
		System.out.println(p1.test(5)); //int
		System.out.println(p1.test('5')); //char
		
	}

}
