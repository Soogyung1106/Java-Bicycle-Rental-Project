package generic;

import java.util.ArrayList;

//import java.util.ArrayList;

public class GenericExample2 {

	public static void main(String[] args) {
		//generic 기능 활용 x
		ArrayList list = new ArrayList();
		
		//generic 기능 활용 o (엘리먼트로 넣을 수 있는 자료형 정해놓음 )
		ArrayList<String> genericList = new ArrayList<>();
		
		list.add("first");
		list.add("second");
		list.add("third");
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		
		genericList.add("first");
		genericList.add("second");
		genericList.add("third");
		//String 타입이 아닌 다른 타입은 저장 못하기 때문에
		//genericList.add(new Integer(4));
		//genericList.add(new Float(5.0f));
		
		String s1=(String)list.get(0); //list경우
		//s2의 경우 형변환 하지 않아도 됨
		String s2=genericList.get(0); //genericListr 경우
		System.out.println(s1);
		System.out.println(s2);
		for(String s : genericList) {  //?이게 무슨 의미임???
			System.out.println(s);
		}
	}

}
