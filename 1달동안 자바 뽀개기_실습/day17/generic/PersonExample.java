package generic;

public class PersonExample {

	public static void main(String[] args) {
		//���ʸ� ��� ��� o
		Person<Character> p1 = new Person<>('��', 3);
		System.out.println(p1.getName());
		
		Person<String> p2 = new Person<>("�ƺ�", 25);
		System.out.println(p2.getName());
		
//? Test(T,t) ����� ����ȯ ���ص� �ڷ��� �ƹ��ų� �� �� �ִ�??
		System.out.println(p1.test(4.8)); //double
		System.out.println(p1.test("4.8")); //String
		System.out.println(p1.test(5)); //int
		System.out.println(p1.test('5')); //char
		
	}

}
