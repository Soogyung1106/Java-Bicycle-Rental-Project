package exception;

public class Super {
	FileSys fs =new FileSys();
	//���ڸ� �����ϴ� �ý��� Super
	public void  doIt(int num) throws IOException{
		System.out.println("Super.doIt()");
		fs.save(num);
	}
	
}
