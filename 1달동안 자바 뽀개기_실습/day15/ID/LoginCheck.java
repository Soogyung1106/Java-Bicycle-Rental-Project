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
			throw new IDNotFoundException("없는 아이디입니다.", e);
		}
	}//end idCheck()

	public static boolean pwCheck(String pwInputValue)throws InvalidPasswordException{
		String password ="itbank";
		if(password.equals(pwInputValue)) {
			return true;
		}throw new InvalidPasswordException("비밀번호가 일치 하지 않습니다.");
	}
}
