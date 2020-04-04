package serializable;

import java.io.*;

public class WriteCustomerExample {

	public static void main(String[] args) {
		FileOutputStream fos=null;   //transient >> 객체 직렬화에 있어서 빼고 읽을 데이터 앞에 붙혀주면 null로 읽는다.
		ObjectOutputStream oos=null;
		Customer cust1=new Customer("홍길동", 'M', "hkd@test.com", 30);
		Customer cust2=new Customer("홍길남", 'F', "hkn@test.com", 25);
		try {
			fos=new FileOutputStream("customer.ser");
			oos new ObjectOutputStream(fos);
			oos.writeObject(cust1);
			oos.writeObject(cust2);
			System.out.println("cust 객체 저장됨");
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
