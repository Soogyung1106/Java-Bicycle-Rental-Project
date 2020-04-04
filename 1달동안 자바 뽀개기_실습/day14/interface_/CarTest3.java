package interface_;

public class CarTest3 {
	//기본 생성자를 기반으로 인스턴스 생성
	GasolineCar myCar=new GasolineCar();
	
//Setter 메서드
	// 생성자를  이용해 생성된 객체를 초기화 하는 것과 setter함수를 이용해 초기화 하는 것의 차이점!
	// private으로 값을 바꿀 수 없게 하는 경우 : 클래스 안에서 setter 함수 작성해줌.
	public void setMyCar(GasolineCar myCar) {  
		this.myCar=myCar;
	}
	
//main 메서드
	public static void main(String[] args) {
		CarTest3 carTest=new CarTest3(); //??
		carTest.myCar.accel(); //??
		//다형성이 없으면 한 번에 하나밖에 테스트 못함.
	}
}
