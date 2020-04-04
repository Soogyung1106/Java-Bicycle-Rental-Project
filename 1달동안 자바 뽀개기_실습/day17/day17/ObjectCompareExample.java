package day17;

import java.util.HashSet;

public class ObjectCompareExample {

	public static void main(String[] args) {
		Dog d1=new Dog("������", "�ǻ�", 15);
		Dog d2=new Dog("��Ƽ��", "�߻�", 5);
		Dog d3=new Dog("������", "�ǻ�", 15);
		//d1�� d3�� ������? �ּҰ��� �ٸ���.
		System.out.println(d1==d3);  //��ü�� ���������� Ÿ���̹Ƿ� ���� �ƴ϶� �ּҸ� �������ϰ� �ִ�.
		//d1 �� d3�� equals�Ѱ���?
		//������ �ϱ� �� equals�� ���� �񱳴� ==�� ���� �񱳿� ������.
		System.out.println(d1.equals(d3));
		System.out.println("hashset�� d1�� d3�� �־�ϴ�.");
		HashSet<Dog> set=new HashSet<>();
		System.out.println(set.add(d1));
		System.out.println(set.add(d3));
		System.out.println(set); //�ٸ��� ���! (������ ����غ��� Hash �� �ٸ�)
		//��ǥ : d1, d3�� ���ٰ� ����� �Ǿ����.
		//equals �޼��带 ������ ���ָ� ����.
		
		
	}

}
