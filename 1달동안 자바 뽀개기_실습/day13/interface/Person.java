package interface_;

public class Person implements Aquatic{  //Person클래스는 Aquatic 이름의 인터페이스를 구현했다.
	//오버라이드
	public void swimming() {
		System.out.println("이제 수영을 할 수 있어요.");
	}
	
	public static void main(String[] args) {
		Person p=new Person();
		p.swimming();
	}

}
