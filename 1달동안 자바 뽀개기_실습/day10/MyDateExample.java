package day10;

public class MyDateExample {
	public static void main(String[] args) {
		MyDate date =new MyDate();
		System.out.println(date.getDay()+"��");
		System.out.println(date.getMonth()+"��");
		//��ü���� ������ ���� �Ҵ��� �� �ִ� ����° ���. ù��°�� �����Ҵ�.
		//�ι�°�� �����ڸ� �̿��� �Ҵ�
		date.setDay(55);
		System.out.println(date.getDay()+"��");
		date.setDay(18);
		System.out.println(date.getDay()+"��");
		
	}
}
