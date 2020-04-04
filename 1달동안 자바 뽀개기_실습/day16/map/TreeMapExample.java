package map;

import java.util.*;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<String, Integer> accounts = new TreeMap<String, Integer>();
		
		accounts.put("ȫ�浿", 10000);
		accounts.put("�̼���", 50000);
		accounts.put("���ؼ�", 90000);
		accounts.put("������", 70000);
		
		System.out.println(accounts);
		
		System.out.println();
		System.out.println("������: "+ accounts.get("������"));
		
		System.out.println();
		Set<Map.Entry<String, Integer>> s = accounts.entrySet();
		for(Map.Entry<String, Integer> me : s) {
			System.out.println(me.getKey()+ " : "+me.getValue());
		}
		
		System.out.println();
		Set<String> ss = accounts.keySet();
		for(String key : ss) {
			System.out.println(key + " :: "+ accounts.get(key));
		}
	}

}
