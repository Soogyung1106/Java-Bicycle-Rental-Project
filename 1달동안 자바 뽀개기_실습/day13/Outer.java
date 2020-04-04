package day13;

public class Outer {
//doIt 메서드
	public void doIt() {  //인스턴스 생성해야 참조 가능
		System.out.println("do it");
	}

//Inner 클래스
	private class Inner() { //인스턴스 생성해야 참조 가능

		public void doIt() {
			System.out.println("inner doIt");
		}
	}
//Inner2 클래스
	private class Inner2() {
		public void doIt() {
			System.out.println("static inner doIt");
		}
		public static void doIt2() {  //클래스에서 참조가능
			System.out.println("static inner doIt2");
		}

	}
//static한 Inner2 클래스
	private static class Inner2() {
		public void doIt() {
			System.out.println("static inner2 doIt");
		}
	}
//Inner3 클래스
	class Inner3() {
		public void doIt() {
			System.out.println("inne doIt(no access modifier)");
		}
	}
//Inner4 클래스
	static class Inner4() {
		public void doIt() {
			System.out.println("static inner doIt(no access modifier)");
		}
	}	
//main 메서드
	public static void main(String[] args) {
		Outer out=new Outer();
		out.doIt();//do It
		out.new Inner().doIt();	//? out.Inner().doIt
		new Outer.Inner2().doIt();	//? Outer.Inner2().doIt
		Outer.Inner2.doIt2();  //static이 붙었으므로 인스턴스 생성 없이도 class로 바로 참조 가능 
	}//end main 

}//end class outer

