package interface_;

public class CarTest3 {
	//�⺻ �����ڸ� ������� �ν��Ͻ� ����
	GasolineCar myCar=new GasolineCar();
	
//Setter �޼���
	// �����ڸ�  �̿��� ������ ��ü�� �ʱ�ȭ �ϴ� �Ͱ� setter�Լ��� �̿��� �ʱ�ȭ �ϴ� ���� ������!
	// private���� ���� �ٲ� �� ���� �ϴ� ��� : Ŭ���� �ȿ��� setter �Լ� �ۼ�����.
	public void setMyCar(GasolineCar myCar) {  
		this.myCar=myCar;
	}
	
//main �޼���
	public static void main(String[] args) {
		CarTest3 carTest=new CarTest3(); //??
		carTest.myCar.accel(); //??
		//�������� ������ �� ���� �ϳ��ۿ� �׽�Ʈ ����.
	}
}
