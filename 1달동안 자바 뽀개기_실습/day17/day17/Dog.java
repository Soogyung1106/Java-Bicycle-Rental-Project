package day17;

public class Dog implements Comparable<Dog>{
//멤버변수
	private String dogId;//견종
	private String dogName;//이름
	private int weight;//몸무게

	public int compareTo(Dog o) {
		//양수면 this.dogName이 o.dogName 뒤에 위치
		//음수면 this.dogName이 o.dogName 앞에 위치
		return o.dogName.compareTo(this.dogName);
	}
	public Dog(String dogId, String dogName, int weight) {
		super();
		this.dogId= dogId;
		this.dogName=dogName;
		this.weight=weight;
	}
// 방법 : source -> generate hashcode and equals()	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dogId == null) ? 0 : dogId.hashCode());
		result = prime * result + ((dogName == null) ? 0 : dogName.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //d1과 주소가 같다면     
			//객체는 참조 데이터타입이므로 객체간의 == 은 주소를 비교하는 것임.
			return true;
		if (obj == null) // 
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (dogId == null) {
			if (other.dogId != null)
				return false;
		} else if (!dogId.equals(other.dogId))
			return false;
		if (dogName == null) {
			if (other.dogName != null)
				return false;
		} else if (!dogName.equals(other.dogName))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	public String getDogId() {
		return dogId;
	}
	
	public void setDogId(String dogId) {
		this.dogId = dogId;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	// equals, hashcode 
	@Override
	public String toString() {
		return "Dog [dogId=" + dogId + ", dogName=" + dogName + ", weight=" + weight + "]";
	}
	
	
}	
