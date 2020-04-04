
public class TextTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char one='A';
	char two='\t';
	char three='\uAC00';
	String four="\uAC00\uAC01\uAC02\uAC03";
	String five="dream";
	System.out.printf("%c,%c,%c,%s,%s\n", one, two, three, four, five);
	
	System.out.println(five + 100+200+"come true\n");
	System.out.println(100+200+five);
		
	}

}
