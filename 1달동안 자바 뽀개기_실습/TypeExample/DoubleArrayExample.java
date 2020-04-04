
public class DoubleArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priArr= {1,2,3};
		int[] priArr2= {4,5,6};
		int[] priArr3= {7,8,9,10};
		
		int[][] refArr =new int[3][];
		refArr[0]=priArr;
		refArr[1]=priArr2;
		refArr[2]=priArr3;
		System.out.println(refArr[0]);
		System.out.println(refArr[0][0]);
		System.out.println(refArr[1][2]);
		System.out.println(refArr[2][3]);
		
		int[][] refArr2 = {{1,2,3}, {4,5,6}, {7,8,9,10}};
		
	}

}
