//Cat 클래스 : Animal클래스  상속받고 IPet 인터페이스 구현
public class Cat extends Animal implements IPet{
	
	//Animal.eat() 구현
	public void eat() { 
		System.out.println("고양이는 생선을 먹습니다.");
	}
	
	//IPet.play 구현
	public void play() {
		System.out.println("고양이는 방에서 놀아요.");
	}
}
