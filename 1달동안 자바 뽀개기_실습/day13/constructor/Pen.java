package constructor;

public class Pen {
	//������� (�ν��Ͻ�)
	public String color;
	int price;
	
	//������
	public Pen() { 
	//�⺻ ������ (���ڿ� �ƹ��͵� x) ����ڰ� ���� ��������!
	//����ڰ� �ؿ� ������ ���� ����������Ƿ�
		color = "black";
	}
	
	public Pen(String init_color) { 
		color=init_color;
		System.out.println("�����ڸ� �̿��Ͽ� color �� �ʱ�ȭ ��");
	}
	
}
