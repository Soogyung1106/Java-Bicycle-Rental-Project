package exception;

public class DoIt3 {
	
	public static void doit(int index) throws Exception{
		
		try {
			DoIt2.doit(index);
		}catch(Exception e){
			System.out.println("DoIt3���� ���ܸ� catch �߽��ϴ�.");
			System.out.println("�ٽ� �����ϴ�.");
			throw e; //? throws���� ������??/ �ٱ��� ȣ���ڿ��� ������ ��, �׳� throw�� 
		}
		

	}
}	
