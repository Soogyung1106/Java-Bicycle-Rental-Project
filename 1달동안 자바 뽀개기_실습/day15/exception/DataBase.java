package exception;

public class DataBase {
	public void insert(int num) {
		if(num>100) {
			throw new SQLException("num�� �ʹ� Ů�ϴ�.")
		}
		System.out.println("DB�� ����Ǿ����ϴ�.");
	
	}//end insert()
}//end class
