package Wrapper;

public class WrapperExample {

	public static void main(String[] args) {
		// Wrapper�� �⺻������Ÿ���̳� Ȥ�� �ٸ� Ŭ������ ���μ� ����� �߰����ִ� ���.
		//ex) int�� Interger, long�� Long, char[]�� String
		//a���� �ƹ� ��ɵ� ����.
		int a=3;
		//a1���� int ���� ���õ� ���� ���(�޼���)���� ��� �ֽ��ϴ�.
		//1. float Ÿ������ �ٲٴ� ���
		Integer a1=new Integer(3);
		float af=a1.floatValue();
		//float af = a; �ڵ��� ����ȯ(promotion)�� ����
		
		//2. int���� ������ ǥ���� String���� ��ȯ�ϴ� ���
		System.out.println(Integer.toBinaryString(3));
		
		//String�� char�迭�� ���δ� �ϳ��� Wrapper�� �� �� �ֽ��ϴ�.
		String s0=new String("�����ٶ󸶹ٻ�");
		String s1=new String("�����ٶ󸶹ٻ�");
		System.out.println(s0==s1);  // == �� �ּҸ� ���ϴ� ����
		System.out.println(s0.equals(s1));  //�� ���� ���� ������ ���ϰ� ���� �� -> equals
//?		//String Ŭ������ ��� 1 : interned 
		String s2="�����ٶ󸶹ٻ�";
		String s3="�����ٶ󸶹ٻ�";
		System.out.println(s2==s3);
		System.out.println(s1==s2);
		System.out.println(s0==s2);
	//String Ŭ������ ��� 2 : sub array �̱� 
		System.out.println(s0.substring(2,5));  // �ε��� 2~4����  ���ڿ� ����
		
	}

}
