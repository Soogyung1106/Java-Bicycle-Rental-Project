package exception;

public class TryCatchExample {
	public static void main(String[] args) {
		int i=0;
		String[] greetings = {"�ȳ��ϼ���.", "�ݰ����ϴ�.", "�� ������."};
		while(i<4) {
			try {//�ϴ� �����ϰ� ���� �κ�
				System.out.println(greetings[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("���� �߻��߽��ϴ�.");
				System.out.println("���ܰ� �߻��� ������"+e.getMessage());
				System.out.println("���� ó���� �Ϸ��߽��ϴ�.");
			}finally { //finally���� ���ܰ� �߻��ϵ� �� �ϵ� �׻� ����Ǵ� �κ�
				System.out.println("finally ���� �׻� ����˴ϴ�.");
			}//end finally
			i++;
		
		}//end while
		
		System.out.println("������ �������Դϴ�.");
	
	}//end main
}//end class


/*
new ArrayIndexOutOfBoundsException e

*/

