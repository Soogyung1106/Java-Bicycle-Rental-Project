package interface_;

public class DieselCar implements Car { //�������̽� ����
//�������
	private String oil="diesel";

//�޼���
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
		moveToEngine();
		burn();
		changeEnergy();
	}	

}
