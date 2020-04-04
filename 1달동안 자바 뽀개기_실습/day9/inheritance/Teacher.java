package inheritance;

public class Teacher extends Person{
	public String subject;
	public Teacher(String name,int age,String subject)
	{
		super(name, age);
		this.subject=subject;
	}
	//재정의
	public String getDetails() {
		return super.getDetails() +"\t과목: "+ subject;
	}
}




