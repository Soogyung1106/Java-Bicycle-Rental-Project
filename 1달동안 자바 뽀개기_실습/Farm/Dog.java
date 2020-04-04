// Dog 클래스 : Animal 클래스 상속받고 IPet 인터페이스 구현
public class Dog extends Animal implements IPet{

//Animal.eat() 구현
	public void eat() {
		System.out.println("개는 사료를 먹습니다.");
	}
	
//IPet.play() 구현
	public void play() {
		System.out.println("개는 밖에서 놀아요.");
	}
}

