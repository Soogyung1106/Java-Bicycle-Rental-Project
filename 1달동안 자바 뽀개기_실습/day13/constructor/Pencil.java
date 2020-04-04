package constructor;

public class Pencil {
//멤버변수(인스턴스 변수)
	public String color;
	public int length;
	public int price;
	
//생성자
	public Pencil() { 
	//기본 생성자 
    //(생성자 안에 실행문은 있더라도 인자x는 조건만 충족하면 기본 생성자임!)
		System.out.println("기본 생성자 실행됨");
	}
	public Pencil(String color) { //인자 1개인 생성자
		System.out.println("color를 인자로하는 생성자 실행됨");
		this.color=color;
	}
	public Pencil(int length) { 
		System.out.println("length를 인자로하는 생성자 실행됨");
		this.length=length;
	}
	public Pencil(int length, int price) {//인자 2개인 생성자
		System.out.println("Length, price를 인자로하는 생성자 실행됨");
		this.length=length;
		this.price=price;
	}
	public Pencil(String color, int length, int price) {//인자 3개인 생성자
	//this()는 현재 클래스에 있는 생성자를 의미한다. 지금의 경우 바로 위에 있는 Pen(int length, int price)를 의미한다.
	//다른 생성자를 참조할 경우 반드시 참조된 생성자가 첫줄에 와야 한다. 
	//super(), this()
		this(length, price); //현재 클래스에 있는 생성자
		this.color=color;
		System.out.println("color, length, price를 인자로하는 생성자 실행됨");
	}
	
//메서드 
	public void write() {
		System.out.println("Hello World");
	}//end write
	
}//end class
