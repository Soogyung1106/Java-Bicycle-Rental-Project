package day1_4;

public class ForStarExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan=5;
		for(int i=0;i<dan;i++) { //�� ����   i= 0���� 4���� 5�� �ݺ�
			
			for(int j=0;j<4+i;j++) {   //���� ���� (������) 0���� 4���� 
				System.out.print(" ");  //i=0�� �� j= 0,1,2,3
			}
			for(int j=0;j<9-2*i;j++) {  // �� ����(������)
				System.out.print("*");   // i=0�� �� j= 0,1,2...8, i=1�� �� j= 0,1,2..6
			}
			for(int j=0;j<4+i;j++) {  //���� ���� (������)
				System.out.print(" ");
			}
			
			System.out.println();
			
		}
		// ���� 0 /*9 /����0
		// ���� 1 /*7 /����1
		// ���� 2 /*5 /����2
		// ���� 3 /*3 /����3
		// ���� 4 /*1 /����4
	}

}
