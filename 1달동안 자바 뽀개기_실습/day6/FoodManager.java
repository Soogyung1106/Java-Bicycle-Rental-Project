/*
<�⺻ ��Ģ> 
1. ���ȭ (�ߺ��Ǵ� ������ �Լ��� ����, main�� ���� �ּ�ȭ��Ű��)
/�ݺ��Ǵ� ������ �ƿ� �Լ��� ����� ������ ���� ���/ 
 -> ���� ���� : �Լ� Ʋ �ȿ� �־���� �Ű������� �� ����!! �����ؾ� �� ���� �Ű����� �ۿ� ����! 
 -> �޼������ ���� �޼��� �ؿ� �޼��� �����ؾ�!
2. ���� �̸� ������
(main�޼��� ������ ���� 2���� �ߺ��ؼ� ������� �ʾҴ���, 
�ٸ� ���� �޼����� ��� ���� �̸��� �ߺ��ؼ� ��� ����, ���� ������ �̸� ��ġ���� ������ ��)
*/
// *idea* �������� �̸����� ã�Ƽ� �ε����� ��ȯ�ϴ� print �޼��� ���! 

import java.util.Scanner;

public class FoodManager {
	
	//������ �̸�, ����, �������
	static final int MAX = 100;
	static String[] nameList =new String[MAX];  //�������� �̸�
	static int[] cntList = new int[MAX]; //�������� ����
	static int[] expireList = new int[MAX]; //�������� �������
	
	static int count = 2; //���α׷��� �ִ� �������� ������ ����
	static int index = -1; //���� ���õ� ������(-1�� �ƹ��͵� ������ �ȵ� ����)
	//���࿡ index=2�̸� �� ��° ������ ����?
	//0    	1	2	3  <- �迭�� �ε���
	//��ǰ1 ��ǰ2 ��ǰ3 ��ǰ4
	//3     5   10  15
	//1     2    4   5
	
	static Scanner scan = new Scanner(System.in); //�ؿ��� scan ����ϱ� ���� ��ġ
	
	
	public static void main(String[] args) {
		
		nameList[0]="egg";cntList[0]=30;expireList[0]=7;
		nameList[1]="kimchi";cntList[1]=30;expireList[1]=365;
		
		while(true) {
			
			//�ܼ�â�� �ݺ��ؼ� �ߴ� �޴�
			System.out.println("/ INFO / ������ ���� : " +count+", ���� ���õ� ���� : " +index);
			System.out.println("< menu >");
			System.out.println("(i)nsert, (d)elete, (u)pdate"); 
			System.out.println("(p)revious, (n)ext, (c)urrent");
			System.out.println("(q)uit, (s)earch, (L)ist");
			
			System.out.println("-->");
			
			String choice = scan.nextLine();//scanf���, ����â���� �Է´�� (�� ������ ������ �Է´�����)
			//choice���� �Է°��� ����.
			choice=choice.toLowerCase();  //�Է��� ���ڸ� ��� �ҹ��ڷ� �ٲٰڴ�.
			switch(choice.charAt(0)) {	//charAt  �Է��� ������ ù��° ���ڸ� ���ڴ�.
			case 'i':
				System.out.println("�� �����縦 �߰��մϴ�.");
				insert();
				break;
			case 'd':
				System.out.println("������ ������ �����մϴ�.");
				delete();
				break;
			case 'u':
				System.out.println("������ ������ �����մϴ�.");
				System.out.println("< ���� ������ 1��, ������� ������ 2�� >");
				String input = scan.nextLine();
				switch(input) {
				case "1":
					updateCnt();
					break;
				case "2":
					updateExpire();
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					break;
				}
				break;
			case 'n':  //���� ���Ϸ� �ε��� �̵�
				System.out.println("���� ������ �����Դϴ�.");
				if(index>=count-1) {  //count-1�� ������ ����� �ε�����
					System.out.println("���� �����簡 �����ϴ�.");
				}else{
					print(++index);  //���� ���̴ϱ� �ε��� �ϳ� �ø���(���� ������ �̷� �� ����ϴ� ��!)
				}
				
				break;
			case 'p': //���� ������ �ε��� �̵�
				System.out.println("���� ������ �����Դϴ�.");
				if(index<=0) {
					System.out.println("���� �����簡 �����ϴ�.");
				}else {
					print(--index); //���� ���̴ϱ� �ε��� �ϳ� ������
				}
				
				break;
			case 'c':
				if(index==-1||index>count-1){	//��Ʈ ��Ŷ 
					System.out.println("���� ���õ� �����簡 �����ϴ�.");
					break;
				}else {
					current(index);
					break;
				}
				//���� ���� ����ϴ� �ڵ�. if�� ���� �־
			case 's':
				System.out.println("�̸����� ������ ������ �˻��մϴ�.");
				System.out.println("������� : ");
				String name=scan.nextLine();  //����ڰ� �Է��� ���� name������ ��Ʈ������ ����
				int found = find(name); //
				if(found ==-1) {
					System.out.println("�ش� �̸��� ���� �����簡 �����ϴ�.");
				}else {
					print(found);
				}
				
				break;
			case 'l':
				System.out.println("��� �������� ������ ����մϴ�.");
				list();  
				break;
			case 'q':
				System.out.println("���α׷��� �����մϴ�.");
				scan.close(); //��ĳ�� �ݾ��ֱ�	
//?��ĳ�� ��� �ݾ����??�� ���⼭ �ݾƾ�? ���� �������� ����ġ�� ����� �ݾ��ָ� �� ��??
				System.exit(0); 
//?���α׷� ����, ��ȣ �ȿ� 0�� ���� �ǹ�?? -> ���� ��ư ������ Terminate ���     
				break;	// while���� ����
			default:
				System.out.println("�޴��� ���� ��ư�Դϴ�. �ٽ� �Է��ϼ���.");
				System.out.println();
			}//end switch
			
		}//end while
		
	}//end main
	
	//�޼������ ���� �޼��� �ؿ� �޼��� �����ؾ�!
	
	private static void deleteByIndex(int idx) {  //��� �ݺ��Ǹ� ���ֱ�! �װ� ���߿� ������ ȿ����
		for(int i=idx;i<count-1;i++) {
			nameList[i]=nameList[i+1];
			cntList[i]=cntList[i+1];
			expireList[i]=expireList[i+1];
		}
		count--;
		index=-1;
	}
	
	//<����> ��������� 0���Ϸ� �Է��ϸ� ������ ����
	private static void updateExpire() {
		System.out.println("��������� ������ �������� �̸��� �Է��ϼ���.");
		String name = scan.nextLine();
		int found = find(name);
		if(found == -1) {
			System.out.println("�ش� �̸��� ���� �����簡 �����ϴ�.");
		}else {
			System.out.println("���� ������� ( "+expireList[found]+") ->");
			int expire = Integer.parseInt(scan.nextLine()); //���ڿ� ���ڸ� ������ ���ڷ� ��ȯ
//?Integer.parseInt�� ����ؾ� �ϴ� ������ scan.nextLine�� ����ڰ� �Է��� ���� �⺻�����ι��ڿ��� �޾Ƶ��̱� ������?
			if(expire <=0) {		
				deleteByIndex(found);	
				System.out.println("��������� 0���ϰ� �Ǿ� "+name+"��(��) �����Ǿ����ϴ�.");
				
			}else {
				expireList[found]=expire;
			}
		}

	}
	
	// <����> ��������� 0�� ���ϰ� �Ǹ� ������ ����	
	private static void updateCnt() {
		System.out.println("������ ������ �������� �̸��� �Է��ϼ���.");
		String name = scan.nextLine();
		int found = find(name);
		if(found == -1) {
			System.out.println("�ش� �̸��� ���� �����簡 �����ϴ�.");
		}else {
			System.out.println("���� ���� ("+cntList[found]+") ->");
			int cnt = Integer.parseInt(scan.nextLine());
			if(cnt <=0) {
				deleteByIndex(found);
				System.out.println("������ 0���ϰ� �Ǿ� "+name+"��(��) �����Ǿ����ϴ�.");
				
			}else {
				cntList[found]=cnt;
			}
		}
	}
	
	
	private static int find(String name) { //find�������� �̸����� ã�Ƽ� �ε����� ��ȯ�ϴ� �޼��� 
		for(int i=0;i<count;i++) {	//������ �������� index�� count-1�̱� ������ 
			if(nameList[i].equals(name)) { //�Է¹��� �̸��� ���ٸ�...
				return i;	//return�� ������ �����..'Ż��'�� ���� �� �ϳ� 
			}
		}
		return -1; // /?/�� ã�Ҵ�, �ε��� -1 
	}
	
	private static void print(int idx) {   //�̸� �˻��� ���� ã�� �ε����� ������ ������ ���
		// TODO Auto-generated method stub
		System.out.println("----------------------");
		System.out.println("������� : "+nameList[idx]);
		System.out.println("���� : "+cntList[idx]);
		System.out.println("������� : "+expireList[idx]);
		System.out.println("----------------------");
	}
	
	
	private static void list() {
		
		System.out.println("--------------------------");
		for(int i=0;i<count;i++) {
			System.out.println("�̸� : "+nameList[i]);
			System.out.println("���� : "+cntList[i]);
			System.out.println("������� : "+ expireList[i]);
			System.out.println("--------------------------");
		}
	
	}

	// case 'c'�� ���Ǵ� �޼���
	private static void current(int idx) {
		System.out.println("���� ���õ� ������ ������ ������ �����ϴ�.");
		System.out.println("������ : "+nameList[idx]);
		System.out.println("���� : "+cntList[idx]);
		System.out.println("������� : "+ expireList[idx]);
	}



	private static void delete() { //�̸����� �˻��� �� �����ϰԲ�!
		//���� ���õ� ���� ���� �ϴ� �޼���        
		//���� ���� index ���ð����� �־�� ��
		System.out.println("������ ������� : ");
		// ������ �� �ڿ� �ִ� ������ �տ� �迭�� ����;� ��
		String name=scan.nextLine();  //����ڰ� �Է��� ���� name������ ��Ʈ������ ����
		int found = find(name); 
		if(found ==-1) {	// find(name) == -1
			System.out.println("�ش� �̸��� ���� �����簡 �����ϴ�.");
		}else {
			deleteByIndex(found);   //���ȭ
			System.out.println(name+"��(��) �����Ǿ����ϴ�.");
		}	
	}
	
	private static void insert() {
		System.out.println("������� : ");
		String name = scan.nextLine();
		int found = find(name);
		if(found !=-1) { // find(name) == -1 �� ������ �̸��� �������� �ʴ� ���� �ǹ�
			System.out.println("�̹� �����ϴ� �������Դϴ�.");
		}else {
			nameList[count]=name;
			System.out.println("���� : ");
			cntList[count]=Integer.parseInt(scan.nextLine());
			System.out.println("������� : ");
			expireList[count]=Integer.parseInt(scan.nextLine());
			print(count++);
		}
	}


}//end class
