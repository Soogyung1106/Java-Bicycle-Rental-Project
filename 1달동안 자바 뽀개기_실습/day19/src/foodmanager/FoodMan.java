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
//	count��ſ� foodList.size()�� ����� ����.
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Food f1 =new Food("kimchi",10,500);
		//Food f2 =new Food("egg",20,10);
		//Food f3 =new Food("fork",30,15);
		//foodList.add(f1);
		//foodList.add(f2);
		//foodList.add(f3);
		
		//�������� ���� ���� �ڵ忡 �̸� �����͸� �����ߴٸ� �̹����� ������ �����ؼ� �����͸� �����ϰ� 
		//���α׷��� ������ ������ �Ŀ��� �ٽ� ������ �����ְԲ� �ϴ� ��� -> load(), save() �߰�
		load();
		
		while(true) {
			System.out.println("�޴��� �Է��ϼ���.");
			System.out.println("(i)nsert, (d)elete, "+ "(u)pdate, (s)earch, (l)ist, (q)uit");
			char menu = scan.nextLine().charAt(0);
			switch(menu) {
			case 'i':
				System.out.println("���ο� �����縦 �߰��մϴ�.");
				insert();
				break;
			case 'd':
				System.out.println("�����縦 ���� �մϴ�.");
				delete();
				break;
			case 'u':
				System.out.println("�����縦 �����մϴ�.");
				System.out.println("���� ������ 1, ������Ѽ����� 2");
				int inputU= Integer.parseInt(scan.nextLine());
				switch(inputU) {
				case 1:
					System.out.println("���� ���� �մϴ�.");
					updateCnt();
					break;
				case 2:
					System.out.println("������� �����մϴ�.");
					updateExpire();
					break;
				default:
					System.out.println("�߸��Է��߽��ϴ�.");
					break;
				}
				break;
			case 's':
				System.out.println("�˻��� ������ ���� �Է��ϼ���");
				String search = scan.nextLine();
				int find =searchFood(search);//�׳� �ε���
				if(find != -1) print(find);
				else System.out.println("�ش� �̸��� ���� �����簡 �����ϴ�.");
				break;
			case 'l':
				System.out.println("��� ������ ��� ���");
				list();
				break;
			case 'q':
				save();
				System.out.println("���α׷�����");
				scan.close();
				System.exit(0);
			default:
				System.out.println("�޴��� �����ϴ�.");
				break;
			}//end switch
		}//end while
	}//end main
	private static void deleteByIndex(int idx) {
		foodList.remove(idx);
	}
	private static void updateExpire() {
		System.out.println("��������� ������ �������� �̸��� �Է��ϼ���");
		String name = scan.nextLine();
		int find = searchFood(name);
		if(find == -1) {
			System.out.println("�ش� �����簡 �����ϴ�.");
		}else {
			System.out.println("�ٲ� �������?");
			int expire = Integer.parseInt(scan.nextLine());
			if(expire <=0) {
				deleteByIndex(find);
				System.out.println("��������� 0���ϰ� �Ǿ�" + name+"��(��) �����Ǿ����ϴ�.");
			}else {
				foodList.get(find).expire=expire;
			}
			
		}
		
		
	}
	
	//�� �κ� ����!
	
	private static void load() {
		//FILEINPUTSTREAM, OBJECTINPUTSTREAM����
		//food.ser ���Ͽ� ����� foodList�� readObject�� �о�´�.
		//�̶� ����ȯ (ArrayList<Food>)�� �ݵ�� ����� �Ѵ�.
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
	
	//�� �κ� ����!!!!! ...������ ������ �������� ������ �κ� ������ ȥ�� �غ���!
	//������ ����, �̱��� ����, ���ø� ����(), �ڹ� -> �� ���α׷���(JSP����!) �ڹ� ��ũ��Ʈ
	// ��ȭ�� �ڹ� ���� -> ������ ����
	// 
	
	private static void save() {	
		//FILEOUTPUTSTREAM, OBJECTOUTPUTSTREAM����
		//foodList��ü�� food.ser�� �����Ѵ�.
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
		System.out.println("������ ������ �������� �̸��� �Է��ϼ���");
		String name = scan.nextLine();
		int find = searchFood(name);
		if(find == -1) {
			System.out.println("�ش� �����簡 �����ϴ�.");
		}else {
			System.out.println("�ٲ� ����?");
			int cnt = Integer.parseInt(scan.nextLine());
			if(cnt <=0) {
				deleteByIndex(find);
				System.out.println("������ 0���ϰ� �Ǿ�" + name+"��(��) �����Ǿ����ϴ�.");
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
		System.out.println("������ �� : "+ foodList.get(idx).name);
		System.out.println("���� : "+ foodList.get(idx).cnt);
		System.out.println("������� : "+ foodList.get(idx).expire);
		System.out.println("----------------------");
	}
	private static void list() {
		for(int i=0;i<foodList.size();i++) {
			print(i);
		}
	}
	private static void insert() {
		System.out.println("�� �������� �̸��� �Է��ϼ���");
		String name = scan.nextLine();
		int find = searchFood(name);
		if(find == -1) {
			Food food = new Food();
			food.name=name;
			
			System.out.println(name+ "�� ������ �Է��ϼ���");
			int cnt = Integer.parseInt(scan.nextLine());
			food.cnt=cnt;
			
			System.out.println(name+ "�� ��������� �Է��ϼ���");
			int expire = Integer.parseInt(scan.nextLine());
			food.expire=expire;
			foodList.add(food);
			
		}else {
			System.out.println("�̹� �����ϴ� ������ �Դϴ�.");
		}
	}
	private static void delete() {
		System.out.println("������ �������� �̸��� �Է��ϼ���");
		String name = scan.nextLine();
		int find = searchFood(name);
		if(find == -1) {
			System.out.println("�ش� �����簡 �����ϴ�.");
		}else {
			deleteByIndex(find);
			System.out.println(name+"��(��) �����Ǿ����ϴ�.");
		}
	}
	
}//end class



