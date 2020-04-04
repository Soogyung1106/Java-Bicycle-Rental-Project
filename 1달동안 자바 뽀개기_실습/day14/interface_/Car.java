package interface_;

public interface Car {
	
	public static final int SEAT_COUNT=4; //public static final 생략 가능
	
	public abstract void accel(); //public abstract 생략 가능
	
	
	//사용자에게는 인터페이스가 accel()이라는 메서드가 있다는 것을 알리고 
	//차 개발자 입장에서는 인터페이스가 공통의 규약을 제공함
	//향후 다형성을 이용할 수 있음
}
