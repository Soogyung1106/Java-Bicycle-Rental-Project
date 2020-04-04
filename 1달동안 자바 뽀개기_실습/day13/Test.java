package day13;

public class Test {
	public static void main(String[] args) {
		//FinalRefVarExample.java파일에 있는 두 번째 클래스인
		//MyDate 클래스는 public이 붙을 수 없기 때문에 같은 패키지 내에서만 사용가능.
		//public이 붙지 못하는 이유는 public class의 이름과 java파일 이름과 동일해야 하기 때문에
		
		//그리고 하난의 파일에 여러개 클래스가 있는 경우 문제점은
		//파일 이름으로 찾지 못하기 때문에 MyDate 클래스가 어디있는지 찾기 어렵다는 것이다.
		//정말 관련있는 클래스 아니면 따로 java파일을 만들어 두는게 낫다.
		MyDate date = new MyDate();
	}
}
