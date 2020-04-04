//GoldFish 클래스 : Fish 부모 클래스 상속받고, IPet 인터페이스 구현
public class GoldFish extends Fish implements IPet {

//IPet.play() 구현
	@Override
	public void play() {
		System.out.println("금붕어는 강에서 헤엄칩니다.");

	}
	
//Fish.swim() 구현
	@Override
	public void swim() {
		System.out.println("금붕어는 물속에서 놀아요.");

	}

}
