package ID;

public class LoginCheck {
	public static boolean idCheck(String idInputValue) {
		String[] idArr = {"a", "b", "c", "d", "e"};
		int i =0;
		try {
			while(true) {
				if(idArr[i].equals(idInputValue)) {
					return true;
				}
				i++;
			}//end while
		}catch(ArrayIndexOutOfBoundsException e) {
			throw new IDNotFoundException("���� ���̵��Դϴ�.", e);
		}
	}//end idCheck()

	public static boolean pwCheck(String pwInputValue)throws InvalidPasswordException{
		String password ="itbank";
		if(password.equals(pwInputValue)) {
			return true;
		}throw new InvalidPasswordException("��й�ȣ�� ��ġ ���� �ʽ��ϴ�.");
	}
}
