package interface_;

public class GasolineCar implements Car { //�������̽� ����
//��� ����(�ν��Ͻ� ����)
	private String oil="gasoline";
	public GasolineCar() {
	System.out.println("���ָ� �� ����");
		// TODO Auto-generated constructor stub
	}
//�޼���
	private void putEngineOil() {
		System.out.println("���ָ� ���� ���������� ���� �Ѹ��� �����մϴ�.");
	}
	
	private void moveToEngine() {
		System.out.println(oil+"�� �������� �ű�ϴ�.");
	}
	
	private void burn() {
		System.out.println(oil+"�� �¿�ϴ�.");
	}
	private void changeEnergy() {
		System.out.println("ȸ���������� ��ȯ�մϴ�.");
	}
	// �������̽��� ������� ������ accel()
	public void accel() {
		putEngineOil();
		moveToEngine();
		burn();
		changeEnergy();
	}	

}
