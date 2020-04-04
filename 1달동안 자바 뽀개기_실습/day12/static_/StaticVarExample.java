package static_;

public class StaticVarExample {

	public static void main(String[] args) { 
		Count c1=new Count();
		c1.a++; // 인스턴스 변수 0 -> 1 
		c1.b++; // 클래스 변수 0 -> 1 증감
		System.out.println("Non-static a : "+c1.a);
		System.out.println("static b : "+c1.b);
		
		Count c2=new Count();
		c2.a++; 
		c2.b++; // 클래스 변수 1 -> 2 증감
		System.out.println("Non-static a : "+c2.a);
		System.out.println("static b : "+c2.b);
		
		Count.b++;  //클래스 변수 2-> 3증감
		// 클래스 변수는 인스턴스 사용 안 하고 다음과 같이 클래스 이름으로만 바로 참조 가능함!
		//<참조 2가지 방법>
		System.out.println("c1.b : "+c1.b); //1. 클래스 변수 사용(이게 더 일반적)
		System.out.println("c2.b : "+c2.b); //2. 인스턴스 변수 사용
		System.out.println("Count.b : "+Count.b);

	}

}
