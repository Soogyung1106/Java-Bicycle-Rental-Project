package stream;
// 복사되었는지 여부 : 프로젝트 클릭하고 F5 누르기

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
				readCount=input.read(buffer); //readCount 함수 : 하나도 못 읽었다면 -1반환
				if(readCount>=0) {
					output.write(buffer,0,readCount); // 읽고 남은것을 중복없이 쓰겠다.
					System.out.println(new String(buffer)); //어떻게 복사했는지 확인하는 방법
				}
			}while(readCount != -1);
			System.out.println();
			System.out.println("파일이 복사되었습니다.");
			
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
