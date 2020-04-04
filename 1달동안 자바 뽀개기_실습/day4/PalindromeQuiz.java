package day1_4;

public class PalindromeQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String check="다큰도라지라도큰다";
		//charAt()  메서드 : 처음과 끝을 비교하는 함수		
		//System.out.println(check.charAt(0));
		//System.out.println(check.length()-1);
		//System.out.println(check.charAt(check.length()-1));
		//System.out.println(check.charAt(1) == check.charAt(check.length()-2));
		
		boolean isPalindrome = false;
		for(int i=1; i<check.length()+1/2 ; i++) {
			//i-1, i  i가 1부터 4까지
			
			if(check.charAt(i-1) == check.charAt(check.length()-i)) { // i=1,2,3,
			}else {		//이렇게 if문 안에 아무것도 안 쓸 수도 있음!!
				isPalindrome = false;
				System.out.println("Palindrome이 아닙니다.");
				break;
			}
			isPalindrome =true;
			
		}
		if(isPalindrome) {
			System.out.println("Palindrome입니다.");
		}
		
	}

}
