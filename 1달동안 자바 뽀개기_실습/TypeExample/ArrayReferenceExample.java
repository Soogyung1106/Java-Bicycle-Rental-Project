//homework : array1을 array2에 얕은 복사가 아니라 깊은 복사 하는 것! 쌤 메일로 보내드리기!
// 깊은 복사(동일한 요소들을 가질뿐만 아니라 다른 주소를 가진 제2의 새로운 배열 탄생 ) vs 얕은 복사(주소를 공유)
public class ArrayReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {2,3,5,7,11,13,17,19};
		int[] array2;
		
		printArray(array1);	//뭔 뜻임
		array2=array1;		//복사 (엄밀히 말하면 array1의 주소를 array2가 전달받은 것임!!)  얕은복사!! 주소를 공유하는 셈!!
		array2[0]=0;
		array2[2]=2;
		printArray(array1);
	}//end main
	
	public static void printArray(int[] array) {
		System.out.println('<');
		for(int i=0;i<array.length; i++) { //0부터 마지막 요소까지 
			System.out.print(array[i]);
			if(i+1 < array.length) {
				System.out.print(" , ");
			}
		}
	}

}
