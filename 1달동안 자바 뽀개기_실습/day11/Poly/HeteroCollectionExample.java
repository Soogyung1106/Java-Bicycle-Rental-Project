package Poly;
//��������
public class HeteroCollectionExample {

	public static void main(String[] args) {
		Person[] pArr=new Person[4];
		
		pArr[0]=new Person("ȫ��", 20);
		pArr[1]=new Student("ȫ�л�", 17, "2017156037");
		pArr[2]=new Teacher("ȫ����", 22, "Java Programming");
		pArr[3]=new Employee("ȫ���", 23, "����ó");
		
		for(int i=0; i<pArr.length;i++) {
			System.out.println(pArr[i].getDetails());
		}
		

	}

}
