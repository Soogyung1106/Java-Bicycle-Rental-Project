package day1_4;

public class PalindromeQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String check="��ū��������ū��";
		//charAt()  �޼��� : ó���� ���� ���ϴ� �Լ�		
		//System.out.println(check.charAt(0));
		//System.out.println(check.length()-1);
		//System.out.println(check.charAt(check.length()-1));
		//System.out.println(check.charAt(1) == check.charAt(check.length()-2));
		
		boolean isPalindrome = false;
		for(int i=1; i<check.length()+1/2 ; i++) {
			//i-1, i  i�� 1���� 4����
			
			if(check.charAt(i-1) == check.charAt(check.length()-i)) { // i=1,2,3,
			}else {		//�̷��� if�� �ȿ� �ƹ��͵� �� �� ���� ����!!
				isPalindrome = false;
				System.out.println("Palindrome�� �ƴմϴ�.");
				break;
			}
			isPalindrome =true;
			
		}
		if(isPalindrome) {
			System.out.println("Palindrome�Դϴ�.");
		}
		
	}

}
