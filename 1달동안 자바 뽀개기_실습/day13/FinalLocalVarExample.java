package day13;

public class FinalLocalVarExample {
	//멤버 변수
	public int data=100;
	
	//main 메서드
	public static void main(String[] args) {
		new FinalLocalVarExample().doIt("홍길동");
	}
	
	//doIt 메서드
	public void doIt(final String name) {  
		//필요시 메서드 안에 클래스를 만들 수 있다. 그 클래스가 속해 있는 메서드 내의 
		//지역변수와 매개변수는 final을 붙여야 한다.
		
		final int age =38;
		
		class InnerLocal{
			public void innerDoIt() {
				System.out.println("클래스 밖의 멤버변수 data :"+data);
				System.out.println("클래스 밖의 파라미터 변수 name :"+name);
				System.out.println("클래스 밖의 지역변수 age :"+age);
				//age++;
			}//end innerDoIt
		}//end class InnerLocal
		new InnerLocal().innerDoIt();
	}//end doIt

}//end class finalLocalVarexample
