package inheritance;

public class Person {
	//생성자가 필요없습니다.
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	/*default*/Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String getDetails() {
		return "이름: " + name + "\t나이: "+ age;
			
	}
	
	
}

// import할 때  * 표시를 통해 패키지 내의 모든 클래스를 import할 수 있다. 
// 하지만 하위 패키지 안에 있는 클래스들까지 import하는 것은 아니다.

/*
 *-> <접근 제한자> (접근 제한자는 클래스의 멤버[멤버변수, 메서드, 생성자]에 붙는다.)
 * 	public : 다른 패키지에서도 자유롭게 사용가능
 * 		단, import를 하고 사용해야함
 *	protected : 다른 패키지에 있는 자식클래스에서만 제한적으로 사용 가능함.
 *?		단, 부모 객체를 통해서 참조할 수는 없고, super.을 통해서 참조
 *	(default) : 다른 패키지에서는 절대로 사용할 수 없음, 오로지 같은 패키지에서만 사용 가능함
 * 	private : 같은 패키지에서도 사용이 불가능, 자기 자신 클래스 안에서만 사용 가능.
 * 
 *-> <상속>  1. 광범위한 클래스(부모 클래스)를 구체화한 클래스(자식 클래스)
 * 		  	 2. 여러 클래스에 해당하는 공통 부분을 하나의 상위 클래스(부모 클래스)로 작성
 * 사용방법 예시) public class Student extends Person 
 * 특징? 1.부모로쿠터 변수나 메서드를 상속받기 때무넹 따로 선언해주지 않아도 됨.
 * 		단, 부모클래스의 private멤버는 상속받을 수 없다.
 *		또한, 부모클래스의 생성자까지 상속받는 것은 아니기 때문에 자식클래스의 생성자가 있어야 함.
 *
 *-> <재정의> 부모에게 있는 메서드를 자식클래스에서 동일한 이름으로 다시 작성하는 것.
 * 조건? 1. 메서드 이름 동일, 인자 형태 동일, 반환타입 동일
 * 		2. 접근제한자는 more public해야 함.
 *
 *-> 오늘 할 일 : 상속, 접근제한자, 생성자 개념을 합친 예제 작성 
 * 
 */