package generic;

import java.util.ArrayList;

//import java.util.ArrayList;

public class GenericExample2 {

	public static void main(String[] args) {
		//generic ��� Ȱ�� x
		ArrayList list = new ArrayList();
		
		//generic ��� Ȱ�� o (������Ʈ�� ���� �� �ִ� �ڷ��� ���س��� )
		ArrayList<String> genericList = new ArrayList<>();
		
		list.add("first");
		list.add("second");
		list.add("third");
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		
		genericList.add("first");
		genericList.add("second");
		genericList.add("third");
		//String Ÿ���� �ƴ� �ٸ� Ÿ���� ���� ���ϱ� ������
		//genericList.add(new Integer(4));
		//genericList.add(new Float(5.0f));
		
		String s1=(String)list.get(0); //list���
		//s2�� ��� ����ȯ ���� �ʾƵ� ��
		String s2=genericList.get(0); //genericListr ���
		System.out.println(s1);
		System.out.println(s2);
		for(String s : genericList) {  //?�̰� ���� �ǹ���???
			System.out.println(s);
		}
	}

}
