package exception;
//?
public class ThrowsExample {

	public static void main(String[] args) throws Exception {
		int i=(int)(Math.random()*4); //?? 형 변환 필요 이유 0~1까지으 수여서?/
		try {
			DoIt4.doit(i);
		}catch(Exception e){
			System.out.println("main에서도 받았습니다.");
			System.out.println("더 이상 예외를 던지지 않고 소비시킵니다.");
			throw e;
			//RuntimeException은 try~catch로 잡아주지 않으면 자동으로 throws됩니다.
			
		}
	
		System.out.println("메인 정상 종료");
		
	}

}

// Error, Exception(checked exception, runtime exception)
