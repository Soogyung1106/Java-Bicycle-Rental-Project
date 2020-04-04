package exception;

public class Super {
	FileSys fs =new FileSys();
	//숫자를 저장하는 시스템 Super
	public void  doIt(int num) throws IOException{
		System.out.println("Super.doIt()");
		fs.save(num);
	}
	
}
