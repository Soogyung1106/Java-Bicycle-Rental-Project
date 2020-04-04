package day1_4;

public class ForStarExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan=5;
		for(int i=0;i<dan;i++) { //단 형성   i= 0부터 4까지 5번 반복
			
			for(int j=0;j<4+i;j++) {   //공백 형성 (증가중) 0부터 4까지 
				System.out.print(" ");  //i=0일 때 j= 0,1,2,3
			}
			for(int j=0;j<9-2*i;j++) {  // 별 형성(감소중)
				System.out.print("*");   // i=0일 때 j= 0,1,2...8, i=1일 때 j= 0,1,2..6
			}
			for(int j=0;j<4+i;j++) {  //공백 형성 (증가중)
				System.out.print(" ");
			}
			
			System.out.println();
			
		}
		// 공백 0 /*9 /공백0
		// 공백 1 /*7 /공백1
		// 공백 2 /*5 /공백2
		// 공백 3 /*3 /공백3
		// 공백 4 /*1 /공백4
	}

}
