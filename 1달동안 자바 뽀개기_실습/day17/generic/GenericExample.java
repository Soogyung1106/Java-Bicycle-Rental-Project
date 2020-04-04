package generic;

import java.util.ArrayList;

public class GenericExample {

	public static void main(String[] args) {
		//제네릭 클래스 사용법(Type parameter에 실제 Type을 대입하는 방법)
		//하나의 클래스가 TypeParameter를 활용해서
		//미리 특정 Type을 지정하지 않고 클래스를 정의했을 때
		//이를 제네릭 클래스라고 함
		//TypeParameter의 결정법 : 객체를 선언 및 생성할 때 <>를 이용하여 결정.
		
		ArrayList<String> list = new ArrayList<>();  // <>안에 옛날에는 String똑같이 써줬어야. 하지만 지금은 안 그래도 됨
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		//제네릭 메서드 사용법(TypeParameter에 실제 Type을 대입하는 방법)
		//하나의 메서드가 클래스의  TypeParameter와 다른
		//TypeParameter를 가지고 있는 경우 제네릭 메서드라 한다.
		//TypeParameter의 결정법 : 인자의 타입에 따라 결정
		Object[] objArr = list.toArray(new Object[5]); // ???
		String[] strArr = list.toArray(new String[5]); //????
		
	}

}
