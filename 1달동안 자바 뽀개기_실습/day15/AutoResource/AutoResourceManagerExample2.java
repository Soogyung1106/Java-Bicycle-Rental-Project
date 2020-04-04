package AutoResource;
//�ڿ� ���� �ڵ�ȭ : finally�� ������� �ʰ� �ڵ������� �ڿ��� �ݳ��� �� �ֵ��� �մϴ�.
//�������  try(�ݵ�� �ݾƾ��ϴ� �ڿ��� �����ϴ� �ڵ�)

//��Ƽĳġ : catch���� ���� �� ������� �ʰ� �ѹ��� ���� ���� ���ܸ� ó���� �� �ֵ��� �մϴ�. 
//���ܵ��� |�� �����մϴ�. �� ��Ӱ��迡 �ִ� ���ܴ� ���� ���̸� �ȵ˴ϴ�.

import java.io.*;
public class AutoResourceManagerExample2 {

	public static void main(String[] args) {
		try(FileInputStream in = new FileInputStream("a.txt")){
			System.out.println("read data: "+in.read());
			System.out.println("read data: "+in.read());
			System.out.println("read data: "+in.read());
			System.out.println("read data: "+in.read());
		}catch(NullPointerException | IOException ex) {
			System.out.println("���� ó���մϴ�.");
			System.out.println(ex.toString());
		}

	}

}
