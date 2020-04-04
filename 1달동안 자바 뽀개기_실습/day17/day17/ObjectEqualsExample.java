package day17;


import java.util.TreeSet;

public class ObjectEqualsExample {

	public static void main(String[] args) {
		Dog d1=new Dog("Áøµ¾°³", "»Ç»ß", 15);
		Dog d2=new Dog("¸»Æ¼Áî", "»ß»ß", 5);
		Dog d3=new Dog("Áøµ¾°³", "¹é±¸", 10);
		
		
		TreeSet<Dog> set=new TreeSet<>();
		set.add(d1);
		set.add(d2);
		set.add(d3);
		System.out.println(d3.compareTo(d1));
		System.out.println(d1.compareTo(d3));
		for(Dog d : set) {
			System.out.println(d);
		}
		
		TreeSet<Dog> set2 = new TreeSet<>(new DogComparator());
		set2.add(d1);
		set.add(d2);
		set.add(d3);
		for(Dog d : set2) {
			System.out.println(d);
		}
		
	}



}
