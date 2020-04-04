package abstract_;

public class Circle extends Shape{
//�������
	private int radius;
	
//������
	public Circle(int r) {
		this(0, 0, r); // �Ʒ��� �ִ� ���ڰ� 3���� ������ ȣ��
	}
	public Circle(int x, int y, int r) {
		super(x, y); //��Ģ : ������ ���� �ٸ� �����ڸ� ������ ��� ù ��
		//Shape(x, y) -> �θ� Ŭ������ ������ ȣ��
		radius =r;
	}
	
//�޼���
	//Shape Ŭ�������� abstract�̾��� getArea �޼��� ����!
	public double getArea() {
		return (Math.PI * radius * radius);
	}
}


