package final_;

public class Child extends Parent{
	
	//�޼��� ������
	public void method() {
		
		
		System.out.println("Child-method()");
	}
	//main �޼���
	public static void main(String[] args) {
		
		Parent p= new Parent(); //�ν��Ͻ� ���� p
		p=new Child(); // p�� ������
		p.method();
		//p.method2();
	}//end main
}//end class
