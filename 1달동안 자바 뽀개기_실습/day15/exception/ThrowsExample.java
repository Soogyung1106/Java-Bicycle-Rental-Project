package exception;
//?
public class ThrowsExample {

	public static void main(String[] args) throws Exception {
		int i=(int)(Math.random()*4); //?? �� ��ȯ �ʿ� ���� 0~1������ ������?/
		try {
			DoIt4.doit(i);
		}catch(Exception e){
			System.out.println("main������ �޾ҽ��ϴ�.");
			System.out.println("�� �̻� ���ܸ� ������ �ʰ� �Һ��ŵ�ϴ�.");
			throw e;
			//RuntimeException�� try~catch�� ������� ������ �ڵ����� throws�˴ϴ�.
			
		}
	
		System.out.println("���� ���� ����");
		
	}

}

// Error, Exception(checked exception, runtime exception)
