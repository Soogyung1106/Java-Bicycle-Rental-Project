package interface_;

public class Person implements Aquatic{  //PersonŬ������ Aquatic �̸��� �������̽��� �����ߴ�.
	//�������̵�
	public void swimming() {
		System.out.println("���� ������ �� �� �־��.");
	}
	
	public static void main(String[] args) {
		Person p=new Person();
		p.swimming();
	}

}
