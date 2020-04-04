package ID;

import java.util.Scanner;

public class LoginExample {

	public static void main(String[] args) {
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("ID를 입력해 주세요.");
			String idInputValue = scan.nextLine();
			
			System.out.println("Password를 입력해 주세요.");
			String pwInputValue = scan.nextLine();
			
			try {
				LoginCheck.idCheck(idInputValue);
				LoginCheck.idCheck(pwInputValue);
			}catch(IDNotFoundException e) {
				System.out.println("causeException : "+e.getCause().getClass());
				System.out.println("causeExceptionMessage : "+e.getCause().getMessage());
				System.out.println(e.getMessage());
				System.out.println("아이디가 없거나, 잘못된 비밀번호 입니다.");
				continue;
			}catch(InvalidPasswordException e) {
				System.out.println(e.getMessage());
				System.out.println("아이디가 없거나 잘못된 비밀번호 입니다.");
				continue;
			}catch(Exception e) {
				System.out.println("예상치 못한 오류입니다. 로그확인.");
			}
			
			System.out.println("로그인 되었습니다.");
			scan.close();
			break;
			
		}//end while

	}//end main

}//end class
