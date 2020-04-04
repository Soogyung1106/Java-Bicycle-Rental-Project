package generic;

import java.util.ArrayList;

public class GenericExample {

	public static void main(String[] args) {
		//���׸� Ŭ���� ����(Type parameter�� ���� Type�� �����ϴ� ���)
		//�ϳ��� Ŭ������ TypeParameter�� Ȱ���ؼ�
		//�̸� Ư�� Type�� �������� �ʰ� Ŭ������ �������� ��
		//�̸� ���׸� Ŭ������� ��
		//TypeParameter�� ������ : ��ü�� ���� �� ������ �� <>�� �̿��Ͽ� ����.
		
		ArrayList<String> list = new ArrayList<>();  // <>�ȿ� �������� String�Ȱ��� ������. ������ ������ �� �׷��� ��
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		//���׸� �޼��� ����(TypeParameter�� ���� Type�� �����ϴ� ���)
		//�ϳ��� �޼��尡 Ŭ������  TypeParameter�� �ٸ�
		//TypeParameter�� ������ �ִ� ��� ���׸� �޼���� �Ѵ�.
		//TypeParameter�� ������ : ������ Ÿ�Կ� ���� ����
		Object[] objArr = list.toArray(new Object[5]); // ???
		String[] strArr = list.toArray(new String[5]); //????
		
	}

}
