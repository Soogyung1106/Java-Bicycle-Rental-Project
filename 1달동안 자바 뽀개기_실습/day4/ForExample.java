package day1_4;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=0; i<=10 ; i++) {
			sum +=i;
		}//for문 안에 사용되는 지역변수 i 다른 반복문에서 중복 사용해도 됨!! 
		
		/*for(int i=0; i<=10 ; i++) {
			sum +=i;
		}*/
		
		System.out.println(sum);
	}

}
