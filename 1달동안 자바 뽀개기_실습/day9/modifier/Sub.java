package modifier;
import modifier.pac.Super;

public class Sub extends Super {  //Sub ���� Super, Super ���� SuperSuper(Sub < Super < SuperSuper)
	private int num5=50;	//this. �� �ǹ� : ���� Ŭ������ �����ϴ� ��ü�� ����
	public void print() {    //super. �� �ǹ�: �θ�Ŭ������ ��ӽ����� ��������� �޼��带 ã�� �ö󰡰ڴ�.
		System.out.println("SuperSuper num0 = "+super.num0);
		//num0�� ��� 1�� �ƴ϶� 2�� ��µȴ�. Super���� ã�ұ� ������ SuperSuper���� �ö��� �ʴ´�. 
		//Super�� ���ٸ� SuperSuper���� �ö󰡼� 1�� ��µ� ����
		System.out.println("Super num1 = "+ super.num1); //SuperŬ���� num1�� public�̹Ƿ�
		System.out.println("Super num2 = "+ super.num2); //Super Ŭ���� num2�� private�̹Ƿ�(���)
		//System.out.println("Super num3 = "+ super.num3); // Super Ŭ���� num3�� package friendly�� 
		//System.out.println("Super num4 = "+ super.num4); // Super Ŭ���� num4�� private�̹Ƿ� 
		
// /?/ ���� ������ �ƹ��͵� �� ���ָ� package friedly��??
// /?/ default�� ����?
		
		System.out.println("Sub num5 = "+ this.num5); // sub �ν��Ͻ��� num5 =50 �̹Ƿ�
		
	}
}
