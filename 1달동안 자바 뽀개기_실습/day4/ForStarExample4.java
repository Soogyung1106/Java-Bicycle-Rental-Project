package day1_4;

public class ForStarExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������ 0,1,2,3,4 // ���� 5,4,3,2,1
		
		int dan=5;
		for(int i=0;i<dan;i++) { //�� ����
			
			for(int j=0 ; j<i;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<dan-i;j++) {  //j �� �� �� ���൵ ��� ����!
				System.out.print("*");
			}
			System.out.println();
		}
	}   
	
	// �� ��° ���ǰ� : dan-i, ����° ���ǰ� : ���� �ݺ��� �� �ֵ��� for�� 
}


// ������  : Math.abs(-3) =3;


