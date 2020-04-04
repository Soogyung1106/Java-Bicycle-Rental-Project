package exception;

public class DoIt1 {
//멤버 변수	
	public static String[] greetings= {"A", "B", "C"};
//메서드
	public static void doit(int index) throws Exception{	//Exception 은 CheckedException
			System.out.println(greetings[index]);  //두잇3에서 try Catch로 처리해주기
		
	}
}	
