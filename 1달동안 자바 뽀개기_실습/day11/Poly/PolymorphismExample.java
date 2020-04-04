package Poly;

public class PolymorphismExample {

	public static void main(String[] args) {
		Person p; //? �̰� ���� �ǹ��̴���...? �̷��� �����ع����� �Ǵ°���??
		
		p=new Teacher("ȫ����", 22, "Java Programming"); //? �� �� �� Person p= new Teacher �� ���� �ǹ�?? 
		System.out.println(p  instanceof Person); // true ���
		System.out.println(p  instanceof Teacher); //true ��� ->'������'�� Ư¡ ������ 
		System.out.println(p.getDetails()); 
		//PersonŬ������ Teacher Ŭ���� �� ���� ���� Ȯ���غ���! 
		//ù ��° : �θ� Ŭ������ ���� getDetails() �޼��尡 �ִ��� Ȯ��
		//�� ��° : �ڽ� Ŭ������ ���� �����ǵ� getDetails() �޼��尡 �ִ��� Ȯ��
		
		p=new Employee("ȫ���", 23, "����ó");
		System.out.println(p  instanceof Person);
		System.out.println(p  instanceof Employee);
		System.out.println(p.getDetails());
		
		p=new Student("ȫ�л�", 17, "20160001");
		System.out.println(p  instanceof Person);
		System.out.println(p  instanceof Student);
		System.out.println(p.getDetails());
		p.walk();
		//p.study();	
	}//end main

}//end class
