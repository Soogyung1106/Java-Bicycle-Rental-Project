package Exception;
import java.io.IOException;
public class CheckedExample {
	public static void main(String[] args) {
		System.out.println("���� �Է¹޴� ���α׷��Դϴ�.");
		byte[] data = new byte[100];
		try {
			System.in.read(data);
		} catch(IOException e) {
			//try catch���ָ� JVM������ �Ȱ�. ���⼭ ������., ���α׷� ���� �ȵ�.
			//main���� throws�ϸ� JVM���� ��. ���α׷� �����.
			e.printStackTrace();
		}
		System.out.println("�Է��� ���ڿ��� : ");
		System.out.println(new String(data).trim());
		
	}
}
