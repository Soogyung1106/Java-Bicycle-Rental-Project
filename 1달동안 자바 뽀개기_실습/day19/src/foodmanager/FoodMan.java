package foodmanager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FoodMan {
	
	static ArrayList<Food> foodList = new ArrayList<>();
	static int index = -1;
//	count대신에 foodList.size()를 사용할 것임.
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Food f1 =new Food("kimchi",10,500);
		//Food f2 =new Food("egg",20,10);
		//Food f3 =new Food("fork",30,15);
		//foodList.add(f1);
		//foodList.add(f2);
		//foodList.add(f3);
		
		//이전에는 위와 같이 코드에 미리 데이터를 저장했다면 이번에는 파일을 생성해서 데이터를 저장하고 
		//프로그램을 완전히 종료한 후에도 다시 정보가 남아있게끔 하는 방식 -> load(), save() 추가
		load();
		
		while(true) {
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(i)nsert, (d)elete, "+ "(u)pdate, (s)earch, (l)ist, (q)uit");
			char menu = scan.nextLine().charAt(0);
			switch(menu) {
			case 'i':
				System.out.println("새로운 식자재를 추가합니다.");
				insert();
				break;
			case 'd':
				System.out.println("식자재를 삭제 합니다.");
				delete();
				break;
			case 'u':
				System.out.println("식자재를 수정합니다.");
				System.out.println("수량 수정은 1, 유통기한수정은 2");
				int inputU= Integer.parseInt(scan.nextLine());
				switch(inputU) {
				case 1:
					System.out.println("수량 수정 합니다.");
					updateCnt();
					break;
				case 2:
					System.out.println("유통기한 수정합니다.");
					updateExpire();
					break;
				default:
					System.out.println("잘못입력했습니다.");
					break;
				}
				break;
			case 's':
				System.out.println("검색할 식자재 명을 입력하세요");
				String search = scan.nextLine();
				int find =searchFood(search);//그냥 인덱스
				if(find != -1) print(find);
				else System.out.println("해당 이름을 가진 식자재가 없습니다.");
				break;
			case 'l':
				System.out.println("모든 식자재 목록 출력");
				list();
				break;
			case 'q':
				save();
				System.out.println("프로그램종료");
				scan.close();
				System.exit(0);
			default:
				System.out.println("메뉴에 없습니다.");
				break;
			}//end switch
		}//end while
	}//end main
	private static void deleteByIndex(int idx) {
		foodList.remove(idx);
	}
	private static void updateExpire() {
		System.out.println("유통기한을 수정할 식자재의 이름을 입력하세요");
		String name = scan.nextLine();
		int find = searchFood(name);
		if(find == -1) {
			System.out.println("해당 식자재가 없습니다.");
		}else {
			System.out.println("바꿀 유통기한?");
			int expire = Integer.parseInt(scan.nextLine());
			if(expire <=0) {
				deleteByIndex(find);
				System.out.println("유통기한이 0이하가 되어" + name+"이(가) 삭제되었습니다.");
			}else {
				foodList.get(find).expire=expire;
			}
			
		}
		
		
	}
	
	//이 부분 이해!
	
	private static void load() {
		//FILEINPUTSTREAM, OBJECTINPUTSTREAM으로
		//food.ser 파일에 저장된 foodList를 readObject로 읽어온다.
		//이때 형변환 (ArrayList<Food>)을 반드시 해줘야 한다.
		//foodList = (ArrayList<Food>) ois.readObject();
		FileInputStream fis=null;
		ObjectInputStream ois =null;
				try {
					fis=new FileInputStream("foodmanager.ser");
					ois=new ObjectInputStream(fis);
					foodList=(ArrayList<Food>) ois.readObject();
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}catch(ClassNotFoundException e) {
					e.printStackTrace();
				}
	}
	
	//이 부분 이해!!!!! ...웹에서 데이터 가져오는 마지막 부분 집가서 혼자 해보기!
	//디자인 패턴, 싱글턴 패턴, 템플릿 패턴(), 자바 -> 웹 프로그래밍(JSP들어야!) 자바 스크립트
	// 심화된 자바 공부 -> 디자인 패턴
	// 
	
	private static void save() {	
		//FILEOUTPUTSTREAM, OBJECTOUTPUTSTREAM으로
		//foodList객체를 food.ser에 저장한다.
		//oos.writeObject(ArrayList)
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("foodmanager.ser");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(foodList);
		}catch(IOException e) {
			e.getMessage();
		}
		
	}
	
	
	private static void updateCnt() {
		System.out.println("수량을 수정할 식자재의 이름을 입력하세요");
		String name = scan.nextLine();
		int find = searchFood(name);
		if(find == -1) {
			System.out.println("해당 식자재가 없습니다.");
		}else {
			System.out.println("바꿀 수량?");
			int cnt = Integer.parseInt(scan.nextLine());
			if(cnt <=0) {
				deleteByIndex(find);
				System.out.println("수량이 0이하가 되어" + name+"이(가) 삭제되었습니다.");
			}else {
				foodList.get(find).cnt=cnt;
			}
			
		}
		
	}

	private static int searchFood(String search) {
		for(int i=0;i<foodList.size();i++) {
			if(search.equals(foodList.get(i).name)) {
				return i;
			}
		}
		return -1;
	}
	private static void print(int idx) {
		System.out.println("----------------------");
		System.out.println("식자재 명 : "+ foodList.get(idx).name);
		System.out.println("수량 : "+ foodList.get(idx).cnt);
		System.out.println("유통기한 : "+ foodList.get(idx).expire);
		System.out.println("----------------------");
	}
	private static void list() {
		for(int i=0;i<foodList.size();i++) {
			print(i);
		}
	}
	private static void insert() {
		System.out.println("새 식자재의 이름을 입력하세요");
		String name = scan.nextLine();
		int find = searchFood(name);
		if(find == -1) {
			Food food = new Food();
			food.name=name;
			
			System.out.println(name+ "의 수량을 입력하세요");
			int cnt = Integer.parseInt(scan.nextLine());
			food.cnt=cnt;
			
			System.out.println(name+ "의 유통기한을 입력하세요");
			int expire = Integer.parseInt(scan.nextLine());
			food.expire=expire;
			foodList.add(food);
			
		}else {
			System.out.println("이미 존재하는 식자재 입니다.");
		}
	}
	private static void delete() {
		System.out.println("삭제할 식자재의 이름을 입력하세요");
		String name = scan.nextLine();
		int find = searchFood(name);
		if(find == -1) {
			System.out.println("해당 식자재가 없습니다.");
		}else {
			deleteByIndex(find);
			System.out.println(name+"이(가) 삭제되었습니다.");
		}
	}
	
}//end class



