package stream;

import java.io.*;

public class FilterStreamExample {
	
	public static void main(String[] args) {
		FileReader input=null;
		FileWriter output=null;
		BufferedReader bufInput=null;
		BufferedWriter bufOutput=null;
		try {
			String inFile = "in.txt";
			String outFile="out.txt";
			
			input = new FileReader(inFile);
			output=new FileWriter(outFile);
			bufInput = new BufferedReader(input);
			bufOutput = new BufferedWriter(output);
			
			String line;
			line=bufInput.readLine();
			
			while(line != null) {
				System.out.println(line); //<?> 점을 기준으로 나눠서 출력하는 것
				bufOutput.write(line, 0, line.length());
				bufOutput.newLine();
				line=bufInput.readLine();
			}
			System.out.println(inFile + " >> "+outFile);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(bufInput !=null)
				try {
					bufInput.close();
				}catch(IOException e) {
					
				}
			if(bufOutput !=null)
				try {
					bufOutput.close();
				}catch(IOException e) {
					
				}//end catch
			
		}//end finally
		
	}//end main
	
}//end class
