package modifier;
import modifier.pac.Super;
// �ּ� ġ��

public class ModifierExample {
	public static void main(String[] args) {
		System.out.println("=======SUPER ����=======");  //����Ʈ?? 
		//�ν��Ͻ� ����
		Super sup=new Super(); 
		System.out.println("num1 = " + sup.num1);  // num1�� public�̿��� �ٸ� ��Ű������ ����� �� ����
		// �� import �ݵ�� �������!
		//System.out.println("num2 = " + sup.num2); //num2�� protected���� 
		//(ModifierExampleŬ������ SuperŬ������ subclass�� �ƴ�)
		//System.out.println("num3 = " + sup.num3); //���� ������ �� ���༭
		//System.out.println("num4 = " + sup.num4); // num4�� private �̿���
		System.out.println("num4 = " + sup.getNum4());  // getNum4()�� public�̿���
		System.out.println("\n=====Sub����======");
		//�ν��Ͻ� ����
		Sub sub = new Sub();
		sub.print();
	
	}
}
