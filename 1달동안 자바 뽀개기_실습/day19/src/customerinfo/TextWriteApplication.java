package customerinfo;

import java.io.FileOutputStream;

public class TextWriteApplication {

	public static void main(String[] args) {
		String data1="ȫ�浿, M, hkd@test.com, 30";
		String data2="�泲, F, hkn@test.com, 25"; //�ʵ屸�����߰�
		FileOutputStream fos = null;
		try {
			fos =new FileOutputStream("customer.txt");
			fos.write(data1.getBytes());
			fos.write('\n');//���ڵ� ������ �߰�
			fos.write(data2.getBytes());
			System.out.println("File saved");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(fos!=null)
				try {
					fos.close();
				}catch(Exception e) {
					
				}//end catch
		}//end finally
	}//end main

}//end class
