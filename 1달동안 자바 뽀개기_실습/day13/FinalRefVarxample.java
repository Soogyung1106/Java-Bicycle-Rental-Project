package day13;

public class FinalRefVarxample {
	
	static final MyDate DATE = new MyDate();
	
	public static void main(String[] args) {

		//주소값이 final이기 때문에 그 주소값이 가리키는 곳에 있는
		//year라는 변수의 값은 바뀔 수 있다.
		DATE.year++;
		//아래는 불가능하다.
		// DATE=new MyDate(); Error
		System.out.println(DATE);
		System.out.println(DATE.toString());

	}//end main
	
}
class MyDate() {
	int year=2000;
	int month=1;
	int day=1;
	
	public String toString() {
		return "["+year+"-"+month+"-"+day+"]";
	}
	public void doIt(final int a) {
	//	a++;	//Error
	}
	
}