package day13;

public class FinalLocalVarExample {
	//��� ����
	public int data=100;
	
	//main �޼���
	public static void main(String[] args) {
		new FinalLocalVarExample().doIt("ȫ�浿");
	}
	
	//doIt �޼���
	public void doIt(final String name) {  
		//�ʿ�� �޼��� �ȿ� Ŭ������ ���� �� �ִ�. �� Ŭ������ ���� �ִ� �޼��� ���� 
		//���������� �Ű������� final�� �ٿ��� �Ѵ�.
		
		final int age =38;
		
		class InnerLocal{
			public void innerDoIt() {
				System.out.println("Ŭ���� ���� ������� data :"+data);
				System.out.println("Ŭ���� ���� �Ķ���� ���� name :"+name);
				System.out.println("Ŭ���� ���� �������� age :"+age);
				//age++;
			}//end innerDoIt
		}//end class InnerLocal
		new InnerLocal().innerDoIt();
	}//end doIt

}//end class finalLocalVarexample
