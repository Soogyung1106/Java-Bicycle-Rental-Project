package day1_4;

public class IfExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cat cat = new Cat(); ��ü�� ����� ���
		int jumsu =(int)(Math.random() * 110);  // Math.random() >> 0~1������ ������ ���� ������ �ϴ� �޼���
		
		System.out.println("���� : " + jumsu);
		
		if(jumsu >= 90) {
			if(jumsu > 100) {
				System.out.println("�߸� �Էµ� �����Դϴ�.");
			}else {
				System.out.println("����� ������  A�Դϴ�.");
			}
		}else if(jumsu >= 80) {
			System.out.println("����� ������ B�Դϴ�.");
		}else if(jumsu >=70) {
			System.out.println("����� ������ C�Դϴ�.");
		}else if(jumsu >= 60) {
			System.out.println("����� ������ D�Դϴ�.");
		}else {
			System.out.println("����� ������ F�Դϴ�.");
			System.out.println("����� ����� ������Դϴ�.");
		}
	}

}
