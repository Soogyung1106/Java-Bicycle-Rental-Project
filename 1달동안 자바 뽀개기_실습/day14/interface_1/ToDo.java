package interface_1;

public class ToDo implements IToDo3, IToDo4{
//인터페이스는 다중상속 뿐만 아니라 '다중구현' 가능함!
	
	public void m1() {
		System.out.println("m1() 구현");
	}
	
	public void m2() {
		System.out.println("m2() 구현");
	}
	
	public void m3() {
		System.out.println("m3() 구현");
	}
	
	public void m4() {
		System.out.println("m4() 구현");
	}
	
}
