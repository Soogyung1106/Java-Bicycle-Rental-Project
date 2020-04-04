package final_;

/*final*/ public class Parent {  // final이 붙으면 자식 클래스 Child 못 가짐
	
	//메서드 
	public /*final*/ void method() { //final이 붙으면 method() 재정의 x
		System.out.println("Parent = method()");
	}
}
