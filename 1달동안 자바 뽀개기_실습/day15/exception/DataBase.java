package exception;

public class DataBase {
	public void insert(int num) {
		if(num>100) {
			throw new SQLException("num이 너무 큽니다.")
		}
		System.out.println("DB에 저장되었습니다.");
	
	}//end insert()
}//end class
