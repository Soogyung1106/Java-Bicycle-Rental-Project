package abstract_;

public class Circle extends Shape{
//멤버변수
	private int radius;
	
//생성자
	public Circle(int r) {
		this(0, 0, r); // 아래에 있는 인자가 3개인 생성자 호출
	}
	public Circle(int x, int y, int r) {
		super(x, y); //규칙 : 생성자 내에 다른 생성자를 참조할 경우 첫 줄
		//Shape(x, y) -> 부모 클래스의 생성자 호출
		radius =r;
	}
	
//메서드
	//Shape 클래스에서 abstract이었던 getArea 메서드 구현!
	public double getArea() {
		return (Math.PI * radius * radius);
	}
}


