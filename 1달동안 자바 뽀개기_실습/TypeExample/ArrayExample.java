
public class ArrayExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr= {1,2,3};		//���� �̸����� ���ڰ� �� �տ� �� �� ����.(��Ģ), Ư�� ���� �� 2���� ���(����_�� �޷�$)
		int[] intArr1= new int[3];
		
		intArr1[0]=1;
		intArr1[1]=2;
		intArr1[3]=3;
		System.out.println();
		int intArr2[]= {1,2,3};
		int intArr3[];
		intArr3=new int[3];
		int intArr4[]=new int[] {1,2,3};
		
		
		System.out.println(intArr);    //�� �̻��� ���� ��µ� ���ϱ�? /���/ �迭�̸� = �ּ�
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
	}

}
