package interface_;

public class DieselCar implements Car { //인터페이스 구현
//멤버변수
	private String oil="diesel";

//메서드
	private void moveToEngine() {
		System.out.println(oil+"을 엔진으로 옮깁니다.");
	}
	
	private void burn() {
		System.out.println(oil+"을 태웁니다.");
	}
	private void changeEnergy() {
		System.out.println("회전에너지로 변환합니다.");
	}
	// 인터페이스를 기반으로 구현한 accel()
	public void accel() {
		moveToEngine();
		burn();
		changeEnergy();
	}	

}
