package anonymous;
import java.util.*;
public class AnonymousExample {

	public static void main(String[] args) {
		//�߻� Ŭ������ ��ü�� �������� ���ϴµ� �����ڰ� �����ϴ� ����?
		ArrayList arr=new ArrayList<>();
		System.out.println(arr instanceof ArrayList);
		System.out.println(arr instanceof List);
		System.out.println(arr instanceof Collection);
		System.out.println(arr instanceof AbstractCollection);
		System.out.println(arr instanceof Object);
		Collection arr2=arr;
//		arr.
//		arr2.
		
		Person p=new Person(); //�ν��Ͻ� ����
		p.walk();
		p=new Student(); //������
		p.walk();
		//������ �Ƚ��ϴ�.�� ����Ϸ��� Person�� ��ӹ޴� Teacher��� Ŭ������
		//walk()�� ������ �ϸ� �˴ϴ�.
		//�׷��� ���⼭ �� ��  ���� "������ �Ƚ��ϴ�."�� ����ҰŶ� Ŭ������ ����� ���� �ʿ䰡 �����ϴ�.
		//�̷� �� �͸� Ŭ������ ����ϴ� ���̴�.
		//new Person() ������ ���۵Ǵ� �����
		//Person�� ��ӹ޴� �ϳ��� Ŭ���� ���ζ�� �����ϸ� ��.
		p=new Person() {
			//walk() ������
			public void walk() {
				System.out.println("�������� �Ƚ��ϴ�.");
			}
		};
		p.walk();
	}

}
