// 기본자료형은 정수형(byte, short, int, long), 부동소수점형(float, double), 논리형(Boolean), 문자형(char) 

public class TypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수형 변수 선언 및 초기화  //0000_0101이 변수 b의 공간에 들어감
		byte b=5;
		short s=30000;
		int i =2138234234;
		long l=999999L;		//long형의 리터럴은 L을 붙힙니다.
		
		//부동소수점형 변수 선언 및 초기화
		float f=3.15F;//float의 리터럴은 F를 붙힙니다. (double과 구분해주기 위해서)
		double d =3.15;
		
		//논리형
		boolean bo =true;
		bo=false;	//boolean의 리터럴은 true, false 2개박에 없습니다.
		
		//문자형
		char c='a';
		String st="abc";	//String은 사실 기본 데이터 타입은 아니지만..
		System.out.println((int)c);
		
	}

}



