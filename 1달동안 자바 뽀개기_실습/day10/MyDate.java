package day10;

public class MyDate {
	//��� ����
	private int day;
	private int month;
	private int year;
	
	//�⺻ ������
	public MyDate() {
		super(); // �����Ǿ�����
		this.day=1;
		this.month=1;
		this.year=2018;
	}
	
	//�޼���
	public int getDay() {
		return day;
	}
	
	public void setDay(int day){ //�Ķ���� �ؼ�: �Է¹޴� ��
		this.day=day;
		if(day<1||day>31) {
			System.out.println("�߸��� ��¥ �Է��Դϴ�.");
		}else this.day=day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month=month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}
