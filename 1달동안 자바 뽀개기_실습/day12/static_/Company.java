package static_;

public class Company {
	//1. 멤버 변수
	//인스턴스 변수--> 실제 인스턴스가 생길 때 생성.
	private String str;
	// static 한 성질  --> 클래스 로드시에 생성
	private static Company c=new Company(); 
	
	//2. 생성자
	private Company() {
		str="company";
		System.out.println(str);
	}
	//3. 메서드 
	public static Company getCompany() {
		return c;
	}
}//end class
