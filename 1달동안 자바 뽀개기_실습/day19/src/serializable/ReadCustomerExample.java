package serializable;

import java.io.*;

public class ReadCustomerExample {

	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream ois =null;
		try {
			fis=new FileInputStream("cusomer.ser");
			ois=new ObjectInputStream(fis);
			Customer cust1=(Customer)ois.readObject();
			Customer cust2=(Customer)ois.readObject();
			System.out.println(cust1);
			System.out.println(cust2);
		}catch(Exception e) {
			
		}finally {
			if(ois!=null)
				try {
					ois.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}
	}

}
