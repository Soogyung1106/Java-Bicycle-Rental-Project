package abstract_;

public class AbstractExample {

	//main 메서드	
	public static void main(String[] args) {
		Shape circle =new Circle(10); //다형성
		
		//생성한 객체 circle이 다형성을 가지므로 메서드를 확인할 때 부모 클래스부터 검사하면서
		//자식 클래스로 내려옴, (핵심) 생성된 객체가 다형성을 가지면 때에 따라서 자식클래스에서, 부모클래스에 맞게 행동
		System.out.println("원의 넓이는 : "+circle.getArea()); //자식 클래스에 맞게 행동
		System.out.println("도형의 위치는 : "+circle.position()); //부모 클래스에 맞게 행동
	}
}
