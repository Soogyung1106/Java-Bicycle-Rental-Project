package Exception;

public class RuntimeExceptionExample {
	
	public static int makeException1(int input) {
		//CheckedException�� ȣ���ڿ��� ������ ���ؼ��� �ݵ�� �޼��� �̸� ���� throws ������ �������
		//RuntimeException�� ȣ���ڿ��� ������ ���ؼ� throws ������ ���� �ʿ䰡 ����. �� ���൵ throws ��.
		
		//�׷��� RuntimeException�� try catch���� ������ �ڵ����� ȣ���ڿ��� throws��.
		//�ݸ鿡 CheckedException�� try catch���� ������ �ݵ�� throws������ ����� ��.
		
		//RuntimeExceptio�� �����Ͻÿ� ���ܰ� �߻��� �� �𸣰�, ����ÿ��� �� �� �ִ�.
		//-> ó������ �ʾƵ� ������ ���� -> ��, ���ܸ� ���������� �ƹ��� ó���� �ȵ��ִ� �����̴�.
		//-> throws������ ������ �ڵ������� ȣ���ڿ��� throws �ϵ��� ����. -> �ݵ�� ó���ؾ߸� ������ ����
		
		//�ݸ鿡 CheckedException�� �����Ͻÿ� ���ܰ��ɼ��� �ִٴ� ����� �ȴ�. 
		//-> �ݵ�� ó���ؾ߸� ������ ���� -> ���ܸ� �������� ��� ó���� �Ǿ����� -> ��� throws�� ����ߴٸ� �ᱹ JVM���� ���� ���α׷� ����
		
	    int divide=0;
		// �����ϱ� ������ ���ܰ� �߻����� �߻����� ������ �𸥴�.
		//int/int�� ��..
		//������ �츮�� �˼� �ֱ� ������ �̷����� �߰��ϸ�
		//�ʿ信 ���� ���ļ� Arithmetic���ܰ� �߻����� �ʵ��� �ϰų�,
		//Ȥ�� �״�� �ΰ� catch�Ͽ� �ٸ� �ڵ带 ������ �� ���� ����.
		int result =input/divide; //���� : 0���� ����
		return result;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
			System.out.println(e.getMessage());	
		}
	}
	
	public static void makeException2() {
		String s="��";
		//���ܰ� �߻����� ������ ��.
		//s�� String�� ��ü�̰� �� ��ü�ȿ� charAt�̶�� �ż��尡 �ְ� 
		//�޼��� �ȿ� ���ڷ� int���� �� ���� ������ ���������δ� �ƹ� ������ ����
		//�����ϻ� �ƹ� ������ ���� ������ �� �� �˼� �ִ� ���ܰ� �ٷ� --> RuntimeException
		//RuntimeException�� �ƴ� ���ܵ�(CheckedException)�� 
		//������ �ܰ���� ó���� ����� �������� ������.
		System.out.println(s.charAt(1)); // ���� : 0���� �ۿ� ����.
	}
	public static void makeException3() {
		int[] a= {1,2,3};
		//���������� ���� �ƹ��� ������ ����.
		//�������� �����ǰ� RuntimeException �ֿ��� -> �߽߰ÿ� �ڵ带 ����
		//(�ƴ� ��쵵 �ֽ��ϴ�.) -> �� ���� �ڵ带 �ٲ��� �ʰ� try catch�� ó��
		System.out.println(a[3]); // ���� : index�� 2���� �ۿ� ����
	}
	
//null ������ �ͼ��� 
	public static int makeException4() {
		String nothing=null;
		System.out.println(nothing.split(""));
	}
	
	public static void makeException5() {
		String notInt="������";
		int a=Integer.parseInt(notInt);
	}
	//�ͼ����� �ƴ϶� ������ (StackOverflowError : ��� �ڱ��ڽ��� ȣ���ؼ� �ߴ� ����)
	public static int makeException6() {
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			makeException6();
		}
	}
	
	//ArrayStoreException
	public static void makeException7() {
		Object[] objArr =new String[3];
		objArr[0]=0; // ���� : String �迭�ε� int ���� ������
	}
	
	//ClassCastException
	public static void makeException8() {
		Object[] objArr = new String[3];
		objArr[0]="0";
		Integer a = (Integer) objArr[0];
	}
	
	public static void main(String[] args) {
		//Runtime Exception�� �������� �ᱹ try catch ���־�� ���α׷��� 
		//makeException1(4);
		//System.out.println("���α׷��� ���������� ���� �Ǿ���"); 
		//���α׷��� �����ٰ� ������ �߻��ϴ��� ������ ���α׷��� ������ ������.
		//makeException2();
		//makeException3();
		//makeException4();
		//makeException5();
		try {
			makeException6();
		}
		makeException6();
		//makeException7();
		//makeException8();

	}
	
}


