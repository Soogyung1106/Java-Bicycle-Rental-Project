package day1_5;
import java.util.Scanner;  //Scanner는 java.util이라는 패키지에 포함되어 있으므로 명시해줌

public class CustomerManager {
	// 맴버변수 : 클래스 내에 있는 변수.(지역변수와는 다름)
	static final int MAX=100;		//static final 하면 상수, 상수명은 모두 대문자 -> 'static final 자료형 상수명'   
	static String[] nameList =new String[MAX];  //new 객체랑 변수 선언 하는 방법
	static char[] genderList =new char[MAX];
	static String[] emailList = new String[MAX];
	static int[] birthYearList=new int[MAX];
			
	static int index=-1;	// index=1 2번째 사람을 선택했다.
	static int count=3;	//프로그램 안에 있는 고객의 명수
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		nameList[0]="정수경0";genderList[0]='M';emailList[0]="sally1106@naver.com";birthYearList[0]=1997;
		nameList[1]="정수경1";genderList[1]='M';emailList[1]="sally1106@naver.com";birthYearList[1]=1997;
		nameList[2]="정수경2";genderList[2]='M';emailList[2]="sally1106@naver.com";birthYearList[2]=1997;
		
		while(true) {
			//메뉴 생성
			System.out.println("/ INFO /  총 고객 수 : " +count+", 현재 선택된 고객 : " +index);
			System.out.println("< menu >");
			System.out.println("(i)입력, (d)삭제, (u)수정");
			System.out.println("(p)이전 고객, (n)다음 고객, (c)현재 고객, (q)프로그램 종료");
			
			System.out.println("-->");
			
			String menu = scan.nextLine();//scanf기능, 컨솔창에서 입력대기
			//menu에는 입력값이 저장.
			menu=menu.toLowerCase();  //입력한 문자를 모두 소문자로 바꾸겠다.
			switch(menu.charAt(0)) {	//charAt  입력한 문자의 첫번째 글자만 쓰겠다.
			case 'i':
				System.out.println("고객 정보를 입력합니다.");
				insert();
				break;
			case 'd':
				System.out.println("고객 정보를 삭제합니다.");
				// 삭제한 후 뒤에 있는 정보를 앞에 배열로 끌어와야 함
				delete();
				break;
			case 'u':
				System.out.println("고객 정보를 수정합니다.");
				update();
				break;
			case 'n':  //다음 고객으로 인덱스 이동
				System.out.println("다음 고객 정보입니다.");
				if(index>=count-1) {  //count-1이 마지막 사람의 인덱스임
					System.out.println("다음 고객이 없습니다.");
				}else{
					print(++index);  //다음 고객이니까 인덱스 하나 올리고(증감 연산자 이럴 때 사용하는 것!)
				}
				
				break;
			case 'p': //이전 고객으로 인덱스 이동
				System.out.println("이전 고객 정보입니다.");
				if(index<=0) {
					System.out.println("이전 고객이 없습니다.");
				}else {
					print(--index); //이전 고객이니까 인덱스 하나 내리고
				}
				
				break;
			case 'c':
				if(index==-1||index>count-1){	//쇼트 서킷 
					System.out.println("현재 선택된 고객이 없습니다.");
					break;
				}else {
					current(index);
					break;
				}
				//현재 고객을 출력하는 코드. if문 조건 넣어서
			case 'q':
				System.out.println("프로그램을 종료합니다.");
				scan.close(); //스캐너 닫아주기
				System.exit(0); //프로그램 종료
				break;
			
			}//end switch
		}//end while
		
	}//end main
	
	
	private static void delete() {
		for(int i=index; i<count-1;i++) { 
			nameList[i]=nameList[i+1]; // 삭제하고 싶을 때 기억!!
			genderList[i]=genderList[i+1];
			emailList[i]=emailList[i+1];
			birthYearList[i]=birthYearList[i+1];
			//마지막 반복일 때 i의 값은? count-2(마지막 전사람)
			//마지막 전사람 정보 = 마지막 사람 정보
		} //1명 삭제하는 과정
		count--; //1명 삭제 했으니 총 명수 줄여주기
		index=-1; // count 2명, 1명으로 줄어드는데  index가 5인 경우 ....방지
		
	}


	// case 'u'에 사용되는 메서드
	private static void update() {
		//현재 선택된 고객의 정보를 업데이트(수정)하는 메서드
		//업데이트 전에 index 선택과정이 있어야 한다.
		System.out.printf("이름(%s) : ", nameList[index]);
		String name=scan.nextLine();
		if(name==null || name.length()==0) {
			
		}else {
			nameList[index]=name;  //수정할고 싶을 때 기억!!!!!
		}
		
		System.out.printf("성별(%c) : ", genderList[index]);
		String gender=scan.nextLine();
		if(gender==null || gender.length()==0) {
			
		}else {
			genderList[index]=gender.charAt(0); 
			// 99번째 줄에서 gender의 자료형을 String이라고 선언해주었기 때문에  char형인 genderList[index]랑 자료형 mismatch
			//그래서 charAt() 함수 써 줌
		}
		System.out.printf("이메일(%s) : ", emailList[index]);
		String email=scan.nextLine();
		if(email==null || email.length()==0) {
			
		}else {
			emailList[index]=email; 
		}
		System.out.printf("출생년도(%d) : ", birthYearList[index]);
		String birthYear=scan.nextLine();
		if(birthYear==null || birthYear.length()==0) {
			
		}else {
			birthYearList[index]=Integer.parseInt(birthYear); //문자열 "1997"을 정수 1997로 받겠다.
		}
		
	}





	// case 'c'에 사용되는 메서드
	private static void current(int idx) {
		System.out.println("현재 선택된 고객 정보는 다음과 같습니다.");
		System.out.println("이름: "+ nameList[idx]);
		System.out.println("성별 : "+genderList[idx]);
		System.out.println("이메일 : "+emailList[idx]);
		System.out.println("출생년도 : "+ birthYearList[idx]);
	}
	
	// case 'n'와 case 'p'에 사용되는 메서드
	private static void print(int idx) {
		System.out.println("-------------------------");
		System.out.println("이름: "+ nameList[idx]);
		System.out.println("성별 : "+genderList[idx]);
		System.out.println("이메일 : "+emailList[idx]);
		System.out.println("출생년도 : "+ birthYearList[idx]);
	}
	
	// case 'i'에 사용되는 메서드
	private static void insert() {
		//마지막 사람 뒷자리에 새로운 사람을 추가할 것
		//마지막 사람 count 인덱스는 count-1, 따라서 추가할 사람의 인덱스는 count
		System.out.println("이름을 입력하세요.");
		String name=scan.nextLine();
		System.out.println("성별을 입력하세요.");
		char gender=scan.nextLine().charAt(0);
		System.out.println("이메일을 입력하세요.");
		String email=scan.nextLine();
		System.out.println("출생년도를 입력하세요.");
		int birthYear=Integer.parseInt(scan.nextLine());
		//"55"라는 String값을 Integer.parseInt("55")에 넣으면 --> 55  즉, 숫자 스트링을 int로 바꿔주는 기능
		
		nameList[count]=name;
		genderList[count]=gender;
		emailList[count]=email;
		birthYearList[count]=birthYear;
		
		count++;
	}

}//end class
