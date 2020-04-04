package exception;

import java.io.IOException;

public class SystemExample {

	public static void main(String[] args) {
		Super sup = new Sub();
		
		try {
			sup.doIt(1000);
		}catch(IOException e){
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}

}
