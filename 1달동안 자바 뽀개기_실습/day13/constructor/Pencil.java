package constructor;

public class Pencil {
//�������(�ν��Ͻ� ����)
	public String color;
	public int length;
	public int price;
	
//������
	public Pencil() { 
	//�⺻ ������ 
    //(������ �ȿ� ���๮�� �ִ��� ����x�� ���Ǹ� �����ϸ� �⺻ ��������!)
		System.out.println("�⺻ ������ �����");
	}
	public Pencil(String color) { //���� 1���� ������
		System.out.println("color�� ���ڷ��ϴ� ������ �����");
		this.color=color;
	}
	public Pencil(int length) { 
		System.out.println("length�� ���ڷ��ϴ� ������ �����");
		this.length=length;
	}
	public Pencil(int length, int price) {//���� 2���� ������
		System.out.println("Length, price�� ���ڷ��ϴ� ������ �����");
		this.length=length;
		this.price=price;
	}
	public Pencil(String color, int length, int price) {//���� 3���� ������
	//this()�� ���� Ŭ������ �ִ� �����ڸ� �ǹ��Ѵ�. ������ ��� �ٷ� ���� �ִ� Pen(int length, int price)�� �ǹ��Ѵ�.
	//�ٸ� �����ڸ� ������ ��� �ݵ�� ������ �����ڰ� ù�ٿ� �;� �Ѵ�. 
	//super(), this()
		this(length, price); //���� Ŭ������ �ִ� ������
		this.color=color;
		System.out.println("color, length, price�� ���ڷ��ϴ� ������ �����");
	}
	
//�޼��� 
	public void write() {
		System.out.println("Hello World");
	}//end write
	
}//end class
