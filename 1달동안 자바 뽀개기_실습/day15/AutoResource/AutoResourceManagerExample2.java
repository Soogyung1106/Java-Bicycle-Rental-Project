package AutoResource;
//자원 관리 자동화 : finally를 사용하지 않고도 자동적으로 자원이 반납될 수 있도록 합니다.
//사용방법은  try(반드시 닫아야하는 자원을 생성하는 코드)

//멀티캐치 : catch문을 여러 번 사용하지 않고도 한번에 여러 개의 예외를 처리할 수 있도록 합니다. 
//예외들은 |로 구분합니다. 단 상속관계에 있는 예외는 같이 쓰이면 안됩니다.

import java.io.*;
public class AutoResourceManagerExample2 {

	public static void main(String[] args) {
		try(FileInputStream in = new FileInputStream("a.txt")){
			System.out.println("read data: "+in.read());
			System.out.println("read data: "+in.read());
			System.out.println("read data: "+in.read());
			System.out.println("read data: "+in.read());
		}catch(NullPointerException | IOException ex) {
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		}

	}

}
