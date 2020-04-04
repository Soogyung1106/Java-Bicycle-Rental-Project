package customerinfo;

import java.io.*;

public class TextReadApplication {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader("customer.txt");
			br=new BufferedReader(fr);
			String data=null;
			while((data=br.readLine())!=null) {
				String[] customer=data.split(",");
				int age=Integer.parseInt(customer[3]);
				if(age>=20) {
					System.out.println(data);
				}//end if
			}//end while
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(br!=null)
				try {
					br.close();
				}catch(Exception e) {
					
				}//end catch
		}//end finally

	}//end main

}//end class
