package static_;

public class StaticVarExample {

	public static void main(String[] args) { 
		Count c1=new Count();
		c1.a++; // �ν��Ͻ� ���� 0 -> 1 
		c1.b++; // Ŭ���� ���� 0 -> 1 ����
		System.out.println("Non-static a : "+c1.a);
		System.out.println("static b : "+c1.b);
		
		Count c2=new Count();
		c2.a++; 
		c2.b++; // Ŭ���� ���� 1 -> 2 ����
		System.out.println("Non-static a : "+c2.a);
		System.out.println("static b : "+c2.b);
		
		Count.b++;  //Ŭ���� ���� 2-> 3����
		// Ŭ���� ������ �ν��Ͻ� ��� �� �ϰ� ������ ���� Ŭ���� �̸����θ� �ٷ� ���� ������!
		//<���� 2���� ���>
		System.out.println("c1.b : "+c1.b); //1. Ŭ���� ���� ���(�̰� �� �Ϲ���)
		System.out.println("c2.b : "+c2.b); //2. �ν��Ͻ� ���� ���
		System.out.println("Count.b : "+Count.b);

	}

}
