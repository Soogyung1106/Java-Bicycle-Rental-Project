package Wrapper;

public class WrapperExample {

	public static void main(String[] args) {
		// Wrapper는 기본데이터타입이나 혹은 다른 클래스를 감싸서 기능을 추가해주는 방법.
		//ex) int는 Interger, long은 Long, char[]는 String
		//a에는 아무 기능도 없음.
		int a=3;
		//a1에는 int 값과 관련된 많은 기능(메서드)들이 들어 있습니다.
		//1. float 타입으로 바꾸는 기능
		Integer a1=new Integer(3);
		float af=a1.floatValue();
		//float af = a; 자동적 형변환(promotion)과 동일
		
		//2. int값의 내부적 표현을 String으로 반환하는 기능
		System.out.println(Integer.toBinaryString(3));
		
		//String도 char배열을 감싸는 하나의 Wrapper로 볼 수 있습니다.
		String s0=new String("가나다라마바사");
		String s1=new String("가나다라마바사");
		System.out.println(s0==s1);  // == 은 주소를 비교하는 것임
		System.out.println(s0.equals(s1));  //그 안의 값이 같는지 비교하고 싶을 때 -> equals
//?		//String 클래스의 기능 1 : interned 
		String s2="가나다라마바사";
		String s3="가나다라마바사";
		System.out.println(s2==s3);
		System.out.println(s1==s2);
		System.out.println(s0==s2);
	//String 클래스의 기능 2 : sub array 뽑기 
		System.out.println(s0.substring(2,5));  // 인덱스 2~4까지  문자열 나옴
		
	}

}
