package generic;

public class Person <E>{
//�������
	private E name; //Ŭ���� ����
	private int age;
//������
	public Person(E name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//�޼���					<���� �Ű����� �����>
	public E getName() { //1. Getter�� ����ϱ�
		return name;
	}
						//2. Ŭ�������� �������� ���� test(T t) ����ϱ�
	public <T extends Object> T test(T t) {
		return t;
	}
	
	
}
