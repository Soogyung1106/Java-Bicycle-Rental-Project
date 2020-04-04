package Exception;
import java.io.IOException;
public class CheckedExample {
	public static void main(String[] args) {
		System.out.println("값을 입력받는 프로그램입니다.");
		byte[] data = new byte[100];
		try {
			System.in.read(data);
		} catch(IOException e) {
			//try catch해주면 JVM까지는 안감. 여기서 없어짐., 프로그램 종료 안됨.
			//main에서 throws하면 JVM까지 감. 프로그램 종료됨.
			e.printStackTrace();
		}
		System.out.println("입력한 문자열은 : ");
		System.out.println(new String(data).trim());
		
	}
}
