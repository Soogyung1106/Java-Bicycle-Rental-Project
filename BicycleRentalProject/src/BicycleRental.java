// BicycleManager (메뉴에서 p,n,c 삭제)
// 자전거 총 종류의 개수 =count, index=-1
// 기존 프로그램에 있는 자전거 종류 3개로 
// 단 search에서 기능 2개 
// 고객명 검색시 >> 고객이 대여해간 자전거  기종, 대여기간, 대여비용 
// 자전거명 검색시 >> 수량, 대여비용, 대여기간, 대여해간 고객명 (우선)

//수정사항 :  이름 검색시 소문자로 쳐도 검색가능하게! 대여해간 고객수! 

import java.util.Scanner;

public class BicycleRental {
	
	static final int MAX = 100;
	static String[] bicycleNameList =new String[MAX];  // 자전거기종 이름
	static int[] cntList = new int[MAX]; //자전거 수량
	static int[] periodList = new int[MAX]; //자전거 대여기간
	static int[] costList = new int[MAX]; //자전거 대여비용
	static int[] customerList = new int[MAX]; //자전거 대여해간 고객 명단 -> 심화해서 생각
	
	static int count = 3; //프로그램에 있는 자전거 기종의 갯수
	//만약에 index=2이면 몇 번째 자전거가 선택?
	//0    	1	2	3  <- 배열의 인덱스
	//자전거1 자전거2 자전거3 자전거4
	//3     5   10  15  -> 대여기간
	//1     2    4   5   -> 대여비용
	//a,b   c,d   e   f,g
	
	static Scanner scan = new Scanner(System.in); //밑에서 scan 사용하기 위한 장치
	
	public static void main(String[] args) {
		
		bicycleNameList[0]="road bike";cntList[0]=20;periodList[0]=30;costList[0]=30000;customerList[0]=30;
		bicycleNameList[1]="hybrid";cntList[1]=10;periodList[1]=7;costList[1]=15000;customerList[1]=20;
		bicycleNameList[2]="minivelo";cntList[2]=5;periodList[2]=1;costList[2]=5000;customerList[4]=8;
		
		while(true) {
			
			//콘솔창에 반복해서 뜨는 메뉴
			System.out.println("==================Bycicle Rental=========================");
			System.out.println("/ INFO / 현재 보유하고 있는 자전거 종류 : " +count);  //보유한 자전거 총 개수 추가
			System.out.println();
			System.out.println("(I)nsert	(D)elete	(U)pdate"); 
			System.out.println("(S)earch	(L)ist		(Q)uit");
			System.out.println("=========================================================");
			
			System.out.println("-->");
			
			String choice = scan.nextLine();//scanf기능, 컨솔창에서 입력대기 (이 문장을 만나면 입력대기받음)
			//choice에는 입력값이 저장.
			choice=choice.toLowerCase();  //입력한 문자를 모두 소문자로 바꾸겠다.
			switch(choice.charAt(0)) {	//charAt  입력한 문자의 첫번째 글자만 쓰겠다.
			case 'i':
				System.out.println("자전거 새 기종 추가...");
				insert();
				break;
			case 'd':
				System.out.println("자전거 정보 삭제...");
				delete();
				break;
			case 'u':
				System.out.println("자전거 정보 수정..");
				System.out.println("< 수량 수정은 1번, 대여기간 수정은 2번, 대여비용 수정은 3번, 대여 고객 수 수정은 4번, 모두 수정은 5번 >");
				String input = scan.nextLine();
				switch(input) {
				case "1":
					updateCnt();
					break;
				case "2":
					updatePeriod();
					break;
				case "3":
					updateCost();
					break;
				case "4":
					updateCustomer();
					break;
				case "5":
					updateAll();
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
				break;
			
			case 's':
				System.out.println("자전거 기종으로 정보 검색...");
				System.out.println("자전거 기종 : ");
				String name=scan.nextLine();  //사용자가 입력한 것을 name변수에 스트링으로 저장
				name=name.toLowerCase();
				
				int found = find(name); //
				if(found ==-1) {
					System.out.println("해당 기종의 자전거가 없습니다.");
				}else {
					print(found);
				}
				
				break;
			case 'l':
				System.out.println("모든 자전거 기종의 정보...");
				list();  
				break;
			case 'q':
				System.out.println("프로그램 종료...");
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
	

	private static void print(int found) {   //이름 검색을 통해 찾은 인덱스를 가지고 정보를 출력
		// TODO Auto-generated method stub
		System.out.println("----------------------");
		System.out.println("수량 : "+cntList[found]);
		System.out.println("대여기간 : "+periodList[found]);
		System.out.println("대여비용 : "+costList[found]);
		System.out.println("대여 고객  : "+customerList[found]);
		System.out.println("----------------------");
	}

	private static void deleteByIndex(int idx) {  //계속 반복되면 빼주기! 그게 나중에 수정시 효율적
		for(int i=idx;i<count-1;i++) {
			bicycleNameList[i]=bicycleNameList[i+1];
			cntList[i]=cntList[i+1];
			periodList[i]=periodList[i+1];
			costList[i]=costList[i+1];
			customerList[i]=customerList[i+1];
		}
		count--;
		
	}
	
	private static int find(String name) { //find자전거 종류으로 찾아서 인덱스를 반환하는 메서드 
		for(int i=0;i<count;i++) {	//마지막 자전거 기종 index가 count-1이기 때문에 
			if(bicycleNameList[i].equals(name)) { //입력받은 이름과 같다면...
				return i;	//return문 만나면 종료됨..'탈출'의 수단 중 하나 
			}
		}
		return -1; // /?/못 찾았다, 인덱스 -1 
	}	
	
	private static void updateAll() {
		//현재 선택된 자전거의 정보를 업데이트(수정)하는 메서드
		//업데이트 전에 index 선택과정이 있어야 한다.
		System.out.println("정보 수정할 자전거 기종 :");
		String name = scan.nextLine();
		name=name.toLowerCase();
		int found = find(name);
		if(found == -1) {
			System.out.println("해당 기종의 자전거가 없습니다.");
		}else {
			System.out.println("현재 수량 ( "+cntList[found]+") ->");
			String cnt=scan.nextLine();
			
			if(cnt==null || cnt.length()==0) {
				
			}
			if(Integer.parseInt(cnt) <=0) {
				deleteByIndex(found);
				System.out.println("수량이 0이하가 되어 "+name+"이(가) 삭제되었습니다.");	
			}
			else {
				cntList[found]=Integer.parseInt(cnt);
				
				System.out.printf("대여비용(%d) : ", costList[found]);
				String cost=scan.nextLine();
				if(cost==null || cost.length()==0) {
					
				}else {
					costList[found]= Integer.parseInt(cost);
				}
				
				System.out.printf("대여기간(%d) : ", periodList[found]);
				String period=scan.nextLine();
				if(period==null || period.length()==0) {
					
				}else {
					periodList[found]= Integer.parseInt(period);
				}//end else0
				
			}//end else1
		
		}//end else2
		
	}//end updateAll
	
	private static void updateCustomer() {
		System.out.println("대여 고객 수를 수정할 자전거 기종 :");   //대여비용 수정, updateAll 테스트
		String name = scan.nextLine();
		name=name.toLowerCase();
		
		int found = find(name);
		if(found == -1) {
			System.out.println("해당 기종의 자전거가 없습니다.");
		}else {
			System.out.println("현재 대여 고객 수 ("+customerList[found]+") ->");
			
			boolean k=true;
			while(k) {
				int customer = Integer.parseInt(scan.nextLine());
				
				if(customer <=0) {
					System.out.println("대여비용을 잘못 입력하셨습니다.");
					System.out.println("재입력 : ");
					
				}else {
					customerList[found]=customer;
					k=false;
				}
			}//end while
			
		}//end else
		
	}//end updateCost

	
	// <주의> 수량이 0이 이하가 되면 자전거 삭제	
	private static void updateCnt() {
		System.out.println("수량을 수정할 자전거 기종 :");
		String name = scan.nextLine();
		name=name.toLowerCase();
		
		int found = find(name);
		if(found == -1) {
			System.out.println("해당 기종의 자전거가 없습니다.");
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
	
	private static void updateCost() {
		System.out.println("대여비용을 수정할 자전거 기종 :");   //대여비용 수정, updateAll 테스트
		String name = scan.nextLine();
		name=name.toLowerCase();
		
		int found = find(name);
		if(found == -1) {
			System.out.println("해당 기종의 자전거가 없습니다.");
		}else {
			System.out.println("현재 대여비용 ("+costList[found]+") ->");
			
			boolean k=true;
			while(k) {
				int cost = Integer.parseInt(scan.nextLine());
				
				if(cost <=0) {
					System.out.println("대여비용을 잘못 입력하셨습니다.");
					System.out.println("재입력 : ");
					
				}else {
					costList[found]=cost;
					k=false;
				}
			}//end while
			
		}//end else
		
	}//end updateCost

	private static void updatePeriod() {    
		System.out.println("대여기간을 수정할 자전거 기종 :");
		String name = scan.nextLine();
		name=name.toLowerCase();
		
		int found = find(name);
		if(found == -1) {
			System.out.println("해당 기종의 자전거가 없습니다.");
		}else {
			System.out.println("현재 대여기간 ("+periodList[found]+") ->");
			
			while(true) {
				int period = Integer.parseInt(scan.nextLine());
				
				if(period <=0) {
					System.out.println("대여기간을 잘못 입력하셨습니다.");
					System.out.println("재입력 : ");
					
				}else {
					periodList[found]=period;
					break;
				}
			}//end while
			
		}//end else
		
	}//end updateCost


	private static void list() {
		
		System.out.println("--------------------------");
		for(int i=0;i<count;i++) {
			System.out.println("자전거 기종 : "+bicycleNameList[i]);
			System.out.println("수량: "+cntList[i]+"대");
			System.out.println("대여비용 : "+costList[i]+"원");
			System.out.println("대여기간 : "+ periodList[i]+"일");
			System.out.println("대여고객 : "+customerList[i]+"명");
			System.out.println("--------------------------");
		}
	
	}

	private static void delete() {
		System.out.println("삭제할 자전거 기종 : ");
		String name = scan.nextLine();
		name=name.toLowerCase();
		
		int found = find(name);
		
		if(found ==-1) {	
			System.out.println("해당 이름을 가진 자전거가 없습니다.");
		}else {
			deleteByIndex(found);   
			System.out.println(name+"이(가) 삭제되었습니다.");
		}
		
	}

	private static void insert() {
		System.out.println("자전거 기종 : ");
		String name = scan.nextLine();
		name=name.toLowerCase();
		
		int found = find(name);
		if(found !=-1) { // find(name) == -1 이 동일한 이름이 존재하지 않는 것을 의미
			System.out.println("이미 존재하는 자전거 기종입니다.");
		}else {
			bicycleNameList[count]=name;
			System.out.println("수량 : ");
			cntList[count]=Integer.parseInt(scan.nextLine());
			System.out.println("대여기간 : ");
			periodList[count]=Integer.parseInt(scan.nextLine());
			System.out.println("대여비용 : ");
			costList[count]=Integer.parseInt(scan.nextLine());
			System.out.println("대여고객 수 : ");
			customerList[count]=Integer.parseInt(scan.nextLine());
			
			count++;
			System.out.println("새 기종 자전거를 성공적으로 추가했습니다.");
			
		}
		
	}

}//end class
