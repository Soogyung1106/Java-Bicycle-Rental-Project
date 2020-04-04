package exception;

public class FileSys {
	
	public void save(int num)throws IOException {
		if(num<0) {
			throw new IOException("num이 0보다 작습니다.");
		}
		System.out.println("File에 저장되었습니다.");
		
	}
}