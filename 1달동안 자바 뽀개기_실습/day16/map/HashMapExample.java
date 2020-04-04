package map;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		Map maps=new HashMap(); //������ (�������̽��� Ŭ���� ���̿��� ������ �ν��Ͻ�)
	
		String s1=new String("ȫ�浿");
		maps.put("name", s0);
		maps.put("name", s1); //add ��� �� �ϰ� put�����, ����� 
		maps.put("hiredate", new Date());
		maps.put("salary", 20000);
		
		System.out.println(maps);
		
		System.out.println();
		System.out.println(maps.get("hiredate"));
		System.out.println(maps.get("salary"));
		System.out.println(maps.get("name"));

		System.out.println();
		//map���� ������Ʈ�� entrySet() �޼��带 �̿��Ͽ� ��ȸ
		Set<Map.Entry<String, Object>> s =maps.entrySet();
		for(Map.Entry<String, Object> me : s) {
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		
		System.out.println();
		//keySet() �޼���� map Ű�� ���Ϲް�  get(key) �޼���� ��ȸ
		Set <String> ss = maps.keySet();
		
		for(String key : ss) {
			System.out.println(key+ " :: " + maps.get(key));
			
		}
		
	}

}
