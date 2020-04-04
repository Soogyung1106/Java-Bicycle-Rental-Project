package set;

import java.util.*;

public class SetExample2 {

	public static void main(String[] args) {
		Set set = new TreeSet(); //Set 인터페이스 타입으로 TreeSet 인스턴스 생성
		
		set.add(5);
		set.add(9);
		set.add(4);
		set.add(8);
		set.add(3);
		set.add(1);
		set.add(7);
		set.add(2);
		set.add(6);
		
		System.out.println(set);
		
	}

}
