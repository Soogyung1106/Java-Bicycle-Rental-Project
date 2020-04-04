package day10;

public class MyDate {
	//멤버 변수
	private int day;
	private int month;
	private int year;
	
	//기본 생성자
	public MyDate() {
		super(); // 생략되어있음
		this.day=1;
		this.month=1;
		this.year=2018;
	}
	
	//메서드
	public int getDay() {
		return day;
	}
	
	public void setDay(int day){ //파라미터 해석: 입력받는 값
		this.day=day;
		if(day<1||day>31) {
			System.out.println("잘못된 날짜 입력입니다.");
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
