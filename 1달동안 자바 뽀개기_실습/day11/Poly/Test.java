package Poly;

public class Test {
	public static void main(String[] args) {
		Person p=new Person("������", 27);
		System.out.println(p);
		System.out.println(p.toString());
		Object[] objArr=new Object[2];
		//������.. �⺻ ������Ÿ���� Object Ÿ�Ժ����� ���� ���ϰ� 
		//Wrapper Ŭ������ �μ� �־���.
		//������ ������ ����ڽ� ��� ���п� �׳� ���� �� �ֽ��ϴ�.
		objArr[0]=new Integer(100);  //���� ���������� �ݵ�� �̷��� ���� ����
		objArr[0]=100; //����
	}
}
