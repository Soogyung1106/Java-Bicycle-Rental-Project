package list;
import java.util.*;
public class ArrayListExample {
//List �������̽��� ������ Ŭ���� : ArrayList, LinkedList
//set�� �޸� ������ �ְ� �ߺ��� ���Ǵ� �ڷᱸ���̴�. ��? �ε����� �ֱ� ������
//������ �迭�� ���ο� �����͸� �߰� �����Ҷ� ���� �����͵鵵 ó������� �ϹǷ� �����մϴ�.
//���� ũ�⸦ �ø��� ���ؼ��� �迭�� ���� �����ؾ߸� �߽��ϴ�.
//������ ArrayList Ŭ������ �̿��ϸ� �������� ����Ʈ�� ũ�Ⱑ ���ϰ� �� �پ��� �޼��带 ���� �����ϰ� �߰� ������ �����մϴ�. 
	
//add, indexOf, remove, get �߿�!!
	public static void main(String[] args) {
		//List<String, > list = new ArraytList<>();
		List list = new ArrayList(); //List �������̽� Ÿ���� ArrayListŬ�������� �ν��Ͻ� ���� (������)
		
		list.add("One");
		boolean a = list.add("second"); //add() ����� boolean�� ���� a�� ���� -> true
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		boolean b=list.add("second");//add() ����� boolean�� ���� a�� ���� -> true
		list.add(new Integer(4));
		list.add("SECOND");
		
		System.out.println(a); // true��µ�.. boolean���̿���
		System.out.println(b); // ����
		System.out.println(list);
		
		list.remove(0); //0��° �ε����� �ִ� ������Ʈ ����
		System.out.println(list);
		
		Object o=list.get(1); //1���� �ε����� �ִ� ������Ʈ�� ���� o�� ����
		System.out.println(o); //3rd ��µ�
		
		int i=list.indexOf("second"); //"second"�� �ִ� ��ġ(�ε���)�� ���� i�� ����
		System.out.println("second = "+i);
		
		list.clear(); //����Ʈ�� ��� ������Ʈ�� ����
		
		if(list.isEmpty()) { //isEmpty() list�� ��������� true ��ȯ�ϹǷ�
			System.out.println("list is Empty");
		}//end if
	
	}//end main

}//end class
