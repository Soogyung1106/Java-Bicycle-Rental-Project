package Poly;

public class PolymorphismExample {

	public static void main(String[] args) {
		Person p; //? 이게 무슨 의미이더라...? 이렇게 선언해버려도 되는것임??
		
		p=new Teacher("홍선생", 22, "Java Programming"); //? 위 두 줄 Person p= new Teacher 과 같은 의미?? 
		System.out.println(p  instanceof Person); // true 출력
		System.out.println(p  instanceof Teacher); //true 출력 ->'다형성'의 특징 때문에 
		System.out.println(p.getDetails()); 
		//Person클래스와 Teacher 클래스 두 군데 가서 확인해봐야! 
		//첫 번째 : 부모 클래스에 가서 getDetails() 메서드가 있는지 확인
		//두 번째 : 자식 클래스에 가서 재정의된 getDetails() 메서드가 있는지 확인
		
		p=new Employee("홍사원", 23, "교무처");
		System.out.println(p  instanceof Person);
		System.out.println(p  instanceof Employee);
		System.out.println(p.getDetails());
		
		p=new Student("홍학생", 17, "20160001");
		System.out.println(p  instanceof Person);
		System.out.println(p  instanceof Student);
		System.out.println(p.getDetails());
		p.walk();
		//p.study();	
	}//end main

}//end class
