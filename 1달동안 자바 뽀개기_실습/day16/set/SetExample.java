package set;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		Set set =new TreeSet();
		//��ȯ Ÿ���� boolean
		//���Ҹ� Object type���� ����ϱ� ������ ��� ���� ��ü�� ���� �� ����.
		set.add("three");
		//TreeSet�� ��� �ι�° ���Ҹ� ���� �� ù��° ���ҿ� ���ؼ� ����.
		//TreeSet�� �̿��ϸ� �ε����� ���µ� ������ ����.
		//String�� Integer�� ���� �� ����.
		//��Ÿ�� ������ ClassCastException�߻�
//		set.add(3); 
		//ù��° ���Ҵ� �ƹ��ų� ���� �� ������ �� �������ʹ� ù��° ���ҿ�
		//�� �������ʹ� ù��° ���ҿ� �񱳰� �� �� �ִ� ���Ҹ� �־�� ��.
		set.add("four");
		set.add(3.0f);
		set.add('��');
		set.add(new Date());
		//�ߺ� �Ұ�\
		
		System.out.println(set.add("three"));
		
		//��ü ���
		System.out.println(set);
		//�ϳ��� ��� 1. enhanced for ���
		for(Object element : set) {
			System.out.println(element);
		}

		//�ϳ��� ��� 2. iterator ���
		//���ҵ��� �ϳ��� �Һ��� �� ���, ������ Set���� ���Ұ� �������� �� �ƴ�.
		Iterator iter = set.iterator(); //���ͷ����͸� ���� �ϳ��� ����ϴ� ���
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		//�ϳ��� ��� 3. toArray �޼��� ���
		Object[] setArr = set.toArray();
		for(int i=0;i<setArr.length;i++) {
			System.out.println(setArr[i]);
		}
		
		
		
		//set������ Ư�����Ҹ� ���ü��� ����.
		System.out.println(set.contains("three")); //����ִ��� �� ����ִ��� true, false
		System.out.println("set�� �ִ� �� ������Ʈ�� ����"+set.size()); //����ִ� ������ ����
		set.remove("three"); //����
		System.out.println("set�� �ִ� �� ������Ʈ�� ����"+set.size());
		set.clear();//���� ��� ���� 
		if(set.isEmpty()) { //���Ұ� ����ִ��� ������
			System.out.println("���Ұ� �ϳ��� �����ϴ�.");
		}
		
		
	}

}
