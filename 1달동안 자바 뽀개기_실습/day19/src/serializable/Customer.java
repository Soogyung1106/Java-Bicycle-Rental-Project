package serializable;

public class Customer {
	
	 
	
	String name;
	char gender;
	String email;
	int age;

	public Customer(String name, char gender, String email, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.age = age;
	}
	
	public Customer() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + ", age=" + age + "]";
	}
	
	public String toCSV() {
		return name+","+gender+","+email+","+age;
	}
	
	
	
	
}
