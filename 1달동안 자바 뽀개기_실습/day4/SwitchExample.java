package day1_4;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu =(int)(Math.random()*100);
		
		System.out.println("���� : "+ jumsu);
		switch(jumsu/10) {
		case 9:
			System.out.println("����� ������ A�Դϴ�.");
			break;
		case 8:
			System.out.println("����� ������ B�Դϴ�.");
			break;
		case 7:
			System.out.println("����� ������ C�Դϴ�.");
			break;
		case 6:
			System.out.println("����� ������ D�Դϴ�.");
			break;
		default:
			System.out.println("����� ������ F�Դϴ�.");
			System.out.println("����� ����� ������Դϴ�.");
			break;
		}
	}

}
