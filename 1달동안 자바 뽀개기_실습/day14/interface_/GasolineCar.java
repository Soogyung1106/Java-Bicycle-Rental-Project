package interface_;

public class GasolineCar implements Car { //인터페이스 구현
//멤버 변수(인스턴스 변수)
	private String oil="gasoline";
	public GasolineCar() {
	System.out.println("가솔린 차 생성");
		// TODO Auto-generated constructor stub
	}
//메서드
	private void putEngineOil() {
		System.out.println("가솔린 차는 엔진오일을 먼저 뿌리고 시작합니다.");
	}
	
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
		putEngineOil();
		moveToEngine();
		burn();
		changeEnergy();
	}	

}
