package day1_4;

public class IfExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cat cat = new Cat(); 객체를 만드는 방법
		int jumsu =(int)(Math.random() * 110);  // Math.random() >> 0~1사이의 임의의 수가 나오게 하는 메서드
		
		System.out.println("점수 : " + jumsu);
		
		if(jumsu >= 90) {
			if(jumsu > 100) {
				System.out.println("잘못 입력된 점수입니다.");
			}else {
				System.out.println("당신의 학점은  A입니다.");
			}
		}else if(jumsu >= 80) {
			System.out.println("당신의 학점은 B입니다.");
		}else if(jumsu >=70) {
			System.out.println("당신의 학점은 C입니다.");
		}else if(jumsu >= 60) {
			System.out.println("당신의 학점은 D입니다.");
		}else {
			System.out.println("당신의 학점은 F입니다.");
			System.out.println("당신은 재수강 대상자입니다.");
		}
	}

}
