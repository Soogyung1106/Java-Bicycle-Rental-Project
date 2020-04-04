package day10;

public class MyDateExample {
	public static void main(String[] args) {
		MyDate date =new MyDate();
		System.out.println(date.getDay()+"일");
		System.out.println(date.getMonth()+"월");
		//객체안의 변수에 값을 할당할 수 있는 세번째 방법. 첫번째는 직접할당.
		//두번째는 생성자를 이용해 할당
		date.setDay(55);
		System.out.println(date.getDay()+"일");
		date.setDay(18);
		System.out.println(date.getDay()+"일");
		
	}
}
