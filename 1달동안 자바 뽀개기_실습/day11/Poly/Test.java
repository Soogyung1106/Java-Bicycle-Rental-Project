package Poly;

public class Test {
	public static void main(String[] args) {
		Person p=new Person("지승훈", 27);
		System.out.println(p);
		System.out.println(p.toString());
		Object[] objArr=new Object[2];
		//예전에.. 기본 데이터타입을 Object 타입변수에 넣지 못하고 
		//Wrapper 클래스로 싸서 넣었다.
		//하지만 지금은 오토박싱 기능 덕분에 그냥 넣을 수 있습니다.
		objArr[0]=new Integer(100);  //옛날 버전에서는 반드시 이렇게 썼어야 했음
		objArr[0]=100; //현재
	}
}
