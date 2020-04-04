package day13;

public class Outer {
//doIt �޼���
	public void doIt() {  //�ν��Ͻ� �����ؾ� ���� ����
		System.out.println("do it");
	}

//Inner Ŭ����
	private class Inner() { //�ν��Ͻ� �����ؾ� ���� ����

		public void doIt() {
			System.out.println("inner doIt");
		}
	}
//Inner2 Ŭ����
	private class Inner2() {
		public void doIt() {
			System.out.println("static inner doIt");
		}
		public static void doIt2() {  //Ŭ�������� ��������
			System.out.println("static inner doIt2");
		}

	}
//static�� Inner2 Ŭ����
	private static class Inner2() {
		public void doIt() {
			System.out.println("static inner2 doIt");
		}
	}
//Inner3 Ŭ����
	class Inner3() {
		public void doIt() {
			System.out.println("inne doIt(no access modifier)");
		}
	}
//Inner4 Ŭ����
	static class Inner4() {
		public void doIt() {
			System.out.println("static inner doIt(no access modifier)");
		}
	}	
//main �޼���
	public static void main(String[] args) {
		Outer out=new Outer();
		out.doIt();//do It
		out.new Inner().doIt();	//? out.Inner().doIt
		new Outer.Inner2().doIt();	//? Outer.Inner2().doIt
		Outer.Inner2.doIt2();  //static�� �پ����Ƿ� �ν��Ͻ� ���� ���̵� class�� �ٷ� ���� ���� 
	}//end main 

}//end class outer

