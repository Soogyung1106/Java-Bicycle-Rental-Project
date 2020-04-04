package Poly;
//捞辆葛澜
public class HeteroCollectionExample {

	public static void main(String[] args) {
		Person[] pArr=new Person[4];
		
		pArr[0]=new Person("全揪", 20);
		pArr[1]=new Student("全切积", 17, "2017156037");
		pArr[2]=new Teacher("全急积", 22, "Java Programming");
		pArr[3]=new Employee("全荤盔", 23, "背公贸");
		
		for(int i=0; i<pArr.length;i++) {
			System.out.println(pArr[i].getDetails());
		}
		

	}

}
