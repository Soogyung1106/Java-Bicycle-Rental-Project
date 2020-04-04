package abstract_;


public abstract class Shape { // abstract  -> 추상 클래스
	// 멤버변수(인스턴스 변수)
	private int x; //캡슐화의 예
	private int y;
	
	//생성자
	public Shape() {} //기본 생성자

	public Shape(int x, int y) { //추가 생성자
		this.x=x;
		this.y=y;
	}
	
	//메서드  
	public abstract double getArea(); //abstract -> 구현이 되어있지 않음
	
	public String position() {
		return "[x="+x+", y="+y+"]";
	}
}
