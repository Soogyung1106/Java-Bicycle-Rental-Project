
public class PetShop {

//�޼���
	public void carePet(IPet pet) { //IPet �������̽� Ÿ���� pet : IPet Ÿ���� ��ü�� �ްڴ�.
		if(pet instanceof Dog) {
			System.out.println("���� �����ϴ�.");
		}else if(pet instanceof Cat) {
			System.out.println("����̸� �����ϴ�.");
		}else if(pet instanceof GoldFish) {
			System.out.println("����⸦ �����ϴ�.");
		}//end else if
		
	}//end carePet()
	
}//end class
