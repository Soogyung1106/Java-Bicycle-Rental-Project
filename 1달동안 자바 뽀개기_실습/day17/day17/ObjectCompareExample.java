package day17;

import java.util.HashSet;

public class ObjectCompareExample {

	public static void main(String[] args) {
		Dog d1=new Dog("진돗개", "뽀삐", 15);
		Dog d2=new Dog("말티즈", "삐삐", 5);
		Dog d3=new Dog("진돗개", "뽀삐", 15);
		//d1과 d3가 같나요? 주소값이 다르다.
		System.out.println(d1==d3);  //객체는 참조데이터 타입이므로 값이 아니라 주소를 저장한하고 있다.
		//d1 과 d3가 equals한가요?
		//재정의 하기 전 equals를 통한 비교는 ==을 통한 비교와 동일함.
		System.out.println(d1.equals(d3));
		System.out.println("hashset에 d1과 d3를 넣어봅니다.");
		HashSet<Dog> set=new HashSet<>();
		System.out.println(set.add(d1));
		System.out.println(set.add(d3));
		System.out.println(set); //다르게 취급! (실제로 출력해보면 Hash 값 다름)
		//목표 : d1, d3가 같다고 취급이 되어야함.
		//equals 메서드를 재정의 해주면 가능.
		
		
	}

}
