package static_;

public class Company {
	//1. ��� ����
	//�ν��Ͻ� ����--> ���� �ν��Ͻ��� ���� �� ����.
	private String str;
	// static �� ����  --> Ŭ���� �ε�ÿ� ����
	private static Company c=new Company(); 
	
	//2. ������
	private Company() {
		str="company";
		System.out.println(str);
	}
	//3. �޼��� 
	public static Company getCompany() {
		return c;
	}
}//end class
