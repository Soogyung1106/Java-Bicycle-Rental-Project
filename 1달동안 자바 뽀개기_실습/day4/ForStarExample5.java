package day1_4;

public class ForStarExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan=5;
		for(int i=0;i<dan;i++) { //�� ����   i= 0���� 4���� 5�� �ݺ�
			
			for(int j=0;j<4-i;j++) {   //���� ����(������ �پ��� ���� ...�ϴ�-)
				System.out.print(" "); //i=0�� �� j= 4,3,2,1
			}
			for(int j=0;j<2*i+1;j++) {  // �� ����(���� �����ϰ� ����...�ϴ� +)
				System.out.print("*"); //i=0�� �� j = 0, i=1�� �� j=0,1,2
			}
			for(int j=0;j<4-i;j++) {  //���� ����
				System.out.print(" ");
			}
			
			System.out.println();
			
		}
		// ���� 4 /*1 /����4
		// ���� 3 /*3 /����3
		// ���� 2 /*5 /����2
		// ���� 1 /*7 /����1
		// ���� 0 /*9 /����0
	}

}
