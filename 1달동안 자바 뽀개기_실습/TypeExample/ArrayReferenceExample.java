//homework : array1�� array2�� ���� ���簡 �ƴ϶� ���� ���� �ϴ� ��! �� ���Ϸ� �����帮��!
// ���� ����(������ ��ҵ��� �����Ӹ� �ƴ϶� �ٸ� �ּҸ� ���� ��2�� ���ο� �迭 ź�� ) vs ���� ����(�ּҸ� ����)
public class ArrayReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {2,3,5,7,11,13,17,19};
		int[] array2;
		
		printArray(array1);	//�� ����
		array2=array1;		//���� (������ ���ϸ� array1�� �ּҸ� array2�� ���޹��� ����!!)  ��������!! �ּҸ� �����ϴ� ��!!
		array2[0]=0;
		array2[2]=2;
		printArray(array1);
	}//end main
	
	public static void printArray(int[] array) {
		System.out.println('<');
		for(int i=0;i<array.length; i++) { //0���� ������ ��ұ��� 
			System.out.print(array[i]);
			if(i+1 < array.length) {
				System.out.print(" , ");
			}
		}
	}

}
