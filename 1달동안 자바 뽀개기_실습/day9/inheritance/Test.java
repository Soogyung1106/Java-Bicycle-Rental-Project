package inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Person p =new Person("ȫ�浿", 25);
		//p.name="ȫ�浿";
		//p.age=25;
		System.out.println(p.getDetails());
		
		Student s =new Student("�̼���", 30, "20001234");
//		s.name="�̼���";
//		s.age=30;
//		s.studentId="20001234";
		System.out.println(s.getDetails());
		
		Teacher t = new Teacher("������", 40, "�ڹ����α׷���");
//		t.name="������";
//		t.age=40;
//		t.subject="�ڹ����α׷���";
		System.out.println(t.getDetails());
		
		Employee e =new Employee("�����", 30, "����ó");
//		e.name ="�����";
//		e.age=30;
//		e.department="����ó";
		System.out.println(e.getDetails());
		
	}
	
}
