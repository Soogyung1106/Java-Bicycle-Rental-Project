package day13;

public class FinalRefVarxample {
	
	static final MyDate DATE = new MyDate();
	
	public static void main(String[] args) {

		//�ּҰ��� final�̱� ������ �� �ּҰ��� ����Ű�� ���� �ִ�
		//year��� ������ ���� �ٲ� �� �ִ�.
		DATE.year++;
		//�Ʒ��� �Ұ����ϴ�.
		// DATE=new MyDate(); Error
		System.out.println(DATE);
		System.out.println(DATE.toString());

	}//end main
	
}
class MyDate() {
	int year=2000;
	int month=1;
	int day=1;
	
	public String toString() {
		return "["+year+"-"+month+"-"+day+"]";
	}
	public void doIt(final int a) {
	//	a++;	//Error
	}
	
}