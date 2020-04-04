package list;
import java.util.*;
public class ArrayListExample {
//List 인터페이스를 구현한 클래스 : ArrayList, LinkedList
//set과 달리 순서가 있고 중복이 허용되는 자료구조이다. 왜? 인덱스가 있기 떄문에
//기존의 배열은 새로운 데이터를 추가 삭제할때 뒤의 데이터들도 처리해줘야 하므로 불편합니다.
//또한 크기를 늘리기 위해서는 배열을 새로 생성해야만 했습니다.
//하지만 ArrayList 클래스를 이용하면 동적으로 리스트의 크기가 변하고 또 다양한 메서드를 통해 간단하게 추가 삭제가 가능합니다. 
	
//add, indexOf, remove, get 중요!!
	public static void main(String[] args) {
		//List<String, > list = new ArraytList<>();
		List list = new ArrayList(); //List 인터페이스 타입의 ArrayList클래스에서 인스턴스 형성 (다형성)
		
		list.add("One");
		boolean a = list.add("second"); //add() 결과를 boolean형 변수 a에 저장 -> true
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		boolean b=list.add("second");//add() 결과를 boolean형 변수 a에 저장 -> true
		list.add(new Integer(4));
		list.add("SECOND");
		
		System.out.println(a); // true출력됨.. boolean형이여서
		System.out.println(b); // 동일
		System.out.println(list);
		
		list.remove(0); //0번째 인덱스에 있는 엘리먼트 삭제
		System.out.println(list);
		
		Object o=list.get(1); //1번쨰 인덱스에 있는 엘리먼트를 변수 o에 저장
		System.out.println(o); //3rd 출력됨
		
		int i=list.indexOf("second"); //"second"가 있는 위치(인덱스)를 변수 i에 저장
		System.out.println("second = "+i);
		
		list.clear(); //리스트의 모든 엘리먼트를 삭제
		
		if(list.isEmpty()) { //isEmpty() list가 비어있으면 true 반환하므로
			System.out.println("list is Empty");
		}//end if
	
	}//end main

}//end class
