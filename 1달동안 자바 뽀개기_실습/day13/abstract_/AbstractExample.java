package abstract_;

public class AbstractExample {

	//main �޼���	
	public static void main(String[] args) {
		Shape circle =new Circle(10); //������
		
		//������ ��ü circle�� �������� �����Ƿ� �޼��带 Ȯ���� �� �θ� Ŭ�������� �˻��ϸ鼭
		//�ڽ� Ŭ������ ������, (�ٽ�) ������ ��ü�� �������� ������ ���� ���� �ڽ�Ŭ��������, �θ�Ŭ������ �°� �ൿ
		System.out.println("���� ���̴� : "+circle.getArea()); //�ڽ� Ŭ������ �°� �ൿ
		System.out.println("������ ��ġ�� : "+circle.position()); //�θ� Ŭ������ �°� �ൿ
	}
}
