package day13;

public class InnerExample {

	public static void main(String[] args) {
		//Inner, Inner2는 private한 클래스이기 때문에 객체생성 불가 
//		new Outer().new Inner();
//		Outer.new Inner2();
		
		//보통 내부 클래스는 private인 경우가 많음.
		//해당 클래에서만 간편하게 사용하기 위한 용도
//		Outer.new Inner2();
		Outer.Inner4 in4=new Outer.Inner4();
		in4.doIt();
		
		//Inner3는 static 내부 클래스가 아니기 때문에
		//아래와 같이 생성할 수 없음
//		Outer.Inner3 in3 = new Outer.Inner3();
		Outer.Inner3 in3=new Outer().new Inner3();
		in3.doIt();
	
	}

}
