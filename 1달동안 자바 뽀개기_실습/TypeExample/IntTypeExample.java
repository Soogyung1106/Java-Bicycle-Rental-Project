
public class IntTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=(byte)(128+256*2);  //a�� 127���� �ۿ� ǥ���� ���Ѵ�.   //00000000...(1000_0000) 1�� ��ȣ��Ʈ�� ��
		short b=(short)32768;		////00000000...(1000_0000_0000_0000) 1�� ��ȣ��Ʈ�� ��
		int c= 2147483647;
		long d=2147483648L;
		System.out.printf("%d,%d,%d,%d \n", a,b,c,d);
		
	}

}
