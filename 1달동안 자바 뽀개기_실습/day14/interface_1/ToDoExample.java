package interface_1;

public class ToDoExample {

	public static void main(String[] args) {
		ToDo todo=new ToDo(); //todo �ν��Ͻ� ����
		IToDo1 itodo1=todo; //?? �ǹ�??
		IToDo2 itodo2=todo;
		IToDo3 itodo3=todo;
		IToDo4 itodo4=todo;
//���� ���� �������̽��� ������ ��� ��Ӱ��迡 �ִ� �������̽����� ���
//�޼��带 �����ؾ� ��
	System.out.println(todo instanceof IToDo1);
	System.out.println(todo instanceof IToDo2);
	System.out.println(todo instanceof IToDo3);
	System.out.println(todo instanceof IToDo4);
//�������̽��� ��ü�� ���� �� ������, �������̽� Ÿ������ �������� ���� ������!!
	
		itodo1.m1();//itodo1.m2();itodo1.m3();itodo1.m4();
		itodo2.m2();//itodo2.m1();itodo2.m3();itodo2.m4();
		itodo3.m1();itodo3.m2();itodo3.m3();//itodo3.m4();
		itodo4.m4();//itodo4.m1();itodo4.m2();itodo4.m3();
		
	}

}
