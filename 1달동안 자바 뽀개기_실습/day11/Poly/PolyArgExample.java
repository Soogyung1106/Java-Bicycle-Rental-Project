package Poly;

public class PolyArgExample {

	public static void main(String[] args) {
		// Person Ŭ������ getName(), setName() �޼��� �߰����ּ���.
		// sayName�̶�� �޼��带 ����ڽ��ϴ�.
		Teacher t=new Teacher("���л�", 17, "null");
		Student s=new Student("������", 27, "JAVA/JSP");
		sayName(s);
		//���� Teacher�� ���ڷ� �ϴ� sayName�޼��尡 ���� ������ �̸��� ������ ����.
		//�޼��带 �߰��ؾ� �̸��� ���� �� ����
		sayName(t);
		
		Employee e =new Employee("�����",30, "IT");
		sayName(e);
		FreeLancer f=new FreeLancer("������", 35);
		sayName(f);
		
	}//end main
	
	public static void sayName(Person p) {
		//������ ���ڸ� �̿��ϸ� Ŭ���� Ÿ�Ը��� �޼��带 ������� �ʿ䰡 �����ϴ�.
		//������ ������ �ݵ�� ��Ӱ��谡 ���� �Ǿ�� �̷��� ����� �� �ֽ��ϴ�.
		//��Ӱ��谡 ���ٸ� �������� ������ �� �����ϴ�.
		
		//�� �Ѱ��� ������ Person Ŭ������ ��ӹ޴� �Ǵٸ� Ŭ������ �߰��ϱⰡ ���������ϴ�.
		//������� PersonŬ������ ��ӹ޴� FreeLancer��� ���ο� Ŭ������ �ۼ��Ѵ��ص�
		//�޼��带 �߰��� �ʿ� �����ϴ�.
		//� ����� �߰��ϰų� ����/������ �� �ٸ� ���� Ȥ�� �ڵ带 ��ü������ �ٲ�� �ϴ� ��츦 
		//���Ӽ��� ���ٶ�� ǥ���� �� ���� ���Դϴ�.
		//�������� �̿��ϸ� ���� ���Ӽ��� ���� ���ȭ�� ���α׷��� �ۼ��ϴµ� ������ �� ���Դϴ�.
		//��ü �������α׷��� ������ �� �� �ڿ������� ������ִ� ���ҵ� �մϴ�.
		//������� �л��� ����ε� ���Ÿ�� ������ �� �� �ִ°��� �ڿ�������.
		System.out.println("���� "+p.getName()+" �Դϴ�.");
	}
	
//	public static void sayName(Teacher t) {
//		System.out.println("���� "+t.getName()+" �Դϴ�.");
//	}
//
//	
//	public static void sayName(Student s) {
//		System.out.println("���� "+s.getName()+" �Դϴ�.");
//	}
//	
//	public static void sayName(Employee e) {
//		System.out.println("���� "+e.getName()+" �Դϴ�.");
//	}
	

}
