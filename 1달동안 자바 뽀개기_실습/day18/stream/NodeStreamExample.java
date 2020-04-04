package stream;
// ����Ǿ����� ���� : ������Ʈ Ŭ���ϰ� F5 ������

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NodeStreamExample {
	public static void main(String[] args) {
		FileReader input=null;
		FileWriter output=null;
		try {
			String inFile="in.txt";
			String outFile="out.txt";
			input =new FileReader(inFile);
			output =new FileWriter(outFile);
			
			char[] buffer =new char[128];
			
			int readCount=0;
			
			do {
				readCount=input.read(buffer); //readCount �Լ� : �ϳ��� �� �о��ٸ� -1��ȯ
				if(readCount>=0) {
					output.write(buffer,0,readCount); // �а� �������� �ߺ����� ���ڴ�.
					System.out.println(new String(buffer)); //��� �����ߴ��� Ȯ���ϴ� ���
				}
			}while(readCount != -1);
			System.out.println();
			System.out.println("������ ����Ǿ����ϴ�.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(input != null)
				try {
					input.close();
				}catch(IOException e) {
					
				}
			
			if(output!=null)
				try {
					output.close();
				}catch(IOException e) {	
				
				}
		
		}//end finally
	
	}//end main
}//end class
