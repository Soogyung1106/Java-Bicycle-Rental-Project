package ID;

import java.util.Scanner;

public class LoginExample {

	public static void main(String[] args) {
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("ID�� �Է��� �ּ���.");
			String idInputValue = scan.nextLine();
			
			System.out.println("Password�� �Է��� �ּ���.");
			String pwInputValue = scan.nextLine();
			
			try {
				LoginCheck.idCheck(idInputValue);
				LoginCheck.idCheck(pwInputValue);
			}catch(IDNotFoundException e) {
				System.out.println("causeException : "+e.getCause().getClass());
				System.out.println("causeExceptionMessage : "+e.getCause().getMessage());
				System.out.println(e.getMessage());
				System.out.println("���̵� ���ų�, �߸��� ��й�ȣ �Դϴ�.");
				continue;
			}catch(InvalidPasswordException e) {
				System.out.println(e.getMessage());
				System.out.println("���̵� ���ų� �߸��� ��й�ȣ �Դϴ�.");
				continue;
			}catch(Exception e) {
				System.out.println("����ġ ���� �����Դϴ�. �α�Ȯ��.");
			}
			
			System.out.println("�α��� �Ǿ����ϴ�.");
			scan.close();
			break;
			
		}//end while

	}//end main

}//end class
