
public class ArrayExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr= {1,2,3};		//변수 이름에는 숫자가 맨 앞에 올 수 없다.(규칙), 특수 문자 딱 2개만 허용(밑줄_과 달러$)
		int[] intArr1= new int[3];
		
		intArr1[0]=1;
		intArr1[1]=2;
		intArr1[3]=3;
		System.out.println();
		int intArr2[]= {1,2,3};
		int intArr3[];
		intArr3=new int[3];
		int intArr4[]=new int[] {1,2,3};
		
		
		System.out.println(intArr);    //왜 이상한 값이 출력된 것일까? /기억/ 배열이름 = 주소
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
	}

}
