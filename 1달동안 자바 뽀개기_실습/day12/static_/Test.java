package static_;

public class Test {
//����. static�޼��� �ȿ��� non static ����� static reference�� ����� �� ����. �ν��Ͻ� ������ �׳� ����� �� ����??
// static �޼���� �ν��Ͻ��� ���� �������� �ʰ� ���� �����ϴ�
// static ����� �ν��Ͻ��� ���ӵǾ� ���� �ʰ� �������̱� ������! ���� ������ ���. Ŭ�������� ������ �ؾ�! 
// static �޼��尡 ȣ��Ǿ��� ��, �ν��Ͻ���  �����Ѵٴ� ������ ����.
// �ν��Ͻ� ������ �ν��Ͻ��� �־�� �����Ѵ�.
// �ν��Ͻ� ������ ������ �� �ִ��� ������ �� ����.
//cannot make a static reference to the non-static field scan
	
	public static void main(String[] args) {
		//Ŭ���� �޼����� ���� .....??
		String a = String.valueOf(2345); 
		int i = Integer.parseInt("3465");
		//�ν��Ͻ� �޼����� ����.....??
		String a1="abcdef";
		System.out.println(a1.charAt(0));
	}

}
