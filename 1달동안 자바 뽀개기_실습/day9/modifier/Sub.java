package modifier;
import modifier.pac.Super;

public class Sub extends Super {  //Sub 위에 Super, Super 위에 SuperSuper(Sub < Super < SuperSuper)
	private int num5=50;	//this. 의 의미 : 현재 클래스가 생성하는 객체의 대명사
	public void print() {    //super. 의 의미: 부모클래스가 상속시켜준 멤버변수나 메서드를 찾아 올라가겠다.
		System.out.println("SuperSuper num0 = "+super.num0);
		//num0의 경우 1이 아니라 2가 출력된다. Super에서 찾았기 떄문에 SuperSuper까지 올라가지 않는다. 
		//Super에 없다면 SuperSuper까지 올라가서 1이 출력될 것임
		System.out.println("Super num1 = "+ super.num1); //Super클래스 num1은 public이므로
		System.out.println("Super num2 = "+ super.num2); //Super 클래스 num2는 private이므로(상속)
		//System.out.println("Super num3 = "+ super.num3); // Super 클래스 num3은 package friendly라서 
		//System.out.println("Super num4 = "+ super.num4); // Super 클래스 num4는 private이므로 
		
// /?/ 접근 제한자 아무것도 안 써주면 package friedly임??
// /?/ default는 뭐임?
		
		System.out.println("Sub num5 = "+ this.num5); // sub 인스턴스의 num5 =50 이므로
		
	}
}
