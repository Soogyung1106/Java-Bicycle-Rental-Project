package day1_4;

public class ForStarExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//공백은 0,1,2,3,4 // 별은 5,4,3,2,1
		
		int dan=5;
		for(int i=0;i<dan;i++) { //단 형성
			
			for(int j=0 ; j<i;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<dan-i;j++) {  //j 또 한 번 써줘도 상관 없음!
				System.out.print("*");
			}
			System.out.println();
		}
	}   
	
	// 두 번째 조건값 : dan-i, 세번째 조건값 : 공백 반복할 수 있도록 for문 
}


// 마름모  : Math.abs(-3) =3;


