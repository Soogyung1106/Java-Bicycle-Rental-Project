package constructor;

public class Pen {
	//멤버변수 (인스턴스)
	public String color;
	int price;
	
	//생성자
	public Pen() { 
	//기본 생성자 (인자에 아무것도 x) 사용자가 따로 명시해줘야!
	//사용자가 밑에 생성자 따로 만들어줬으므로
		color = "black";
	}
	
	public Pen(String init_color) { 
		color=init_color;
		System.out.println("생성자를 이용하여 color 값 초기화 함");
	}
	
}
