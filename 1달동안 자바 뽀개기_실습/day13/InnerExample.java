package day13;

public class InnerExample {

	public static void main(String[] args) {
		//Inner, Inner2�� private�� Ŭ�����̱� ������ ��ü���� �Ұ� 
//		new Outer().new Inner();
//		Outer.new Inner2();
		
		//���� ���� Ŭ������ private�� ��찡 ����.
		//�ش� Ŭ�������� �����ϰ� ����ϱ� ���� �뵵
//		Outer.new Inner2();
		Outer.Inner4 in4=new Outer.Inner4();
		in4.doIt();
		
		//Inner3�� static ���� Ŭ������ �ƴϱ� ������
		//�Ʒ��� ���� ������ �� ����
//		Outer.Inner3 in3 = new Outer.Inner3();
		Outer.Inner3 in3=new Outer().new Inner3();
		in3.doIt();
	
	}

}
