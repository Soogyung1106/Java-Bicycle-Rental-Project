
public class PetShop {

//메서드
	public void carePet(IPet pet) { //IPet 인터페이스 타입의 pet : IPet 타입의 객체만 받겠다.
		if(pet instanceof Dog) {
			System.out.println("개를 돌봅니다.");
		}else if(pet instanceof Cat) {
			System.out.println("고양이를 돌봅니다.");
		}else if(pet instanceof GoldFish) {
			System.out.println("물고기를 돌봅니다.");
		}//end else if
		
	}//end carePet()
	
}//end class
