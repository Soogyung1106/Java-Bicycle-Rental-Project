package customerinfo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataWriteApplication {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		try {
			fos=new FileOutputStream("customer.data");
			dos=new DataOutputStream(fos);
			dos.writeUTF("ȫ�浿");
			dos.writeChar('M');
			dos.writeUTF("hkd@test.com");
			dos.writeInt(30);
			dos.writeUTF("ȫ�泲");
			dos.writeChar('F');
			dos.writeUTF("hkn@test.com");
			dos.writeInt(25);
			System.out.println("File Saved");
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(dos!=null)
				try {
					dos.close();
				}catch(Exception e) {
					
				}//end catch
		}//end finally
	}//end main
}//end class
