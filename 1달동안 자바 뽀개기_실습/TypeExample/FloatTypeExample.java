
public class FloatTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f=3.15F;		//float�� double�� ������ : ��Ȯ�� (6��°, 13������� ��Ȯ)
		double d=3.15;
		System.out.printf("float : %f\ndouble : %f\n", f,d);
		System.out.printf("float : %.10f\ndouble : %.10f\n", f,d);
		System.out.printf("float : %.20f\ndouble : %.20f\n", f,d);
		System.out.printf("float : %.100f\ndouble : %.100f\n", f,d);
		              
		f=3.14F;
		toBitString(f);
		System.out.println();  //�ƹ��͵� �� ������ �� �� ���
		f=3.1400002F;
		toBitString(f);
		System.out.println();
		
	}//end main
	
	//�޼��� ����
	public static void toBitString(float f) {
		int num=Float.floatToRawIntBits(f);	//Ŭ���� - �޼��� (�̸���Ģ)
		String bin =Integer.toBinaryString(num);
		int temp=bin.length();
		for(int i=0;i<32-temp;i++) {
			bin="0"+bin;
		}
		System.out.printf("f�� ���� ǥ�� : %s",bin);
		System.out.println("��ȣ ��Ʈ : "+bin.charAt(0));
		System.out.println("������ : "+bin.substring(1, 9));
	}

}
