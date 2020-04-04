package day13;

public class Outer2 {
	private class Inner() { //인스턴스 생성해야 참조 가능

		public void doIt() {
			System.out.println("inner doIt");
		}
	}
}
