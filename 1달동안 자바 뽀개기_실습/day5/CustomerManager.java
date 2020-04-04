package day1_5;
import java.util.Scanner;  //Scanner�� java.util�̶�� ��Ű���� ���ԵǾ� �����Ƿ� �������

public class CustomerManager {
	// �ɹ����� : Ŭ���� ���� �ִ� ����.(���������ʹ� �ٸ�)
	static final int MAX=100;		//static final �ϸ� ���, ������� ��� �빮�� -> 'static final �ڷ��� �����'   
	static String[] nameList =new String[MAX];  //new ��ü�� ���� ���� �ϴ� ���
	static char[] genderList =new char[MAX];
	static String[] emailList = new String[MAX];
	static int[] birthYearList=new int[MAX];
			
	static int index=-1;	// index=1 2��° ����� �����ߴ�.
	static int count=3;	//���α׷� �ȿ� �ִ� ���� ���
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		nameList[0]="������0";genderList[0]='M';emailList[0]="sally1106@naver.com";birthYearList[0]=1997;
		nameList[1]="������1";genderList[1]='M';emailList[1]="sally1106@naver.com";birthYearList[1]=1997;
		nameList[2]="������2";genderList[2]='M';emailList[2]="sally1106@naver.com";birthYearList[2]=1997;
		
		while(true) {
			//�޴� ����
			System.out.println("/ INFO /  �� �� �� : " +count+", ���� ���õ� �� : " +index);
			System.out.println("< menu >");
			System.out.println("(i)�Է�, (d)����, (u)����");
			System.out.println("(p)���� ��, (n)���� ��, (c)���� ��, (q)���α׷� ����");
			
			System.out.println("-->");
			
			String menu = scan.nextLine();//scanf���, ����â���� �Է´��
			//menu���� �Է°��� ����.
			menu=menu.toLowerCase();  //�Է��� ���ڸ� ��� �ҹ��ڷ� �ٲٰڴ�.
			switch(menu.charAt(0)) {	//charAt  �Է��� ������ ù��° ���ڸ� ���ڴ�.
			case 'i':
				System.out.println("�� ������ �Է��մϴ�.");
				insert();
				break;
			case 'd':
				System.out.println("�� ������ �����մϴ�.");
				// ������ �� �ڿ� �ִ� ������ �տ� �迭�� ����;� ��
				delete();
				break;
			case 'u':
				System.out.println("�� ������ �����մϴ�.");
				update();
				break;
			case 'n':  //���� ������ �ε��� �̵�
				System.out.println("���� �� �����Դϴ�.");
				if(index>=count-1) {  //count-1�� ������ ����� �ε�����
					System.out.println("���� ���� �����ϴ�.");
				}else{
					print(++index);  //���� ���̴ϱ� �ε��� �ϳ� �ø���(���� ������ �̷� �� ����ϴ� ��!)
				}
				
				break;
			case 'p': //���� ������ �ε��� �̵�
				System.out.println("���� �� �����Դϴ�.");
				if(index<=0) {
					System.out.println("���� ���� �����ϴ�.");
				}else {
					print(--index); //���� ���̴ϱ� �ε��� �ϳ� ������
				}
				
				break;
			case 'c':
				if(index==-1||index>count-1){	//��Ʈ ��Ŷ 
					System.out.println("���� ���õ� ���� �����ϴ�.");
					break;
				}else {
					current(index);
					break;
				}
				//���� ���� ����ϴ� �ڵ�. if�� ���� �־
			case 'q':
				System.out.println("���α׷��� �����մϴ�.");
				scan.close(); //��ĳ�� �ݾ��ֱ�
				System.exit(0); //���α׷� ����
				break;
			
			}//end switch
		}//end while
		
	}//end main
	
	
	private static void delete() {
		for(int i=index; i<count-1;i++) { 
			nameList[i]=nameList[i+1]; // �����ϰ� ���� �� ���!!
			genderList[i]=genderList[i+1];
			emailList[i]=emailList[i+1];
			birthYearList[i]=birthYearList[i+1];
			//������ �ݺ��� �� i�� ����? count-2(������ �����)
			//������ ����� ���� = ������ ��� ����
		} //1�� �����ϴ� ����
		count--; //1�� ���� ������ �� ��� �ٿ��ֱ�
		index=-1; // count 2��, 1������ �پ��µ�  index�� 5�� ��� ....����
		
	}


	// case 'u'�� ���Ǵ� �޼���
	private static void update() {
		//���� ���õ� ���� ������ ������Ʈ(����)�ϴ� �޼���
		//������Ʈ ���� index ���ð����� �־�� �Ѵ�.
		System.out.printf("�̸�(%s) : ", nameList[index]);
		String name=scan.nextLine();
		if(name==null || name.length()==0) {
			
		}else {
			nameList[index]=name;  //�����Ұ� ���� �� ���!!!!!
		}
		
		System.out.printf("����(%c) : ", genderList[index]);
		String gender=scan.nextLine();
		if(gender==null || gender.length()==0) {
			
		}else {
			genderList[index]=gender.charAt(0); 
			// 99��° �ٿ��� gender�� �ڷ����� String�̶�� �������־��� ������  char���� genderList[index]�� �ڷ��� mismatch
			//�׷��� charAt() �Լ� �� ��
		}
		System.out.printf("�̸���(%s) : ", emailList[index]);
		String email=scan.nextLine();
		if(email==null || email.length()==0) {
			
		}else {
			emailList[index]=email; 
		}
		System.out.printf("����⵵(%d) : ", birthYearList[index]);
		String birthYear=scan.nextLine();
		if(birthYear==null || birthYear.length()==0) {
			
		}else {
			birthYearList[index]=Integer.parseInt(birthYear); //���ڿ� "1997"�� ���� 1997�� �ްڴ�.
		}
		
	}





	// case 'c'�� ���Ǵ� �޼���
	private static void current(int idx) {
		System.out.println("���� ���õ� �� ������ ������ �����ϴ�.");
		System.out.println("�̸�: "+ nameList[idx]);
		System.out.println("���� : "+genderList[idx]);
		System.out.println("�̸��� : "+emailList[idx]);
		System.out.println("����⵵ : "+ birthYearList[idx]);
	}
	
	// case 'n'�� case 'p'�� ���Ǵ� �޼���
	private static void print(int idx) {
		System.out.println("-------------------------");
		System.out.println("�̸�: "+ nameList[idx]);
		System.out.println("���� : "+genderList[idx]);
		System.out.println("�̸��� : "+emailList[idx]);
		System.out.println("����⵵ : "+ birthYearList[idx]);
	}
	
	// case 'i'�� ���Ǵ� �޼���
	private static void insert() {
		//������ ��� ���ڸ��� ���ο� ����� �߰��� ��
		//������ ��� count �ε����� count-1, ���� �߰��� ����� �ε����� count
		System.out.println("�̸��� �Է��ϼ���.");
		String name=scan.nextLine();
		System.out.println("������ �Է��ϼ���.");
		char gender=scan.nextLine().charAt(0);
		System.out.println("�̸����� �Է��ϼ���.");
		String email=scan.nextLine();
		System.out.println("����⵵�� �Է��ϼ���.");
		int birthYear=Integer.parseInt(scan.nextLine());
		//"55"��� String���� Integer.parseInt("55")�� ������ --> 55  ��, ���� ��Ʈ���� int�� �ٲ��ִ� ���
		
		nameList[count]=name;
		genderList[count]=gender;
		emailList[count]=email;
		birthYearList[count]=birthYear;
		
		count++;
	}

}//end class
