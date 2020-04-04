
public class FloatTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f=3.15F;		//float과 double의 차이점 : 정확성 (6번째, 13번재까지 정확)
		double d=3.15;
		System.out.printf("float : %f\ndouble : %f\n", f,d);
		System.out.printf("float : %.10f\ndouble : %.10f\n", f,d);
		System.out.printf("float : %.20f\ndouble : %.20f\n", f,d);
		System.out.printf("float : %.100f\ndouble : %.100f\n", f,d);
		              
		f=3.14F;
		toBitString(f);
		System.out.println();  //아무것도 안 넣으면 한 줄 띄기
		f=3.1400002F;
		toBitString(f);
		System.out.println();
		
	}//end main
	
	//메서드 선언
	public static void toBitString(float f) {
		int num=Float.floatToRawIntBits(f);	//클래스 - 메서드 (이름규칙)
		String bin =Integer.toBinaryString(num);
		int temp=bin.length();
		for(int i=0;i<32-temp;i++) {
			bin="0"+bin;
		}
		System.out.printf("f의 내부 표현 : %s",bin);
		System.out.println("부호 비트 : "+bin.charAt(0));
		System.out.println("지수부 : "+bin.substring(1, 9));
	}

}
