//애완동물임을 나타내는 인터페이스 
//IPet을 구현한 클래스는 Cat, Dog, GoldFish
public interface IPet {
	public abstract void play(); 
}

//IPet(인터페이스) => 구현 : Cat, Dog, GoldFish (애완동물로 키울 수 있는 것)

//Animal(부모) -> Cat, Dog, Tiger(자식)
//Fish(부모) -> GoldFish, Shark(자식)

//PetShop <매개변수 : Cat, Dog, GoldFish (IPet객체들)>