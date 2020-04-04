package abstract_;


public abstract class Shape { // abstract  -> �߻� Ŭ����
	// �������(�ν��Ͻ� ����)
	private int x; //ĸ��ȭ�� ��
	private int y;
	
	//������
	public Shape() {} //�⺻ ������

	public Shape(int x, int y) { //�߰� ������
		this.x=x;
		this.y=y;
	}
	
	//�޼���  
	public abstract double getArea(); //abstract -> ������ �Ǿ����� ����
	
	public String position() {
		return "[x="+x+", y="+y+"]";
	}
}
