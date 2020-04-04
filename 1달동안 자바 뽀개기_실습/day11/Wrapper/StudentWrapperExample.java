package Wrapper;

public class StudentWrapperExample {

	public static void main(String[] args) {
		Student s=new Student("Áö½ÂÈÆ", 27, "123123");
		System.out.println(s.getDetails());
		s=new StudentWrapper(s);
		System.out.println(s.getDetails());
		s=new StudentWrapper2(s);
		System.out.println(s.getDetails());
		

	}

}
