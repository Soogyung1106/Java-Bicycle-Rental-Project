package constructor;

public class PencilInstanceExample {

	public static void main(String[] args) {
		Pencil testPen0=new Pencil(); 
		//기본 생성자 역할? 객체 생성만 해줌..값을 넣어주거나 그런 기능은 x
		Pencil testPen1=new Pencil("red");
		Pencil testPen2=new Pencil(30);
		Pencil testPen3=new Pencil(30,20);
		Pencil testPen4=new Pencil("yellow",30,20);
		Pencil testPen5=new Pencil("green", 10, 1000);
		//생성자를 만들어 놓으면 이런 점이 좋음... 
		//객체 생성과 동시에 초기화
		
	 
		
		
	

	}

}
