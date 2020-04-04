package exception;

public class DoIt3 {
	
	public static void doit(int index) throws Exception{
		
		try {
			DoIt2.doit(index);
		}catch(Exception e){
			System.out.println("DoIt3에서 예외를 catch 했습니다.");
			System.out.println("다시 던집니다.");
			throw e; //? throws와의 차이점??/ 바깥의 호출자에게 던지는 것, 그냥 throw는 
		}
		

	}
}	
