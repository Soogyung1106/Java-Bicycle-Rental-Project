package Exception;

public class RuntimeExceptionExample {
	
	public static int makeException1(int input) {
		//CheckedException을 호출자에게 던지기 위해서는 반드시 메서드 이름 옆에 throws 구문을 써줘야함
		//RuntimeException을 호출자에게 던지기 위해서 throws 구문을 써줄 필요가 없음. 안 써줘도 throws 됨.
		
		//그래서 RuntimeException을 try catch하지 않으면 자동으로 호출자에게 throws됨.
		//반면에 CheckedException을 try catch하지 않으면 반드시 throws구문을 써줘야 함.
		
		//RuntimeExceptio은 컴파일시엔 예외가 발생할 지 모르고, 실행시에만 알 수 있다.
		//-> 처리하지 않아도 컴파일 가능 -> 즉, 예외를 만났을때는 아무런 처리가 안되있는 상태이다.
		//-> throws구문이 없더라도 자동적으로 호출자에게 throws 하도록 만듬. -> 반드시 처리해야만 컴파일 가능
		
		//반면에 CheckedException은 컴파일시에 예외가능성이 있다는 사실을 안다. 
		//-> 반드시 처리해야만 컴파일 가능 -> 예외를 만나더라도 어던 처리가 되어잇음 -> 계속 throws만 명시했다면 결국 JVM까지 가서 프로그램 종료
		
	    int divide=0;
		// 실행하기 전까진 예외가 발생될지 발생되지 않을지 모른다.
		//int/int일 뿐..
		//하지만 우리는 알수 있기 때문에 이런것을 발견하면
		//필요에 따라 고쳐서 Arithmetic예외가 발생하지 않도록 하거나,
		//혹은 그대로 두고 catch하여 다른 코드를 실행할 수 있을 것임.
		int result =input/divide; //오류 : 0으로 나눔
		return result;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("예외가 발생하였습니다.");
			System.out.println(e.getMessage());	
		}
	}
	
	public static void makeException2() {
		String s="가";
		//예외가 발생할지 안할지 모름.
		//s는 String의 객체이고 이 객체안에 charAt이라는 매서드가 있고 
		//메서드 안에 인자로 int값도 잘 들어갔기 때문에 구조적으로는 아무 문제가 없음
		//컴파일상 아무 문제가 없고 실행을 할 때 알수 있는 예외가 바로 --> RuntimeException
		//RuntimeException이 아닌 예외들(CheckedException)은 
		//컴파일 단계부터 처리를 해줘야 컴파일이 가능함.
		System.out.println(s.charAt(1)); // 오류 : 0까지 밖에 없음.
	}
	public static void makeException3() {
		int[] a= {1,2,3};
		//구조적으로 보면 아무런 문제가 없음.
		//개발자의 부주의가 RuntimeException 주원인 -> 발견시에 코드를 수정
		//(아닌 경우도 있습니다.) -> 이 경우는 코드를 바꾸지 않고 try catch로 처리
		System.out.println(a[3]); // 오류 : index는 2까지 밖에 없음
	}
	
//null 포인터 익셉션 
	public static int makeException4() {
		String nothing=null;
		System.out.println(nothing.split(""));
	}
	
	public static void makeException5() {
		String notInt="가나다";
		int a=Integer.parseInt(notInt);
	}
	//익셉션이 아니라 에러임 (StackOverflowError : 계속 자기자신을 호출해서 뜨는 에러)
	public static int makeException6() {
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			makeException6();
		}
	}
	
	//ArrayStoreException
	public static void makeException7() {
		Object[] objArr =new String[3];
		objArr[0]=0; // 오류 : String 배열인데 int 값이 들어가려함
	}
	
	//ClassCastException
	public static void makeException8() {
		Object[] objArr = new String[3];
		objArr[0]="0";
		Integer a = (Integer) objArr[0];
	}
	
	public static void main(String[] args) {
		//Runtime Exception도 마지막엔 결국 try catch 해주어야 프로그램이 
		//makeException1(4);
		//System.out.println("프로그램의 마지막까지 실행 되었음"); 
		//프로그램을 돌리다가 에러가 발생하더라도 끝까지 프로그램을 돌리고 끝낸다.
		//makeException2();
		//makeException3();
		//makeException4();
		//makeException5();
		try {
			makeException6();
		}
		makeException6();
		//makeException7();
		//makeException8();

	}
	
}


