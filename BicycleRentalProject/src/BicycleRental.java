// BicycleManager (�޴����� p,n,c ����)
// ������ �� ������ ���� =count, index=-1
// ���� ���α׷��� �ִ� ������ ���� 3���� 
// �� search���� ��� 2�� 
// ���� �˻��� >> ���� �뿩�ذ� ������  ����, �뿩�Ⱓ, �뿩��� 
// �����Ÿ� �˻��� >> ����, �뿩���, �뿩�Ⱓ, �뿩�ذ� ���� (�켱)

//�������� :  �̸� �˻��� �ҹ��ڷ� �ĵ� �˻������ϰ�! �뿩�ذ� ����! 

import java.util.Scanner;

public class BicycleRental {
	
	static final int MAX = 100;
	static String[] bicycleNameList =new String[MAX];  // �����ű��� �̸�
	static int[] cntList = new int[MAX]; //������ ����
	static int[] periodList = new int[MAX]; //������ �뿩�Ⱓ
	static int[] costList = new int[MAX]; //������ �뿩���
	static int[] customerList = new int[MAX]; //������ �뿩�ذ� �� ��� -> ��ȭ�ؼ� ����
	
	static int count = 3; //���α׷��� �ִ� ������ ������ ����
	//���࿡ index=2�̸� �� ��° �����Ű� ����?
	//0    	1	2	3  <- �迭�� �ε���
	//������1 ������2 ������3 ������4
	//3     5   10  15  -> �뿩�Ⱓ
	//1     2    4   5   -> �뿩���
	//a,b   c,d   e   f,g
	
	static Scanner scan = new Scanner(System.in); //�ؿ��� scan ����ϱ� ���� ��ġ
	
	public static void main(String[] args) {
		
		bicycleNameList[0]="road bike";cntList[0]=20;periodList[0]=30;costList[0]=30000;customerList[0]=30;
		bicycleNameList[1]="hybrid";cntList[1]=10;periodList[1]=7;costList[1]=15000;customerList[1]=20;
		bicycleNameList[2]="minivelo";cntList[2]=5;periodList[2]=1;costList[2]=5000;customerList[4]=8;
		
		while(true) {
			
			//�ܼ�â�� �ݺ��ؼ� �ߴ� �޴�
			System.out.println("==================Bycicle Rental=========================");
			System.out.println("/ INFO / ���� �����ϰ� �ִ� ������ ���� : " +count);  //������ ������ �� ���� �߰�
			System.out.println();
			System.out.println("(I)nsert	(D)elete	(U)pdate"); 
			System.out.println("(S)earch	(L)ist		(Q)uit");
			System.out.println("=========================================================");
			
			System.out.println("-->");
			
			String choice = scan.nextLine();//scanf���, ����â���� �Է´�� (�� ������ ������ �Է´�����)
			//choice���� �Է°��� ����.
			choice=choice.toLowerCase();  //�Է��� ���ڸ� ��� �ҹ��ڷ� �ٲٰڴ�.
			switch(choice.charAt(0)) {	//charAt  �Է��� ������ ù��° ���ڸ� ���ڴ�.
			case 'i':
				System.out.println("������ �� ���� �߰�...");
				insert();
				break;
			case 'd':
				System.out.println("������ ���� ����...");
				delete();
				break;
			case 'u':
				System.out.println("������ ���� ����..");
				System.out.println("< ���� ������ 1��, �뿩�Ⱓ ������ 2��, �뿩��� ������ 3��, �뿩 �� �� ������ 4��, ��� ������ 5�� >");
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
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					break;
				}
				break;
			
			case 's':
				System.out.println("������ �������� ���� �˻�...");
				System.out.println("������ ���� : ");
				String name=scan.nextLine();  //����ڰ� �Է��� ���� name������ ��Ʈ������ ����
				name=name.toLowerCase();
				
				int found = find(name); //
				if(found ==-1) {
					System.out.println("�ش� ������ �����Ű� �����ϴ�.");
				}else {
					print(found);
				}
				
				break;
			case 'l':
				System.out.println("��� ������ ������ ����...");
				list();  
				break;
			case 'q':
				System.out.println("���α׷� ����...");
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
	

	private static void print(int found) {   //�̸� �˻��� ���� ã�� �ε����� ������ ������ ���
		// TODO Auto-generated method stub
		System.out.println("----------------------");
		System.out.println("���� : "+cntList[found]);
		System.out.println("�뿩�Ⱓ : "+periodList[found]);
		System.out.println("�뿩��� : "+costList[found]);
		System.out.println("�뿩 ��  : "+customerList[found]);
		System.out.println("----------------------");
	}

	private static void deleteByIndex(int idx) {  //��� �ݺ��Ǹ� ���ֱ�! �װ� ���߿� ������ ȿ����
		for(int i=idx;i<count-1;i++) {
			bicycleNameList[i]=bicycleNameList[i+1];
			cntList[i]=cntList[i+1];
			periodList[i]=periodList[i+1];
			costList[i]=costList[i+1];
			customerList[i]=customerList[i+1];
		}
		count--;
		
	}
	
	private static int find(String name) { //find������ �������� ã�Ƽ� �ε����� ��ȯ�ϴ� �޼��� 
		for(int i=0;i<count;i++) {	//������ ������ ���� index�� count-1�̱� ������ 
			if(bicycleNameList[i].equals(name)) { //�Է¹��� �̸��� ���ٸ�...
				return i;	//return�� ������ �����..'Ż��'�� ���� �� �ϳ� 
			}
		}
		return -1; // /?/�� ã�Ҵ�, �ε��� -1 
	}	
	
	private static void updateAll() {
		//���� ���õ� �������� ������ ������Ʈ(����)�ϴ� �޼���
		//������Ʈ ���� index ���ð����� �־�� �Ѵ�.
		System.out.println("���� ������ ������ ���� :");
		String name = scan.nextLine();
		name=name.toLowerCase();
		int found = find(name);
		if(found == -1) {
			System.out.println("�ش� ������ �����Ű� �����ϴ�.");
		}else {
			System.out.println("���� ���� ( "+cntList[found]+") ->");
			String cnt=scan.nextLine();
			
			if(cnt==null || cnt.length()==0) {
				
			}
			if(Integer.parseInt(cnt) <=0) {
				deleteByIndex(found);
				System.out.println("������ 0���ϰ� �Ǿ� "+name+"��(��) �����Ǿ����ϴ�.");	
			}
			else {
				cntList[found]=Integer.parseInt(cnt);
				
				System.out.printf("�뿩���(%d) : ", costList[found]);
				String cost=scan.nextLine();
				if(cost==null || cost.length()==0) {
					
				}else {
					costList[found]= Integer.parseInt(cost);
				}
				
				System.out.printf("�뿩�Ⱓ(%d) : ", periodList[found]);
				String period=scan.nextLine();
				if(period==null || period.length()==0) {
					
				}else {
					periodList[found]= Integer.parseInt(period);
				}//end else0
				
			}//end else1
		
		}//end else2
		
	}//end updateAll
	
	private static void updateCustomer() {
		System.out.println("�뿩 �� ���� ������ ������ ���� :");   //�뿩��� ����, updateAll �׽�Ʈ
		String name = scan.nextLine();
		name=name.toLowerCase();
		
		int found = find(name);
		if(found == -1) {
			System.out.println("�ش� ������ �����Ű� �����ϴ�.");
		}else {
			System.out.println("���� �뿩 �� �� ("+customerList[found]+") ->");
			
			boolean k=true;
			while(k) {
				int customer = Integer.parseInt(scan.nextLine());
				
				if(customer <=0) {
					System.out.println("�뿩����� �߸� �Է��ϼ̽��ϴ�.");
					System.out.println("���Է� : ");
					
				}else {
					customerList[found]=customer;
					k=false;
				}
			}//end while
			
		}//end else
		
	}//end updateCost

	
	// <����> ������ 0�� ���ϰ� �Ǹ� ������ ����	
	private static void updateCnt() {
		System.out.println("������ ������ ������ ���� :");
		String name = scan.nextLine();
		name=name.toLowerCase();
		
		int found = find(name);
		if(found == -1) {
			System.out.println("�ش� ������ �����Ű� �����ϴ�.");
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
	
	private static void updateCost() {
		System.out.println("�뿩����� ������ ������ ���� :");   //�뿩��� ����, updateAll �׽�Ʈ
		String name = scan.nextLine();
		name=name.toLowerCase();
		
		int found = find(name);
		if(found == -1) {
			System.out.println("�ش� ������ �����Ű� �����ϴ�.");
		}else {
			System.out.println("���� �뿩��� ("+costList[found]+") ->");
			
			boolean k=true;
			while(k) {
				int cost = Integer.parseInt(scan.nextLine());
				
				if(cost <=0) {
					System.out.println("�뿩����� �߸� �Է��ϼ̽��ϴ�.");
					System.out.println("���Է� : ");
					
				}else {
					costList[found]=cost;
					k=false;
				}
			}//end while
			
		}//end else
		
	}//end updateCost

	private static void updatePeriod() {    
		System.out.println("�뿩�Ⱓ�� ������ ������ ���� :");
		String name = scan.nextLine();
		name=name.toLowerCase();
		
		int found = find(name);
		if(found == -1) {
			System.out.println("�ش� ������ �����Ű� �����ϴ�.");
		}else {
			System.out.println("���� �뿩�Ⱓ ("+periodList[found]+") ->");
			
			while(true) {
				int period = Integer.parseInt(scan.nextLine());
				
				if(period <=0) {
					System.out.println("�뿩�Ⱓ�� �߸� �Է��ϼ̽��ϴ�.");
					System.out.println("���Է� : ");
					
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
			System.out.println("������ ���� : "+bicycleNameList[i]);
			System.out.println("����: "+cntList[i]+"��");
			System.out.println("�뿩��� : "+costList[i]+"��");
			System.out.println("�뿩�Ⱓ : "+ periodList[i]+"��");
			System.out.println("�뿩�� : "+customerList[i]+"��");
			System.out.println("--------------------------");
		}
	
	}

	private static void delete() {
		System.out.println("������ ������ ���� : ");
		String name = scan.nextLine();
		name=name.toLowerCase();
		
		int found = find(name);
		
		if(found ==-1) {	
			System.out.println("�ش� �̸��� ���� �����Ű� �����ϴ�.");
		}else {
			deleteByIndex(found);   
			System.out.println(name+"��(��) �����Ǿ����ϴ�.");
		}
		
	}

	private static void insert() {
		System.out.println("������ ���� : ");
		String name = scan.nextLine();
		name=name.toLowerCase();
		
		int found = find(name);
		if(found !=-1) { // find(name) == -1 �� ������ �̸��� �������� �ʴ� ���� �ǹ�
			System.out.println("�̹� �����ϴ� ������ �����Դϴ�.");
		}else {
			bicycleNameList[count]=name;
			System.out.println("���� : ");
			cntList[count]=Integer.parseInt(scan.nextLine());
			System.out.println("�뿩�Ⱓ : ");
			periodList[count]=Integer.parseInt(scan.nextLine());
			System.out.println("�뿩��� : ");
			costList[count]=Integer.parseInt(scan.nextLine());
			System.out.println("�뿩�� �� : ");
			customerList[count]=Integer.parseInt(scan.nextLine());
			
			count++;
			System.out.println("�� ���� �����Ÿ� ���������� �߰��߽��ϴ�.");
			
		}
		
	}

}//end class
