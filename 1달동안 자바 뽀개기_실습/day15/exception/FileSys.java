package exception;

public class FileSys {
	
	public void save(int num)throws IOException {
		if(num<0) {
			throw new IOException("num�� 0���� �۽��ϴ�.");
		}
		System.out.println("File�� ����Ǿ����ϴ�.");
		
	}
}