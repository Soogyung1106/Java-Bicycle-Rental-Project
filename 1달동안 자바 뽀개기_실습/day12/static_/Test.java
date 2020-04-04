package static_;

public class Test {
//문법. static메서드 안에서 non static 멤버를 static reference로 사용할 수 없다. 인스턴스 변수를 그냥 사용할 수 없다??
// static 메서드는 인스턴스를 전혀 생성하지 않고도 실행 가능하다
// static 멤버는 인스턴스에 종속되어 있지 않고 독립적이기 때문에! 전역 변수와 비슷. 클래스에서 참조를 해야! 
// static 메서드가 호출되었을 때, 인스턴스가  존재한다는 보장을 못함.
// 인스턴스 변수는 인스턴스가 있어야 존재한다.
// 인스턴스 변수를 참조할 수 있는지 보장할 수 없다.
//cannot make a static reference to the non-static field scan
	
	public static void main(String[] args) {
		//클래스 메서드의 예시 .....??
		String a = String.valueOf(2345); 
		int i = Integer.parseInt("3465");
		//인스턴스 메서드의 예시.....??
		String a1="abcdef";
		System.out.println(a1.charAt(0));
	}

}
