
public class PetShopExample {

	public static void main(String[] args) {
		
		// 인스턴스 3개 생성
		Animal badook = new Dog(); //다형성 (부모클래스 타입, 자식 클래스)
		Animal nabi = new Cat();
		Animal tiger = new Tiger();
		
		//배열에 생성된 인스턴스 매칭 -> 배열 이름 : animals
		Animal[] animals = new Animal[3]; //<?> 의미
										//배열 선언하는 방법 참고 : 타입 [] 이름, 타입[]이름 = new 타입 [크기]
		//Object[] objArr = new Object[3];
		//Object obj = new Object();
		//System.out.println(obj);
		animals[0]=badook;
		animals[1]=nabi;
		animals[2]=tiger;
		
		//<?>
		//enhanced for문 
		for(Animal ani : animals) { //클래스A  A로부터 생성된 인스턴스 이름 : 배열
			ani.eat();
		}
		System.out.println();
		
		
		//배열에 생성된 인스턴스 매칭 -> 배열 이름 : pets
		IPet[] pets = new IPet[3];
		pets[0] = (IPet)badook;  //?
		pets[1] = (IPet)nabi;  //?
		//pets[1] = (IPet)tiger; //Runtime Error
		pets[2] = new GoldFish(); //? 
		//pets[2] = new Shark(); //Compile Error
		
		for(IPet pet : pets) { 
			pet.play();
		}
		System.out.println();
		
		PetShop shop = new PetShop();
		//System.out.println(badook instanceof IPet);
		//System.out.println(badook instanceof Dog);
		//System.out.println(badook instanceof Animal);
		//System.out.println();
		
		shop.carePet((IPet) badook); //IPet 타입으로 형변환해서 전달해야 함
		shop.carePet((Cat)nabi); //Cat은 IPet이므로 Cat으로 형변환 해도 됨
		shop.carePet(pets[2]); //Pets 배열은 IPet 타입
		
		
	}//end main

}//end class
