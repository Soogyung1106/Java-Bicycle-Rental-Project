/*
<기본 원칙> 
1. 모듈화 (중복되는 패턴은 함수로 빼기, main문 안을 최소화시키기)
/반복되는 패턴을 아예 함수로 만들어 버리고 싶은 경우/ 
 -> 주의 사항 : 함수 틀 안에 넣어놓고 매개변수만 잘 생각!! 생각해야 할 것은 매개변수 밖에 없음! 
 -> 메서드들은 메인 메서드 밑에 메서드 선언해야!
2. 변수 이름 설정시
(main메서드 내에서 변수 2개를 중복해서 사용하지 않았는지, 
다른 구역 메서드일 경우 변수 이름은 중복해서 사용 가능, 전역 변수와 이름 겹치지만 않으면 됨)
*/
// *idea* 식자재의 이름으로 찾아서 인덱스로 반환하는 print 메서드 사용! 

import java.util.Scanner;

public class FoodManager {
	
	//식자재 이름, 갯수, 유통기한
	static final int MAX = 100;
	static String[] nameList =new String[MAX];  //식자재의 이름
	static int[] cntList = new int[MAX]; //식자재의 개수
	static int[] expireList = new int[MAX]; //식자재의 유통기한
	
	static int count = 2; //프로그램에 있는 식자재의 종류의 갯수
	static int index = -1; //현재 선택된 식자재(-1은 아무것도 선택이 안된 상태)
	//만약에 index=2이면 몇 번째 음식이 선택?
	//0    	1	2	3  <- 배열의 인덱스
	//식품1 식품2 식품3 식품4
	//3     5   10  15
	//1     2    4   5
	
	static Scanner scan = new Scanner(System.in); //밑에서 scan 사용하기 위한 장치
	
	
	public static void main(String[] args) {
		
		nameList[0]="egg";cntList[0]=30;expireList[0]=7;
		nameList[1]="kimchi";cntList[1]=30;expireList[1]=365;
		
		while(true) {
			
			//콘솔창에 반복해서 뜨는 메뉴
			System.out.println("/ INFO / 식자재 종류 : " +count+", 현재 선택된 과일 : " +index);
			System.out.println("< menu >");
			System.out.println("(i)nsert, (d)elete, (u)pdate"); 
			System.out.println("(p)revious, (n)ext, (c)urrent");
			System.out.println("(q)uit, (s)earch, (L)ist");
			
			System.out.println("-->");
			
			String choice = scan.nextLine();//scanf기능, 컨솔창에서 입력대기 (이 문장을 만나면 입력대기받음)
			//choice에는 입력값이 저장.
			choice=choice.toLowerCase();  //입력한 문자를 모두 소문자로 바꾸겠다.
			switch(choice.charAt(0)) {	//charAt  입력한 문자의 첫번째 글자만 쓰겠다.
			case 'i':
				System.out.println("새 식자재를 추가합니다.");
				insert();
				break;
			case 'd':
				System.out.println("식자재 정보를 삭제합니다.");
				delete();
				break;
			case 'u':
				System.out.println("식자재 정보를 수정합니다.");
				System.out.println("< 수량 수정은 1번, 유통기한 수정은 2번 >");
				String input = scan.nextLine();
				switch(input) {
				case "1":
					updateCnt();
					break;
				case "2":
					updateExpire();
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
				break;
			case 'n':  //다음 과일로 인덱스 이동
				System.out.println("다음 식자재 정보입니다.");
				if(index>=count-1) {  //count-1이 마지막 사람의 인덱스임
					System.out.println("다음 식자재가 없습니다.");
				}else{
					print(++index);  //다음 고객이니까 인덱스 하나 올리고(증감 연산자 이럴 때 사용하는 것!)
				}
				
				break;
			case 'p': //이전 고객으로 인덱스 이동
				System.out.println("이전 식자재 정보입니다.");
				if(index<=0) {
					System.out.println("이전 식자재가 없습니다.");
				}else {
					print(--index); //이전 고객이니까 인덱스 하나 내리고
				}
				
				break;
			case 'c':
				if(index==-1||index>count-1){	//쇼트 서킷 
					System.out.println("현재 선택된 식자재가 없습니다.");
					break;
				}else {
					current(index);
					break;
				}
				//현재 고객을 출력하는 코드. if문 조건 넣어서
			case 's':
				System.out.println("이름으로 식자재 정보를 검색합니다.");
				System.out.println("식자재명 : ");
				String name=scan.nextLine();  //사용자가 입력한 것을 name변수에 스트링으로 저장
				int found = find(name); //
				if(found ==-1) {
					System.out.println("해당 이름을 가진 식자재가 없습니다.");
				}else {
					print(found);
				}
				
				break;
			case 'l':
				System.out.println("모든 식자재의 정보를 출력합니다.");
				list();  
				break;
			case 'q':
				System.out.println("프로그램을 종료합니다.");
				scan.close(); //스캐너 닫아주기	
//?스캐너 어디서 닫아줘야??꼭 여기서 닫아야? 메인 안이지만 스위치문 벗어나서 닫아주면 안 됨??
				System.exit(0); 
//?프로그램 종료, 괄호 안에 0은 무슨 의미?? -> 빨간 버튼 눌러서 Terminate 기능     
				break;	// while문을 종료
			default:
				System.out.println("메뉴에 없는 버튼입니다. 다시 입력하세요.");
				System.out.println();
			}//end switch
			
		}//end while
		
	}//end main
	
	//메서드들은 메인 메서드 밑에 메서드 선언해야!
	
	private static void deleteByIndex(int idx) {  //계속 반복되면 빼주기! 그게 나중에 수정시 효율적
		for(int i=idx;i<count-1;i++) {
			nameList[i]=nameList[i+1];
			cntList[i]=cntList[i+1];
			expireList[i]=expireList[i+1];
		}
		count--;
		index=-1;
	}
	
	//<주의> 유통기한을 0이하로 입력하면 식자재 삭제
	private static void updateExpire() {
		System.out.println("유통기한을 수정할 식자재의 이름을 입력하세요.");
		String name = scan.nextLine();
		int found = find(name);
		if(found == -1) {
			System.out.println("해당 이름을 가진 식자재가 없습니다.");
		}else {
			System.out.println("현재 유통기한 ( "+expireList[found]+") ->");
			int expire = Integer.parseInt(scan.nextLine()); //문자열 숫자를 정수형 숫자로 변환
//?Integer.parseInt를 사용해야 하는 이유가 scan.nextLine이 사용자가 입력한 것을 기본적으로문자열로 받아들이기 때문에?
			if(expire <=0) {		
				deleteByIndex(found);	
				System.out.println("유통기한이 0이하가 되어 "+name+"이(가) 삭제되었습니다.");
				
			}else {
				expireList[found]=expire;
			}
		}

	}
	
	// <주의> 유통기한이 0이 이하가 되면 식자재 삭제	
	private static void updateCnt() {
		System.out.println("수량을 수정할 식자재의 이름을 입력하세요.");
		String name = scan.nextLine();
		int found = find(name);
		if(found == -1) {
			System.out.println("해당 이름을 가진 식자재가 없습니다.");
		}else {
			System.out.println("현재 수량 ("+cntList[found]+") ->");
			int cnt = Integer.parseInt(scan.nextLine());
			if(cnt <=0) {
				deleteByIndex(found);
				System.out.println("수량이 0이하가 되어 "+name+"이(가) 삭제되었습니다.");
				
			}else {
				cntList[found]=cnt;
			}
		}
	}
	
	
	private static int find(String name) { //find식자재의 이름으로 찾아서 인덱스를 반환하는 메서드 
		for(int i=0;i<count;i++) {	//마지막 식자재의 index가 count-1이기 때문에 
			if(nameList[i].equals(name)) { //입력받은 이름과 같다면...
				return i;	//return문 만나면 종료됨..'탈출'의 수단 중 하나 
			}
		}
		return -1; // /?/못 찾았다, 인덱스 -1 
	}
	
	private static void print(int idx) {   //이름 검색을 통해 찾은 인덱스를 가지고 정보를 출력
		// TODO Auto-generated method stub
		System.out.println("----------------------");
		System.out.println("식자재명 : "+nameList[idx]);
		System.out.println("수량 : "+cntList[idx]);
		System.out.println("유통기한 : "+expireList[idx]);
		System.out.println("----------------------");
	}
	
	
	private static void list() {
		
		System.out.println("--------------------------");
		for(int i=0;i<count;i++) {
			System.out.println("이름 : "+nameList[i]);
			System.out.println("수량 : "+cntList[i]);
			System.out.println("유통기한 : "+ expireList[i]);
			System.out.println("--------------------------");
		}
	
	}

	// case 'c'에 사용되는 메서드
	private static void current(int idx) {
		System.out.println("현재 선택된 식자재 정보는 다음과 같습니다.");
		System.out.println("식자재 : "+nameList[idx]);
		System.out.println("수량 : "+cntList[idx]);
		System.out.println("유통기한 : "+ expireList[idx]);
	}



	private static void delete() { //이름으로 검색한 후 삭제하게끔!
		//현재 선택된 고객을 삭제 하는 메서드        
		//삭제 전에 index 선택과정이 있어야 함
		System.out.println("삭제할 식자재명 : ");
		// 삭제한 후 뒤에 있는 정보를 앞에 배열로 끌어와야 함
		String name=scan.nextLine();  //사용자가 입력한 것을 name변수에 스트링으로 저장
		int found = find(name); 
		if(found ==-1) {	// find(name) == -1
			System.out.println("해당 이름을 가진 식자재가 없습니다.");
		}else {
			deleteByIndex(found);   //모듈화
			System.out.println(name+"이(가) 삭제되었습니다.");
		}	
	}
	
	private static void insert() {
		System.out.println("식자재명 : ");
		String name = scan.nextLine();
		int found = find(name);
		if(found !=-1) { // find(name) == -1 이 동일한 이름이 존재하지 않는 것을 의미
			System.out.println("이미 존재하는 식자재입니다.");
		}else {
			nameList[count]=name;
			System.out.println("수량 : ");
			cntList[count]=Integer.parseInt(scan.nextLine());
			System.out.println("유통기한 : ");
			expireList[count]=Integer.parseInt(scan.nextLine());
			print(count++);
		}
	}


}//end class
