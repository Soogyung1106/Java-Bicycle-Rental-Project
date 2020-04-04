package generic;

public class Person <E>{
//멤버변수
	private E name; //클래스 변수
	private int age;
//생성자
	public Person(E name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//메서드					<유형 매개변수 사용방법>
	public E getName() { //1. Getter에 사용하기
		return name;
	}
						//2. 클래스에서 선언하지 않은 test(T t) 사용하기
	public <T extends Object> T test(T t) {
		return t;
	}
	
	
}
