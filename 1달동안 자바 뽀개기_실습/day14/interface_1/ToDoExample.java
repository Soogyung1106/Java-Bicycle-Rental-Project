package interface_1;

public class ToDoExample {

	public static void main(String[] args) {
		ToDo todo=new ToDo(); //todo 인스턴스 생성
		IToDo1 itodo1=todo; //?? 의미??
		IToDo2 itodo2=todo;
		IToDo3 itodo3=todo;
		IToDo4 itodo4=todo;
//가장 하위 인터페이스를 구현할 경우 상속관계에 있는 인터페이스들의 모든
//메서드를 구현해야 함
	System.out.println(todo instanceof IToDo1);
	System.out.println(todo instanceof IToDo2);
	System.out.println(todo instanceof IToDo3);
	System.out.println(todo instanceof IToDo4);
//인터페이스는 객체를 만들 수 없지만, 인터페이스 타입으로 다형성을 적용 가능함!!
	
		itodo1.m1();//itodo1.m2();itodo1.m3();itodo1.m4();
		itodo2.m2();//itodo2.m1();itodo2.m3();itodo2.m4();
		itodo3.m1();itodo3.m2();itodo3.m3();//itodo3.m4();
		itodo4.m4();//itodo4.m1();itodo4.m2();itodo4.m3();
		
	}

}
