package customerinfo;

import java.io.*;

public class DataReadApplication {

	public static void main(String[] args) {
		FileInputStream fis =null;
		DataInputStream dis = null;
		try {
			fis=new FileInputStream("customer.data");
			dis =new DataInputStream(fis);
			
			while(dis.available()!=0) {
				String name=dis.readUTF();
				System.out.println(name);
				char gender = dis.readChar();
				System.out.println(gender);
				String email = dis.readUTF();
				System.out.println(email);
				int age=dis.readInt();
				System.out.println(age);
				
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(dis!=null)
				try {
					dis.close();
				}catch(Exception e) {
					
				}
		}//end finally

	}//end main

}//end class
