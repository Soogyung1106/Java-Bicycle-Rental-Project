package interface_;

public class CarTest2 {
	
	Car myCar=new GasolineCar();// myCar인스턴스 
	
//Setter 메서드
	public void setMyCar(Car myCar) {
		this.myCar=myCar;
	}
	
//main메서드
	public static void main(String[] args) {
		CarTest2 carTest=new CarTest2(); // carTest인스턴스 
		carTest.myCar.accel(); 
		carTest.setMyCar(new DieselCar()); //?
		carTest.myCar.accel(); //? 얘는 왜 한 번 더 써줌?/
		
	}
}
