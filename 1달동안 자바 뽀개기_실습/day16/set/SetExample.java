package set;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		Set set =new TreeSet();
		//반환 타입이 boolean
		//원소를 Object type으로 취급하기 때문에 모든 값과 객체를 담을 수 있음.
		set.add("three");
		//TreeSet의 경우 두번째 원소를 넣을 때 첫번째 원소와 비교해서 넣음.
		//TreeSet을 이용하면 인덱스는 없는데 정렬은 가능.
		//String과 Integer를 비교할 수 없음.
		//런타임 예외인 ClassCastException발생
//		set.add(3); 
		//첫번째 원소는 아무거나 넣을 수 있지만 그 다음부터는 첫번째 원소와
		//그 다음부터는 첫번째 원소와 비교가 될 수 있는 원소만 넣어야 함.
		set.add("four");
		set.add(3.0f);
		set.add('삼');
		set.add(new Date());
		//중복 불가\
		
		System.out.println(set.add("three"));
		
		//전체 출력
		System.out.println(set);
		//하나씩 출력 1. enhanced for 사용
		for(Object element : set) {
			System.out.println(element);
		}

		//하나씩 출력 2. iterator 사용
		//원소들을 하나씩 소비할 때 사용, 하지만 Set에서 원소가 없어지는 건 아님.
		Iterator iter = set.iterator(); //이터레이터를 통해 하나씩 출력하는 방법
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		//하나씩 출력 3. toArray 메서드 사용
		Object[] setArr = set.toArray();
		for(int i=0;i<setArr.length;i++) {
			System.out.println(setArr[i]);
		}
		
		
		
		//set에서는 특정원소를 빼올수는 없음.
		System.out.println(set.contains("three")); //들어있는지 안 들어있는지 true, false
		System.out.println("set에 있는 총 엘리먼트의 개수"+set.size()); //들어있는 원소의 갯수
		set.remove("three"); //삭제
		System.out.println("set에 있는 총 엘리먼트의 개수"+set.size());
		set.clear();//원소 모두 삭제 
		if(set.isEmpty()) { //원소가 비어있는지 없는지
			System.out.println("원소가 하나도 없습니다.");
		}
		
		
	}

}
