package list;

import java.util.LinkedList;

public class LinkedListExample {

//LinkedList Ŭ������ ArrayList ���� ��ȸ �ӵ��� ������.(����)
//ArrayList���� �߰�, ������ ������.(����)
	
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("hello");
		list.add("java");
		list.addFirst("banana");
		list.addFirst("apple");
		list.addLast("zoo");
		
		System.out.println("list data : "+list);
		
		list.remove();	//head ������Ʈ ����
		System.out.println("list data after remove() : "+list);
		
		list.remove(2);	//2�� �ε��� ������Ʈ ����
		System.out.println("list data after remove(2) : "+list);
		
		list.set(1, "new element");	//1��° ������Ʈ ����
		System.out.println("list data after set() : "+list);
		
		String str1=list.peek();  //������Ʈ ��ȸ
		System.out.println("str1 : "+str1);
		System.out.println("list data after peek() : "+list);
		
		String str2=list.poll(); //������Ʈ ��ȸ �� ����
		System.out.println("str2 : "+str2);
		System.out.println("list data after poll() : "+list);
		
		

	}

}
