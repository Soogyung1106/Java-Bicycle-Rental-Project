package exception;

public class DoIt1 {
//��� ����	
	public static String[] greetings= {"A", "B", "C"};
//�޼���
	public static void doit(int index) throws Exception{	//Exception �� CheckedException
			System.out.println(greetings[index]);  //����3���� try Catch�� ó�����ֱ�
		
	}
}	
