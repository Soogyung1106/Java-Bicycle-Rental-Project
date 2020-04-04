
public class IntTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=(byte)(128+256*2);  //a는 127까지 밖에 표현을 못한다.   //00000000...(1000_0000) 1이 부호비트가 됨
		short b=(short)32768;		////00000000...(1000_0000_0000_0000) 1이 부호비트가 됨
		int c= 2147483647;
		long d=2147483648L;
		System.out.printf("%d,%d,%d,%d \n", a,b,c,d);
		
	}

}
