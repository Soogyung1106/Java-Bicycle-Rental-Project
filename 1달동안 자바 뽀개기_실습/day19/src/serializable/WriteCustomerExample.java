package serializable;

import java.io.*;

public class WriteCustomerExample {

	public static void main(String[] args) {
		FileOutputStream fos=null;   //transient >> ��ü ����ȭ�� �־ ���� ���� ������ �տ� �����ָ� null�� �д´�.
		ObjectOutputStream oos=null;
		Customer cust1=new Customer("ȫ�浿", 'M', "hkd@test.com", 30);
		Customer cust2=new Customer("ȫ�泲", 'F', "hkn@test.com", 25);
		try {
			fos=new FileOutputStream("customer.ser");
			oos new ObjectOutputStream(fos);
			oos.writeObject(cust1);
			oos.writeObject(cust2);
			System.out.println("cust ��ü �����");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally{
			if(oos!=null)
				try {
					oos.close();
					
				}catch() {
					
				}
		}
		
	}

}
