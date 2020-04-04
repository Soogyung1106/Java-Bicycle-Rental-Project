package modifier;
import modifier.pac.Super;
// 주석 치기

public class ModifierExample {
	public static void main(String[] args) {
		System.out.println("=======SUPER 참조=======");  //디폴트?? 
		//인스턴스 생성
		Super sup=new Super(); 
		System.out.println("num1 = " + sup.num1);  // num1은 public이여서 다른 패키지에서 끌어올 수 있음
		// 단 import 반드시 적어줘야!
		//System.out.println("num2 = " + sup.num2); //num2는 protected여서 
		//(ModifierExample클래스가 Super클래스의 subclass도 아님)
		//System.out.println("num3 = " + sup.num3); //접근 제한자 안 써줘서
		//System.out.println("num4 = " + sup.num4); // num4는 private 이여서
		System.out.println("num4 = " + sup.getNum4());  // getNum4()는 public이여서
		System.out.println("\n=====Sub참조======");
		//인스턴스 생성
		Sub sub = new Sub();
		sub.print();
	
	}
}
