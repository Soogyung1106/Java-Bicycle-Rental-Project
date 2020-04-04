package stream;

public class VariableLengthExample {

	public static void main(String[] args) {
		log("Hello");
		log("VariablLengthExample", "Hello");
		log("a", "b", "c");
		log();
	}
	
	public static void log(String ...msg) {
		System.out.println("·Î±×");
		for(int i=0 ; i<msg.length ; i++) {
			System.out.println(msg[i]+",");
		}
		System.out.println();
	}

}
