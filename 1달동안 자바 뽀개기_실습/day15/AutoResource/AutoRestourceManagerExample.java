package AutoResource;

import java.io.FileInputStream;

public class AutoRestourceManagerExample {
	FileInputStream in2 =null;
	public static void main(String[] args) {
		try {
			in2 = new FileInputStream("A.txt");
			System.out.println("read data : "+in2.read());
		}catch(NullPointerException ex) {
			System.out.println(ex);
		}catch(IOException ex) {
			System.out.println(ex);
		}finally {
			if(in2!=null) 
				try {
					in2.close();
				}catch(IOException e) {
					
				}//end catch
		}//end finally

	}//end main

}//end class
