// �⺻�ڷ����� ������(byte, short, int, long), �ε��Ҽ�����(float, double), ����(Boolean), ������(char) 

public class TypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������ ���� ���� �� �ʱ�ȭ  //0000_0101�� ���� b�� ������ ��
		byte b=5;
		short s=30000;
		int i =2138234234;
		long l=999999L;		//long���� ���ͷ��� L�� �����ϴ�.
		
		//�ε��Ҽ����� ���� ���� �� �ʱ�ȭ
		float f=3.15F;//float�� ���ͷ��� F�� �����ϴ�. (double�� �������ֱ� ���ؼ�)
		double d =3.15;
		
		//����
		boolean bo =true;
		bo=false;	//boolean�� ���ͷ��� true, false 2���ڿ� �����ϴ�.
		
		//������
		char c='a';
		String st="abc";	//String�� ��� �⺻ ������ Ÿ���� �ƴ�����..
		System.out.println((int)c);
		
	}

}



