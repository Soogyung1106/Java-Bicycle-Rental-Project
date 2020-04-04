package anonymous;
import java.util.*;
public class AnonymousExample {

	public static void main(String[] args) {
		//추상 클래스는 객체를 생성하지 못하는데 생성자가 존재하는 이유?
		ArrayList arr=new ArrayList<>();
		System.out.println(arr instanceof ArrayList);
		System.out.println(arr instanceof List);
		System.out.println(arr instanceof Collection);
		System.out.println(arr instanceof AbstractCollection);
		System.out.println(arr instanceof Object);
		Collection arr2=arr;
//		arr.
//		arr2.
		
		Person p=new Person(); //인스턴스 생성
		p.walk();
		p=new Student(); //다형성
		p.walk();
		//선생이 걷습니다.를 출력하려면 Person을 상속받는 Teacher라는 클래스에
		//walk()를 재정의 하면 됩니다.
		//그런데 여기서 딱 한  번만 "선생이 걷습니다."를 출력할거라 클래스로 만들어 놓을 필요가 없습니다.
		//이럴 때 익명 클래스를 사용하는 것이다.
		//new Person() 옆에서 시작되는 블록은
		//Person을 상속받는 하나의 클래스 내부라고 생각하면 됨.
		p=new Person() {
			//walk() 재정의
			public void walk() {
				System.out.println("선생님이 걷습니다.");
			}
		};
		p.walk();
	}

}
