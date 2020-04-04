
public class PetShopExample {

	public static void main(String[] args) {
		
		// �ν��Ͻ� 3�� ����
		Animal badook = new Dog(); //������ (�θ�Ŭ���� Ÿ��, �ڽ� Ŭ����)
		Animal nabi = new Cat();
		Animal tiger = new Tiger();
		
		//�迭�� ������ �ν��Ͻ� ��Ī -> �迭 �̸� : animals
		Animal[] animals = new Animal[3]; //<?> �ǹ�
										//�迭 �����ϴ� ��� ���� : Ÿ�� [] �̸�, Ÿ��[]�̸� = new Ÿ�� [ũ��]
		//Object[] objArr = new Object[3];
		//Object obj = new Object();
		//System.out.println(obj);
		animals[0]=badook;
		animals[1]=nabi;
		animals[2]=tiger;
		
		//<?>
		//enhanced for�� 
		for(Animal ani : animals) { //Ŭ����A  A�κ��� ������ �ν��Ͻ� �̸� : �迭
			ani.eat();
		}
		System.out.println();
		
		
		//�迭�� ������ �ν��Ͻ� ��Ī -> �迭 �̸� : pets
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
		
		shop.carePet((IPet) badook); //IPet Ÿ������ ����ȯ�ؼ� �����ؾ� ��
		shop.carePet((Cat)nabi); //Cat�� IPet�̹Ƿ� Cat���� ����ȯ �ص� ��
		shop.carePet(pets[2]); //Pets �迭�� IPet Ÿ��
		
		
	}//end main

}//end class
