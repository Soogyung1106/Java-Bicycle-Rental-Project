package final_;

public class Child extends Parent{
	
	//메서드 재정의
	public void method() {
		
		
		System.out.println("Child-method()");
	}
	//main 메서드
	public static void main(String[] args) {
		
		Parent p= new Parent(); //인스턴스 생성 p
		p=new Child(); // p는 다형성
		p.method();
		//p.method2();
	}//end main
}//end class
