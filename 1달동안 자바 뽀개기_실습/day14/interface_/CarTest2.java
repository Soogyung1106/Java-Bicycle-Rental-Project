package interface_;

public class CarTest2 {
	
	Car myCar=new GasolineCar();// myCar�ν��Ͻ� 
	
//Setter �޼���
	public void setMyCar(Car myCar) {
		this.myCar=myCar;
	}
	
//main�޼���
	public static void main(String[] args) {
		CarTest2 carTest=new CarTest2(); // carTest�ν��Ͻ� 
		carTest.myCar.accel(); 
		carTest.setMyCar(new DieselCar()); //?
		carTest.myCar.accel(); //? ��� �� �� �� �� ����?/
		
	}
}
