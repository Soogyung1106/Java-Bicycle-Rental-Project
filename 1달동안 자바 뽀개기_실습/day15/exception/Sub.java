package exception;
import java.sql.SQLException;
public class Sub extends Super {
	DataBase db = new DataBase();
	
	public void doIt(int num) throws SQLException {
		System.out.println("Sub.doIt()");
		try {
			db.insert(num);
		}catch(SQLException e) {
			throw new IOException(e.getMessage(), e)  //ExceptionŬ������ message�� e��� ������� ������
		}
	}
}
